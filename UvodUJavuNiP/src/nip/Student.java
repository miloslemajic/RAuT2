package nip;

class Student extends Osoba{
	
	String index;
    String smer;
    int godina;
    
    public Student(String s1, String s2, String s3, int g, String s4, String s5, int g1) {
        super(s1,s2,s3,g); //poziv roditeljskog konstruktora
        index = s4;
        smer = s5;
        godina = g1;
    }
    
    @Override
    public String toString() {
        return super.toString() + "[" + index + "/" + godina + "]";
    }
    
    public String getUserName() {
        return super.ime + super.prezime + "_" + index; //ime je friendly, prezime je protected
    }
}