package ex_20_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab073_ArrayList_Student {
    public static void main(String[] args) {
        Student s1 = new Student("Arun",1001);
        Student s2 = new Student("Banu",1002);
        Student s3 = new Student("Clin",1003);

        List<Student> students = new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
class Student{
    private String name;
    private int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails(){
        System.out.println("Student name: "+this.name);
        System.out.println("Roll Number: "+this.rollNo);
        System.out.println("---------------------------------");
    }
}