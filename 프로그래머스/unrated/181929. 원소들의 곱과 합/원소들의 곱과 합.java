class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int conduct = 1;
        int powSum =0;
        for(int a : num_list){
            
            conduct  *= a; 
            powSum += a;
        }
        
        return (conduct < Math.pow(powSum,2)) ? 1 : 0;
    }
}