package ex_20_Collection_Framework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab076_Comparable {
    public static void main(String[] args) {
        Student s1 = new Student(1001,"Kathir",25);
        Student s2 = new Student(1002,"Valar",21);
        Student s3 = new Student(1003,"Sami",14);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList);
        System.out.println(studentList);
    }
}

class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int age;

    Student(int rollNo,String name, int age){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
