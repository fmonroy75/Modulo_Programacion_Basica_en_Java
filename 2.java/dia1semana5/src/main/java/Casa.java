/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class Casa {
    String Construccion;
    String Urbana;
    int C_Piso;
    String Color;
    
    
    public Casa(){
        Construccion="";
        Urbana="";
        Color="";
        C_Piso=1;
        
        
    }
    public void setConstruccion(String construccion)
    {
        this.Construccion = construccion;
    }
        
    public void setUrbana(String urbana)
    {
        this.Urbana = urbana;
    }

    public void setColor(String color)
    {
        this.Color = color;
    }
    
    public void setC_Piso(int cpiso)
    {
        this.C_Piso = cpiso;
    }

    //getters

    public String getConstruccion()
    {
        return Construccion;
    }

    public String getUrbana()
    {
        return Urbana;
    }

    public String getColor()
    {
        return Color;
    }
    public int getC_Piso()
    {
        return C_Piso;
    }
    
}
