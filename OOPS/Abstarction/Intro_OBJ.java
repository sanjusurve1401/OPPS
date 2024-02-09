/*
Note: the classes name can't be same for the files which are in same folder

Learned about the objects from the Classes
*/ 


public class Intro_OBJ{
    public static float radius = 10.0f;
    
    public static void main(String[] args) {
       Circle1 c1 = new Circle1();
       c1.radius = 10f;
       System.out.println(c1.area());

       Circle1 c2 = new Circle1();
       c2.radius = 20f;
       System.out.println(c2.area());

       Square1 s1 = new Square1();
       s1.leng = 10f;
       System.out.println(s1.area());
    
    }
}
class Circle1{
    /*
    removed the static keyword from these attributes becoz it belongs to particular class
     where as the non-static belongs to object or the instance of that class 
    */ 

    public float radius;    // methods or instance 
    public float area (){
        return 3.141f * radius * radius;
    }
}
class Square1{
    public float leng;
    public float area(){
        return leng * leng;
    }
}