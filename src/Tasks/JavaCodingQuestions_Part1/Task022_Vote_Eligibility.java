package Tasks.JavaCodingQuestions_Part1;

import java.util.Scanner;

public class Task022_Vote_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of the person: ");
        int age = sc.nextInt();
        if(age>=18)
            System.out.println("Person is eligible to vote");
        else
            System.out.println("Person is not eligible to vote");
        sc.close();
    }
}
