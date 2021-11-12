/*
b)Realizar un programa utilizando WHILE que  le pida al 
usuario un valor inicial y un valor final por consola, 
e incrementemos el valor inicial dado hasta el tope establecido, 
mostrando el valor de la variable contadora en cada iteración.
Imprimir en consola cada resultado.
 */
package pkgwhile;

import java.util.Scanner;

public class WHILE {


    public static void main(String[] args) {
    
    
    
    Scanner Leer = new Scanner(System.in);
        System.out.println("°°°Ingrese 2 valores°°°");
        System.out.print("Ingrese un valor inicial: ");
        int i;
        i = Leer.nextInt();
       
         System.out.print("Ingrese un valor final: ");
         int b;
         b = Leer.nextInt();
         
         while(i!=b){
             System.out.println("Valor de i: " + i);
             i++;
         }
         System.out.println("Valor final de i: " + b);
    }
    
}
