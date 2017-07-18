package parkir;
import java.util.Scanner;
//Abstrak class   
public abstract class karcis {
    protected int jam;
    protected int menit;
    protected int detik;
    
    Scanner input = new Scanner(System.in);
 //Abstrak Method   
abstract void jammasuk() ;    
}
    
