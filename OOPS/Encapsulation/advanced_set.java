/*
 * Class = Circle8
 * Attributes = Radius8
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
public class advanced_set {
    public static void main(String[] args) {
        
        Circle8 c1 = new Circle8(15f);
        printCircle(c1);

        c1.setRadius(10f);
        printCircle(c1);
    }
    public static void printCircle(Circle8 C){
        System.out.println("Area of Radius: "+C.getRadius()+'\n'+ "Area of Circle : "+C.area5()+'\n');
    }
}

class Circle8{
    private float Radius8;
    public static final float PI = 3.1414f;
    
    // even at the time of the creating the value from the 1st of creating obj.
    public Circle8(float radius8){ 
        setRadius(radius8);
    }

    // Getter method 

    public float getRadius(){
        return this.Radius8;
    }

    // Setter Method
    public void setRadius(float radius8){
        if( radius8 >= 0 ){
            this.Radius8 = radius8;
        }
    }


    public float area5(){
        return PI * this.Radius8 * this.Radius8;
    }

    public float Circumference5(){
        return 2 * PI * this.Radius8;
    }
}