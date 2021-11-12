/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generaciones;

/**
 *
 * @author User
 */
public class Generaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int Nacimiento=1990;
        
        if(Nacimiento >= 1930 &&Nacimiento<= 1948){
            System.out.println("Es generación Silenciosa");
        }else if(Nacimiento >= 1949 && Nacimiento <= 1968){
            System.out.println("Es generación Baby Boom");
        }else if(Nacimiento >= 1969 && Nacimiento <= 1980){
            System.out.println("Es generación X");
        }else if(Nacimiento >= 1981 && Nacimiento <= 1993){
            System.out.println("Es generación Y");
        }else if(Nacimiento >= 1994 && Nacimiento <= 2010){
            System.out.println("Es generación Z");
        }
                

                
}
}
