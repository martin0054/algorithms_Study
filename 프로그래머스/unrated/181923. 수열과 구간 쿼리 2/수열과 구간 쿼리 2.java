import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];
       
        for(int i = 0; i< queries.length; i++){
        	
        	int [] a = queries[i];
        	
        	int s = a[0];
        	int e = a[1];
        	int k = a[2];
        	
        	int [] temp = Arrays.copyOfRange(arr, s, e+1);
        	        	
        	int count =0;
        	for(int j = 0; j<temp.length; j++){
        		if(temp[j] > k) {
        			count ++;
        		}
        	}

        	if(count !=0 ) {
        		int [] t = new int [count];
        		int l = 0;
        		for(int j = 0; j<temp.length; j++){
        			
        			if(temp[j] > k) {
            			t[l] = temp[j];
            			l++;
        			}
        		}
        		Arrays.sort(t);
        		answer[i] = t[0];
        	}else {
        		answer[i] = -1;
        	}
        	
        }
        return answer;
    }
}