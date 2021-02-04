
package main;
import java.util.Scanner;
/**
 *
 * @author Yusuf Isra
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Object
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();
        
        System.out.println("1. Menghitung luas lingkaran");
        System.out.println("2. Menghitung luas Persegi");
        System.out.print("Pilih pak : ");
        int inputt = input.nextInt();
        
        switch(inputt){
            case 1 :
                System.out.println("-------------------------------------");
         System.out.print("Masukkan jari-jari lingkaran : ");
         float jari = input.nextFloat();
         lingkaran.hitung(jari);
         break;
            case 2 :
                System.out.println("-------------------------------------");
         System.out.print("Masukkan sisi Persegi : ");
                float sisi = input.nextFloat();
         persegi.hitung(sisi); 
         break;
            default :
         System.out.println("Adanya 1 ama 2 anjir");
        }

    }
    
}
