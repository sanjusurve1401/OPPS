package threading;

public class ResearchStudent6 extends Student6kt{
    protected String ResearchArea;
    private static final int annnualFees = 100000;

    public ResearchStudent6(int rollNum, int year, String ResearchArea) {
        super(rollNum, year);
        this.ResearchArea = ResearchArea;
    }
    public float computeFees(){
        return Student6.annualFees * this.year * 0.9f;
    }

    public String getDetails(){
        return super.getDetails() + "\nResearch Area: "+this.ResearchArea;
    }
}
