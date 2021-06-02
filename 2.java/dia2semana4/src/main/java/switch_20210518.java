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
public class switch_20210518 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lim;
        int num=1;
        int i;        
        int opt;
        char rep='S';
        Scanner leer=new Scanner(System.in);        
        do{



            System.out.println("1.- serie de Fibonacci ");
            System.out.println("2.- potencias");
            System.out.println("3.- palindrome");
            System.out.println("selecciones una opcion: ");
            opt=leer.nextInt();
            switch (opt){
                case 1:
            // TODO code application logic here

                    int paso;
                    int ant=0;
                    num=1;
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
                    break;
                case 2:
                    System.out.println("ingrese la cantidad de numeros: ");
                    lim=leer.nextInt();
                    System.out.println("ingrese numero a calcular potencia: ");
                    num=leer.nextInt();


                    for (i=1;i<=lim;i++){
                        System.out.println("potencia de "+num+"^"+i+": "+Math.pow(num,i));
                    }

                    break;
                case 3:
                    String cadena;
                    String cadena2="";
                    int des;
                    System.out.println("ingrese palabra a determinar: ");
                    cadena=leer.next();
                    cadena=cadena.toLowerCase();
                    des=cadena.length()-1;
                    //System.out.println(cadena.length());
                    while(des>=0){
                        cadena2=cadena2.concat(cadena.substring(des,des+1));
                        //System.out.println(cadena.substring(3,1));
                        des=des-1;
                    }
                    System.out.println("cadena original: " +cadena);
                    System.out.println("nueva cadena : " +cadena2);
                    if (cadena.equals(cadena2)){
                        System.out.println("Son Palindromes ");
                    }else{
                        System.out.println("NO Son Palindromes ");
                    }

                    break;
                default:  
                    System.out.println("Gracias");
                    break;
            }
            System.out.println("desea continuar S/N:");
            rep=leer.next().charAt(0);
        }while(rep=='S' || rep=='s');
    }
    
}
