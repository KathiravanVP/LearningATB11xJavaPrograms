package ex_20_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab071_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";
        while(continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name");
            String name = sc.next();
            names.add(name);

            System.out.println("Enter the age");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            continueInput = sc.nextLine();
        }
        for (Object o1: names){
            System.out.println(o1);
        }
        for (Object o2: ages){
            System.out.println(o2);
        }
        sc.close();
    }
}
