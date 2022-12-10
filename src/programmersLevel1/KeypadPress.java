package programmersLevel1;

class KeypadPress {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		int[] locL = new int[numbers.length + 1]; 
		int[] locR = new int[numbers.length + 1];
		locL[0] = 10; locR[0] = 12;    // *과 # 임의로 값 지정
		int[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{10,0,12}};
		
		if (hand.equals("right")) {hand = "R";}
		else {hand = "L";}

		for(int i = 0; i < numbers.length; i++) {
			switch(numbers[i]) {
			case 1: case 4: case 7:
				answer = answer.concat("L");
				locL[i+1] = numbers[i];
				locR[i+1] = locR[i];
				break;

			case 3: case 6: case 9:	
				answer = answer.concat("R");
				locR[i+1] = numbers[i];
				locL[i+1] = locL[i];
				break;

			case 2: case 5: case 8: case 0: 
				int a1 = 0; int b1 = 0;
				int a2 = 0; int b2 = 0;
				int aP = 0; int bP = 0;

				for(int a = 0; a < 4; a++) {
					for(int b = 0; b < 3; b++) {
						if (locL[i] == keypad[a][b]) {
							a1 = a;
							b1 = b;
						}
						if (locR[i] == keypad[a][b]) {
							a2 = a;
							b2 = b;
						}
						if (numbers[i] == keypad[a][b]) {
							aP = a;
							bP = b;
						}
					}
				}

				double distL = Math.ceil(Math.sqrt(Math.pow(aP - a1,2) + Math.pow(bP - b1,2)));
				double distR = Math.ceil(Math.sqrt(Math.pow(aP - a2,2) + Math.pow(bP - b2,2)));
				
				if (distL < distR) {
					answer = answer.concat("L");
					locL[i+1] = numbers[i];
					locR[i+1] = locR[i];
				}
				else if (distL > distR) {
					answer = answer.concat("R");
					locR[i+1] = numbers[i];
					locL[i+1] = locL[i];
				}
				else if (distL == distR){
					answer = answer.concat(hand);
					if (hand.equals("L")) {
						locL[i+1] = numbers[i];
						locR[i+1] = locR[i];
					}
					else {
						locR[i+1] = numbers[i];
						locL[i+1] = locL[i];
					}
				}

				break;
			}
		}
		return answer;
	}
}