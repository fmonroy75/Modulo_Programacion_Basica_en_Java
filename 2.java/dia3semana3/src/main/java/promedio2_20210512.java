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
public class promedio2_20210512 {
    public static void main(String[]args){
        int num1;
        int num2;
        int num3;
        int num4;
        int suma;
        double promedio;
        Scanner leer=new Scanner(System.in);


        System.out.println("ingrese un nota 1: ");
        num1=leer.nextInt();
        System.out.println("ingrese un nota 2: ");
        num2=leer.nextInt();
        System.out.println("ingrese un nota 3: ");
        num3=leer.nextInt();
        System.out.println("ingrese un nota 4: ");
        num4=leer.nextInt();
        suma=num1+num2+num3+num4;
        promedio=suma/4;
        System.out.println("el promedio es: "+ promedio);  
    }  
}
