/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

public class Bear {


    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        int c=0;
        while(a<=b)
        {
            c++;
            a*=3;
            b*=2;
            
        }
        System.out.println(c);
        
    }
}


