/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
import java.util.Scanner;
public class vinicultura_20210513 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int tamano;
	int precioinicial;
	int preciofinal=0;
	int kilos;
	char tipo;
        Scanner leer=new Scanner(System.in);
        // TODO code application logic here
        System.out.println("ingrese el tipo : ");
        tipo=leer.next().charAt(0);
        System.out.println("ingrese el tamaño : ");
        tamano=leer.nextInt();
        System.out.println("ingrese los kilos : ");
        kilos=leer.nextInt();
        System.out.println("ingrese el precio inicial : ");
        precioinicial=leer.nextInt();
        if (tipo=='A' || tipo=='a'){
            if (tamano==1){
                preciofinal=precioinicial+20;
            } else{
                preciofinal=precioinicial+30  ;                              
            }            
        }else if (tipo=='B' || tipo=='b'){
            if (tamano==1){
                preciofinal=precioinicial-30;
            } else{
                preciofinal=precioinicial-50 ;                              
            }            
        }
    	System.out.println("el precio final por kilo es: "+ preciofinal);
	System.out.println("ganancia por kilo: "+ (preciofinal-precioinicial));
	System.out.println("venta final: " + preciofinal*kilos);
    
    }
}
