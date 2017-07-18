
package parkir;
import java.util.Scanner;// perintah untuk membuat objek atau menginisialisasi
import pekerjaan.Pekerjaan;// penggunaan pakage
public class Parkir {
    
int noo;// menentukan tipe data untuk input pilihan 
    public static void main(String[] args) {
    Pekerjaan kerja = new Pekerjaan(); // bisa di buat polimorpisme tapi saya tidak buat
    
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        String ul="",lagi;
        System.out.println("********** SELAMAT DATANG ***********");
        
        kerja.Pegawai();
        
        System.out.println("             MENU UTAMA             ");
        System.out.println("1. Masukan Jam Masuk");
        System.out.println("2. Masukan Jam Keluar");
        System.out.println("3. Hitung");
        System.out.println("4. Keluar");
        System.out.println("=====================================");
        System.out.print("Pilihan [1/2/3] = ");
        int noo = input.nextInt();
        System.out.println("=====================================");
       
        switch(noo){
           
            case 1: 
            hitung in =  new hitung();
            
            in.jammasuk();
            break;
            
            case 2:
                hitung out =  new hitung();
            out.keluar();
            break;
            
            case 3:
                hitung hit =  new hitung();
            hit.hitung();
            break;
            case 4:{
                System.exit(4);
                System.out.println("Warning !! Pilihan tidak tersedia !! ");
                }
                break;
        }
        System.out.println("=====================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
        }
    }
}
 
    

