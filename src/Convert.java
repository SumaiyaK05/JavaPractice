import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number: ");
        double v= sc.nextDouble();
        double returnValue= kmToMile(v);
        System.out.println(returnValue + " mile");


        v=sc.nextDouble();
        returnValue= returnValue+ kmToMile(v);
        System.out.println(returnValue+ " mile");
        System.out.println("Successfully converted");
    }

    public static double kmToMile(double valueOfKm){
        double mile  = valueOfKm* 0.62;
        return mile;
    }
}
