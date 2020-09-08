package project1;

public class Cocomanmo6 {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	    	//이렇게 푼 사람 진짜 핵핵핵핵많네유...창의적으로  풀고싶네욤
	        int answer = 0;
	        int[] student = new int[n+1];
	        
	        for(int i=1;i<=n;i++) {
	            student[i]=1;
	        }
	        for(int j:lost) {
	            student[j]--;
	        }
	        for(int k:reserve) {
	            student[k]++;
	        }
	        
	        for(int i=1;i<=n;i++) {
	            if(student[i]==0) {
	               if(i-1>=1&&student[i-1]==2){
	                   student[i]++;
	                   student[i-1]--;
	               }else if(i+1<=n&&student[i+1]==2) {
	                   student[i]++;
	                   student[i+1]--;
	               }
	            }
	        }
	        for(int i=1;i<=n;i++) {
	            if(student[i]>=1)
	                answer++;
	            }
	        
	        return answer;
	        
	    }
	}

}
/* true/false 이용해서 빼주는 풀이. 
 * class Solution { public int solution(int n, int[] lost, int[] reserve) { int
 * answer = 0; answer = n;
 * 
 * for(int i = 0; i < lost.length; i++) { boolean rent = false; int j = 0;
 * while(!rent) { if(j == reserve.length) break; if(lost[i] == reserve[j])
 * {reserve[j] = -1; rent=true;} else if(lost[i] - reserve[j] == 1 ) {reserve[j]
 * = -1; rent=true;} else if(lost[i] - reserve[j] == -1) {reserve[j] = -1;
 * rent=true;} else {j++; } } if(!rent) answer--; } return answer; } }
 */