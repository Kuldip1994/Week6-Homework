package week2homework;
//Write a Java program to print the sum (addition), multiply, subtract, divide and
//remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5
public class AddMulSubDiv { //declare class

    public static void main(String[] args) { //main method

        int a = 125;  //local variable
        int  b = 24;   //local variable

        System.out.println("Addition       = "+(a+b));  //to print statement
        System.out.println("Subtraction    = "+(a-b));
        System.out.println("Multiplication = "+(a*b));
        System.out.println("Division     ="   +(a/b));
        System.out.println("mod          ="   +(a%b));

    }
}
