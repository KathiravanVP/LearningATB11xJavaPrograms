package ex_18_Exceptions;

import java.util.Scanner;

public class Lab059_Try_Catch_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        try{
            a = n/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
            System.out.println("Executed always");
        }
    }
}
