/*
Class = Circle5
Attributes = Radius1
Method = Area5 / Circumference
Object = c1

*/ 


public class Final_keyword {
    public static void main(String[] args) {
        
        Circle5 c1 = new Circle5(15f);
        System.out.println("Area of Circle:        " + c1.area5());
        // c1.Radius1 = 10f;
        System.out.println("Circumference of Circle: "+c1.Circumference5());
    }
}

class Circle5{

    // After adding the final in the Radius1 it can't be change externally
    // We need to pass the value in the obj itself
    public final float Radius1;
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