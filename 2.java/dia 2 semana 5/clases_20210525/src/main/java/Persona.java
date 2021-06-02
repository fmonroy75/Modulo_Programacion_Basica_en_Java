/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class Persona {
    String Nombre;
    String Apellido;
    String Id;
    int Edad;
    Auto TieneAuto;
    Casa TieneCasa;
    public Persona(){
        Nombre="";
        Apellido="";
        Id="";
        Edad=0;
        //EstCivil='';
        
    }
    public void setNombre(String nombre)
    {
        this.Nombre = nombre;
    }
        
    public void setApellido(String apellido)
    {
        this.Apellido = apellido;
    }

    public void setId(String id)
    {
        this.Id = id;
    }
    
    public void setEdad(int edad)
    {
        this.Edad = edad;
    }
    
    public void setTieneAuto(Auto tieneauto)
    {
        this.TieneAuto = tieneauto;
    }    
    public void setTieneCasa(Casa tienecasa)
    {
        this.TieneCasa = tienecasa;
    }    

    /*public void setEstCivil(int estado)
    {
        this.EstCivil = estado;
    } */   
    //getters

    public String getNombre()
    {
        return Nombre;
    }

    public int getEdad()
    {
        return Edad;
    }

    public String getApellido()
    {
        return Apellido;
    }
    public String getId()
    {
        return Id;
    }
    
    public Auto getTieneAuto(){
        return TieneAuto;
    }

    public Casa getTieneCasa(){
        return TieneCasa;
    }    
            
}
