package calculatormain;
public class hitung extends Calculator{

           @Override
           protected void hasilTambah(double x, double y) {
               System.out.println("Hasil Tambah = "+ (x+y));
           }

           @Override
           protected void hasilKurang(double x, double y) {
               System.out.println("Hasil Kurang = "+ (x-y));
           }

           @Override
           protected void hasilKali(double x, double y) {
                   System.out.println("Hasil Kali = "+ (x*y));
           }

           @Override
           protected void hasilBagi(double x, double y) {
                   System.out.println("Hasil Bagi = "+ (x/y));
           }

           @Override
           protected boolean hasilLebihBesarDari(double x, double y) {
                        
               System.out.println("Hasil Lebih Besar dari = "+ (x>y));
               return true;
         }

           @Override
           protected boolean hasilLebihKecilDari(double x, double y) {
               System.out.println("Hasil Lebih Kecil dari = "+ (x<y));
               
               return super.hasilLebihKecilDari(x, y); 
           }

           @Override
           protected boolean hasilLebihBesarSamaDenganDari(double x, double y) {
               System.out.println("Hasil Lebih Besar Sama Dengan dari = "+ (x>=y));
               
               return super.hasilLebihBesarSamaDenganDari(x, y);
           }

           @Override
           protected boolean hasilLebihKecilSamaDenganDari(double x, double y) {
               System.out.println("Hasil Lebih Kecil Sama Dengan dari = "+ (x<=y));
               
               return super.hasilLebihKecilSamaDenganDari(x, y);
           }
                      
       }
 

     
       
       
                
