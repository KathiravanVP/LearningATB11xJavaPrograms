package Tasks.JavaCodingQuestions_Part6_For_While_Loops;

public class Task042_Sum_1_to_100 {
    public static void main(String[] args) {
        System.out.println("For Loop");
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            sum1 = sum1 + i;
        }
        System.out.println(sum1);
        System.out.println("-------------------");
        System.out.println("While Loop");
        int sum2 = 0;
        int k = 0;
        while (k<=100){
            sum2 = sum2 + k;
            k++;
        }
        System.out.println(sum2);
    }
}
