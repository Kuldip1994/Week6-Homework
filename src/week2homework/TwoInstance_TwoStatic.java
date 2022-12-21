package week2homework;
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.
public class TwoInstance_TwoStatic {

    String name= "Smith";   //instance variable
    String lname= "John";  //instance variable

    static int a = 10;   //static variable
    static int b =15;   //static variable

    public void print () {     //instance method
        System.out.println(name);  //instance variable
        System.out.println(lname);  //instance variable
        System.out.println(a);   //static variable
        System.out.println(b);  //static variable

    }

    public static void print2() {  //static method
        TwoInstance_TwoStatic K = new TwoInstance_TwoStatic(); //object created to access instance variable into static method
        System.out.println(K.name);  //instance variable
        System.out.println(K.lname);  //instance variable
        System.out.println(a);   //static variable
        System.out.println(b);  //static variable

    }

    public static void main(String[] args) {   //Main method
        TwoInstance_TwoStatic  K =new TwoInstance_TwoStatic(); //object created
        K.print();  //called instance method to static method using object
        print2(); //called static method to static directly



    }
}
