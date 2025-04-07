package Tasks.JavaCodingQuestions_Part2;

import java.util.Scanner;

public class Task024_Smallest_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        if(num1<num2)
            System.out.println(num1+" is the smallest of two numbers");
        else
            System.out.println(num2+" is the smallest of two numbers");
        sc.close();
    }
}
