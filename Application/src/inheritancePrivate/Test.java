
package inheritancePrivate;


public class Test {
    
    public static void main(String []args){
        
        Teacher t1 = new Teacher();
        
        t1.setName("dfkds kfdhs");
        t1.setAge(45);
        t1.qualification = "dflkdsjl sdjfkd";
        
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        t1.display2();
    }
    
}
