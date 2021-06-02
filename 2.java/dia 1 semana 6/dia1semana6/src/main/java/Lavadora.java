/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Lavadora extends Electrodomestico{
    private final static int CARGA_DEF=5;
    private int carga;


    public int getCarga() {
        return carga;
    }
    public double precioFinal(){
        double aux=super.precioFinal();
        if (carga>30){
            aux+=50;
        }
        return aux;
    }
  
    public Lavadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}