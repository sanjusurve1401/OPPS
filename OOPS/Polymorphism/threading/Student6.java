package threading;

public class Student6 implements person6{
    protected final int rollNum;
    protected int year;
    protected static final int annualFees = 10000;
    protected static final int annualSalary = 15000;


    public Student6(int rollNum, int year) {
        this.rollNum = rollNum;
        this.year = year;
    }

    public float computeFees(){
        return Student6.annualFees * this.year;
    }

    public float computeSalary(){
        return Student6.annualFees * this.year;
    }

    public String getDetails(){
        return "\nRoll Number: "+ rollNum+ "\nFees: "+this.computeFees();
    }
}
