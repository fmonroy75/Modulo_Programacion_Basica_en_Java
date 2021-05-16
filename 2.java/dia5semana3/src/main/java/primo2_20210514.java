
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
public class primo2_20210514 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int num;
        int multiplo;
        int resultado;
        int i,j;
        boolean primo;
        primo=true;
        Scanner leer=new Scanner(System.in);
        System.out.println("cuantos numeros desea ingresar  : ");
        cant=leer.nextInt();
        resultado=1;
        for (i=0;i<cant;i++){
            System.out.println("ingrese numero  : ");
            num=leer.nextInt();
            primo=true;
            j=2;        
            while (j<num ) {
                if (num%j==0){
                    primo=false;
                }
                j=j+1;
            }
            if(primo==true){
                resultado=resultado*num;
            }

        }
        System.out.println("resultado con do: "+resultado);

    }
    
}
