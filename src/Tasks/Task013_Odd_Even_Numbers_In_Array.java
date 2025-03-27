package Tasks;

public class Task013_Odd_Even_Numbers_In_Array {
    public static void main(String[] args) {
        int[] arr = {35, 82, 50, 15, 36, 99, 5, 120, 29, 66};
        for (int num : arr){
            if(num%2==0)
                System.out.println("Even Number - "+num);
            if(num%2!=0)
                System.out.println("Odd Number - "+num);
        }
    }
}
