/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
import java.util.Scanner;
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite;
        int inicio;
        int i;
        ClaContador contador;
        contador=new ClaContador();
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese valor inicio : ");
        inicio=leer.nextInt();
        contador.setCont(inicio);
        //System.out.println("ingrese limite : ");
        //limite=leer.nextInt();
        //for(i=contador.getCont();i<=limite;i++){
            contador.incrementar();
            contador.incrementar();
            contador.incrementar();
            contador.incrementar();
            System.out.println("se incrementa en 4:"+contador.getCont());
        //}    
        //for(i=contador.getCont();i>=limite;i--){
            contador.decrementar();
            System.out.println("se decrementa en 1:"+contador.getCont());
        //}
        
    }
    
}
