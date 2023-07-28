class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab = Integer.parseInt( String.valueOf(a) + String.valueOf(b));
        int conduct = 2 * a * b;
         
        answer = (ab > conduct) ? ab : conduct;
        return answer;
    }
}