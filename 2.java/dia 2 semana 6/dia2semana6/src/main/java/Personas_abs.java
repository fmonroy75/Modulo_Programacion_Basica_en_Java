/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public abstract class Personas_abs {

    
    //Podemos crear atributos igualmente que con las clases no abstractas
    private String nombre;
    private int edad;

    public Personas_abs() {
    }
    
    //Creamos el constructor
    public Personas_abs(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }
    
    //método abstracto
    public abstract void accionPersona();
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }
    
    
}    

