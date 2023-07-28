class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String front = Integer.toString(a) + Integer.toString(b) ;
        String after = Integer.toString(b) + Integer.toString(a);
        
        int iFront = Integer.parseInt(front);
        int iAfter = Integer.parseInt(after);
        if(iFront >iAfter){
            answer = iFront;
        }
        else{
            answer = iAfter;
        }
        return answer;
    }
}