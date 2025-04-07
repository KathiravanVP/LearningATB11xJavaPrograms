package Tasks.JavaCodingQuestions_Part2;
import java.util.Scanner;
public class Task025_Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        System.out.println("Enter third number:");
        int n3 = sc.nextInt();
        int min = (n1<n2)?((n1<n3)?n1:n3):((n2<n3)?n2:n3);
        System.out.println(min+" is the smallest of three numbers");
        sc.close();
    }
}
