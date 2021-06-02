
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class mayorNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int mayor;
        int lim;
        char c;
        int i;
        boolean cond=true;
        Scanner leer=new Scanner(System.in);
        
        do{
        mayor=0;    
        System.out.println("ingrese la cantidad de numeros: ");
        lim=leer.nextInt();
        for (i=1;i<=lim;i++){
            System.out.println("ingrese numero  : ");
            num=leer.nextInt();
            if (num>mayor){
                mayor=num;
            }
               
        }        
        System.out.println("el mayor numero es: "+mayor);
        System.out.println("desea ingresar nuevamente S/N?");
        c=leer.next().charAt(0);
        if (c=='N' || c=='n'){cond=false;}
        }while(cond==true);
    }
    
}
