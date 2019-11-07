
package method_overridding;


public class Test {
    
    public static void main(String []args){
        Teacher t1 = new Teacher();
        
        t1.name = "dlskfsdk dsfsd";
        t1.age = 58;
        t1.qualification = "jldkfjkl dsfk";
        t1.display();
        
        Person t2 = new Person();
        
        t2.name = "Pdlskfsdk dsfsd";
        t2.age = 54;
        t2.display();
    }
    
}
