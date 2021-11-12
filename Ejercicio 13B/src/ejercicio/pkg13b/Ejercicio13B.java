/*
B)Ingrese por teclado el puntaje de un alumno que ha postulado a la Universidad,
visualice un mensaje “Alumno Ingresado” si el puntaje obtenido es mayor a 500.
Solicitar nombre del alumno y tres notas (hacer promedio)
 */
package ejercicio.pkg13b;

import javax.swing.JOptionPane;

public class Ejercicio13B {

    public static void main(String[] args) {
        
        String nombre ="";
        int nota1 = 0;
        int nota2=0;
        int nota3=0;
        double Prom=0;
        
        nombre = JOptionPane.showInputDialog("Ingrese nombre del alumno: ");
        
        nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer nota: ", "Notas", JOptionPane.INFORMATION_MESSAGE));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segunda nota: ", "Notas", JOptionPane.INFORMATION_MESSAGE));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tercer nota: ", "Notas", JOptionPane.INFORMATION_MESSAGE));
        
        Prom = (nota1 + nota2 + nota3)/3;
       
        
        if(Prom>500){
            JOptionPane.showMessageDialog(null, "Alumno Ingresado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null, "Alumno no ingresado","Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
    }
    
}
