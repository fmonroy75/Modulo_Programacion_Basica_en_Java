/*
Un número es perfecto si es igual a la suma de todos sus divisores positivos
sin incluir el propio número.
por ejemplo, el número 6 es perfecto. El tiene como divisores: 1, 2, 3 y 6
pero el 6 no se cuenta como divisor para comprobar si es perfefecto.
Si sumamos 1 + 2 + 3 = 6
Los siguientes números perfectos después del 6 son 28, 496, 8128, 33550336,
8589869056.
Realizar programa que pida por teclado un número y muestra si es perfecto o no. 
*/

/**
 *
 * @author 56982
 */
import java.util.Scanner;
public class numperfecto_20210520 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1;
        int i;
        double suma=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese primer numero: ");
        num1=leer.nextDouble();
        
        for (i=1;i<num1;i++){
            if (num1%i==0){
                suma=suma+i;
            }
        }
        if (num1==suma){
            System.out.println("el número " + num1+" es perfecto ");
        }else{
            System.out.println("el número " + num1+" NO es perfecto ");
        }
    }
    
}
