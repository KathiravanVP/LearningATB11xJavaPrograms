package Tasks.JavaCodingQuestions_Part2;

import java.util.Scanner;

public class Task027_Grade_Based_on_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark: ");
        int mark = sc.nextInt();
        if(mark<0 || mark>100)
            System.out.println("Not a valid mark");
        else if(mark<=100 && mark>=90)
            System.out.println("Grade - A+");
        else if(mark<90 && mark>=80)
            System.out.println("Grade - A");
        else if(mark<80 && mark>=70)
            System.out.println("Grade - B");
        else if(mark<70 && mark>=60)
            System.out.println("Grade - C");
        else if(mark<60 && mark>=50)
            System.out.println("Grade - D");
        else if(mark<50 && mark>=40)
            System.out.println("Grade - E");
        else if(mark<40)
            System.out.println("Fail");
        sc.close();
    }
}
