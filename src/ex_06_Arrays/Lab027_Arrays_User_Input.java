package ex_06_Arrays;

import java.util.Scanner;

public class Lab027_Arrays_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        String marks[] = new String[size];
        for(int i=0; i<marks.length;i++){
            System.out.println("Enter the mark "+(i+1)+": ");
            marks[i] = sc.next();
        }
        for(int i=0; i< marks.length;i++)
            System.out.println(marks[i]);

        sc.close();
    }
}
