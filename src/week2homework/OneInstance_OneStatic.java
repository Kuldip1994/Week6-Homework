package week2homework;

//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//
//3.4 Call both instance and static variables i
//nto both instance and static methods inside the print statement.
//
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.
public class OneInstance_OneStatic {
    String name= "josh";  //instance variable
    static String lname = "West";  //static variable

    public void l1() {   //instance method
        System.out.println(name);  //instance variable
        System.out.println(lname);  // static variable into instance method

    }
        public static void l2()  {   //static method
            OneInstance_OneStatic I = new OneInstance_OneStatic();  //obejct creation
            System.out.println(I.name); //instance to static access throgh object
            System.out.println(lname); //static variable to static directly
        }

    public static void main(String[] args) {

        OneInstance_OneStatic I = new OneInstance_OneStatic();
        I.l1(); //called instance method access through object
        l2(); //called static method to static directly

    }


}
