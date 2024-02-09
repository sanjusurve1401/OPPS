/*
 * Class = Circle7
 * Attributes = Radius7
 * Method = Area5 / Circumference
 * Object = c1
 * 
 * Setter method is used to modify the private variable data 
 * 
 * it does not make it same like public because
 * we can give some conditions in the getter method so 
 * the inserted value could not be negative
 * 
 * 
 * if we insert the -ve value than too the the output won't be affected nor give error
 * this make it different from the public method were it could give the error or a -ve o/p
 */
public class Setter {
    public static void main(String[] args) {
        
        Circle7 c1 = new Circle7(15f);
        printCircle(c1);

        c1.setRadius(10f);
        printCircle(c1);
    }
    public static void printCircle(Circle7 C){
        System.out.println("Area of Radius: "+C.getRadius()+'\n'+ "Area of Circle : "+C.area5()+'\n');
    }
}

class Circle7{
    private float Radius7;
    public static final float PI = 3.1414f;

    
    public Circle7(){
        this.Radius7 = 0f;
    }

    // Getter method 

    public float getRadius(){
        return this.Radius7;
    }

    // Setter Method
    public void setRadius(float radius7){
        if( radius7 >= 0 ){
            this.Radius7 = radius7;
        }
    }
    
    public Circle7(float radius7){ 
        this.Radius7 = radius7;
    }

    public float area5(){
        return PI * this.Radius7 * this.Radius7;
    }

    public float Circumference5(){
        return 2 * PI * this.Radius7;
    }
}