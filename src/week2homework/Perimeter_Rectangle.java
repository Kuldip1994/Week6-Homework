package week2homework;

//Write a Java program to print the area and perimeter of a rectangle.
//
//Test Data:
//Width = 5.5 Height = 8.5
//
//Expected Output:
//
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20

public class Perimeter_Rectangle {

    public static void main(String[] args) {   //main method


        double width = 5.5d;   //Floting point
        double height = 8.5d;
        double area =width*height;


        System.out.println("Area of Rectangle is "+area);
        System.out.println("Perimeter is   "+2*(width+height));

    }

}
