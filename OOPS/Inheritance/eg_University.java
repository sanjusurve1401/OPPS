public class eg_University{
    public static void main(String[] args) {
        Student s1 = new Student("Sanju", 4);
        System.out.println(s1.getDetails());
        researchStudent rs1 = new researchStudent("MIHI", 2,"WORLD OF IOT");
        System.out.println(rs1.getDetails());
    }
}
class Student{
    private final String name;
    private int year;
    private static final int annualFees = 10000;
    
    public Student(String Name, int Year) {
        this.name = Name;
        this.year = Year;
    }

    public String getDetails(){
        return "Name: "+name +'\n'+ "Year: "+
        year+"th" + '\n' + 
        "Fees: "+this.computeFees();
    }
    public float computeFees(){
        return Student.annualFees * this.year;
    }
}
class researchStudent{
    private final String name;
    private int year;
    private static final int annualFees = 10000;
    private String researchArea;
    
    public researchStudent(String Name, int Year, String researchArea) {
        this.name = Name;
        this.year = Year;
        this.researchArea = researchArea;
    }

    public String getDetails(){
        return "\nResearch Students Data: "+'\n'+"Name: "+name +'\n'+
        "Research Area: "+ researchArea +'\n'+  
        "Year: "+year+"th" + '\n' + 
        "Fees: "+this.computeFees();
    }
    public float computeFees(){
        return researchStudent.annualFees * this.year;
    }    
}