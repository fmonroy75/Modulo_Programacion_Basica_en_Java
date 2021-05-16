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
public class if_else_20210512 {
    public static void main(String[]args){
        int num1;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un valor : ");
        num1=leer.nextInt();
        if (num1 > 0){
            System.out.println("numero "+ num1+ " es positivo");
        }else{
            System.out.println("numero "+ num1+ " es negativo");
        }
    }
}
