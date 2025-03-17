package Task_01;

public class Lab014_CLI_User_Input {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);
        System.out.println("User name : "+name);
        System.out.println("User age : "+age);
        System.out.println("User salary : "+salary);
    }
}
