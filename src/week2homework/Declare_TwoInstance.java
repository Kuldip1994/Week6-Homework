package week2homework;


// 1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print
//statement. 1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme.
public class Declare_TwoInstance {

    String name= "Kuldip";   //Instance variables
    int a =15;             //Instance variables

    public void l1 () {    //Instance method

        System.out.println (name);
        System.out.println(a);

    }

    public static void main(String[] args) {    //main method

        Declare_TwoInstance k = new Declare_TwoInstance();   //create the object
        k.l1();            // Declare the object


    }

}
