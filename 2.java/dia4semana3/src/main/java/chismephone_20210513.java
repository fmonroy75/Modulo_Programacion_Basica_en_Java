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
public class chismephone_20210513 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant_minutos ;
	char turno ;
	int dia_llamada;
	double costo_llamada ;
	int  paso;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese cantidad de minutos de la llamada");
        cant_minutos=leer.nextInt();
        System.out.println("ingrese turno M/V");
        turno=leer.next().charAt(0);
	System.out.println("ingrese dia de la llamada (1-7)");
	dia_llamada=leer.nextInt();
	costo_llamada=0;
	if (cant_minutos<=5){
            costo_llamada=cant_minutos*100;
        }else if (cant_minutos>5 && cant_minutos<=8){
            paso=cant_minutos-5;
            costo_llamada=500+(paso*80);
        }else if (cant_minutos>8 && cant_minutos<=10){
            paso=cant_minutos-8;
            costo_llamada=660+(paso*70);
        }else if (cant_minutos>10){
            paso=cant_minutos-10;
            costo_llamada=660+(2*70)+(paso*50);
        }
	switch(dia_llamada){
            case 7:
                costo_llamada=costo_llamada*1.03;
                System.out.println("costo de la llamada es para día Domingo es: "+ costo_llamada);
                break;
            case 1:
		if (turno=='M' || turno=='m'){
                    costo_llamada=costo_llamada*1.15;
                }else{
                    costo_llamada=costo_llamada*1.1;
                }
                System.out.println("costo de la llamada es para día Lunes es: "+ costo_llamada);
                break;
            case 2:
		if (turno=='M' || turno=='m'){
                    costo_llamada=costo_llamada*1.15;
                }else{
                    costo_llamada=costo_llamada*1.1;
                }
                System.out.println("costo de la llamada es para día Martes es: "+ costo_llamada);
                break;
            case 3:
		if (turno=='M' || turno=='m'){
                    costo_llamada=costo_llamada*1.15;
                }else{
                    costo_llamada=costo_llamada*1.1;
                }     
                System.out.println("costo de la llamada es para día Miercoles es: "+ costo_llamada);
                break;
            case 4:
		if (turno=='M' || turno=='m'){
                    costo_llamada=costo_llamada*1.15;
                }else{
                    costo_llamada=costo_llamada*1.1;
                }                
                System.out.println("costo de la llamada es para día Jueves es: "+ costo_llamada);
                break;
            case 5:
		if (turno=='M' || turno=='m'){
                    costo_llamada=costo_llamada*1.15;
                }else{
                    costo_llamada=costo_llamada*1.1;
                }             
                System.out.println("costo de la llamada es para día Viernes es: "+ costo_llamada);
                break;
            case 6:
		if (turno=='M' || turno=='m'){
                    costo_llamada=costo_llamada*1.15;
                }else{
                    costo_llamada=costo_llamada*1.1;
                }                
                System.out.println("costo de la llamada es para día Sabado es: "+ costo_llamada);
                break;
            default:
        	System.out.println("dia de la semana no valido");

        }
	
	
    }
    
}
	
	
	
