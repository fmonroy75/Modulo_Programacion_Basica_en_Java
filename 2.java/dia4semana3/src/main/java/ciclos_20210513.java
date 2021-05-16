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
public class ciclos_20210513 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
	int saltos;
        int i;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el numero limite : ");
        num=leer.nextInt();
        System.out.println("ingrese iteracion : ");
        saltos=leer.nextInt();
        if (saltos<1){saltos=1;}
        System.out.println("do while ");
        i=0;
        do {
            System.out.println(i);
            i=i+saltos;
        }while (i<num);
                
        System.out.println("while ");
        i=0;
        while (i<num) {
            System.out.println(i);
            i=i+saltos;
        }
        System.out.println("for ");
        for (i=0;i<num;i=i+saltos) {
            System.out.println(i);
        }
                
        
        
    }
    
}
