package week2homework;
//Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.)
public class Parameters {

    public static void main(String[] args) {  //Main method
        Parameters P=new Parameters();  //Created an object
        P.addition();  //called instance method using an object.
        P.multiplication(); //Called instance method using an object
        subtraction(20,17); //called static method directly
        divison(15,5);//called static method directly

    }

    public void addition(){  //Instance menthod
        int a =15, b = 39;
        System.out.println("Addition is  " +(a+b));

    }

    public int multiplication (){  //Instance method
        int c = 15, d=5;
        System.out.println("Multiplication is   "+(c*d));
        return c;
    }

    public static void subtraction(int e, int f){ //static method

        System.out.println("Subtraction is "   +(e-f));
    }

    public static int divison (int g, int h){ //statich method
        int c =g/h;
        System.out.println("Division is " +(g/h));
        return c;
    }

}





