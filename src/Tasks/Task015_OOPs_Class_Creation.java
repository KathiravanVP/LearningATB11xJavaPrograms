package Tasks;

public class Task015_OOPs_Class_Creation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.intro();
        p1.personDetails("Kathiravan", 25, "Male");
        String contact = p1.contactDetails("9710275935");
        System.out.println("Contact Number - "+contact);
        boolean marriage = p1.marriageDetails();
        System.out.println("Is Person married - "+marriage);
    }
}
class Person{
    String name;
    byte age;
    double weight;
    double height;
    String mobileNo;
    String email;
    String gender;
    String skinColor;
    boolean isMarried;
    double salary;

    void intro(){
        System.out.println("This is my introduction");
    }

    void personDetails(String name, int age, String gender){
        System.out.println("Name - "+name+"\nAge - "+age+"\nGender - "+gender);
    }

    boolean marriageDetails(){
        isMarried=false;
        return isMarried;
    }

    String contactDetails(String mobileNo){
        return mobileNo;
    }
}
