
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class Clase_20210601_abstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor_abs p = new Profesor_abs();
        Alumno_abs aux = new Alumno_abs();
        ArrayList<Alumno_abs> a=new ArrayList();
        
        p.setNombre("Inna");
        p.setEdad(40);
        p.setColegio("LanguageLife");
        p.setSueldo(500000);
        
        
        
        aux.setColegio("LanguageLife");
        aux.setCurso(1);
        aux.setEdad(20);
        aux.setNombre("Camila");

        a.add(aux);
        
        aux.setColegio("LanguageLife");
        aux.setCurso(1);
        aux.setEdad(5);
        aux.setNombre("Antonia");
        
        a.add(aux);
        
       
        p.accionPersona();
        System.out.println("Profesor "+p.getNombre()+" trabaja en: "+p.getColegio());
        System.out.println("Sus estudiantes son:");
        for(int i=0;i<a.size();i++){
            System.out.println("Alumno:"+ a.get(i).getNombre());
            System.out.println("Edad:"+ a.get(i).getEdad());
            System.out.println("Colegio:"+ a.get(i).getColegio());
            System.out.println("Curso:"+ a.get(i).getCurso());
            System.out.println(a.get(i).getNombre()+" ");
            a.get(i).accionPersona();
        }
        
        
       
    }
    
}
