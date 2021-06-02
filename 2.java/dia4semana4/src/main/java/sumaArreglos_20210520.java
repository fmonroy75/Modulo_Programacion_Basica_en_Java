
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
public class sumaArreglos_20210520 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num1;
        int[] num2;
        int i;
        int suma=0;
        int largo;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese largo array: ");
        largo=leer.nextInt();
        num1=new int[largo];
        num2=new int[largo];
        for(i=0;i<largo;i++){
            System.out.println("ingrese elemnto en arreglo 1: ");
            num1[i]=leer.nextInt();
            System.out.println("ingrese elemnto en arreglo 2: ");
            num2[i]=leer.nextInt();            
        }
        for(i=0;i<largo;i++){
            System.out.println("pos "+(i+1)+" arreglo 1: "+num1[i]);
            System.out.println("pos "+(i+1)+" arreglo 2: "+num2[i]);
            System.out.println("suman: "+(num1[i]+num2[i]));
        }
    
    }
    
}
