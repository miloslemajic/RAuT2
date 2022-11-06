package nip;

class Osoba {
	String JMBG;
    String ime;
    protected String prezime;
    private int godina;
    
    public Osoba(String s1, String s2, String s3) {
        JMBG = s1;
        ime = s2;
        prezime = s3;
    }
    
    
    public Osoba(String s1, String s2, String s3, int g) {
        JMBG = s1;
        ime = s2;
        prezime = s3;
        godina = g;
    }
    
    @Override
    public String toString() {
        return ime + " " + prezime + ", (" + JMBG + ")";
    }


}
