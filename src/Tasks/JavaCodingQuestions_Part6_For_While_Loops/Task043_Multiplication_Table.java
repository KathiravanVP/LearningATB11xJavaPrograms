package Tasks.JavaCodingQuestions_Part6_For_While_Loops;

import java.util.Scanner;

public class Task043_Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the multiplication table number:");
        int n = sc.nextInt();
        System.out.println("For Loop");
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        System.out.println("-------------------");
        System.out.println("While Loop");
        int k = 1;
        while(k<=10){
            System.out.println(n+" x "+k+" = "+(n*k));
            k++;
        }
        sc.close();
    }
}
