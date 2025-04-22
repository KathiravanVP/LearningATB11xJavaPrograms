package ex_20_Collection_Framework.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab082_HaspMap_Example {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap<>();

        student1.put("name","Diwakar");
        student1.put("phone","9876543210");
        student1.put("address1","Bangalore");
        student1.put("address2",123);

        Map<String,Object> student2 = new HashMap();
        student2.put("name","Lucky");
        student2.put("phone","96789876");
        student2.put("address1","Delhi");
        student2.put("address2",345);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
        System.out.println(student1);
    }
}
