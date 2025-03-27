package ex_06_Arrays;

public class Lab024_Arrays_Creation {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int[] arr1 = {6,7,8,9,10};
        String names[] = {"Kathir", "Karan", "Kalam"};
        System.out.println("--------------------");
        System.out.println(arr[2]);
        System.out.println(arr1[4]);
        System.out.println(names[0]);
        System.out.println("--------------------");

        String[] names1 =  {"Arun","Bala","Cathy"};
        System.out.println(names1.length);
        System.out.println(names1[0]);
        System.out.println(names1[2]);
        System.out.println(names1[1]);
        System.out.println("--------------------");

        String str[] = new String[3];
        str[0] = "Dino";
        str[1] = "Eliz";
        str[2] = "Fenn";

        for (int i=0;i< str.length;i++){
            System.out.println(str[i]);
        }
    }
}
