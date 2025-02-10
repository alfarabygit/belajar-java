/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class BufferInput {

    /**
     * @param args the command line arguments
     */
    
//jika menggunakan buffer reader tambahkan throws IOException di main method
    public static void main(String[] args) throws IOException {
        // buffer reader input method
        String nama;
        int umur;
        
        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        
        //isi variabel dgn buffer reader
        System.out.print("Nama Anda :");
        nama = br.readLine();
        System.out.print("Input Umur :");
        umur = Integer.parseInt(br.readLine());
        
        System.out.println("Halo, Selamat Datang " + nama + "!");
        System.out.println("Umur anda sekarang adalah " + umur + " tahun");
        
    }
    
}
