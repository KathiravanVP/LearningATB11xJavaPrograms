package ex_20_Collection_Framework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab077_Comparator {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1001,"Kathir",25);
        Student1 s2 = new Student1(1002,"Valar",21);
        Student1 s3 = new Student1(1003,"Sami",14);

        List<Student1> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList, new AgeComparator());
        System.out.println(studentList);
    }
}

class AgeComparator implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getAge() - o2.getAge();
    }
}

class NameComparator implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class RollNoComparator implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getRollNo()- o2.getRollNo();
    }
}


class Student1 {
    private int rollNo;
    private String name;
    private int age;

    Student1(int rollNo,String name, int age){
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

}
