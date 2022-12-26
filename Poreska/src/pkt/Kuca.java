package pkt;

class Kuca extends Nekretnina {
    /*kvadratura, 
    veličina 
    dvorišta (u metrima kvadratnim), 
    broj spratova, 
    taksa po kvadratnom metru kuće i taksa po kvadratnom metru dvorišta*/
     
     private int kvadratura;
     private int velicina_dvorista;
     private int broj_spratova;
     private double tax_kuce;
     private double tax_dvorista;
     
     public Kuca (String lokacija, int kupovna_cena, int kvadratura, 
                int velicina_dvorista, int broj_spratova, double tax_kuce, double tax_dvorista){
         
         super(lokacija,kupovna_cena);
         this.kvadratura = kvadratura;
         this.velicina_dvorista = velicina_dvorista;
         this.broj_spratova = broj_spratova;
         this.tax_dvorista = tax_dvorista;
         this.tax_kuce = tax_kuce;
     }
     
     @Override
      public char getType(){
        return 'K';
    }
       @Override
  public double getTax(){
      return (kvadratura * tax_kuce + velicina_dvorista * tax_dvorista + 0.05 * super.getCena());
     
  }
      
      @Override 
    public String toString() {
         return super.toString() + ", " + kvadratura + ", " + velicina_dvorista + ", " + broj_spratova ;
    } 
}
