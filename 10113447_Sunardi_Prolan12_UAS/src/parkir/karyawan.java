package parkir;
import java.util.Scanner;
//membuat class
public class karyawan {
String Nama,idkar; // Tipe Data
//membuat inputan
Scanner nama = new Scanner(System.in);

//membuat method
    public void petugaspos (){
        
       
        System.out.println("Masukkan Nama Petugas :");
        Nama = nama.nextLine();
        System.out.println("Masukkan ID Petugas :");
        idkar = nama.nextLine();
      
    }
    
  //membuat method  
  public void petugaslapangan(){
       //menampilkan data atau tulisan
        System.out.println("Masukkan Nama Petugas :");
       //nextline membuat bisa menulis
        Nama = nama.nextLine();
        System.out.println("Masukkan ID Petugas :");
        idkar = nama.nextLine();
    }




}
