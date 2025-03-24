package Tasks;

import java.util.Scanner;

public class Task011_Palindrome_Of_String {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome: ");
        String str = sc.next();
        String rev_str = "";
        for(int i=str.length()-1;i>=0;i--){
            rev_str = rev_str+str.charAt(i);
        }
        if(str.equals(rev_str)){
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
    }
}
