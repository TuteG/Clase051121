/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecondicionales;

/**
 *
 * @author User
 */
public class EjeCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diagrama 1");
        int Temperatura = 27;
        if (Temperatura > 25){
            System.out.println("¡A la playa!");
        }
        System.out.println("------------------------");
        System.out.println("Diagrama 2");
        boolean haceSol=true;
        if(haceSol==true){
            System.out.println("No te olvides la sombrilla");
        }
        System.out.println("------------------------");
        System.out.println("Diagrama 3");
        haceSol = true;
        boolean Nevado = true;
        if(haceSol||Nevado){
            System.out.println("¡Que bien!");
        }
        System.out.println("------------------------");
        System.out.println("Diagrama 4");
        
        boolean Nevando = true;
        Temperatura = 29;
        if(Nevando && (Temperatura>=20 && Temperatura<=30)){
            System.out.println("¡No me lo creo!");
            }
        System.out.println("------------------------");
        System.out.println("Diagrama 5");
        Temperatura = 32;
        haceSol = true;
        
        if((Temperatura<0||Temperatura>30) && haceSol==true){
            System.out.println("Mejor me quedo en casa");
        }
        System.out.println("------------------------");
        System.out.println("Diagrama 6");
        Temperatura = 32;
        if(Temperatura>25){
            System.out.println("¡A la playa!");
        }
        
        System.out.println("------------------------");
        System.out.println("Diagrama 7");
        Temperatura = 10;
        if(Temperatura<=25){
            System.out.println("Esperando el buen tiempo...");
        }
        System.out.println("------------------------");
        System.out.println("Diagrama 8");
        if(Temperatura>25){
            System.out.println("¡¡¡A la playa!!!");
        }else {
            System.out.println("Esperando el buen tiempo...");
        }
        System.out.println("------------------------");
        System.out.println("Diagrama 9");
        if(Temperatura>25){
            System.out.println("!A la playa!");
        }else if(Temperatura>15){
            System.out.println("¡A la montaña!");
        }else if(Temperatura<5 && Nevado==true){
            System.out.println("!A esquiar!");
        }else{
            System.out.println("A dormir");
        }
        System.out.println("------------------------");
        System.out.println("Diagrama 10");
        if(Temperatura<15){
            if(Temperatura<5){
                System.out.println("¡A esquiar!");
            }else{
                System.out.println("A dormir");
            }
        }else if(Temperatura>25){
            System.out.println("¡A la playa!");
            
        }else{
            System.out.println("¡A la montaña!");
        }
    }
    }