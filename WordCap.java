/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;


import java.util.Scanner;

public class WordCap {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String word=in.next();
             if(Character.isUpperCase(word.charAt(0))) 
        
            System.out.println(word);
        if(Character.isLowerCase(word.charAt(0)))
            System.out.println(Character.toUpperCase(word.charAt(0))+word.substring(1));
    }
    
           
    
    
}