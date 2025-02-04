/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihantipedata;

/**
 *
 * @author User
 */
public class LatihanTipeData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sisi, panjang, lebar, tinggi;
        double luas;
        
        sisi =5;
        panjang =4;
        lebar = 2;
        tinggi = 9;
        
        //luas balok
        luas = 2*((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
        System.out.println("Luas Balok adalah : " +luas+ "cm");
        
        //luas kubus
        luas = 6 * sisi * sisi;
        System.out.println("Luas kubus adalah : " + luas+ "cm");
    
        
        int jari = 12;
        double luas_lingkaran, keliling_lingkaran;
        
        //nilai luas
        luas_lingkaran = 3.14*jari*jari;
        keliling_lingkaran = 2*3.14*jari;
        
        System.out.println("Luas Lingkaran adalah ; " + luas_lingkaran+ "cm");
        System.out.println("Keliling Lingkaran adalah : " + keliling_lingkaran+ "cm");
        
        
    }
    
}
