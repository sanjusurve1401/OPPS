/*
 * ithe aapn Student1 class che attributes share kartoy researchStudent1 sobat
 * 
 * 
 * Ata ithe aapn Inheritance method use kartoy 
 * Mnje jya goshti common aahet Student1 cha class madhe 
 * tyana direct refer karto using "super" manje Student1 madhe 
 * already te aahe ky " name & year" mahnun aaplya parat nhi lihayla lagnar 
 * ya inheritance ni aaplyala jast code nh lihita sarv goshti access karta yetil
 * 
 * Ithe     Student1 ---------------Super class
 *          researchStudent1 ------ Sub-class 
 * 
 * 
 * ithe aapn aata protected class use karto 
 * karan ki name & year from student class te private aahet tar tyana aapn modify nhi karu shakat 
 * research class madhe manually nh aapn tyana public karu shakto mahnun he navin type
 * "PROTECTED"
 * 
 * protected aaplya publicly used nhi karun det pn jar konta subclass asel tar mg aapn data easily 
 * use karu shakto
 */


public class inheritanceEg{
    public static void main(String[] args) {
        Student1 s1 = new Student1("Mihi", 3);
        System.out.println(s1.getDetails());
        
        researchStudent1 rs1 = new researchStudent1("Vanshi", 1,"WORLD OF IOT");
        System.out.println(rs1.getDetails());

        PhDStudent phd1 = new PhDStudent("Sanju", 3, "FSD", "Web Dev");
        System.out.println(phd1.getDetails());
    }
}
class Student1{
    // private final String name;
    // private int year;
    protected final String name;
    protected int year;
    private static final int annualFees = 10000;
    
    public Student1(String Name, int Year) {
        this.name = Name;
        this.year = Year;
    }

    public String getDetails(){
        return "\nName: "+name +'\n'+ "Year: "+
        year+"th" + '\n' + 
        "Fees: "+this.computeFees();
    }
    public float computeFees(){
        return Student1.annualFees * this.year;
    }
}
class researchStudent1 extends Student1{
    private String researchArea;
    
    public researchStudent1(String Name, int Year, String researchArea) {
        // Super mnje aatala aapla Student1 cha class tyala ha refer karto

        super(Name, Year);
        this.researchArea = researchArea;
    }
    // without making protect we can directly work

    // public String getDetails(){
    //     return super.getDetails() + '\n' +
    //     "Research Area: " + this.researchArea;
    // }

    // but if we want to work properly and individually the attributes then we need to used protected method
    public String getDetails(){
        return '\n'+this.name+'\n'+ "Year: "+this.year+'\n'+
        "Research Area: "+this.researchArea;
    }
}
class PhDStudent extends researchStudent1{
    private static final int annualFees= 10000;
    private String thesisTitle;

    public PhDStudent(String Name, int Year, String researchArea, String thesisTitle){
        super(Name, Year, researchArea);
        // this.researchArea = researchArea;
        this.thesisTitle = thesisTitle;
    }
}