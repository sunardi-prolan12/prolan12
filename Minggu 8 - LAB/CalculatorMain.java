package calculatormain;
import java.util.Scanner;

public class CalculatorMain extends hitung {
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
                   
       
     Calculator cal = new hitung();
      
               
     double operan1, operan2 ;
        operan1 = input.nextDouble();
       operan2 = input.nextDouble(); 
        
       cal.hasilTambah(operan1, operan2);
       cal.hasilKurang(operan1, operan2);
       cal.hasilKali(operan1, operan2);
       cal.hasilBagi(operan1, operan2);
       
       cal.hasilLebihBesarDari(operan1, operan2);
       cal.hasilLebihKecilDari(operan1, operan2);
       cal.hasilLebihBesarSamaDenganDari(operan1, operan2);
       cal.hasilLebihKecilSamaDenganDari(operan1, operan2);      
}
}