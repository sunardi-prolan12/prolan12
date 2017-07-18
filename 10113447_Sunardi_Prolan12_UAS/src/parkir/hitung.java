
package parkir;
import java.util.Scanner;
public class hitung extends karcis{
//mengoveride dari karcis termasuk mengembangkan abstrak method dan termasuk inheritance
    @Override
    void jammasuk() {
        System.out.println("Masukkan Jam : ");
    jam = input.nextInt();
    System.out.println("Masukkan Menit : ");
    menit = input.nextInt();
    System.out.println("Masukkan Detik : ");
    detik = input.nextInt();
     System.out.println("\nJam Keluar : "+jam+":"+menit+":"+detik+"\n");
    }
 


    
     int jam2,menit2,detik2;
    
    public void keluar(){
   Scanner input = new Scanner(System.in);

    System.out.println("Masukkan Jam Keluar: ");
    jam2 = input.nextInt();
    System.out.println("Masukkan Menit Keluar: ");
    menit2 = input.nextInt();
    System.out.println("Masukkan Detik Keluar: ");
    detik2 = input.nextInt();
        System.out.println("\nJam Keluar : "+jam2+":"+menit2+":"+detik2+"\n");
  
}

    public void hitung() {
    
    
    
    int jamtot, sisa, menittot, detiktot;
    int waktu1, waktu2, selisih;

    jam = (3600*jam)+(60*menit)+detik;
    jam2 = (3600*jam2)+(60*menit2)+detik2;
    selisih = jam2-jam;
    jamtot = selisih/3600;
    sisa = selisih%3600;
    menittot = sisa/60;
    detiktot = sisa%60;
System.out.println ("\nSelisih Waktu   = "+jamtot+":"+menittot+":"+detiktot);
    }  
    
}

