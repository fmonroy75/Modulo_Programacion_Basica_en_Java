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
public class calculadora_20210519 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1;
        double num2;
        char oper;
        double res=0;
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("ingrese primer numero: ");
            num1=leer.nextDouble();
            System.out.println("ingrese segundo numero: ");
            num2=leer.nextDouble();
            System.out.println("ingrese operador (+,-,/,*,^): ");
            oper=leer.next().charAt(0);
            switch (oper){
                    case '+':
                       res=num1+num2;
                       break;
                    case '-':
                       res=num1-num2;
                       break;
                    case '*':
                       res=num1*num2;
                       break;
                    case '/':
                       res=num1/num2;
                       break;   
                    case '^':
                       res=Math.pow(num1,num2);
                       break;
            }
            System.out.println("resultado es: "+res);
            System.out.println("desea continuar S/N:");
            res=leer.next().charAt(0);
        }while(res=='S' || res=='s');

    }
    
}
