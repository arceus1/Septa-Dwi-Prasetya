/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.pembalik.kata;

import java.util.Scanner;

/**
 *
 * @author Hello
 */
public class AplikasiPembalikKata {
    

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //menampikan kalimat masukkan kata
        System.out.println("Masukkan kata = ");
        //
        Scanner masukan = new Scanner(System.in);
        String kata = masukan.next(); 
        int i;
        int a;
        String terbalik = "";
        String ng = "";
        int length = kata.length();
        int hapus = kata.length();
        
        
  System.out.println("Sebelum di balik : "+kata);
  
  
  for( i = length -3; i >= 0; i-- ){
   ng = ng + kata.charAt(i);
}
      for(a= hapus -1; a >= 0; a--){
   terbalik = terbalik + kata.charAt(a);
    }
  if(kata.contains("%ng")){
          System.out.println("Setelah di balik : ng"+ng);
      }
  else if (kata.contains("ny")){
      System.out.println("Setelah di balik : ny"+ng);
  }
  else{
      System.out.println("Setelah di balik : "+terbalik);
   }
  }
 }
