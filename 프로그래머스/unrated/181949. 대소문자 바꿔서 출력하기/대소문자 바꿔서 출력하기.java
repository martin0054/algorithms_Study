import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String rst ="";
        for(char s : a.toCharArray()){
            if(Character.isLowerCase(s)){
                rst += Character.toUpperCase(s);
            }else{
                rst += Character.toLowerCase(s);
            }
        }
        System.out.print(rst);
    }
}