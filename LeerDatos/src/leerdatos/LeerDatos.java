
package leerdatos;

import java.util.Scanner;

public class LeerDatos {

    public static void main(String[] args) {

        Scanner Lector = new Scanner(System.in);
        
        System.out.println("°°°°Ingreso de datos°°°°");
        System.out.println("¿Cual es tu nombre?");
        String Nombre;
        Nombre = Lector.nextLine();
        System.out.println("¿Cual es tu numero de celular?");
        String Cel;
        Cel = Lector.nextLine();
        System.out.println("¿Cual es tu peso?");
        int Peso;
        Peso = Lector.nextInt();
        System.out.println("----Impresion de ficha----");
        System.out.println("* Nombre: " + Nombre);
        System.out.println("* Numero de celular:" + Cel);
        System.out.println("* Peso:" + Peso + "Kg");
    }
    
}
