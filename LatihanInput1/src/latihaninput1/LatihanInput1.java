/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihaninput1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class LatihanInput1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
         // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        
        int bilangan;
        System.out.print("Input Bilangan : ");
        bilangan = Integer.parseInt(br.readLine());
        
        if(bilangan %2 != 0){
            System.out.println("Ganjil");
        }else{
            System.out.println("Genap");
        }
    }
    
}
