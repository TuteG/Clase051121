
package switchsueldo;

import java.util.Scanner;

public class SwitchSueldo {

 
    public static void main(String[] args) {
    
        Scanner Leer = new Scanner(System.in);
                
        System.out.println("#### Ingrese datos del empleado ####");
        System.out.print("Nombre y apellido: ");
        String Nombre= Leer.nextLine();
        System.out.print("Fecha de nacimiento: ");
        String FdeN = Leer.nextLine();
        System.out.print("Area de trabajo: ");
        String AreaDT;
        AreaDT = Leer.nextLine();
        System.out.print("Categoria: ");
        char Cat;
        Cat=Leer.next().charAt(0);
        System.out.print("Sueldo actual: ");
        double Sueldo = Leer.nextDouble();
        System.out.print("Años de antigüedad: ");
        int AdeA = Leer.nextInt();
        int Aumento = 0;
        System.out.println("----Porcentaje de aumento por categoria----");
        System.out.println("Categoria A = 18%/Categoria B = 12%/Categoria C = 9%/Categoria D = 6%");        
        
         switch (Cat) {
            case 'A':
                Aumento = 18;
                break;
            case 'B':
                Aumento = 12;
                break;
            case 'C':
                Aumento = 9;
                break;
            case 'D':
                Aumento = 6;
                break;
            default:
                System.out.println("Debe ingresar una categoria válida");
        }
         
         if(Aumento!=0){
             System.out.println("°°°°°°°°°°Ficha de empleado°°°°°°°°°°");
             System.out.println("Nombre y Apellido: " + Nombre);
             System.out.println("Fecha de nacimiento: " + FdeN);
             System.out.println("Area de Trabajo: " + AreaDT);
             System.out.println("Categoria: " + Cat);
             System.out.println("Años de Antigüedad: " + AdeA);
             System.out.println("Sueldo actual: " + Sueldo);
             System.out.println("Porcentaje de aumento: " + Aumento+"%");
             System.out.println("Sueldo con aumento: " + (Sueldo + (Sueldo*Aumento/100)));
             System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
         }
        
        }
        
        
        
    }
    

