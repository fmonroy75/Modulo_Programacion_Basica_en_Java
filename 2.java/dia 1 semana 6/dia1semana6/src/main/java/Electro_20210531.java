/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class Electro_20210531 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        TV electro1=new TV(100, 60, 'A', "negro", 30); 
        TV electro2=new TV(100, 60, 'C', "gris", 30);
        Lavadora electro3=new Lavadora(300, 40, 'Z', "blanco", 70);
        Lavadora electro4=new Lavadora(300, 40, 'A', "blanco", 40);
        
        
       System.out.println("Color TV 1: "+electro1.getColor());
       System.out.println("Peso TV 1: "+electro1.getPeso());
       System.out.println("Ef.Energetica TV 1: "+electro1.getConsumoEnergetico());
       System.out.println("Ef.Energetica TV 1: "+electro1.getResolucion());
       System.out.println("Valor calculado TV 1: "+electro1.precioFinal());
       
       
       System.out.println("Color Lavadora 1: "+electro3.getColor());
       System.out.println("Peso Lavadora 1: "+electro3.getPeso());
       System.out.println("Ef.Energetica Lavadora 1: "+electro3.getConsumoEnergetico());
       System.out.println("Ef.Energetica Lavadora 1: "+electro3.getCarga());
       System.out.println("Valor calculado Lavadora 1: "+electro3.precioFinal());  
       

       System.out.println("Color Lavadora 2: "+electro4.getColor());
       System.out.println("Peso Lavadora 2: "+electro4.getPeso());
       System.out.println("Ef.Energetica Lavadora 2: "+electro4.getConsumoEnergetico());
       System.out.println("Ef.Energetica Lavadora 2: "+electro4.getCarga());
       System.out.println("Valor calculado Lavadora 2: "+electro4.precioFinal());  
              
    }
    
}

