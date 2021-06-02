
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
public class ClsAlumno {
    private String Nombre;
    //private ClsCurso Curso;
    private int Edad;
    private static ArrayList<ClsNotas> Notas=new ArrayList();
    
    
    public ClsAlumno(){
        
    }
    public ClsAlumno(String nombre,int edad){
        this.Nombre=nombre;
        this.Edad=edad;
        
    }
    public void setNombre(String desc){
        this.Nombre=desc;
    }
/*    public void setCurso(ClsCurso curso){
        this.Curso=curso;
    }*/
    public String getNombre(){
        return this.Nombre;
    }
/*    public ClsCurso getCurso(){
        return this.Curso;
    }*/    

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }
    
    public void AgregarNotas(ClsNotas nota){
        //System.out.println("agregando "+alumno.getNombre()+" edad:"+alumno.getEdad());
        Notas.add(nota);
    }
    public ClsNotas getN(int i){
        //System.out.println(i);
        return Notas.get(i);
    }
    
    @Override
    public String toString(){
   
        return "Nombre: " + this.Nombre + " Edad: " + this.Edad;
    }

}
