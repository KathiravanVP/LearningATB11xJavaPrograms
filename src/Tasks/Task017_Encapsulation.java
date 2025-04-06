package Tasks;

public class Task017_Encapsulation {
    public static void main(String[] args) {
        ATB stu1 = new ATB(1,"Kathir","11x");
        System.out.println(stu1.getId());
        System.out.println(stu1.getName());
        System.out.println(stu1.getCourseName());
        System.out.println("--------------");
        ATB stu2 = new ATB(2,"Mani","10x");
        System.out.println(stu2.getId());
        System.out.println(stu2.getName());
        System.out.println(stu2.getCourseName());
    }
}
class ATB{
    private int id;
    private String name;
    private String courseName;

    ATB(int id,String name, String courseName){
        this.id=id;
        this.name=name;
        this.courseName=courseName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
