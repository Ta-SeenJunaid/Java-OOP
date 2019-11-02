
package static_value;

class StaticMethod{
    
    void display1(){
        System.out.println("Non static");
    }
    
    static void display2(){
        System.out.println("Static");
    }
    
}

public class Test2{
    public static void main(String []args){
       
       StaticMethod ob1 = new StaticMethod();
       ob1.display1();
       

       StaticMethod.display2();
       
    }
}