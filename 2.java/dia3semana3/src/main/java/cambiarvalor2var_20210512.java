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
public class cambiarvalor2var_20210512 {
    public static void main(String[]args){
        int num1;
        int num2;
        int num3;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un valor 1: ");
        num1=leer.nextInt();
        System.out.println("ingrese un valor 2: ");
        num2=leer.nextInt();
        num3=num1;
        num1=num2;
        num2=num3;
        System.out.println("valor 1: "+num1);
        System.out.println("valor 2: "+num2);
    }
}