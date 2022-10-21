package PracticePackage;

import java.util.Scanner;

//Square a number with the Math.pow method
public class SquareNumberByMethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num= sc.nextDouble();

        double square= Math.pow(num, 2);
        System.out.println("Square of "+ num + " is: "+ square);
    }
}
