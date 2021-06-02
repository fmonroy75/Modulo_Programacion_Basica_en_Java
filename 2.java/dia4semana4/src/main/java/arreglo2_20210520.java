
import java.util.ArrayList;
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
public class arreglo2_20210520 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> num1=new ArrayList<Integer>();
        int i;
        double suma=0;
        char resp='S';
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("ingrese primer numero: ");
            num1.add(leer.nextInt());
            System.out.println("desea seguir otro numero S/N: ");
            resp=leer.next().charAt(0);
        }while(resp=='S' || resp=='s');
        System.out.println("arreglo : "+num1);
        for(i=0;i<num1.size();i++){
            suma=suma+num1.get(i);
        }    
        System.out.println("arreglo suman: "+suma);
        }
            
    }
    

