/*
 * Abstract 
 * here we created a person class and the professor class 
 * professor and student are 2 different preson's 
 * 
 * In prof. class we have there name, Empolyee number and salary
 * 
 * but person class just have the name in it so we used it as a parent class 
 * we extend the student and give the super(name) in it 
 * same for the prof. class
 */

public class Dynamic_poly3{
    public static void main(String[] args){
        Student3 s1 = new Student3("SANJEET", 2);

        ResearchStudent3 s2 = new ResearchStudent3("Mihika", 1, "IOT");
      
        PhD3 s3 = new PhD3("Vanshika", 3, "Software", "FSD");
        
        Professor p1 = new Professor("KC", 2165324);
        person[] array = {p1, s1, s2, s3};
        printdetails(array);
    }

    public static void printdetails(person[] persons){
        for(person person : persons){
            System.out.println(person.getDetails());
        }
    }

}
class person{
    protected final String name;

    public person(String name) {
        this.name = name;
    }

    public String getDetails() {
        return "\nno data";
    }   
}

class Student3 extends person{
    protected int year;
    protected static final int annualFees = 10000;

    public Student3(String name, int year){
        super(name);
        this.year = year;
    }

    public float computeFees(){
        return Student3.annualFees * this.year;
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
class Professor extends person{
    private static final float startingSalary = 50000;
    private int empNum;

    public Professor(String name, int empNum) {
        super(name);
        this.empNum = empNum;
    }
}
class ResearchStudent3 extends Student3{
    private String ResearchArea;

    public ResearchStudent3(String name, int year, String ResearchArea) {
        super(name, year);
        this.ResearchArea = ResearchArea;
    }

    public String getDetails(){
        return super.getDetails() + "\nResearch Area: "+this.ResearchArea;
    }
}
class PhD3 extends ResearchStudent3{
    private String Thesis;

    public PhD3(String name, int year, String ResearchArea, String Thesis) {
        super(name, year, ResearchArea);
        this.Thesis = Thesis;
    }

    public String getDetails(){
        return super.getDetails()+ "\nThesis: " + this.Thesis;
    }
}