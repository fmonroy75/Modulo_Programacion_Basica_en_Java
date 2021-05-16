
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
public class sumaParImpar_20210514 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int multiplo;
        int sumaP=0;
        int sumaI=0;
        int contP=0;
        int contI=0;
        int i;
        int lim;
        char c;
        boolean cond=true;
        Scanner leer=new Scanner(System.in);
        do{
        sumaP=0;sumaI=0;contP=0;contI=0;    
        System.out.println("ingrese la cantidad de numeros: ");
        lim=leer.nextInt();
        for (i=1;i<=lim;i++){
            System.out.println("ingrese numero  : ");
            num=leer.nextInt();
            if (num%2==0){
                sumaP=sumaP+num;
                contP=contP+1;
            }else{
                sumaI=sumaI+num;
                contI=contI+1;
            }
               
        }        
        System.out.println("cantidad de numeros impares es  "+contI+ ", suman :"+sumaI);
        System.out.println("cantidad de numeros pares es  "+contP+ ", suman :"+sumaP);
        System.out.println("desea ingresar nuevamente S/N?");
        c=leer.next().charAt(0);
        if (c=='N' || c=='n'){cond=false;}
        }while(cond==true);
    }
    
}
