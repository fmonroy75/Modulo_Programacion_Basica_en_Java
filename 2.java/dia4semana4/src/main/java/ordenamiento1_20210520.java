
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
public class ordenamiento1_20210520 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num1;
        
        int i;
        int x;
        int pivote=0;
        int largo;
        char resp;
        int busq;
        boolean cond=false;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese largo array: ");
        largo=leer.nextInt();
        num1=new int[largo];
        
        for(i=0;i<largo;i++){
            System.out.println("ingrese elemnto en arreglo 1: ");
            num1[i]=leer.nextInt();
        }

        // ordenamiento
        for(x=0;x<largo;x++){
            for(i=0;i<num1.length-x-1;i++){
                if (num1[i]<num1[i+1]){
                    pivote=num1[i+1];
                    num1[i+1]=num1[i];
                    num1[i]=pivote;
                }
            }
        }
        System.out.println("ordenados de mayor a menor");
        for(i=0;i<largo;i++){
            System.out.println("ingrese elemnto "+i+" en arreglo 1: "+num1[i]);
 
        }
        
        
        System.out.println("Desea buscar algun elemnto S/N:");
        resp=leer.next().charAt(0);
        if (resp=='S' || resp=='s'){
            System.out.println("ingrese el valor a buscar: ");
            busq=leer.nextInt();
            i=0;
            while (i<largo && cond==false){
                if (num1[i]==busq){
                    System.out.println("elemento encontrado en la posicion: "+i);
                    cond=true;
                }
                i++;
            }
            if (!cond){
                System.out.println("elemento no fue encontrado");
            }
        }
        
        

    }
    
}
