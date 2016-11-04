package kelilingsegitiga;

//import java.*;
import java.io.*;
public class KelilingSegitiga {
    int KelSegitiga (int a, int b, int c){
        int Kel;
        Kel=a+b+c;
        return(Kel);
    }

    public static void main(String[] args)throws IOException {
        int sisi_a, sisi_b, sisi_c;
        System.out.println("Masukkan Sisi A : ");
        BufferedReader sia=new BufferedReader (new InputStreamReader (System.in));
        sisi_a = Integer.parseInt(sia.readLine());
        
        System.out.println("Masukkan Sisi A : ");
        BufferedReader sib=new BufferedReader (new InputStreamReader (System.in));
        sisi_b = Integer.parseInt(sib.readLine());
    
        System.out.println("Masukkan Sisi A : ");
        BufferedReader sic=new BufferedReader (new InputStreamReader (System.in));
        sisi_c = Integer.parseInt(sic.readLine());
    
        KelilingSegitiga panggil=new KelilingSegitiga();
        System.out.println("Keliling Segitiga= "+panggil.KelSegitiga(sisi_a, sisi_b, sisi_c));
    }
    
}
