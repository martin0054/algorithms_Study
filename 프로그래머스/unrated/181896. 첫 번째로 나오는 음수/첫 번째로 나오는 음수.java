class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int count =0;
        for(int n : num_list){
            if(n<0){
                count++;
                break;
            }
            answer ++;
        }
        
        if(count ==0){
            answer = -1;
        }
        return answer;
    }
}