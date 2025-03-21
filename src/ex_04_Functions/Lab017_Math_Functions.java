package ex_04_Functions;

import java.util.Scanner;

public class Lab017_Math_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int n1=sc.nextInt();
        System.out.println("Enter number two: ");
        int n2=sc.nextInt();
        int max = Math.max(n1,n2);
        int min = Math.min(n1,n2);
        System.out.println("Max of numbers = "+max+"\nMin of numbers = "+min);
        System.out.println("Sum of numbers = "+Math.addExact(n1,n2));
        System.out.println("Difference of numbers = "+Math.subtractExact(n1,n2));
        System.out.println("Multiplication of numbers = "+Math.multiplyExact(n1,n2));
        System.out.println("Division of numbers = "+Math.divideExact(n1,n2));
    }
}
