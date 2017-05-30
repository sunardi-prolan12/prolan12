package parkir2;

public class Parkir2 {

  
    public static void main(String[] args) {
        // TODO code application logic here

      karcis tiketmasuk = new karcis();
        tiketmasuk.setjammasuk(11);
        tiketmasuk.setmenitmasuk(12);
        tiketmasuk.setdetikmasuk(13);
        
        
        karcis tiketkeluar = new karcis();
        tiketkeluar.setjamkeluar(12);
        tiketkeluar.setmenitkeluar(13);
        tiketkeluar.setdetikkeluar(14);
 
        // Mengambil nilai atribut dari objek-objek instanc kelas
        // ContohKelasPakaiGetterSetter
        Integer jammasuk1 = tiketmasuk.getjammasuk();
        Integer menitmasuk1 = tiketmasuk.getmenitmasuk();
        Integer detikmasuk1 = tiketmasuk.getdetikmasuk();
 
        Integer jamkeluar1 = tiketkeluar.getjamkeluar();
        Integer menitkeluar1 = tiketkeluar.getmenitkeluar();
        Integer detikkeluar1 = tiketkeluar.getdetikkeluar();
 
        // Tampilkan output nilai atribut setiap objek
        System.out.println( + jammasuk1 + ":" + menitmasuk1+ ":" + detikmasuk1);
        System.out.println( + jamkeluar1 + ":" + menitkeluar1+ ":" + detikkeluar1);
 
    }
}

