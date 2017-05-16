public class Sunardi extends Mahasiswa{

    @Override
    protected void kuliah() {
        System.out.println(" Mendapatkan Nilai A,B,C,D ");
    }

    @Override
    protected void lulus() {
        System.out.println("Mendapatkan Nilai B");
    }

    @Override
    protected void tidaklulus() {
        System.out.println("Mendapatkan Nilai E");
    }
    
} 