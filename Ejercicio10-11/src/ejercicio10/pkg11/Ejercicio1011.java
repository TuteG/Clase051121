/*
Realizar un programa que calcule las cuotas de un préstamo bancario. 
Solicitarle al Cliente por JOPTIONPANE :
Nombre  y apellido
DNI
Sueldo Mensual:
Solicitado:
Cuotas : hasta 12 

Calculo: 
•	El banco presta hasta 100000 pesos siempre y cuando el sueldo del 
        solicitante superé los 200000 anuales.
•	El préstamo  no debe superar a los 10 sueldos del cliente.
•	Calculo = solicitado / cuota

Imprimir la información consola
Logo del banco 
Información del cliente  
Monto solicitado
Cantidad de cuotas
Importe a pagar
Y Si esta aprobado o no (este puede contener un icono simbolizando el si o el no)
 */
package ejercicio10.pkg11;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ejercicio1011 {


    public static void main(String[] args) {
        ImageIcon Libreta = new ImageIcon("src\\Imagenes\\Libreta.png");
        ImageIcon Logo = new ImageIcon("src\\Imagenes\\LogoBanco.png");
        ImageIcon No = new ImageIcon ("src\\Imagenes\\NO Banco.png");
        ImageIcon Si = new ImageIcon ("src\\Imagenes\\Si Banco.png");
        String nombre = "";
        String DNI = "";
        int SueldoM = 0;
        int Prest = 0;
        int Cuotas = 0;
        int SueldoA = 0;
        int CuoP = 0;
        
        nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del cliente: ", "Datos del cliente", JOptionPane.INFORMATION_MESSAGE);
        DNI = JOptionPane.showInputDialog(null, "Ingerese DNI: ", "Datos del cliente", JOptionPane.INFORMATION_MESSAGE);
        SueldoM = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese sueldo mensual: ", "Datos del cliente", JOptionPane.INFORMATION_MESSAGE));
        Prest = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese monto solicitado: ", "Datos del cliente", JOptionPane.INFORMATION_MESSAGE));
        Cuotas = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de cuotas", "Datos del Préstamo", JOptionPane.QUESTION_MESSAGE));
        
        SueldoA = SueldoM*12;
        
        
        if(SueldoA>200000 && (SueldoM*10)>Prest)
            {
            JOptionPane.showMessageDialog(null, "Usted puede solicitar el préstamo", "SI", JOptionPane.INFORMATION_MESSAGE, Si);
            JOptionPane.showMessageDialog(null, "Nombre: " +nombre+ "\nDNI: " +DNI+ "\nMonto solicitado: " +Prest+ "\nCantidad de cuotas: " +Cuotas+ "\nImporte a pagar: " + (Prest/Cuotas), "SI", JOptionPane.INFORMATION_MESSAGE, Logo);
        }else{
            JOptionPane.showMessageDialog(null, No );
        }
        
        
        
        
        
        
        
        
               
    }
    
}
