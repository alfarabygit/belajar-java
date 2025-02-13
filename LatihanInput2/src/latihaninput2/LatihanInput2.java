/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihaninput2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class LatihanInput2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
           // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        
        int tahun;
        System.out.print("Input Tahun : ");
        tahun = Integer.parseInt(br.readLine());
        
         if (tahun % 400 == 0) {
            System.out.println(tahun + " adalah tahun kabisat");
      }
        else if (tahun % 100 == 0) {
            System.out.println(tahun + " bukan tahun kabisat");
      }
        else if (tahun % 4 == 0) {
            System.out.println(tahun + " adalah tahun kabisat");
      }
        else {
            System.out.println(tahun + " bukan tahun kabisat");
      }
        
    }
    
}
