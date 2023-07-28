class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String b = "";
        for(int i =0; i< myString.length(); i++){
            char a = myString.charAt(i);
            if(a == 'A'){
                b += 'B';
            }else{
                b += 'A';
            }
        }
        
        if(String.valueOf(b).contains(pat)){
            answer  = 1;
        }
        return answer;
    }
}