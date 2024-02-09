/*
 * understand the what encapsulation
 * it used to secure the input data which in confidential 
 * or could effect the output we use encapsulation
 */
 /*
Class = Circle5
Attributes = Radius1
Method = Area5 / Circumference
Object = c1

*/ 


public class undestanding_encha {
    public static void main(String[] args) {
        
        Circle5 c1 = new Circle5(15f);
        System.out.println("Area of Circle: " + c1.area5());
        // c1.Radius1 = 10f;
        printCircle(c1);
    }
    public static void printCircle(Circle5 C){
        // Here any outer sider can change the code default input e.g radius like this
        // you uncommment and see the error after using private method
        // C.Radius1 = 11f;  

        // for avoiding changes in the radius or any interfare
        System.out.println("Area of Circle: "+C.area5());
    }
}

class Circle5{

    // After adding the final in the Radius1 it can't be change externally
    // We need to pass the value in the obj itself
    // public float Radius1;

    // for protecting the data we use "PRIVATE" method
    private float Radius1;

    /*
     * private data is not accessible outside the class
     * it can only be accessible only in that particular class
     * the values in this private can't be read nor access for any other purpose
     */
    public static final float PI = 3.1414f;

    // Default consturctor can't kept empty
    public Circle5(){
        this.Radius1 = 0f;
    }

    public Circle5(float radius1){
        this.Radius1 = radius1;
    }

    public float area5(){
        return PI * this.Radius1 * this.Radius1;
    }

    public float Circumference5(){
        return 2 * PI * this.Radius1;
    }
}