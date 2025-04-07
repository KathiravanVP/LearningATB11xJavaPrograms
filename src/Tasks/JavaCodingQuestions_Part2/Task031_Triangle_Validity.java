package Tasks.JavaCodingQuestions_Part2;

import java.util.Scanner;

public class Task031_Triangle_Validity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side 1:");
        int a = sc.nextInt();
        System.out.println("Enter length of side 2:");
        int b = sc.nextInt();
        System.out.println("Enter length of side 3:");
        int c = sc.nextInt();
        if((a+b>c)&&(b+c>a)&&(c+a)>b){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Not a valid triangle");
        }
    }
}
