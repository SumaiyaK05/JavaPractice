package Custom;

public class Student {
    public String name, id, email, subject;
    public double cgpa;

    public void setValue(String subject, String name, String id, String stuEmail, double cgpa){
        this.subject = subject;
        this.cgpa = cgpa;
        this.name = name;
        this.id = id;
        this.email = stuEmail;
    }


}
