package Task_01;

import java.util.Scanner;

public class Lab017_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of side 1 : ");
        int s1 = sc.nextInt();
        System.out.print("Enter length of side 2 : ");
        int s2 = sc.nextInt();
        System.out.print("Enter length of side 3 : ");
        int s3 = sc.nextInt();

        if((s1==s2) && (s2==s3)){
            System.out.println("Equilateral Triangle");
        } else if ((s1==s2)&&(s1!=s3) || (s2==s3)&&(s2!=s1) || (s3==s1)&&(s3!=s2)) {
            System.out.println("Isosceles Triangle");
        } else if ((s1!=s2) && (s2!=s3) && (s3!=s1)) {
            System.out.println("Scalene Triangle");
        }
    }
}
