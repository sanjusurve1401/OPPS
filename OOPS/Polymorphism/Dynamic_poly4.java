/*
 * Implementation of get details method in the Professor parent class 
 */

public class Dynamic_poly4{
    public static void main(String[] args){
        Student4 s1 = new Student4("SANJEET", 2);

        ResearchStudent4 s2 = new ResearchStudent4("Mihika", 1, "IOT");
      
        PhD4 s3 = new PhD4("Vanshika", 3, "Software", "FSD");
        
        Professor4 p1 = new Professor4("KC", 2165324);
        person1[] array = {p1, s1, s2, s3};
        printdetails(array);
    }

    public static void printdetails(person1[] person1s){
        for(person1 person1 : person1s){
            System.out.println(person1.getDetails());
        }
    }

}
class person1{
    protected final String name;

    public person1(String name) {
        this.name = name;
    }

    public String getDetails() {      
        // this is default statement if any sub-class does not have getDetails function then will be printed
        return "\nno data";
    }   
}

class Student4 extends person1{
    protected int year;
    protected static final int annualFees = 10000;

    public Student4(String name, int year){
        super(name);
        this.year = year;
    }

    public float computeFees(){
        return Student4.annualFees * this.year;
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
class Professor4 extends person1{
    private static final float startingSalary = 50000;
    private int empNum;

    public Professor4(String name, int empNum) {
        super(name);
        this.empNum = empNum;
    }
    public String getDetails(){
        return "\nName: "+this.name+
        "\nSalary: " + this.startingSalary;
    }
}
class ResearchStudent4 extends Student4{
    private String ResearchArea;

    public ResearchStudent4(String name, int year, String ResearchArea) {
        super(name, year);
        this.ResearchArea = ResearchArea;
    }

    public String getDetails(){
        return super.getDetails() + "\nResearch Area: "+this.ResearchArea;
    }
}
class PhD4 extends ResearchStudent4{
    private String Thesis;

    public PhD4(String name, int year, String ResearchArea, String Thesis) {
        super(name, year, ResearchArea);
        this.Thesis = Thesis;
    }

    public String getDetails(){
        return super.getDetails()+ "\nThesis: " + this.Thesis;
    }
}