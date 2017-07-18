package Minggu10;
public class Karcis {

    public static void main(String[] args) {
        
        
        parkir<String> p2 = new parkir<String>("12:77:12");
        String z = p2.getJam();
        System.out.println("Jam Masuk = " + z);
        
        
  
        parkir p3 = new parkir<String>("21:12:13");
        String d = (String) p3.getJam();
        System.out.println("Jam Keluar = " + d);
        
    }
    
}