
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
public class multiplos_20210514 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int multiplo;
        int suma;
        int i;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el numero limite : ");
        num=leer.nextInt();
        System.out.println("ingrese numero  : ");
        multiplo=leer.nextInt();
        suma=0;
        i=0;
        
        do {
            suma=suma+(multiplo*i);
            i=i+1;
        }while (i<=num);
                
        System.out.println("resultado con do: "+suma);
        i=0;
        suma=0;
        while (i<=num) {
            suma=suma+(multiplo*i);
            i=i+1;
        }
        System.out.println("resultado con while: "+suma);
        
        suma=0;
        for (i=0;i<=num;i++) {
            suma=suma+(multiplo*i);
        }
        System.out.println("resultado con for: "+suma);
                     
        
    }
    
}
