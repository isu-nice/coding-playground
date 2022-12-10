package programmersLevel1;

class MBTI {
	 public String solution(String[] survey, int[] choices) {
	        
	        String type = "RTCFJMAN";
	        int[] cntArr = {0,0,0,0,0,0,0,0};
	        int cnt = 0;
	        int len = 8;
	        
	        for (int i = 0; i < survey.length; i++) {
	        	char fir = survey[i].charAt(0);
	        	
	        	for (int j = 0; j < len-1; j++) {
	        		if (type.charAt(j) == fir) {
	        			cnt = j;
	        			break;
	        		}
	        	}
	        	
	        	switch(choices[i]) {
	        	case 1: cntArr[cnt]+=3;
	        	case 2:	cntArr[cnt]+=2;
	        	case 3: cntArr[cnt]+=1;
	        	case 4: cntArr[cnt]+=0;
	        	case 5: cntArr[cnt+1]+=1;
	        	case 6: cntArr[cnt+1]+=2;
	        	case 7: cntArr[cnt+1]+=3;
	        	}
	        }
	        
	        String answer = "";
	        char[] charArr = {};
	        int ans = 0;
	        
	        for(int a = 0; a < len-1; a++) {
	        	if (cntArr[a] > cntArr[a+1]) {
	        		charArr[ans] = type.charAt(a);
	        	}
	        	else if (cntArr[a] < cntArr[a+1]) {
	        		charArr[ans] = type.charAt(a+1);
	        	}
	        	else { 
	        		if (Character.compare(type.charAt(a),type.charAt(a+1)) > 0) {
	        			charArr[ans] = type.charAt(a);
	        		}else {
	        			charArr[ans] = type.charAt(a+1);
	        		}
	        	}
	        	ans++; a++;
	        }
	        
	        answer = String.valueOf(charArr);
	        
	        return answer;
	    }
}

