/*
 * Dynamic Polymorphism
 * here we have sub-classes of the of students class like research students its sub class is PhD student
 * so we can them drectly by our parent class that is with Student class
 * or Directly with the obj of the parent class directly as we can see below
 */



 public class Dynamic_poly1{
    public static void main(String[] args){
        Student1 s1 = new Student1("SANJEET", 2);
        System.out.println(s1.getDetails());

        // ResearchStudent1 s2 = new ResearchStudent1("Mihika", 1, "IOT");
    //    Student1 s2 = new ResearchStudent1("Mihika", 1, "IOT");
       s1 = new ResearchStudent1("Mihika", 1, "IOT");
        System.out.println(s1.getDetails());
        //System.out.println(s1.computeFees(100000));

        PhD1 s3 = new PhD1("Vanshika", 3, "Software", "FSD");
        System.out.println(s3.getDetails());
        System.out.println(s3.computeFees(500000));
    }
}
class Student1{
    private final String name;
    private int year;
    private static final int annualFees = 10000;

    public Student1(String name, int year){
        this.name = name;
        this.year = year;
    }

    public float computeFees(){
        return Student1.annualFees * this.year;
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
class ResearchStudent1 extends Student1{
    private String ResearchArea;

    public ResearchStudent1(String name, int year, String ResearchArea) {
        super(name, year);
        this.ResearchArea = ResearchArea;
    }

    public String getDetails(){
        return super.getDetails() + "\nResearch Area: "+this.ResearchArea;
    }
}
class PhD1 extends ResearchStudent1{
    private String Thesis;

    public PhD1(String name, int year, String ResearchArea, String Thesis) {
        super(name, year, ResearchArea);
        this.Thesis = Thesis;
    }

    public String getDetails(){
        return super.getDetails()+ "\nThesis: " + this.Thesis;
    }
}