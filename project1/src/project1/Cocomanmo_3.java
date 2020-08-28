package project1;


public class Cocomanmo_3 {
	    public String solution(String s) {
	          String answer = "";
	          char ch = 0;
	          int index = 0;
	          
	          for(int i=0; i<s.length(); i++) {
	              if(s.charAt(i) == ' ') {//공백처리
	                  ch = s.charAt(i);
	                  index = 0;
	              } else {
	                  index += 1;
	                  if(index%2!=0) {
	                      ch = Character.toUpperCase(s.charAt(i));
	                  } else {
	                      ch = Character.toLowerCase(s.charAt(i));
	                  }
	              }
	              
	              answer += ch;
	          }
	          
	          return answer;
	}
	

}
