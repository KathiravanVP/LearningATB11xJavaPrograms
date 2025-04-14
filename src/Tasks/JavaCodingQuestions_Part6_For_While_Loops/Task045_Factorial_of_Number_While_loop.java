package Tasks.JavaCodingQuestions_Part6_For_While_Loops;

public class Task045_Factorial_of_Number_While_loop {
    public static void main(String[] args) {
        int n = 6;
        int fact = 1;
        int i = 1;
        while(i<=n){
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
