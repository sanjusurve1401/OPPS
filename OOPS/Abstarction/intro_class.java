// In java there is only 1 public class
public class intro_class{
    public static float radius = 10.0f;
    public static float length = 20.0f;
    public static void main(String[] args) {
        System.out.println(Circle.area(radius));    // this is the way is to call data from different class
        System.out.println(Square.area(length));    // this is the way is to call data from different class
    
    }
}
class Circle{
    public static float area (float radius){
        return 3.141f * radius * radius;
    }
}
class Square{
    public static float area(float length) {
        return length*length;
    }
}