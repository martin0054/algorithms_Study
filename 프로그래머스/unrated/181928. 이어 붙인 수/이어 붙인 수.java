class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String odd = "";
        String even = "";
        for(int n : num_list){
            
            if(n%2 ==1){
                odd += Integer.parseInt(String.valueOf(n));    
            }
            else{
                even += Integer.parseInt(String.valueOf(n)); 
            }
                         
        }
        
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}