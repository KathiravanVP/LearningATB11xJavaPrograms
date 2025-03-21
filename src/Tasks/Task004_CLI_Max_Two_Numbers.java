package Tasks;

public class Task004_CLI_Max_Two_Numbers {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int s= n1>n2 ? n1 : n2;
        System.out.println("Maximum of two number is - "+s);
    }
}
