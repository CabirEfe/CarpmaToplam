/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class çarpmatoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen İki Tane Pozitif Sayı Giriniz");
        int sayi = input.nextInt();
        int sayi2 = input.nextInt();
        int toplam = 0;
        int a = 0;
         while( a < sayi2 ){
         
            
             
             
         toplam = toplam +sayi;
         a++;
         
         }
         System.out.println(toplam);
        
        
        
        
        
        
        
        
        
        
    }
    
}
