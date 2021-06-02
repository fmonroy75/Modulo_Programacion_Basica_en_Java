
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
public class biblioteca_20210528 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ArrayList<ClaCuenta> cuentas=new ArrayList();
        int Saldo=0;
        int isbn;
        int Monto;
        int opc;
        char opc2='S';
        char res='S';
        int destino=0;
        Libro libros;
        
        Scanner leer=new Scanner(System.in);
        
        
        libros=new Libro();
        do{
            //System.out.println("1.- Ingresar Cuenta");
            System.out.println("1.- Ingreso Nuevo Libro");
            System.out.println("2.- Ingresar Ejemplar");
            System.out.println("3.- Realizar Devolución");
            System.out.println("4.- Realizar Prestamo");
            System.out.println("5.- Mostrar Stock");
            System.out.println("6.- Salir");
            System.out.println("Selecciones una opción");
            opc=leer.nextInt();
            switch (opc){
                case 1:
                    
                    System.out.println("Realizar Ingreso de un Libro");
                    System.out.println("____________________________");
                    
                    System.out.println("Ingrese ISBN: ");
                    libros.setIdtitulo(leer.nextInt());
                    System.out.println("Ingrese Titulo: ");
                    libros.setTitulo(leer.nextLine());
                    System.out.println("Ingrese Autor: ");
                    libros.setAutor(leer.nextLine());
                    System.out.println("Ingrese Cantidad de ejemplares: ");
                    libros.setEjemplares(leer.nextInt());
                    libros.setPrestados(0);
                    
                    break;
                case 2:
                    System.out.println("Realizar un Nuevo Ejemplar");
                    System.out.println("____________________________");
                    System.out.println("ingrese cantidad de nuevos ejemplares: ");
                    Monto=leer.nextInt();
                    if (Monto>0){
                        libros.setEjemplares(libros.getEjemplares()+Monto);
                    }else{
                        System.out.println("Cantidad inválida");
                    }
                    System.out.println("ejemplares de "+ libros.getIdtitulo() +": "+libros.getEjemplares());
                    break;
                case 3:
                    System.out.println("Realizar un Devolucion");
                    System.out.println("____________________________");
                    System.out.println("ingrese ISBN a devolver: ");
                    isbn=leer.nextInt();
                    if (isbn>0){
                        libros.Devolver(isbn);
                    }else{
                        System.out.println("isbn inválida");
                    }
                    System.out.println("ejemplares de "+ libros.getIdtitulo() +" disponibles: "+(libros.getEjemplares()-libros.getPrestados()));
                    
                    break;
                case 4:
                    System.out.println("Realizar un Prestamo");
                    System.out.println("____________________________");
                    System.out.println("ingrese isbn a prestar: ");
                    isbn=leer.nextInt();
                    if(libros.Existe(isbn)){
                        libros.Prestar(isbn);
                        System.out.println("Libro Prestado");
                    }
                        
                    
                    break;
                case 5:
                    System.out.println("Stock");
                    System.out.println("____________________________");
                    System.out.println("isbn: "+libros.getIdtitulo());
                    System.out.println("Titulo: "+libros.getTitulo());
                    System.out.println("Autor: "+libros.getAutor());
                    System.out.println("Ejemplares: "+libros.getEjemplares());
                    System.out.println("Disponibles: "+(libros.getEjemplares()-libros.getPrestados()));
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
            System.out.println("desea continuar S/N:");
            res=leer.next().charAt(0);
        }while(res=='S' || res=='s');
        
    }
    
}
