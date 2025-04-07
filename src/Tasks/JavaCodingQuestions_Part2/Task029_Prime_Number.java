package Tasks.JavaCodingQuestions_Part2;

import java.util.Scanner;

public class Task029_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<=1)
            isPrime=false;
        else if(n<=3)
            isPrime= true;
        else{
            for(int i=2;i<n;i++){
                if(n%i==0)
                    isPrime=false;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
