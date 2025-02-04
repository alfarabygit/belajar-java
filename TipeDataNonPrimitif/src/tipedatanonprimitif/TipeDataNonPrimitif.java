/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipedatanonprimitif;

/**
 *
 * @author User
 */
public class TipeDataNonPrimitif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tipe data non primitif java
        
        // A. String
        String nama = "Alfaraby Indra";
        System.out.println("My name is :" + nama);
        
        //1. get length from string
        String greet = "Good bye Cruel World!";
        
        //get length
        int length = greet.length();
        System.out.println("length String is: " + length);
        
        //2. join in two string with concat
         // create first string
            String first = "Java ";
            System.out.println("First String: " + first);

        // create second
            String second = "Programming";
            System.out.println("Second String: " + second);
            
        //join strings with concat method
        String fusion = first.concat(second);
        System.out.println("after join two string : " +fusion);
        
        //3.compare two strings
           // create 3 strings
    String a = "java programming";
    String b = "java programming";
    String c = "python programming";

    // compare first and second strings
    boolean result1 = a.equals(b);
    System.out.println("Strings first and second are equal: " + result1);

    // compare first and third strings
    boolean result2 = a.equals(c);
    System.out.println("Strings first and third are equal: " + result2);
    
    //B. Array
    //declare and initialize and array
    int[] age = {12, 4, 5, 2, 5};
    //access element array
     System.out.println("Accessing Elements of Array:");
     System.out.println("First Element: " + age[0]);
     System.out.println("Second Element: " + age[1]);
     System.out.println("Third Element: " + age[2]);
     System.out.println("Fourth Element: " + age[3]);
     System.out.println("Fifth Element: " + age[4]);
    
    //with loop
    int [] number = {10, 34, 55};
    // loop through the array
    // using for loop
   System.out.println("Using for Loop:");
    for(int i = 0; i < number.length; i++) {
      System.out.println(number[i]);
    }
    
    //using for each
     System.out.println("Using for-each Loop:");
     for(int x : age){
         System.out.println(x);
     }
  }
    
}
