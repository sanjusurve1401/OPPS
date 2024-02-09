/*
 * Static polymorphism.
 * here we used the same name of method but different parameter in it and it also known as compile time polymorphism
 * We implement it on the computefees method 
 * we create 2 method with same name but with different parameters
 * 
 * public float computeFees()
 * public float computeFees(int annualFees)`
 * 
 * we can see the difference in the parameteres but not in the name the type of variable using 
 * 
 * Compiler understand when to invoked which method
 * 
 * 
 * System.out.println(s1.getDetails()); FOr this statement
 * public float computeFees()           Compiler uses this method
 * 
 * System.out.println(s3.computeFees(500000)); FOr this statement
 * public float computeFees(int annualFees)    Compiler uses this method
 */


public class poly1{
    public static void main(String[] args){
        Student s1 = new Student("SANJEET", 2);
        System.out.println(s1.getDetails());

        ResearchStudent s2 = new ResearchStudent("Mihika", 1, "IOT");
        System.out.println(s2.getDetails());
        System.out.println(s2.computeFees(100000));

        PhD s3 = new PhD("Vanshika", 3, "Software", "FSD");
        System.out.println(s3.getDetails());
        System.out.println(s3.computeFees(500000));
    }
}
class Student{
    private final String name;
    private int year;
    private static final int annualFees = 10000;

    public Student(String name, int year){
        this.name = name;
        this.year = year;
    }

    public float computeFees(){
        return Student.annualFees * this.year;
    }
    
    public float computeFees(int annualFees){
        return annualFees * this.year;
    }

    public String getDetails(){
        return "\nName: "+this.name+
        "\nYear: "+this.year+
        "\nCompute Fees"+computeFees();
    }
}
class ResearchStudent extends Student{
    private String ResearchArea;

    public ResearchStudent(String name, int year, String ResearchArea) {
        super(name, year);
        this.ResearchArea = ResearchArea;
    }

    public String getDetails(){
        return super.getDetails() + "\nResearch Area: "+this.ResearchArea;
    }
}
class PhD extends ResearchStudent{
    private String Thesis;

    public PhD(String name, int year, String ResearchArea, String Thesis) {
        super(name, year, ResearchArea);
        this.Thesis = Thesis;
    }

    public String getDetails(){
        return super.getDetails()+ "\nThesis: " + this.Thesis;
    }
}
