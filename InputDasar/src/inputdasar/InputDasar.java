/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputdasar;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class InputDasar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
     ada 3 cara untuk melakukan input pada java   
     1. Scanner Class
     2. BufferReader Class
     3. Console Class   
     */
     
        //Scanner Class
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Anda : ");
        String nama = input.nextLine();
        System.out.println("Halo, Selamat Datang !" + nama);
    }
    
}
