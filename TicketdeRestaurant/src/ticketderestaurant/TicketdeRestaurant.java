
package ticketderestaurant;

import java.util.Scanner;


public class TicketdeRestaurant {

 
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int cuotas =0;
        int NT=0;
        int SupremaM= 600;
        int ChoopC = 350;
        int PostreVig = 250;
        
        System.out.print("Ingrese nombre del mozo: ");
        String Mozo="";
        Mozo = Leer.next();
        int consumo;
        consumo = SupremaM + ChoopC + PostreVig;
        System.out.println("Total consumido: $ ");
        System.out.print("Modo de pago: ");
         String FdeP=""; 
         FdeP = Leer.next();
        
        switch(FdeP){
            case "Credito":
                FdeP="Credito";
                break;
            case "Debito":
                FdeP="Debito";
                break;
            case "Efectivo":
                FdeP="Efectivo";
                break;
            default:
                System.out.println("Ingrese un medio de pago válido");
        }
        
        if(FdeP.equals("Credito")){
            System.out.println("Ingrese N° de Tarjeta de crédito: ");
            NT = Leer.nextInt();
            System.out.println("Cuotas: ");
            cuotas = Leer.nextInt();
        }else if(FdeP.equals("Debito")){
            System.out.println("Ingrese N° de la tarjeta de Débito: ");
            NT = Leer.nextInt();
        }
        
        
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===Bodegón Ribera de La Boca===");
        System.out.println("=El mejor Bodegón de la Ciudad=");
        System.out.println("=Bransend 810, La Boca, BS.AS.=");
        System.out.println("===============================");
        System.out.println("Caja # 1 - Ticket # 1");
        System.out.println("Usted fue atendido por: " + Mozo);
        System.out.println("30/08/2021          16:50:30 PM");
        System.out.println("===============================");
        System.out.println("*1 Suprema Maryland________$" + SupremaM);
        System.out.println("*1 Chopp de cerveza________$" + ChoopC);
        System.out.println("*1 Postre Vigilante________$" + PostreVig);
        System.out.println("===============================");
        System.out.println("SUBTOTAL___________________$" + consumo );
        System.out.println("FORMA DE PAGO: " + FdeP);
        if(FdeP.equals("Credito")){
            System.out.println("NUMERO DE TARJETA: " + NT );
        }else if(FdeP.equals("Debito")){
            System.out.println("NUMERO DE TARJETA: " + NT);
        }else{
            System.out.println("NUMERO DE TARJETA: ");
        }
        System.out.println("CUOTAS: " + cuotas);
        switch(FdeP){
            case "Credito":
                System.out.println("DESCUENTO: ");
                break;
            case "Debito":
                System.out.println("DESCUENTO: 10%");
                break;
            case "Efectivo":
                System.out.println("DESCUENTO: 30%");
                break;
            default:
        }
        System.out.println("");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        switch(FdeP){
            case "Credito":
                System.out.println("°TOTAL______________________$" + (consumo+(consumo*0.3))+" °");
                break;
            case "Debito":
                System.out.println("°TOTAL______________________$" + (consumo-(consumo*0.1))+ " °");
                break;
            case "Efectivo":
                System.out.println("°TOTAL______________________$" + (consumo-(consumo*0.3))+"  °");
                break;
            default:
                System.out.println("Ingrese un método de pago válido");
        }
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("°°°°°Gracias por elegirnos°°°°°");
        System.out.println("===============================");
        System.out.println("===============================");
    


}
    
    
}