package Tasks;

public class Task007_Odd_Even_Numbers_Top20 {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println("Even --> "+i);
            }
            else{
                System.out.println("Odd --> "+i);
            }
        }
    }
}
