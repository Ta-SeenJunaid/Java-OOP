
package static_value;

class Teacher{

String name, gender;
int phone;
static String university = "CUET";

Teacher(){
System.out.println("No value\n\n"); 
}

Teacher(String n, String g){
name = n;
gender = g;
}



Teacher(String n, String g, int p){
name = n;
gender = g;
phone = p;
}


void displayInformation(){

System.out.println("Name :"+name);
System.out.println("Gender :"+gender);
System.out.println("Phone :"+phone);
System.out.println("University :"+university);
System.out.println("\n\n");
}
}

public class Test{

public static void main(String []args){

Teacher teacher1 = new Teacher("dfsd fd","dsfdf dfd",45);
teacher1.displayInformation();

Teacher teacher2 = new Teacher("adsdsadas sds fd","wewqq dfd",9);
teacher2.displayInformation();

Teacher teacher3 = new Teacher();

Teacher teacher4 = new Teacher("qwqewesd fd","erewrwf dfd");
teacher4.displayInformation();


}


}





