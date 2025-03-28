package ex_06_Arrays;

import java.util.Scanner;

public class Lab033_Left_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=n;i>=0;i--){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
