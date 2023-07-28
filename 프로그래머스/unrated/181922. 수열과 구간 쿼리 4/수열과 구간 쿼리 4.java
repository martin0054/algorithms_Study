import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
         for(int i = 0; i< queries.length; i++){
        	
        	int [] a = queries[i];
        	
        	System.out.println(Arrays.toString(a));
        	int s = a[0];
        	int e = a[1];
        	int k = a[2];
        	
    		for(int j = s; j<=e; j++){
    			if(j%k == 0 ){
    				arr[j] = arr[j]+1;
    			}
    		}	
        }
        return arr;
    }
}