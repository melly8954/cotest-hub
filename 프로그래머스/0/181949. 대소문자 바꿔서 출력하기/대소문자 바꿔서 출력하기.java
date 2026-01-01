import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < a.length(); i++){
            char word = a.charAt(i);
            if (Character.isUpperCase(word)) {
                sb.append(Character.toLowerCase(word));
            } else if (Character.isLowerCase(word)) {
                sb.append(Character.toUpperCase(word));
            }
        }
        
        System.out.println(sb);
    }
}