/*
 * When to use abstract classes:-
 * 
 * 1. use abstract class only when we are sure of the class hierarchy
 * 2. if we wish to share some common code amomgst classes but also let them have their own 
 * implementations of common methods then only use the abstract classes
 * 3. When we wish to create multiple instances of a common class
 * 
 * 
 * When to use the Interface:-
 * 1.When we want the subclasses to implement some mandatory behaviour in a method
 * 2.When we want to implement some characteristics and behaviour multiple source 
 * 
 * If we want to extend more then 1 super()classes in java that is not allowed but 
 * it is allowed more than one interfaces in the java
 */


public class Interfaces{
    public static void main(String[] args){
        Student6 s1 = new Student6(11, 2);

        ResearchStudent6 s2 = new ResearchStudent6(23, 1, "IOT");
      
        PhD6 s3 = new PhD6(123, 3, "Software", "FSD");
        
        Professor6 p1 = new Professor6(2166324);

        person6[] array = {s1, s2, s3, p1};
        printdetails(array);
    }

    public static void printdetails(person6[] person6s){
        for(person6 person6 : person6s){
            System.out.println(person6.getDetails());
            System.out.println("Salary: "+person6.computeSalary());
        }
    }

}

interface person6{ 
    
    public abstract String getDetails();  
    public abstract float computeSalary();
}

class Student6 implements person6{
    protected final int rollNum;
    protected int year;
    protected static final int annualFees = 10000;
    protected static final int annualSalary = 15000;


    public Student6(int rollNum, int year) {
        this.rollNum = rollNum;
        this.year = year;
    }

    public float computeFees(){
        return Student6.annualFees * this.year;
    }

    public float computeSalary(){
        return Student6.annualFees * this.year;
    }

    public String getDetails(){
        return "\nRoll Number: "+ rollNum+ "\nFees: "+this.computeFees();
    }
}
class Professor6 implements person6{
    private static final float startingSalary = 60000;
    private int empNum;

    public Professor6(int empNum) {
        this.empNum = empNum;
    }

    public float computeSalary(){
        return this.startingSalary;
    }
    public String getDetails(){
        return "\nEmployee Number: "+this.empNum;
    }
}
class ResearchStudent6 extends Student6{
    protected String ResearchArea;
    private static final int annnualFees = 100000;

    public ResearchStudent6(int rollNum, int year, String ResearchArea) {
        super(rollNum, year);
        this.ResearchArea = ResearchArea;
    }
    public float computeFees(){
        return Student6.annualFees * this.year * 0.9f;
    }

    public String getDetails(){
        return super.getDetails() + "\nResearch Area: "+this.ResearchArea;
    }
}
class PhD6 extends ResearchStudent6{
    private String Thesis;

    public PhD6(int rollNum, int year, String ResearchArea, String Thesis) {
        super(rollNum, year, ResearchArea);
        this.Thesis = Thesis;
    }

    public String getDetails(){
        return super.getDetails()+ "\nThesis: " + this.Thesis;
    }
}