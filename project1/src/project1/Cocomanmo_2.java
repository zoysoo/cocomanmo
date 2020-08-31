package project1;

public class Cocomanmo_2 {
	  public long solution(int a, int b) {
	        long answer = 0;
	        
	        if(a<=b) {
	        for(int i=a;a<=b;a++) {
	            answer=answer+a;
	         }
	        }else if(a>b) {
	            for(int i=b;b<=a;b++) {
	            answer=answer+b;
	         }
	        }
	        
	        return answer;
	    }

}
