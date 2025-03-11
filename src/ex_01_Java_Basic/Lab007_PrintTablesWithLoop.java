package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab007_PrintTablesWithLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int table=sc.nextInt();
        for(int i=1;i<=10;i++){
            //System.out.println(table+" x "+i+" = "+table*i);
            System.out.printf("%d x %d = %d\n",table,i,table*i);
        }
        sc.close();
    }
}
