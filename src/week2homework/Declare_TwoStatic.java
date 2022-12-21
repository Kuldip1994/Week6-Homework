package week2homework;

//2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print
//statement. 2.4 Declare the Main method.
//2.5 Call the static method into the Main method and Run the programme.

public class Declare_TwoStatic {

    static String name = "Alex";    //Static variables
    static String lname = "Josh";  //Static variables

    public static void l2() {     //Static method
        System.out.println(name);
        System.out.println(lname);
    }

    public static void main(String[] args) {  //Declared Main method
        System.out.println(name);  //static to static direct access
        System.out.println(lname);  //static to static direct access
    }

}
