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
public class potencia_20210518 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        int lim;
        int num;
        int i;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros: ");
        lim=leer.nextInt();
        System.out.println("ingrese numero a calcular potencia: ");
        num=leer.nextInt();
        
        
        for (i=1;i<=lim;i++){
            System.out.println("potencia de "+num+"^"+i+": "+Math.pow(num,i));
        }
       
    }
}
