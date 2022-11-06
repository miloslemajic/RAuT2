package student;

public class StudentKlasa {

	private String ime;
    private String prezime;
    private Integer indeks;
    private Double br1;
    private Double br2;
    private Double brz;
    private Double bsum;
    
    public StudentKlasa(String ime, String prezime, Integer indeks, Double br1, Double br2, Double brz)
    {
        this.ime=ime;
        this.prezime=prezime;
        this.indeks=indeks;
        this.br1=br1;
        this.br2=br2;
        this.brz=brz;
        
    }
    
     private Double SaberiSve()
    {
        bsum = br1 + br2 + brz;
        return bsum;
    }
     
   public String getIme()
   {
       return ime;
   }
   
   public String getPrezime()
   {
       return prezime;
   }
   
   public Integer getIndeks()
   {
       return indeks;
   }
   
   public Double getBr1()
   {
       return br1;
   }
   
   public Double getBr2()
   {
       return br2;
   }
   
   public Double getBrz()
   {
       return brz;
   }
   
   public void setIme(String ime)
   {
       this.ime=ime;
   }
   
   public void setPrezime(String prezime)
   {
       this.prezime=prezime;
   }
   
   public void setIndeks(Integer indeks)
   {
       this.indeks=indeks;
   }
   
   public void setBr1(Double br1)
   {
       this.br1=br1;
   }
   
   public void setBr2(Double br2)
   {
       this.brz=br2;
   }
   
   public void setBrz(Double brz)
   {
       this.brz=brz;
   }
    
    public int Ocena()
    {
        if( SaberiSve()>= 91)
            return 10;
        if(SaberiSve() >= 81)
            return 9;
        if(SaberiSve() >= 71)
            return 8;
        if(SaberiSve() >= 61)
            return 7;
        if(SaberiSve() >= 51)
            return 6;
        return 5;
    }
    
    
    @Override public String toString()
    {
        StringBuilder s=new StringBuilder();
        
        s.append(ime + " "+prezime+" "+" "+indeks+" "+br1+","+br2+","+brz+","+SaberiSve());
        return s.toString();
    }
    
}


