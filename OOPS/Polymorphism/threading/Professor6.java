package threading;

public class Professor6 implements person6{
    private static final float startingSalary = 60000;
    private int empNum;

    public Professor6(int empNum) {
        this.empNum = empNum;
    }

    public float computeSalary(){
        return this.startingSalary;
    }
    public String getDetails(){
        return "\nEmployee Number: "+this.empNum;
    }
}
