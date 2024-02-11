/*
 * Abstarct class means the a partially implemented class
 * may have abstarct methods - methods that only have a declaration and no definition
 * through this implementation we do not have to used the dummy implementation
 * 
 * We can just make a abstarct method just to complete the class code 
 * 
 * Note:
 * 1. Abstract method of an abstract class must be defined in its subclass
 * 2. if the subclass does not provide definition for the abstract method
 * then the subclass has to be declared abstract too.
 * 3. Abstract class can not be instantiated (mnje obj nhi karu shakt tyacha)
 * 4. abstract classes can only be sub-classed
 * 5. the sub-class must provide implementation for all the abstract method in order to be a 
 * non-abstract class
 */

 public class Abstract1{
    public static void main(String[] args){
        Student5 s1 = new Student5("SANJEET", 2);

        ResearchStudent5 s2 = new ResearchStudent5("Mihika", 1, "IOT");
      
        PhD5 s3 = new PhD5("Vanshika", 3, "Software", "FSD");
        
        Professor5 p1 = new Professor5("KC", 2165324);
        person5[] array = {s1, s2, s3, p1};
        printdetails(array);
    }

    public static void printdetails(person5[] person5s){
        for(person5 person5 : person5s){
            System.out.println(person5.getDetails());
        }
    }

}
abstract class person5{         // changed the class to abstract class
    protected final String name;

    public person5(String name) {
        this.name = name;
    }

    // Currently we do not have proper used it is only for compeleting the data 
    // public String getDetails() {      
    //     return "\nno data";
    // }   

    public abstract String getDetails();       // abstract method
}

class Student5 extends person5{
    protected int year;
    protected static final int annualFees = 10000;

    public Student5(String name, int year){
        super(name);
        this.year = year;
    }

    public float computeFees(){
        return Student5.annualFees * this.year;
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
class Professor5 extends person5{
// abstract class Professor5 extends person5{       we can't make abstract class for the professor
    private static final float startingSalary = 50000;
    private int empNum;

    public Professor5(String name, int empNum) {
        super(name);
        this.empNum = empNum;
    }
    // public String getDetails(){
    //     return "\nName: "+this.name+
    //     "\nSalary: " + this.startingSalary;
    // }
    public String getDetails(){
        return "\nName: "+this.name+
        "\nSalary: " + this.startingSalary;
    }


    public float computeSalary(){
        return this.startingSalary;
    }
}
class ResearchStudent5 extends Student5{
    private String ResearchArea;

    public ResearchStudent5(String name, int year, String ResearchArea) {
        super(name, year);
        this.ResearchArea = ResearchArea;
    }

    public String getDetails(){
        return super.getDetails() + "\nResearch Area: "+this.ResearchArea;
    }
}
class PhD5 extends ResearchStudent5{
    private String Thesis;

    public PhD5(String name, int year, String ResearchArea, String Thesis) {
        super(name, year, ResearchArea);
        this.Thesis = Thesis;
    }

    public String getDetails(){
        return super.getDetails()+ "\nThesis: " + this.Thesis;
    }
}