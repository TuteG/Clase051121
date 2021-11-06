/*
Ejercicio Clase 05/11/2021
Se necesita crear un progrma para una casa de comidas rapidas, la misma debe tener:
-Presentacion de la aplicacion joption con icon de la copañia
-Soliictar antes de la seleccion del pedido al cliente nombre y formas de pago
-Solicitarle el tipo de Hamburguesa con joption con combo
-Solicitarle el tipo de Papas fritas  con joption con combo
-Solicitarle el tipo de Bebidas con joption con combo
-Mostrar el pedido seleccionado en pantalla por joption y datos del cliente
-Los productos deben estar en tres vectores separados
 */
package restaurantecomidarapida;
        
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class RestauranteComidaRapida {

    
    public static void main(String[] args) {
        ImageIcon Icono = new ImageIcon("src\\Icono\\Fast Food.png");
        ImageIcon Libreta = new ImageIcon("src\\Icono\\Libreta.png");
        ImageIcon Hambu = new ImageIcon("src\\Icono\\Hamburguesa.png");
        ImageIcon Pap = new ImageIcon("src\\Icono\\Papas.png");
        ImageIcon Be = new ImageIcon("src\\Icono\\Bebida.png");
        
        String nombre="";
        String FdeP="";
        String [] Hamb = new String[5];
        Hamb [0] = "Hamburguesa simple";
        Hamb [1] = "Hamburguesa con queso";
        Hamb [2]= "Hamburguesa con queso y panceta";
        Hamb [3]= "Oklahoma";
        Hamb [4]= "Patty Melt";
        String [] Papas  = {"Papas simples","Papas con cheddar","Papas con cheddar y panceta"};
        String Bebidas []  = {"Coca Cola", "Sprite", "Fanta", "Cerveza", "Agua"};
        
        
        JOptionPane.showMessageDialog(null, "Bienvenido a VelociRapid Fast Food", "Buen día", JOptionPane.INFORMATION_MESSAGE, Icono);
        nombre = JOptionPane.showInputDialog(null, "Su nombre por favor: ", "Datos del cliente", JOptionPane.INFORMATION_MESSAGE);
        FdeP = JOptionPane.showInputDialog(null, "Forma de Pago", "Datos del cliente", JOptionPane.INFORMATION_MESSAGE);
        Object Ham= JOptionPane.showInputDialog(null, "Seleccione su hamburguesa", "Pedido", JOptionPane.QUESTION_MESSAGE,Hambu, Hamb, Hamb[0]);
        Object Papa = JOptionPane.showInputDialog(null, "Seleccione sus papas", "Pedido", JOptionPane.QUESTION_MESSAGE, Pap, Papas, Papas[0]);
        Object Beb = JOptionPane.showInputDialog(null, "Seleccione su bebida", "Pedido", JOptionPane.QUESTION_MESSAGE, Be, Bebidas, Bebidas[0]);
        JOptionPane.showMessageDialog(null, "Nombre del cliente: " + nombre + "\nForma de pago: " + FdeP + "\nHamburguesa: " + Ham + "\nPapas: " + Papa + "\nBebida: " + Beb + "\n\nGracias por su compra", "VelociRapid Fast Food", JOptionPane.INFORMATION_MESSAGE, Icono);        
        
        
    }
    
}
