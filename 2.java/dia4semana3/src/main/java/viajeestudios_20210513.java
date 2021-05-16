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
public class viajeestudios_20210513 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cant_alumnos;
	double costobus;
	double valor_x_alumno;
        costobus=400000;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese cantidad de alumnos : ");
        cant_alumnos=leer.nextInt();
        if (cant_alumnos>=100){
            valor_x_alumno=6500;
            costobus=cant_alumnos*valor_x_alumno;
        }else if (cant_alumnos>50 && cant_alumnos<=99){
            valor_x_alumno=7000;
            costobus=cant_alumnos*valor_x_alumno;
        }else if (cant_alumnos>30 && cant_alumnos<=49){
            valor_x_alumno=9500;
            costobus=cant_alumnos*valor_x_alumno;
        }else{
            valor_x_alumno=costobus/cant_alumnos;
        }
        System.out.println( "costo de la renta del bus es: "+ costobus);
	System.out.println("valor por alumno"+ valor_x_alumno);
    }
    
}

	