
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
public class fibonacci_20210518 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lim=0;
        int num=1;
        int paso;
        int ant=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros: ");
        lim=leer.nextInt();
        System.out.println("Serie de Fibonacci <= a: "+lim);
        System.out.println(ant);
        while (num<=lim){
            System.out.println(num);
            paso=ant;
            ant=num;
            num=paso+num;        
        }
    }
    
}
