package pkt;

public class sanduk extends proizvod {
    double a,b,c;
   
   public sanduk(double price, double a, double b, double c)
   {
       super (price);
       this.a=a;
       this.b=b;
       this.c=c;
   }
   
   @Override
   public char getType()
           {
               return 'S';
           }
   
   @Override
   public double zapremina()
   {
       return a*b*c;
   }
   
   @Override
   public String toString()
   {
       return super.toString()+" , ("+a+" , "+b+" , "+c+") zapremine "+zapremina()+","+super.getPrice();
   }
           
   
}
