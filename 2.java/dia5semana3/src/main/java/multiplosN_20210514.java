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
public class multiplosN_20210514 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int multiplo;
        int suma=0;
        int i;
        int lim;
        char c;
        boolean cond=true;
        Scanner leer=new Scanner(System.in);
        do{
        System.out.println("ingrese la cantidad de numeros: ");
        lim=leer.nextInt();
        System.out.println("ingrese multiplo  : ");
        multiplo=leer.nextInt();

        for (i=1;i<=lim;i++){
            System.out.println("ingrese numero  : ");
            num=leer.nextInt();
            if (num%multiplo==0){suma=suma+1;}
               
        }        
        System.out.println("cantidad de numeros ingresados que son multiplos de  "+multiplo+ " es "+suma);
        System.out.println("desea ingresar otro numero S/N?");
        c=leer.next().charAt(0);
        if (c=='N' || c=='n'){cond=false;}
        }while(cond==true);
    }
    
}
