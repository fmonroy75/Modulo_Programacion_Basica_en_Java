/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Electrodomestico {
   
    protected final static String COLOR_DEF="blanco";
    protected final static char CONSUMO_ENERGETICO_DEF='F';
    protected final static double PRECIO_BASE_DEF=100;
    protected final static double PESO_DEF=5;
   
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
   
   
    private void comprobarColor(String color){
   
        //Colores disponibles
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }
          
          
    }
      
    /**
     * Comprueba el consumo energetico
     * Solo mayusculas, si es una 'a' no lo detecta como una 'A'
     * @param consumoEnergetico
     */
    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        }
          
    }
   
    public double getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }
    public double precioFinal(){
        double aux=0;
        switch(consumoEnergetico){
            case 'A':
                aux+=100;
                break;
            case 'B':
                aux+=80;
                break;
            case 'C':
                aux+=60;
                break;
            case 'D':
                aux+=50;
                break;
            case 'E':
                aux+=30;
                break;
            case 'F':
                aux+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            aux+=10;
        }else if(peso>=20 && peso<49){
            aux+=50;
        }else if(peso>=50 && peso<=79){
            aux+=80;
        }else if(peso>=80){
            aux+=100;
        }
   
        return precioBase+aux;
    }
   
    public Electrodomestico(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
   
    
}