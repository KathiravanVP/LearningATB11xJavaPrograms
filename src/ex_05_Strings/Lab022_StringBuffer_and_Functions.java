package ex_05_Strings;

public class Lab022_StringBuffer_and_Functions {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial String: "+sb);

        //1. append
        sb.append(" everyone");
        System.out.println("Append: "+sb);

        //2. insert(int index, String s)
        sb.insert(5," Welcome");
        System.out.println("Insert: "+sb);

        //3. replace(int start, int end, String s)
        sb.replace(0,5,"Hi");
        System.out.println("Replace: "+sb);

        //4. delete(int start, int end)
        sb.delete(3,11);
        System.out.println("Delete: "+sb);

        //5. reverse()
        sb.reverse();
        System.out.println("Reverse: "+sb);
        sb.reverse();

        //6. capacity()
        System.out.println("Capacity: "+sb.capacity());

        //7. ensureCapacity(int minCapacity)
        sb.ensureCapacity(50);
        System.out.println("After Ensure Capacity: "+sb.capacity());

        //8. charAt(int index)
        System.out.println("CharAt: "+sb.charAt(0));

        //9. setCharAt(int index, char ch)
        sb.setCharAt(3,'E');
        System.out.println("Set CharAt: "+sb);

        //10. length()
        System.out.println("Length: "+sb.length());

        //11. substring(int start)
        System.out.println("Substring: "+sb.substring(3));

        //12. substring(int start, int end)
        System.out.println("Substring in Range: "+sb.substring(3,8));

        //13. toString()
        System.out.println("To String: "+sb.toString());

        //14. trimToSize()
        sb.trimToSize();
        System.out.println("After Trim: "+sb.capacity());
    }
}
