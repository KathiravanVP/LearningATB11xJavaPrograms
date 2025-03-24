package ex_05_Strings;

public class Lab021_String_Functions {
    public static void main(String[] args) {
        String name = "Kathiravan";
        //1. charAt
        System.out.println("CharAt: "+name.charAt(4));

        //2. concat
        System.out.println("Concat: "+name.concat(" V P"));

        //3. contains
        System.out.println("Contains: "+name.contains("avan"));

        //4. equals
        System.out.println("Equals: "+name.equals("Kathir"));

        //5. equalsIgnoreCase
        System.out.println("Equals Ignore Case: "+name.equalsIgnoreCase("kathiravan"));

        //6. indexOf
        System.out.println("Index Of: "+name.indexOf('a'));

        //7. length
        System.out.println("Length: "+name.length());

        //8. replace
        System.out.println("Replace: "+name.replace('a','_'));

        //9. split
        String[] str = name.split("a");
        System.out.println("Split: ");
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);

        //10. substring
        System.out.println("Substring: "+name.substring(0,6));

        //11. toLowerCase
        System.out.println("To Lower Case: "+name.toLowerCase());

        //12. toUpperCase
        System.out.println("To Upper Case: "+name.toUpperCase());

        // 13. startsWith()
        System.out.println("Starts With: "+name.startsWith("K"));

        // 14. endsWith()
        System.out.println("Ends With: "+name.endsWith("c"));

        // 15. trim()
        String str1 = "    Trim String before and after  ";
        System.out.println("Trim: "+str1.trim());

        // 16. compareTo()
        System.out.println("Compare To: "+name.compareTo("Kathir"));
    }
}
