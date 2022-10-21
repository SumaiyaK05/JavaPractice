import java.util.Scanner;

public class NumberConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        double num = sc.nextDouble();

        double getValue = kmToMile(num);
        System.out.println(getValue + " mile");

        if( getValue == num*0.62){
            System.out.println("The number has been converted successfully");
        }else{
            System.out.println("Error!");
        }

    }

    public static double kmToMile(double valueOfKm){
        double mile  = valueOfKm* 0.62;
        return mile;
    }

}

