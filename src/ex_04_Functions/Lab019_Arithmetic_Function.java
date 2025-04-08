package ex_04_Functions;

import java.util.Scanner;

public class Lab019_Arithmetic_Function {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number one: ");
        //int n1=sc.nextInt();
        int n1=0;
        if(sc.hasNextInt()){
            n1=sc.nextInt();
        }
        else{
            System.out.println("Enter only integer values");
            System.exit(0);
        }

        System.out.println("Enter number two: ");
        //int n2=sc.nextInt();
        int n2=0;
        if(sc.hasNextInt()){
            n2=sc.nextInt();
        }
        else{
            System.out.println("Enter only integer values");
            System.exit(0);
        }
        System.out.println("Sum of numbers = "+sum(n1,n2));
        System.out.println("Difference of numbers = "+sub(n1,n2));
        System.out.println("Multiplication of numbers = "+mul(n1,n2));
        System.out.println("Division of numbers = "+div(n1,n2));
        System.out.println("Modulus of numbers = "+mod(n1,n2));
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static int sub(int a,int b){
        return a-b;
    }

    public static int mul(int a,int b){
        return a*b;
    }

    public static int div(int a,int b){
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
            System.exit(0);
        }
        return a/b;
    }

    public static int mod(int a,int b){
        return a%b;
    }
}
