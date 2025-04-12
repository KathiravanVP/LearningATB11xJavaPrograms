package ex_19_Generics;

public class Lab064_Generics_Class {
    public static void main(String[] args) {
        GenericClass<Integer> intObjRef = new GenericClass(5);
        GenericClass<String> stringObjRef = new GenericClass("Kathir");
    }
}

class GenericClass<T>{
    private T data;

    public GenericClass(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

}
