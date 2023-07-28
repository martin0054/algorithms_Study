class Solution {
    public String solution(String code) {
        String answer = "";
       
        int mode = 0;
        
        char s [] = code.toCharArray();
       
      
         for(int i = 0; i<s.length; i++){
            
            char a = s[i];
            
            if(a != '1'){
                mode = mode;
            }
            else if(a == '1' && mode == 0){
                mode = 1;
            }else if(a == '1' && mode == 1){
                mode = 0;
            }
            
            if(mode == 0) {
                
                if(a != '1' && i%2 == 0){    
                  answer += a;   
                }
            }
            else{
               if(a != '1' && i%2 ==1){    
                  answer += a;   
                }
            }
            
        } 
    
        if(answer.isEmpty()){
            answer = "EMPTY";
        }
         return answer;
    }
}