package ex_06_Arrays;

public class Lab031_2D_Array {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] arr2 = new int[3][3];
        arr2[0][0] = 11;
        arr2[0][1] = 22;
        arr2[0][2] = 33;
        arr2[1][0] = 44;
        arr2[1][1] = 55;
        arr2[1][2] = 66;
        arr2[2][0] = 77;
        arr2[2][1] = 88;
        arr2[2][2] = 99;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
