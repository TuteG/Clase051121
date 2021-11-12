/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3variablesyconstantes;

/**
 *
 * @author User
 */
public class Eje3VariablesyConstantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int Numero1;
        int Numero2;
        int Suma;
        int Edad = 31;
        String Nombre = "Matias Gayoso";
        
        //Constante
        final int Numero_3=4;
        //Ingreso valores a las variables
        Numero1= 30;
        Numero2= 40;
        //Operación suma
        Suma=Numero1 + Numero2;
        //Muestro en pantalla resultado de la suma y las dos variables
        System.out.println("Número 1 = " + Numero1);
        System.out.println("Número 2 = " + Numero2);
        System.out.println("Resultado de Número 1 + Número 2 = " + Suma);

        // Cambio los valores de numero1,numero2 y vuelvo a realizar la operación de suma
        System.out.println("#####Cambio de valor de las variables#####");
        Numero1 = 100;
        Numero2 = 200;
        //operación suma
        Suma = Numero1 + Numero2;
    
        // Muestro en pantalla las dos variables y el resultado de la suma
        System.out.println("Número 1 = " + Numero1);
        System.out.println("Número 2 = " + Numero2);
        System.out.println("Resultado de Número 1 + Número 2 = " + Suma);

        // Instancio y muestro en pantalla la variable nombre y su edad
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        // Muestro en pantalla la constante
        System.out.println("Constante = " + Numero_3);
        
        
                
    }
    
}
