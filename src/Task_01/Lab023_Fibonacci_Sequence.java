package Task_01;
import java.util.Scanner;

public class Lab023_Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci Sequence: ");
        int num=sc.nextInt();
        int n1=0,n2=1,sum;
        System.out.print(n1+" "+n2);
        for(int i =0;i<num-2;i++){
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
}
