package programmersLevel1;

// 다른 풀이
class NumberAndAlphabet {
	public int solution(String s) {
		int answer = 0;

		String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
		String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

		for(int i=0; i<10; i++){
			s = s.replaceAll(alphabets[i],digits[i]);
		}
		answer = Integer.parseInt(s);
		return answer;
	}
}

//class Solution {
//	public int solution(String s) {
//		int answer = 0;
//		String[] eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//
//		for(int i = 0; i < eng.length; i++) {
//			if (s.indexOf(eng[i]) >= 0) {
//				switch (eng[i]) {
//				case "zero" : s = s.replace("zero","0");
//				case "one" : s = s.replace("one","1");	
//				case "two" : s = s.replace("two","2");	
//				case "three" : s = s.replace("three","3");
//				case "four" : s = s.replace("four","4");
//				case "five" : s = s.replace("five","5");
//				case "six" : s = s.replace("six","6");	
//				case "seven" : s = s.replace("seven","7");	
//				case "eight" : s = s.replace("eight","8");	
//				case "nine" : s = s.replace("nine","9");	
//				}
//			}
//		}
//		answer = Integer.parseInt(s); // String to Integer
//		return answer;
//	}
//}

