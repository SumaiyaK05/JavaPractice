package Custom;

public class Employee {


    public String name,id,email;
    public int age, contactNumber;

    private double dailySalary= 1000;

    public double monthlySalary(int daysOfWorking){
        double x= dailySalary*daysOfWorking;
        return x;
    }
    //write a function to calculate monthly salary
    //Notes: as parameter take days of working, return monthly salary

//    public void employeeInfo(String name, String id, String email, int contactNumber, int age){
//        this.name=name;
//        this.id=id;
//        this.email=email;
//        this.contactNumber=contactNumber;
//        this.age=age;
//    }

    public Employee(String name, String id, String email, int contactNumber, int age){
        this.name=name;
        this.id=id;
        this.email=email;
        this.contactNumber=contactNumber;
        this.age=age;
    }
}
