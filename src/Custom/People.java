package Custom;

public class People {
    public String name, complexion, educationalQualification;
    public int age;
    public double height;


    public People(String name, int age, String complexion, String educationalQualification, double height){
        this.name=name;
        this.age=age;
        this.complexion=complexion;
        this.educationalQualification=educationalQualification;
        this.height=height;
    }


    public void work(boolean canWalk){
        if(canWalk){
            System.out.println(name+ " can walk");
        }else{
            System.out.println(name+ " can not walk");
        }
    }
    public void eat(String food){
        System.out.println(name+ " eats " + food);
    }
}
