public class Main{
    public static void main(String[] args){
        Student6 s1 = new Student6(11, 2);

        ResearchStudent6 s2 = new ResearchStudent6(23, 1, "IOT");
      
        PhD6 s3 = new PhD6(123, 3, "Software", "FSD");
        
        Professor6 p1 = new Professor6(2166324);

        person6[] array = {s1, s2, s3, p1};
        printdetails(array);
    }

    public static void printdetails(person6[] person6s){
        for(person6 person6 : person6s){
            System.out.println(person6.getDetails());
            System.out.println("Salary: "+person6.computeSalary());
        }
    }

}