/*
Static is for the For data which is going to be constant. 
In our case the pie value is been constant so we can make it as a static data.

*/ 

public class Static_keyword {
    public static void main(String[] args) {
        Circle4 c1 = new Circle4();
        System.out.println("Area of Circle:               "+c1.area4());
        
        Circle4 c2 = new Circle4(10f);
        System.out.println("Area of Circle:               "+c2.area4());  

        Circle4 c3 = new Circle4(15);
        System.out.println("Circumference of Circle:      "+c3.Circumference());   
    }
}
class Circle4 {

    public float Radius;
    // jast kahi nhi aapn parat ek constructor sarkha 
    // create kele so PI chi valu kadhich chuknar nhi mahnun
    // aani parat parat value na lihita aapn direct variable la call karto
    public static float PI = 3.14f;

    public Circle4(){}
    public Circle4(float radius){
        this.Radius = radius;       //"radius" is for the public Circle4
        // "this.Radius" is for the class Circle4
    }
    
    public float area4(){
        return PI * this.Radius* this.Radius;
    }

    public float Circumference(){
        return 2 * PI * this.Radius;
    }
    
}
