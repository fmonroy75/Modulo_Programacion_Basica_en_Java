
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
public class ClsCurso {

    private String Descripcion;
    private static ArrayList<ClsAlumno> C_alumnos=new ArrayList();
    
    public ClsCurso(){
        
    }
    /*
    public ClsCurso(String descripcion){
        this.Descripcion="";
        this.C_alumnos=null;
    }*/
    
    public void setDescripcion(String desc){
        this.Descripcion=desc;
    }
/*    public void setC_Alumnos(int cant){
        this.C_Alumnos=cant;
    }*/
    public String getDescripcion(){
        return this.Descripcion;
    }
/*    public int getC_Alumnos(){
        return this.C_Alumnos;
    }*/
    public void AgregarAlumnos(ClsAlumno alumno){
        //System.out.println("agregando "+alumno.getNombre()+" edad:"+alumno.getEdad());
        C_alumnos.add(alumno);
    }
    
    public int Cantidadalumnos(){
        return C_alumnos.size();
    }
    public ClsAlumno getA(int i){
        //System.out.println(i);
        return C_alumnos.get(i);
    }
    
    public void MostrarAlumno(int x){
        for(int i=0;i<C_alumnos.size();i++){
            System.out.println("-->nombre completo: "+this.C_alumnos.get(i).getNombre()+" edad "+this.C_alumnos.get(i).getEdad() );
        }
    }
    
 
}

