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
public class ingresodatos_20210512{
    
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int entero;
        double doble;
        String cadena;
        System.out.println("ingrese un valor integer");
        entero=leer.nextInt();
        System.out.println("ingrese un valor doble");
        doble=leer.nextDouble();
        System.out.println("ingrese un valor String");
        cadena=leer.nextLine();
    
        System.out.println("valor entero es: " + entero);
        System.out.println("el valor doble es :"+doble);
        System.out.println("el valor string es: "+ cadena);
    }
}
