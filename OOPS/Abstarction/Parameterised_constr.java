/*
Here we are creating the default construtor because if there is no value given the after 
Circle c1 = new Circle(); after writing the constructor then it will give me a error for constructor 

Default constructor solves the problem over here
*/ 

public class Parameterised_constr {
    public static void main(String[] args) {
        Circle3 c1 = new Circle3();         // here there is no value for the data then it will not give me error 
        System.out.println(c1.area3());

        Circle3 c2 = new Circle3(10f);
        System.out.println(c2.area3());
    }
}
class Circle3{

    public float rad3;
    public Circle3(){}      // Default Consrtuctor which has no arguement
    public Circle3(float rad3){
        this.rad3 = rad3; 
        // this.rad refers to public float rad3 to undet this rad3 is differnt from the constructor
    }
    public float area3(){
        return 3.14f * this.rad3 * this.rad3;
    }
}
