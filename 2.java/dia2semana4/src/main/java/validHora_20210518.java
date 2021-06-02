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
public class validHora_20210518 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hora;
        String minuto;
        String segundo;
        boolean c1=true;
        boolean c2=true;
        boolean c3=true;
        boolean c=true;
        char resp;
        Scanner leer=new Scanner(System.in);      
        do{ 
            System.out.println("ingrese una hora (0-23): ");
            hora=leer.next();
            System.out.println("ingrese los minutos (0-59): ");
            minuto=leer.next();        
            System.out.println("ingrese los segundos (0-59): ");
            segundo=leer.next();        

            if (IsNumeric(hora) && IsNumeric(minuto) && IsNumeric(segundo)){
                if (Integer.parseInt(hora)<0 || Integer.parseInt(hora)>23){
                    c=false;
                }else if (Integer.parseInt(minuto)<0 || Integer.parseInt(minuto)>59){
                    c=false;
                }else if (Integer.parseInt(segundo)<0 || Integer.parseInt(segundo)>59){
                    c=false;
                }
            }else{
                c=false;
            }    
            if (!c){
                System.out.println("la hora no es valida");
            }else{
                System.out.println("la hora es valida " + hora + ":"+minuto+":"+segundo);
            }
            System.out.println("desea intentar nuevamente S/N:");
            resp=leer.next().charAt(0);
        }while(resp=='s' || resp=='S');
    }
    
    public static boolean IsNumeric(String strNum){
        if (strNum==null){
            return false;
        }
        try {
            int i=Integer.parseInt(strNum);
            return true;        
        }catch (NumberFormatException e){
            return false;
        }
            
    }
    
}
