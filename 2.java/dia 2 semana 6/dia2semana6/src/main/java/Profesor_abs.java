/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class Profesor_abs extends Personas_abs {
    
    //Atributos propios de un profesor
    private double sueldo;
    private String colegio;
    
    //Constructor
    public Profesor_abs() {
        super();
        
    }
    
    public double getSueldo() {
        return sueldo;
    }

    //Al heredar de una clase abstracta, nos obliga a sobreescribir
    //los métodos abstractos de la clase abstracta
    public String getColegio() {
        return colegio;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    //@Override
    public void accionPersona() {
        System.out.println("El profesor enseña a los Alumnos.");
    }
    
    
    
    
}

