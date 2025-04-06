package Tasks.JavaCodingQuestions_Part1;

import java.util.Scanner;

public class Task021_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        char ch1 = Character.toLowerCase(ch);
        if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
            System.out.println(ch+" is a vowel");
        else
            System.out.println(ch+" is a consonant");
        sc.close();
    }
}
