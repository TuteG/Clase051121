/*
A)Crear una aplicación, que permita el ingreso de 2 números, para luego 
calcular la suma, resta, división, multiplicación, división y residuo.
B)Ingrese por teclado el puntaje de un alumno que ha postulado a la Universidad,
visualice un mensaje “Alumno Ingresado” si el puntaje obtenido es mayor a 500.

Mostrar y solicitar valores utilizando JOPTIONPANE
 */
package ejercico13;

import javax.swing.JOptionPane;


public class Ejercico13 {

    
    public static void main(String[] args) {
    int num;
    int num1;
    int suma;
    int resta;
    int multi;
    int div;
    double porcen;
    
    num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número", "Números", JOptionPane.INFORMATION_MESSAGE));
    num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número", "Números", JOptionPane.INFORMATION_MESSAGE));
    
    suma = num + num1;
    resta = num - num1;
    multi = num * num1;
    div = num / num1;
    porcen = num % num1;
    
    JOptionPane.showMessageDialog(null, "La suma es: " + suma, "RESULTADOS", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "La resta es: " + resta, "RESULTADOS", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "La multiplicación es: " + multi, "RESULTADOS", JOptionPane.INFORMATION_MESSAGE);    
    JOptionPane.showMessageDialog(null, "La división es: " + div, "RESULTADOS", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "El residuo es: " + porcen, "RESULTADOS", JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }
    
}
