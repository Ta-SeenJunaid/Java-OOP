
package constructor;


class Teacher{
    
    String name, gender;
    int phone;
    
    Teacher(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }
    
    
    void displayInformation(){
        
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Phone :"+phone);
        System.out.println("\n\n");
    }
}

public class Test{
    
    public static void main(String []args){
        
        Teacher teacher1 = new Teacher("Teacher1","Male",4532);
        teacher1.displayInformation();
        
        Teacher teacher2 = new Teacher("Teacher2","Female",9343);
        teacher2.displayInformation();
        
    }
    
    
}








