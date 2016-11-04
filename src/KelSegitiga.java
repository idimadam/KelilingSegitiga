import java.util.Scanner;
public class KelSegitiga {
    public static void main(String [] args){
        Scanner nilai=new Scanner (System.in);
        int keliling;
        
        System.out.println("Menghitung Keliling Segitiga");{
            int AB, BC, CA;
            System.out.print("Panjang Sisi AB : ");
            AB=nilai.nextInt();
            System.out.print("Panjang Sisi BC : ");
            BC=nilai.nextInt();
            System.out.print("Panjang Sisi CA : ");
            CA=nilai.nextInt();
            
        keliling=AB+BC+CA;
        System.out.println("Jadi, Keliling Segitiga = "+keliling);
    }
    }
}
