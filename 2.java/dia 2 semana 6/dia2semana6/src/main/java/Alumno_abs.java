/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class Alumno_abs extends Personas_abs {
    
    //Atributos del alumno
    private int curso;
    private String colegio;
    
    //Constructor
    public Alumno_abs() {
        super();
    }
    
    //Sobreescribimos el método abstracto de la clase abstracta Persona

    //@Override
    public void accionPersona() {
        System.out.println("El alumno aprende del profesor");
    }

    public int getCurso() {
        return curso;
    }

    public String getColegio() {
        return colegio;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
    

    
}
