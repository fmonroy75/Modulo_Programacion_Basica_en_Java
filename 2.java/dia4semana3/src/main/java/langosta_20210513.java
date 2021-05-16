import java.util.Scanner;
public class langosta_20210513 {
    public static void main(String[]args){
        int cant;
        int costo=0;
        int presup=0;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de personas : ");
        cant=leer.nextInt();
        if (cant > 200 && cant<=300){
            costo=8500;
        }else if (cant>300){
            costo=7500;
        }else{
            costo=9500;
        }
        presup=costo*cant;
        System.out.println("el presupuesto es: " + presup);
        System.out.println("el valor por persona es: " + costo);
    }
}


    

