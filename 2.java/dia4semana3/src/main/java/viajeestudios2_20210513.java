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
public class viajeestudios2_20210513 {

public static void main(String[] args) {
    int cantidadAlumnos;
    int rango=0,costoTotal=0,costoPorAlumno=0;
    Scanner lector=new Scanner(System.in);
// TODO code application logic here
    System.out.println("ingrese cantidad de alumnos");
    cantidadAlumnos=lector.nextInt();
    if(cantidadAlumnos>100){rango=1;}
    if(cantidadAlumnos>50&&cantidadAlumnos<99){rango=2;}
    if(cantidadAlumnos>30&&cantidadAlumnos<49){rango=3;}
    if(cantidadAlumnos<30){rango=0;}

    switch (rango){
        case 1 :
            costoPorAlumno=6500;
            costoTotal=cantidadAlumnos*costoPorAlumno;
            break;
        case 2 :
            costoPorAlumno=7000;
            costoTotal=cantidadAlumnos*costoPorAlumno;
            break;
        case 3 :
            costoPorAlumno=9500;
            costoTotal=cantidadAlumnos*costoPorAlumno;
            break;
        default:
            costoPorAlumno=400000/cantidadAlumnos;
            costoTotal=400000;
            break;
       }
       System.out.println("el costo por alumno es " + costoPorAlumno);
       System.out.println("el costo por total es " + costoTotal);
    }
}
