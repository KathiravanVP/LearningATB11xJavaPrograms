package ex_05_Strings;

public class Lab023_StringBuilder_and_Functions {
    public static void main(String[] args) {
        StringBuilder strBui1 = new StringBuilder("Welcome");
        System.out.println("Initial String: "+strBui1);

        //1. append
        strBui1.append(" to Java");
        System.out.println("Append: "+strBui1);

        //2. insert(int index, String s)
        strBui1.insert(7," you all");
        System.out.println("Insert: "+strBui1);

        //3. replace(int start, int end, String s)
        strBui1.replace(8,15,"everyone");
        System.out.println("Replace: "+strBui1);

        //4. delete(int start, int end)
        strBui1.delete(7,16);
        System.out.println("Delete: "+strBui1);

        //5. reverse()
        strBui1.reverse();
        System.out.println("Reverse: "+strBui1);
        strBui1.reverse();

        //6. capacity()
        System.out.println("Capacity: "+strBui1.capacity());

        //7. ensureCapacity(int minCapacity)
        strBui1.ensureCapacity(50);
        System.out.println("After Ensure Capacity: "+strBui1.capacity());

        //8. charAt(int index)
        System.out.println("CharAt: "+strBui1.charAt(11));

        //9. setCharAt(int index, char ch)
        strBui1.setCharAt(8,'T');
        System.out.println("Set CharAt: "+strBui1);

        //10. length()
        System.out.println("Length: "+strBui1.length());

        //11. substring(int start)
        System.out.println("Substring: "+strBui1.substring(11));

        //12. substring(int start, int end)
        System.out.println("Substring in Range: "+strBui1.substring(8,15));

        //13. toString()
        System.out.println("To String: "+strBui1.toString());

        //14. trimToSize()
        strBui1.trimToSize();
        System.out.println("After Trim: "+strBui1.capacity());
    }
}
