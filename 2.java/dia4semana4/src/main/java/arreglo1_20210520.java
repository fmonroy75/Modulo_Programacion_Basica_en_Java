/*
 Crear Arreglos, ingresar valores al arreglo y mostrarlos por pantalla.
 */

/**
 *
 * @author 56982
 */
import java.util.Scanner;
public class arreglo1_20210520 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num1=new int[10];
        int i;
        double suma=0;
        Scanner leer=new Scanner(System.in);
        for(i=0;i<10;i++){
            System.out.println("ingrese primer numero: ");
            num1[i]=leer.nextInt();
        }
        for(i=0;i<10;i++){
            System.out.println("pos "+(i+1)+": "+num1[i]);
        }
    
        // TODO code application logic here
    }
    
}
