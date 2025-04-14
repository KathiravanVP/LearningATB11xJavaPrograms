package Tasks.JavaCodingQuestions_Part6_For_While_Loops;

import java.util.Scanner;

public class Task047_Right_Angled_Triangle_For_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
