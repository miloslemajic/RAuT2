package pckt;

public class main {

    public static void main(String[] args) {
    	
        aerodrom a= new aerodrom(4, 60000, 20);
        
        putnicki p1= new putnicki(5000, 100);
        putnicki p2= new putnicki (50000, 750);
        
        teretni t1=new teretni(7000, 15000);
        
        System.out.println(a.income());
        
        a.getFlightPermission(p1, 1);
        
        System.out.println(a.income());
        System.out.println(a);
        
        
        a.getFlightPermission(t1, 2);
        
        System.out.println(a.income());
        System.out.println(a);
        
        a.takeOff(1);
        
        System.out.println(a.income());
        System.out.println(a);
        
        
        
        a.getFlightPermission(p2, 0);
        
        
    }
    
}
