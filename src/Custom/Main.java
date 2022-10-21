package Custom;

import javax.xml.namespace.QName;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee1;
        employee1= new Employee("Sara Matar", "S12543", "sara@gmail.com", 014200000, 25);
       // employee1.employeeInfo("Sara Matar", "S12543", "sara@gmail.com", 014200000, 25);

        Employee employee2=new Employee("Raba", "R67748", "raba@gmail.com", 289938, 24);
       // second.employeeInfo("Raba", "R67748", "raba@gmail.com", 289938, 24);

        System.out.println(employee1.id);
        System.out.println(employee2.age);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        String x =sc.next();

        System.out.println(employee1.email);

        employee1.email = "ashkiur@gmail.com"; //i is an object and email is a member of the object
        System.out.println(employee1.email);
        System.out.println(employee2.email);

        if(x.equals(employee1.id)){
            System.out.println(employee1.name);
        }else{
            System.out.println("Not found");
        }

        double employee1Salary = employee1.monthlySalary(18);
        double employee2Salary= employee2.monthlySalary(20);
        System.out.println("employee 1 salary is "+ employee1Salary+
                "\nemployee 2 salary is "+ employee2Salary);



    }
}





//    //        Student x;
//    Student x = new Student();
//        x.setValue("cse", "Siyana", "1234", "siyana@uts.com", 3.20);
//
//                System.out.println(x.cgpa);
//