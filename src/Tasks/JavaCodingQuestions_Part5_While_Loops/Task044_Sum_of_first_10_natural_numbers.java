package Tasks.JavaCodingQuestions_Part5_While_Loops;

public class Task044_Sum_of_first_10_natural_numbers {
    public static void main(String[] args) {
        int i=1,sum=0;
        while(i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers: "+sum);
    }
}
