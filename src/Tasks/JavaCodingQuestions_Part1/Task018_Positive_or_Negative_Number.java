package Tasks.JavaCodingQuestions_Part1;
import java.util.Scanner;
public class Task018_Positive_or_Negative_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num>0)
            System.out.println(num+" is a positive number");
        else if(num<0)
            System.out.println(num+" is a negative number");
        else if(num==0)
            System.out.println(num+ " is neutral number");
        sc.close();
    }
}
