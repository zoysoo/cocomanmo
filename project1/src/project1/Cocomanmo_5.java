package project1;

public class Cocomanmo_5 {
	class Solution {
	    public String solution(String phone_number) {
	        String answer = "";
	        int len = phone_number.length();
	        StringBuffer sb = new StringBuffer();
	        
	            for(int i=0;i<len-4;i++) {
	                sb.append("*");
	            }
	        for(int i= len-4;i<len;i++) {
	            sb.append(phone_number.charAt(i));
	        }
	        
	        answer=sb.toString();
	               
	        return answer;
	    }
	}
}
