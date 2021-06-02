/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class ClsCurso {
    private String Descripcion;
    private int C_Alumnos;
    
    public ClsCurso(){
        
    }
    public ClsCurso(String descripcion, int c_alumnos){
        this.Descripcion=descripcion;
        this.C_Alumnos=c_alumnos;
    }
    
    public void setDescripcion(String desc){
        this.Descripcion=desc;
    }
    public void setC_Alumnos(int cant){
        this.C_Alumnos=cant;
    }
    public String getDescripcion(){
        return this.Descripcion;
    }
    public int getC_Alumnos(){
        return this.C_Alumnos;
    }    
}
