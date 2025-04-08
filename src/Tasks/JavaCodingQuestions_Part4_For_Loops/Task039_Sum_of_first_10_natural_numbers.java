package Tasks.JavaCodingQuestions_Part4_For_Loops;

public class Task039_Sum_of_first_10_natural_numbers {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum = sum+i;
        }
        System.out.println("Sum of first 10 natural numbers: "+sum);
    }
}
