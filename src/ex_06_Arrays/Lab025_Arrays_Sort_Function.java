package ex_06_Arrays;

import java.util.Arrays;

public class Lab025_Arrays_Sort_Function {
    public static void main(String[] args) {
        int[] marks = {72,84,68,93,89};
        System.out.println("Before Sorting");
        for (int i : marks)
            System.out.print(i+" ");

        Arrays.sort(marks);
        System.out.println("\nAfter Sorting");
        for (int i : marks)
            System.out.print(i+" ");
    }
}
