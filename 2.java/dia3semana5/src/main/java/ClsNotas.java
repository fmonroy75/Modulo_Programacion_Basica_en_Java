
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
public class ClsNotas {
    private int C_notas;
    private ArrayList<Double> Notas=new ArrayList<Double>(); 
    //private ClsAlumno Alumno;
    private int indexAlumno;
    public ClsNotas(){
        
    }

    public void setC_Notas(int cant){
        this.C_notas=cant;
    }
//    public void setAlumno(ClsAlumno alum){
//        this.Alumno=alum;
//    }
    public int  getC_Notas(){
        return this.C_notas;
    }

    public void setIndexAlumno(int indexAlumno) {
        this.indexAlumno = indexAlumno;
    }

    public int getIndexAlumno() {
        return indexAlumno;
    }
//    public ClsAlumno getAlumno(){
//        return this.Alumno;
//    }      
    public void NuevaNota(double nota){
        Notas.add(nota);
        C_notas=Notas.size();
    }
    public double Promedio(){
        double suma=0;
        int i;
        double prom;
        for (i=0;i<Notas.size();i++){
            suma=Notas.get(i)+suma;
        }
        prom=suma/C_notas;
        return (prom);
    }
    public double PromedioAlumno(int index){
        double suma=0;
        int i;
        double prom;
        for (i=0;i<Notas.size();i++){
            suma=Notas.get(i)+suma;
        }
        prom=suma/C_notas;
        return (prom);
    }    
}
