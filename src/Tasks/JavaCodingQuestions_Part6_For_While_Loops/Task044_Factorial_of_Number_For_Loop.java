package Tasks.JavaCodingQuestions_Part6_For_While_Loops;

public class Task044_Factorial_of_Number_For_Loop {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
