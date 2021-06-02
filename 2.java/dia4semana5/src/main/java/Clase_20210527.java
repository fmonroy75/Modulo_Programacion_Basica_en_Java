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
public class Clase_20210527 {

        static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        int dia;
        int mes;
        int año;
        
        ClsFecha fecha;
        fecha = new ClsFecha(1,1,2021);
        // TODO code application logic here
        System.out.println("ingrese un dia: ");
        dia=leer.nextInt();
        fecha.setDia(dia);
        System.out.println("ingrese un mes: ");
        mes=leer.nextInt();
        fecha.setMes(mes);
        System.out.println("ingrese un año: ");
        año=leer.nextInt();
        fecha.setAño(año);
        //String[] datos=leer.nextLine().split("&");
        if(!fecha.FechaCorrecta()){
            System.out.println("La Fecha NO es válida");
        }else{
            System.out.println("La Fecha ES válida");
            System.out.println("Los próximos 30 días son:");
            //System.out.println("Día siguiente es:" + fecha.DiaSiguiente());
            for(int i=0;i<30;i++){
                System.out.println(fecha.DiaSiguiente());
            }
        }
    }
    
}
