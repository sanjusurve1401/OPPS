/*
 * Class = Circle6
 * Attributes = radius6
 * Method = Area5 / Circumference
 * Object = c1
 * 
 * 
 * GETTER Method is use to access the Private variable data
 * It only read the data
 */

public class Getter {
    public static void main(String[] args) {
        
        Circle6 c1 = new Circle6(15f);
        System.out.println("Area of Circle: " + c1.area5());
        
        printCircle(c1);
    }
    public static void printCircle(Circle6 C){
        System.out.println("Area of Circle: "+C.area5()+'\n'+ "Radius: "+C.getRadius());
    }
}

class Circle6{
    private float Radius6;
    public static final float PI = 3.1414f;

    // Getter method 

    public float getRadius(){
        return this.Radius6;
    }

    public Circle6(){
        this.Radius6 = 0f;
    }

    public Circle6(float radius6){ 
        this.Radius6 = radius6;
    }

    public float area5(){
        return PI * this.Radius6 * this.Radius6;
    }

    public float Circumference5(){
        return 2 * PI * this.Radius6;
    }
}