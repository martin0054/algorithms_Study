class Solution {
    public int solution(String number) {
        int answer = 0;
        
        char [] a = number.toCharArray();
        
        int sum = 0;
        
        for(char n : a){
            sum += Character.getNumericValue(n);
        }
        
        answer = sum%9;
        return answer;
    }
}