package Tasks.JavaCodingQuestions_Part2;

import java.util.Scanner;

public class Task026_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check leap year: ");
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0))
            System.out.println(year+ " is a leap year");
        else
            System.out.println(year+ " is not a leap year");
        sc.close();
    }
}
