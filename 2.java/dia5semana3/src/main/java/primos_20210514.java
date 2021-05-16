
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
import java.util.Scanner;
public class primos_20210514 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        int num;
        int multiplo;
        int resultado;
        int i;
        char c1;
        boolean primo;
        boolean cond=true;
        primo=true;
        Scanner leer=new Scanner(System.in);
        resultado=1;
        do {
            System.out.println("ingrese numero  : ");
            num=leer.nextInt();
            primo=true;
            i=2;    
        
            while (i<num ) {
                if (num%i==0){
                    primo=false;
                }
                i=i+1;
            }
            if(primo==true){
                resultado=resultado*num;
            }

            System.out.println("desea ingresar otro numero S/N?");
            c1=leer.next().charAt(0);
            if (c1=='N' || c1=='n'){cond=false;}
        }while (cond==true );        
        System.out.println("resultado con do: "+resultado);
    }
    
}

