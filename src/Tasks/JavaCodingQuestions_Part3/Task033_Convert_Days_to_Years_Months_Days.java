package Tasks.JavaCodingQuestions_Part3;

import java.util.Scanner;

public class Task033_Convert_Days_to_Years_Months_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int n = sc.nextInt();
        int years = n/365;
        int months = (n - (years*365))/30;
        int days = n-(years*365) - (months*30);
        System.out.println(years+" years, "+months+" months, "+days+" days");
        sc.close();
    }
}
