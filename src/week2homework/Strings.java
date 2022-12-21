package week2homework;

import com.sun.javafx.binding.StringFormatter;

public class Strings {


    public static void main(String[] args) {
        String name = "Kuldip";
        String name1= " patel ";

        int len = name.length();
        String rev ="";

        for (int i =len-1; i>=0; i--)
            rev = rev +name.charAt(i);

        System.out.println("Lenght of String is = "  +name.length());
        System.out.println("Character is "  +name .charAt(0));
        System.out.println("Concat is "  +name .concat(name));
        System.out.println("Contain is " +name .contains(name));
        System.out.println("Start with"  +name .startsWith("K"));
        System.out.println("Ends with"  +name .endsWith("p"));
        System.out.println("Equals is "  +name1 .equals(name));
        System.out.println("Index is "  +name .indexOf("u"));
        System.out.println("Empty"  +name .isEmpty());
        System.out.println("Replace"   +name .replace("K","C"));
        System.out.println("CharArray is" +name .toCharArray());
        System.out.println("Lowercase "  +name .toLowerCase());
        System.out.println("Uppercase" + name1 .toUpperCase());
        System.out.println("Trim "+name1.trim());
        System.out.println("The substring is:" + name.substring(2));
        System.out.println(rev);// Reverse string






    }

}

