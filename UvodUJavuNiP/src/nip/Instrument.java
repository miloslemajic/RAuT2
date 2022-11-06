package nip;

abstract class Instrument {
String ime;
    
    public Instrument(String s) {
        ime = s;
    }
    
    public abstract void sviraj();
}

