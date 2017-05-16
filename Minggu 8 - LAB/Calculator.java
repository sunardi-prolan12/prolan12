package calculatormain;
public abstract class Calculator {
    protected abstract void hasilTambah(double x, double y);
    protected abstract void hasilKurang(double x, double y);
    protected abstract void hasilKali(double x, double y);
    protected abstract void hasilBagi(double x, double y);
    
    protected boolean hasilLebihBesarDari(double x, double y){return true;}
    protected boolean hasilLebihKecilDari(double x, double y){return true;}
    protected boolean hasilLebihBesarSamaDenganDari(double x, double y){return true;}
    protected boolean hasilLebihKecilSamaDenganDari(double x, double y){return true;}
    
}
