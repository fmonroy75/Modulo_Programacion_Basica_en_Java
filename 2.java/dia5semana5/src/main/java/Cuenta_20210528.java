
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class Cuenta_20210528 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ArrayList<ClaCuenta> cuentas=new ArrayList();
        int Saldo=0;
        int Monto;
        int opc;
        char opc2='S';
        char res='S';
        int destino=0;
        ClaCuenta cuenta1;
        ClaCuenta cuenta2;
        cuenta1=new ClaCuenta("Destino",1234,0);
        Scanner leer=new Scanner(System.in);
        
        
        cuenta2=new ClaCuenta();
        System.out.println("Ingrese Nombre: ");
        cuenta2.setNombre(leer.nextLine());
        System.out.println("Ingrese Número de cuenta: ");
        cuenta2.setNumero(leer.nextInt());
        System.out.println("Ingrese Saldo Inicial: ");
        cuenta2.setSaldo(leer.nextInt());
        do{
            //System.out.println("1.- Ingresar Cuenta");
            System.out.println("1.- Consulte Saldo");
            System.out.println("2.- Realizar Depósito");
            System.out.println("3.- Realizar Giro");
            System.out.println("4.- Realizar Transferencia");
            System.out.println("5.- Salir");
            System.out.println("Selecciones una opción");
            opc=leer.nextInt();
            switch (opc){
                case 1:
                    
                    System.out.println("Su saldo es: "+cuenta2.getSaldo());
                    
                    break;
                case 2:
                    System.out.println("Realizar un Abono o Depósito");
                    System.out.println("____________________________");
                    System.out.println("ingrese el monto del depósito: ");
                    Monto=leer.nextInt();
                    if (Monto>0){
                        cuenta2.Deposito(Monto);
                    }else{
                        System.out.println("Monto inválido");
                    }
                    System.out.println("Su saldo es de: "+cuenta2.getSaldo());
                    break;
                case 3:
                    System.out.println("Realizar un Giro");
                    System.out.println("____________________________");
                    System.out.println("ingrese el monto del Giro: ");
                    Monto=leer.nextInt();
                    if (Monto>cuenta2.getSaldo()){
                        System.out.println("No tiene saldo suficiente, Desea realizar el Giro S/N");
                        System.out.println("Si realiza un giro se le aplicará un interes");
                        opc2=leer.next().charAt(0);
                        if (opc2=='s' || opc2=='S'){
                            cuenta2.Giro(Monto);
                        }
                    }else{
                            cuenta2.Giro(Monto);
                    }
                    System.out.println("Su saldo es de: "+cuenta2.getSaldo());
                    break;
                case 4:
                    System.out.println("Realizar un Abono o Depósito");
                    System.out.println("____________________________");
                    System.out.println("ingrese el Cuenta destino de transferencia: ");
                    destino=leer.nextInt();
                    System.out.println("ingrese el monto de transferencia: ");
                    Monto=leer.nextInt();
                    if(cuenta2.TieneMonto(Monto)){
                        cuenta2.Transferencia(cuenta1, Monto, destino);
                        System.out.println("Su saldo es de: "+cuenta2.getSaldo());
                        System.out.println("Saldo Cuenta Destino es de: "+cuenta1.getSaldo());
                    }else{
                        System.out.println("No tiene saldo suficiente para la transaccion");
                        System.out.println("Su saldo es de: "+cuenta2.getSaldo());
                    }    
                    
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
            System.out.println("desea continuar S/N:");
            res=leer.next().charAt(0);
        }while(res=='S' || res=='s');
        
    }
    
}
