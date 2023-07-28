class Solution {
    public double solution(int a, int b) {
        double answer = 0;
        
        int modA = a%2;
        int modB = b%2;
        
        if(modA == 1 && modB ==1) {    
            answer = Math.pow(a,2) + Math.pow(b,2);
        }
        else if(modA == 0 && modB ==0){
            answer = Math.abs(a-b);
        }
        else{
            answer = 2*(a + b);
            
        }
        
        return answer;
    }
}