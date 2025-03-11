package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab005_InputFromUser {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello, "+name+"! You are "+age+" years old.");
        sc.close();
    }
}
