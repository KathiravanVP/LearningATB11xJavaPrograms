package Tasks.JavaCodingQuestions_Part2;

import java.util.Scanner;

public class Task030_ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acc_balance = 10000;
        System.out.println("Enter the amount to withdraw: ");
        double withDraw = sc.nextDouble();
        if(withDraw<=0)
            System.out.println("The withdrawal amount should be greater than zero");
        else if(withDraw>acc_balance)
            System.out.println("Insufficient balance");
        else if(withDraw%100!=0)
            System.out.println("The withdrawal amount should be a multiple of 100");
        else
            acc_balance=acc_balance-withDraw;

        System.out.println("Account Balance: "+acc_balance);
    }
}
