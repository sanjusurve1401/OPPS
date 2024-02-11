class PhD6 extends ResearchStudent6{
    private String Thesis;

    public PhD6(int rollNum, int year, String ResearchArea, String Thesis) {
        super(rollNum, year, ResearchArea);
        this.Thesis = Thesis;
    }

    public String getDetails(){
        return super.getDetails()+ "\nThesis: " + this.Thesis;
    }
}