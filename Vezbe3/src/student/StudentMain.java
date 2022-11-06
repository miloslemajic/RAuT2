package student;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	
	public static void main(String[] args) {
		
List <StudentKlasa> stud = new ArrayList();
        
        StudentKlasa s1=new StudentKlasa("Sale","Minja",1,15.,15.,10.);
        StudentKlasa s2= new StudentKlasa("Sale","Sale",12,30.,30.,10.);
        StudentKlasa s3= new StudentKlasa("Minja","Minja",13,13.,30.,10.);
        StudentKlasa s4=new StudentKlasa("Alex","Minja",14,17.,22.,10.);
        StudentKlasa s5=new StudentKlasa("Minja","Alex",15,55.,1.,10.);
        StudentKlasa s6=new StudentKlasa("Sale","Alex",16,45.,45.,10.);
        StudentKlasa s7=new StudentKlasa("Alex","Sale",17,17.,32.,10.);
        StudentKlasa s8=new StudentKlasa("Aca","Minja",18,11.,11.,10.);
        StudentKlasa s9=new StudentKlasa("Minja","Aca",19,32.,37.,10.);
        StudentKlasa s10=new StudentKlasa("Shaca","Minja",10,15.,45.,10.);
        
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        stud.add(s4);
        stud.add(s5);
        stud.add(s6);
        stud.add(s7);
        stud.add(s8);
        stud.add(s9);
        stud.add(s10);
    
    
    for(StudentKlasa s: stud)
            System.out.println(s+" sa ocenom "+s.Ocena());
    
    System.out.println(s1.getBrz());
    
    
    
    s1.setBr2(20.);
    s1.setBr1(20.);
    s1.setIndeks(20);
    
    System.out.println(s1.getBrz());
    
    System.out.println("New:");
    
    for(StudentKlasa s: stud)
            System.out.println(s+" sa ocenom "+s.Ocena());
    
    
    }
}
