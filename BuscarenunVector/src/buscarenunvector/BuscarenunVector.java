
package buscarenunvector;

import java.util.Scanner;


public class BuscarenunVector {

  
    public static void main(String[] args) {
        //variables
        String nom;
        //crear objeto
        Scanner leer = new Scanner(System.in);
        // crear vector
        String [] nombres = new String [5];
        //cargar vector
        nombres [0] = "juan";
        nombres [1] = "pedro";
        nombres [2] = "pablo";
        nombres [3] = "carlos";
       
        
        System.out.println("Ingrese un nombre para buscar en la lista : ");
        nom = leer.next();
        
        
        for( int n=0;n<nombres.length;n++){
            if(nom.equals(nombres[n])){
                System.out.println("Dato encontrado!!!" + n );
            }else {
             System.out.println("No se encontro el dato!!!" + n );
            }
          
        }
    }
    
}
