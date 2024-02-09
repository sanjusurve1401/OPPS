class Student{
    private final String name;
    private int year;
    private static final int annualFees = 10000;

    public Student(String Name, int Year){
        this.name = Name;
        this.year = Year;
    }

    public float computeFees(){
        return Student.annualFees * this.year;
    }

    public String getDetails(){
        return "\nName: "+this.name+
        "\nYear: "+ this.year+
        "\nFees: "+this.computeFees();
    }
}
class researchStudent extends Student{
    private String researchArea;

    public researchStudent(String Name, int Year, String ResearchArea) {
        super(Name, Year);
        this.researchArea = ResearchArea;
    }

    public String getDetails(){
        return super.getDetails()+ "\nResearch Area: "+this.researchArea;
    }
    
}
class PhDStudent extends researchStudent{
    private String Thesis;

    public PhDStudent(String Name, int Year, String researchArea, String thesis) {
        super(Name, Year,researchArea);
        this.Thesis = thesis;
    }

    public String getDetails(){
        return super.getDetails()+ "\nThesis Topic: "+this.Thesis;
    }
    
}


public class poly{
    public static void main(String[] args) {
        Student s1 = new Student("Sanjeet", 1);
        researchStudent s2 = new researchStudent("Vanshika", 2, "IOT");
        PhDStudent s3 = new PhDStudent("Mihika", 4, "SoftDev", "WEB DEV");

        s1.getDetails();
        s2.getDetails();
        s3.getDetails();
    }
}