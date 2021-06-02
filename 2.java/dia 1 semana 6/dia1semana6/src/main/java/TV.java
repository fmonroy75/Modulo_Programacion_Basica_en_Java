/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class TV extends Electrodomestico{
    private final static int RESOLUCION_DEF=20;
    private int resolucion;
    
    public double precioFinal(){
        double plus=super.precioFinal();
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        return plus;
    }
    public TV(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF);
    }
  
    public TV(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF);
    }
  
    public TV(double precioBase, double peso, char consumoEnergetico, String color, int resolucion){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public int getResolucion() {
        return resolucion;
    }
    
}
