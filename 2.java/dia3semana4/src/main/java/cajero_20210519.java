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
public class cajero_20210519 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Saldo=0;
        int Monto;
        int opc;
        char opc2='S';
        char res='S';
        do{
            System.out.println("1.- Consulte Saldo");
            System.out.println("2.- Realizar Depósito");
            System.out.println("3.- Realizar Giro");
            System.out.println("4.- Salir");
            System.out.println("Selecciones una opción");
            Scanner leer=new Scanner(System.in);
            opc=leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Su saldo es de: "+Saldo);
                    break;
                case 2:
                    System.out.println("Realizar un Abono o Depósito");
                    System.out.println("____________________________");
                    System.out.println("ingrese el monto del depósito: ");
                    Monto=leer.nextInt();
                    if (Monto>0){
                        Saldo=Saldo+Monto;
                    }else{
                        System.out.println("Monto invalido");
                    }
                    System.out.println("Su saldo es de: "+Saldo);
                    break;
                case 3:
                    System.out.println("Realizar un Giro");
                    System.out.println("____________________________");
                    System.out.println("ingrese el monto del Giro: ");
                    Monto=leer.nextInt();
                    if (Monto>Saldo){
                        System.out.println("No tiene saldo suficiente, Desea realizar el Giro S/N");
                        opc2=leer.next().charAt(0);
                        if (opc2=='s' || opc2=='S'){
                            Saldo=Saldo-Monto;
                        }
                    }else{
                            Saldo=Saldo-Monto;
                    }
                    System.out.println("Su saldo es de: "+Saldo);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            System.out.println("desea continuar S/N:");
            res=leer.next().charAt(0);
        }while(res=='S' || res=='s');
        
    }
    
}
