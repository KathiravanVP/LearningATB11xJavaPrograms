package ex_06_Arrays;

public class Lab029_Sum_Of_Array {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum = sum +arr[i];
        }
        System.out.println("Sum of Array: "+sum);
    }
}
