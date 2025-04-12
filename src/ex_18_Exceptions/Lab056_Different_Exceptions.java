package ex_18_Exceptions;

import java.io.FileInputStream;

public class Lab056_Different_Exceptions {
    public static void main(String[] args) {
        String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
        int output = 100/a; // java.lang.ArithmeticException: / by zero

        //FileInputStream fileInputStream = new FileInputStream("C://testdata.txt"); //Checked exception - FileNotFoundException

        String name= null;
        name.trim(); // java.lang.NullPointerException
    }
}
