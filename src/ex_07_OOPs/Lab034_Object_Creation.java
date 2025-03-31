package ex_07_OOPs;

public class Lab034_Object_Creation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Kathir";
        s1.rollNo=10;
        System.out.println("Name - "+s1.name+"\nRoll Number - "+ s1.rollNo);
        s1.course();
    }
}
class Student{
    String name;
    int rollNo;
    void course(){
        System.out.println("This is a test course");
    }
}
