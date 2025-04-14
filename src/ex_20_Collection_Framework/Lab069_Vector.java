package ex_20_Collection_Framework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab069_Vector {
    public static void main(String[] args) {
        Vector dataTypes = new Vector();
        dataTypes.add("int");
        dataTypes.add("char");
        dataTypes.add("byte");
        dataTypes.add("double");
        dataTypes.add("string");
        dataTypes.add("float");
        dataTypes.add("boolean");
        System.out.println(dataTypes);
        dataTypes.remove("float");
        System.out.println(dataTypes);

        System.out.println("--------------------------------");
        System.out.println("For Loop");
        for(int i=0;i<dataTypes.size();i++){
            System.out.println(dataTypes.get(i));
        }

        System.out.println("--------------------------------");
        System.out.println("For Each Loop");
        for(Object o : dataTypes){
            System.out.println(o);
        }

        System.out.println("--------------------------------");
        System.out.println("Iterator");
        Iterator iterator = dataTypes.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("--------------------------------");
        System.out.println("Enumeration");
        Enumeration<Object> enumeration = dataTypes.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("--------------------------------");
        System.out.println("List Iterator");

        ListIterator listIterator = dataTypes.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("--------------------------------");
        System.out.println("Backward Direction");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
