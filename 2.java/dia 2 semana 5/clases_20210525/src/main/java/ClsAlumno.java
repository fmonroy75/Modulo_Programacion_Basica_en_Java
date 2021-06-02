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
    private ClsCurso Curso;
    
    public ClsAlumno(){
        
    }
    public ClsAlumno(String nombre){
        this.Nombre=nombre;
        
    }
    public void setNombre(String desc){
        this.Nombre=desc;
    }
    public void setCurso(ClsCurso curso){
        this.Curso=curso;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public ClsCurso getCurso(){
        return this.Curso;
    }    
    

}
