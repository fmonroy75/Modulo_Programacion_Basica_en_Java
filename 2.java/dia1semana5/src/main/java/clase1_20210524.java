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
public class clase1_20210524 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona ClaseP;
        Auto ClaseA;
        Casa ClaseC;
        char cond;
        Scanner leer=new Scanner(System.in);
        
        ClaseP=new Persona();
        ClaseA=new Auto();
        ClaseC=new Casa();
        System.out.println("ingrese el nombre: ");
        ClaseP.setNombre(leer.nextLine());
        System.out.println("ingrese el Apellido: ");
        ClaseP.setApellido(leer.nextLine());
        System.out.println("ingrese el Rut: ");
        ClaseP.setId(leer.nextLine());
        System.out.println("ingrese edad: ");
        ClaseP.setEdad(leer.nextInt());
        System.out.println("Tiene Auto S/N: ");
        cond=leer.next().charAt(0);
        if (cond=='s' || cond =='S'){
            System.out.println("ingrese el Marca: ");
            ClaseA.setMarca(leer.next());
            System.out.println("ingrese el Modelo: ");
            ClaseA.setModelo(leer.next());
            System.out.println("ingrese el Color: ");
            ClaseA.setColor(leer.next());
            System.out.println("ingrese Tipo: ");
            ClaseA.setTipo(leer.next());
            ClaseP.setTieneAuto(ClaseA);
        }
        System.out.println("Tiene Casa S/N: ");
        cond=leer.next().charAt(0);
        if (cond=='s' || cond =='S'){
            System.out.println("ingrese el Construccion: ");
            ClaseC.setConstruccion(leer.next());
            System.out.println("ingrese el Urbana: ");
            ClaseC.setUrbana(leer.next());
            System.out.println("ingrese el Color: ");
            ClaseC.setColor(leer.next());
            System.out.println("ingrese Cantidad Pisos: ");
            ClaseC.setC_Piso(leer.nextInt());
            ClaseP.setTieneCasa(ClaseC);
        }
        
        
        
        System.out.println("nombre completo: "+ClaseP.getNombre()+" "+ClaseP.getApellido());
        if(ClaseP.getTieneAuto()!=null){
        System.out.println("Tiene auto Marca: "+ClaseP.getTieneAuto().Marca +" Modelo "+ClaseP.getTieneAuto().Modelo);
        System.out.println("Tiene auto Color: "+ClaseP.getTieneAuto().Color +" Tipo "+ClaseP.getTieneAuto().Tipo);
        }
        if(ClaseP.getTieneCasa()!=null){
            System.out.println("Vive en Casa: "+ClaseP.getTieneCasa().Construccion +" Modelo "+ClaseP.getTieneCasa().Urbana);
            System.out.println("Casa Color: "+ClaseP.getTieneCasa().Color +" con  "+ClaseP.getTieneCasa().C_Piso+" pisos");
        }
        
    }
    
}
