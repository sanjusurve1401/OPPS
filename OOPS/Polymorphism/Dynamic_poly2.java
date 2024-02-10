
/*
 * Dynamic  polymorphism (run time polymorphism)
 * here we make a printDetails funtion in main class
 * we created the array of student which includes the all obj of all classes
 * then we use the for loop to print the array in function
 * 
 * it helps to add more classes and implement the functionality 
 * with this for loop function in the main class
 */
public class Dynamic_poly2{
    public static void main(String[] args){
        Student2 s1 = new Student2("SANJEET", 2);
        // System.out.println(s1.getDetails());

        ResearchStudent2 s2 = new ResearchStudent2("Mihika", 1, "IOT");
        // System.out.println(s2.getDetails());
        // System.out.println(s2.computeFees(100000));

        PhD2 s3 = new PhD2("Vanshika", 3, "Software", "FSD");
        // System.out.println(s3.getDetails());
        // System.out.println(s3.computeFees(500000));

        Student2[] array = {s1, s2, s3};
        printDetails(array);
    }

    public static void printDetails(Student2[] students2){
        for(Student2 student : students2){
            System.out.println(student.getDetails());
        }
    }
}
class Student2{
    private final String name;
    private int year;
    private static final int annualFees = 10000;

    public Student2(String name, int year){
        this.name = name;
        this.year = year;
    }

    public float computeFees(){
        return Student2.annualFees * this.year;
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
class ResearchStudent2 extends Student2{
    private String ResearchArea;

    public ResearchStudent2(String name, int year, String ResearchArea) {
        super(name, year);
        this.ResearchArea = ResearchArea;
    }

    public String getDetails(){
        return super.getDetails() + "\nResearch Area: "+this.ResearchArea;
    }
}
class PhD2 extends ResearchStudent2{
    private String Thesis;

    public PhD2(String name, int year, String ResearchArea, String Thesis) {
        super(name, year, ResearchArea);
        this.Thesis = Thesis;
    }

    public String getDetails(){
        return super.getDetails()+ "\nThesis: " + this.Thesis;
    }
}