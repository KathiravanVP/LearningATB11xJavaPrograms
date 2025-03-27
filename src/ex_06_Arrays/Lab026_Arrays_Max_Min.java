package ex_06_Arrays;

public class Lab026_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] arr = {35, 85, 50, 15, 36, 99, 5, 105, 29, 61};

        int max_no = max_array(arr);
        int min_no = min_array(arr);
        System.out.println("Maximum Number: "+max_no);
        System.out.println("Minimum Number: "+min_no);
    }

    public static int min_array(int[] array) {
        int max = array[0];
        for(int i : array){
            if(max>i){
                max=i;
            }
        }
        return max;
    }

    public static int max_array(int[] array) {
        int min = array[0];
        for(int i : array){
            if(min<i){
                min=i;
            }
        }
        return min;
    }
}
