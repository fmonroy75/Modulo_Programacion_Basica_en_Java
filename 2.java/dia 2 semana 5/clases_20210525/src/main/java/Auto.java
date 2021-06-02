/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class Auto {
    String Marca;
    String Modelo;
    String Color;
    String Tipo;
    
    
    public Auto(String marca,String modelo, String color, String tipo){
        this.Marca=marca;
        this.Modelo=modelo;
        this.Color=color;
        this.Tipo=tipo;
        
        
    }
        public Auto(){
        
    }
    public void setMarca(String marca)
    {
        this.Marca = marca;
    }
        
    public void setModelo(String modelo)
    {
        this.Modelo = modelo;
    }

    public void setColor(String color)
    {
        this.Color = color;
    }
    
    public void setTipo(String tipo)
    {
        this.Tipo = tipo;
    }

    //getters

    public String getMarca()
    {
        return Marca;
    }

    public String getModelo()
    {
        return Modelo;
    }

    public String getColor()
    {
        return Color;
    }
    public String getTipo()
    {
        return Tipo;
    }
    
}
