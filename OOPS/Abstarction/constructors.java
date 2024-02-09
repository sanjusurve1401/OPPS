/*
use of this constructor is that we do not need to creat every new obj.
we just directly pass the data
*/ 
public class constructors {
    public static void main(String[] args) {
        Circle2 C1 = new Circle2(10f); // the arguement in the parenthisis is direct send to the Circle2 parament 
        System.out.println(C1.area2());
    }
}
class Circle2{
    public float rad2;

    // Constructor 
    public Circle2(float r){ 
        rad2 = r; //parameter
    }
    public float area2(){
        return 3.141f * rad2 * rad2;
    }
}

