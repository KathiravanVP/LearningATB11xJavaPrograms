package ex_18_Exceptions;

public class Lab057_Handle_Exception {
    public static void main(String[] args) {
        int a=0;
        try{
            a=100/0;
        } catch (ArithmeticException e){
        System.out.println("Arithmetic Exception");
        }catch (Exception e) {
            System.out.println("Normal Exception");
        }
        System.out.println(a);
    }
}
