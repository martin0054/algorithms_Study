import java.util.Arrays;    
class Solution {
    public int[] solution(int n) {
		   
         String s = String.valueOf(n) + " ";
        while( n != 1){
            if(n%2==0){
                n = n/2;
            }else {
                n = 3*n +1;
            }
            s += (n + " ");
            
            if(n == 1) {
            	break;
            }	
        }
        
        String [] str = s.split(" ");
        int[] answer = new int [str.length];  
       
        for (int i = 0; i < str.length; i++){
             answer[i] = Integer.parseInt(str[i].trim());
    }
        return answer;
    
	}
}