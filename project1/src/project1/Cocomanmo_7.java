package project1;

public class Cocomanmo_7 {
	//에라토스테네스의 체 풀이 참고함. math.sqrt대신 i의 제곱을 이용함. 원리는 같음
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	              
	        for(int m=2; m<=n; m++) {
	            boolean flag = true;
	            for(int i=2; i*i<=m; i++) {
	                if(m%i==0) {
	                flag=false;
	                break;
	            }
	        }
	            if(flag) answer++;
	     }
	      
	        return answer;
	    }
	}
	
	

	/* 시간초과 넘나 슬픔,,
	 * public int solution(int n) { int answer = 0;
	 * 
	 * for(int m=2; m<=n; m++) { boolean flag = true; for(int i=2; i<m; i++) {
	 * if(m%i==0) flag=false; } if(flag==true) { answer++; } }
	 * 
	 * 
	 * return answer; }
	 */

}
