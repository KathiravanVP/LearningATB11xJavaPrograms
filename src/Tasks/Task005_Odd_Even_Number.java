package Tasks;

import java.util.Scanner;

public class Task005_Odd_Even_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is an even number");
        }
        else{
            System.out.println(n+" is an odd number");
        }
    }
}
