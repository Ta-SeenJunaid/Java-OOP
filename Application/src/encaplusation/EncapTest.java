
package encaplusation;


public class EncapTest {
    
    public static void main(String []args){
        
        Person o1 = new Person();
        o1.setName("Som");
        o1.setAge(50);
        
        System.out.println(o1.getName());
        System.out.println(o1.getAge());
        
        Person o2 = new Person();
        o2.setName("Somdjdjdj");
        o1.setAge(45);
        
        System.out.println(o2.getName());
        System.out.println(o2.getAge());
    }
    
}
