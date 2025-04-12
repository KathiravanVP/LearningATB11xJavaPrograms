package ex_18_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab060_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
