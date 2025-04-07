package Tasks.JavaCodingQuestions_Part2;

import java.util.Scanner;

public class Task028_AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch+ " is an alphabet");
        } else {
            System.out.println(ch+ " is not an alphabet");
        }
        sc.close();
    }
}
