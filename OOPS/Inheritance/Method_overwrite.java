/*
 * Method Overriding 
 * 
 * mnje jast kahi nhi same method aasel doni class madhe like getDetails ahe pn subclass 
 * madhe aajun kahi add karaycha ahe mg te kase 
 * super.getdetails()+... data jo kahi asel     mnje aapn overwrite karto 
 * super ha aaplya la proper class madhun data deto jyala aapn extend karto
 */
public class Method_overwrite{
    public static void main(String[] args) {
        Student2 s1 = new Student2("Mihi", 3);
        System.out.println(s1.getDetails());
        
        researchStudent2 rs1 = new researchStudent2("Vanshi", 1,"WORLD OF IOT");
        System.out.println(rs1.getDetails());

        PhDStudent2 phd1 = new PhDStudent2("Sanju", 3, "FSD", "Web Dev");
        System.out.println(phd1.getDetails());
    }
}
class Student2{
    protected final String name;
    protected int year;
    private static final int annualFees = 10000;
    
    public Student2(String Name, int Year) {
        this.name = Name;
        this.year = Year;
    }

    public String getDetails(){
        return "\nName: "+name +'\n'+ "Year: "+
        year+"th" + '\n' + 
        "Fees: "+this.computeFees();
    }
    public float computeFees(){
        return Student2.annualFees * this.year;
    }
}
class researchStudent2 extends Student2{
    private String researchArea;
    
    public researchStudent2(String Name, int Year, String researchArea) {
        super(Name, Year);
        this.researchArea = researchArea;
    }

    public String getDetails(){
        return "\nName: "+this.name+'\n'+ "Year: "+this.year+'\n'+
        "Research Area: "+this.researchArea;
    }
}
class PhDStudent2 extends researchStudent2{
    private static final int annualFees= 10000;
    private String thesisTitle;

    public PhDStudent2(String Name, int Year, String researchArea, String thesisTitle){
        super(Name, Year, researchArea);
        // this.researchArea = researchArea;
        this.thesisTitle = thesisTitle;
    }
    public String getDetails(){
        return super.getDetails()+"\nThesis: "+this.thesisTitle;
    }
}

 