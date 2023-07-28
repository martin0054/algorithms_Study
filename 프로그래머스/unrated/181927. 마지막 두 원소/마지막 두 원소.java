
class Solution {
    public int[] solution(int[] num_list) {
       
       
        int length = num_list.length;
         int[] answer = new int[length+1];
        
                 
       for(int i=0; i<length; i++){
           answer[i] = num_list[i]; 
       }
        
        int a = num_list[length-2];
        int b = num_list[length-1];
        
        if(a<b){
            answer[answer.length-1] = (b-a);
        }else{
           answer[answer.length-1] = (2*b);
        }
        
        return answer;
    }
}