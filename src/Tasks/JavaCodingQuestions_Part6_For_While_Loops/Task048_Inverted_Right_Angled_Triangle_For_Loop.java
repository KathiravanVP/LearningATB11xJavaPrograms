package Tasks.JavaCodingQuestions_Part6_For_While_Loops;

import java.util.Scanner;

public class Task048_Inverted_Right_Angled_Triangle_For_Loop {
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
        sc.close();
    }
}
