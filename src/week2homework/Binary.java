package week2homework;
//Input Data:
//Input first binary number: 10
//Input second binary number: 11
//Expected Output:
//
//Sum of two binary numbers: 101
public class Binary {

    public static void main(String[] args) { //main method

        byte b= 0b10; //local variable
        byte c= 0b11;
        int result;
        result = b+c;


        System.out.println("Sum of Binary is "+(Integer.toBinaryString(result))); //method for binary

    }
}
