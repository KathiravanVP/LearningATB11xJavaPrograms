package Tasks.JavaCodingQuestions_Part5_While_Loops;

public class Task042_Print_even_numbers_from_1_20 {
    public static void main(String[] args) {
        int i=1;
        while(i<=20){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
