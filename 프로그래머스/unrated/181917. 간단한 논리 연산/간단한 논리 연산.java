class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        boolean a =  f1(x1,x2);
        boolean b =  f1(x3,x4);
            
        return f2(a,b);
    }
    
    public boolean f1 (boolean a, boolean b){
        
        return a==false && b==false ? false : true;
    }
    
    public boolean f2 (boolean a, boolean b){
     
        return a==true && b==true ? true : false;
    }
}