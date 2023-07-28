import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
       
        for(int i = 0; i< queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            
            int k = arr[b];
            int p = arr[a];
            
            arr[a] = k;
            arr[b] = p;
            
        }
        return arr;
    }
}