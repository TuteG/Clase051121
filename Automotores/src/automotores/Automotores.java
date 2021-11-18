/*
Se solicita hacer un sistema para sacar turnos en un centro de servicios para el automovil.
se debe solicitar al clientes :
    -Nombre del Clientes, DNI y dominio del vehículo
Solicitar al cliente permitir seleccionar:
Cambio de neumáticos
Cambio de aceite
Pastillas de frenos 
Alineación 
Balanceo
Imprimir el turno al cliente con detalle con los servicios seleccionados y la información del cliente
Imprimir ticket
 */
package automotores;

import java.util.Scanner;


public class Automotores {


    public static void main(String[] args) {
        String servicio = "";
        int servicios = 0;
        String marca = "";
        int marcas = 0;
        String DNI = "";
        
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("----Bienvenido a Master Service----");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        
        System.out.println("Ingrese sus datos por favor");
        
        Scanner Leer = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = "";
        nombre = Leer.next();
        do{
            System.out.print("DNI: ");
           
            DNI = Leer.next();
            if(DNI.length()>8){
                System.out.println("Ingrese un DNI válido");
            }
        }while(DNI.length()!=8);
        
        
        System.out.print("Dominio del auto: ");
        String Dom = "";
        Dom = Leer.next();
        System.out.println("\nElija la marca de su auto \n1* FIAT \n2* FORD \n3* VW \n4* CHEVROLET");
        
        marcas = Leer.nextInt();
        switch(marcas){
            case 1:
                marca = "FORD";
                break;
            case 2:
                marca = "FIAT";
                break;
            case 3:
                marca = "VW";
                break;
            case 4:
                marca = "CHEVROLET";
                break;
            default: 
                marcas = 0;
                System.out.println("Elija una opción válida");
        }
        
        
        do{
        System.out.println("\nElija los servicios requeridos: \n1* Cambio de neumaticos \n2* Cambio de aceite \n3* Pastillas de freno \n4* Alineación \n5* Balanceo \n* Presione 0 para salir del menú.");
        servicios = Leer.nextInt();
        switch(servicios){
            
            case 1:
               servicio = "Cambio de neumaticos";
                
               break;
            case 2:
                servicio = "Cambio de aceite";
                
                break;
            case 3:
                servicio ="Pastillas de freno";
                
                break;
            case 4:
                servicio = "Alineacion";
                
                break;
            case 5:
                servicio = "Balanceo";
                
                break;
            default:
                servicios = 0;
            }
        }while(servicios!=0&&servicios<=5);
        
        
        System.out.println("\n===============================");
        System.out.println("===============================");
        System.out.println("==========Su ticket============");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("*Nombre del Cliente: "   + nombre);
        System.out.println("*DNI del cliente: "     + DNI);
        System.out.println("*Marca del Vehiculo: " + marca);
        System.out.println("*Dominio del Vehiculo: " + Dom);
        System.out.println("===============================");
        System.out.println("*Servicios : " + servicio);
        System.out.println("===============================");
        System.out.println("===============================");
        
        
        
        
        
    }
    
}
