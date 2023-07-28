class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 0; i< numLog.length-1; i++){

            int m = numLog[i+1]-numLog[i];
            if(m == 1) answer += "w";
            if(m == -1) answer += "s";
            if(m == 10) answer += "d";
            if(m == -10) answer += "a";
            
        }
        return answer;
    }
}