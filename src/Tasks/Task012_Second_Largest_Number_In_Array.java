package Tasks;

public class Task012_Second_Largest_Number_In_Array {
    public static void main(String[] args) {
        int[] arr = {35, 85, 50, 15, 36, 99, 5, 105, 29, 61};
        int larg=0;
        int sec_larg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                sec_larg=larg;
                larg=arr[i];
            }
            if(arr[i]>sec_larg && arr[i]!=larg)
                sec_larg=arr[i];
        }
        System.out.println("Second Largest no: "+sec_larg);
    }
}
