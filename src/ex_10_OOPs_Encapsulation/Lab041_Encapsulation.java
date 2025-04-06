package ex_10_OOPs_Encapsulation;

public class Lab041_Encapsulation {
    public static void main(String[] args) {
        Login log = new Login("admin", "passkey123");
        log.setUserName("Kathir");
        System.out.println(log.getUserName());
        log.setPassWord("123@pass",true);
        System.out.println(log.getPassWord());
    }
}
class Login{

    private String userName;
    private String passWord;

    Login(String usr, String pwd){
        this.userName=usr;
        this.passWord=pwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord, boolean isAdmin) {
        if (isAdmin) {
            this.passWord = passWord;
        }else{
            System.out.println("Not allowed to change the password!");
        }
    }
}
