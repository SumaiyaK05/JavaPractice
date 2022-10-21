package PracticePackage;

import java.util.Scanner;

//Square a number by multiplying it by itself
public class SquareANumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a  number: ");
        double num= sc.nextDouble();

        double square= num*num;
        System.out.println("Square of "+ num + " is: "+ square);
    }
}
