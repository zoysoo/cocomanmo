package project1;

import java.util.Arrays;


public class Cocomanmo_4 {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length]; //commands.length °¡ ÇÊ¼öÀÎ °É ¸ô¶ú³×À¯....
	        int[] cut = {};
	        
	        for(int i=0;i<commands.length;i++){
	            cut = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
	            Arrays.sort(cut);
	            answer[i] = cut[commands[i][2]-1];
	        }
	        
	        return answer;
	}
}
