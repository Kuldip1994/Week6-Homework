package week2homework;
//Write a Java program to swap two variables.
public class Swap_Variable {

    public static void main(String[] args) { //main method

        int a, b, tp; //local variable
        a=7;
        b=8;
        System.out.println("Before Swapping : a, b = "+a+",  "+ +b);
        tp=a;
        a=b;
        b=tp;

        System.out.println("After Swapping : a,b = "+a+", "+ + b);
    }
}
