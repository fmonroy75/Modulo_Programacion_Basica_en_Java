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
public class promedioNnotas_20210513 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double promedio;
        int cnotas;
        int i=1;
        int suma=0;
        int nota;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese cantidad de notas : ");
        cnotas=leer.nextInt();
        System.out.println("-- ciclo while-- ");
        while (i<=cnotas){
            System.out.println("ingrese nota : " + i);
            nota=leer.nextInt();
            suma=suma+nota;
            i=i+1;
        }    
        promedio=suma/cnotas;
        System.out.println("promedio es : " +promedio);
        
        suma=0;
        System.out.println("-- ciclo for-- ");
        for (i=1;i<=cnotas;i++){
            System.out.println("ingrese nota : " + i);
            nota=leer.nextInt();
            suma=suma+nota;
            //i=i+1
        }    
        promedio=suma/cnotas;
        System.out.println("promedio es : " +promedio);
        }
    }
    

