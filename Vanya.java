/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;


import java.util.Scanner;

public class Vanya {
   
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int i,cnt=0;
        int amigos= teclado.nextInt();
        int altura= teclado.nextInt();
        int a[];
        a= new int[amigos];
        for(i=0; i<amigos; i++)
            a[i]=teclado.nextInt();
            for(i=0; i<amigos; i++)
            {
                 if(a[i]>altura)
        {
            cnt+=2;
        }
        else
            cnt++;
            }     
        System. out. println(cnt);
    }
}
    
}
