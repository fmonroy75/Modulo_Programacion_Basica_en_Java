
import java.util.ArrayList;
import java.util.Scanner;

/*
 Crrear 3 clases con sus respectivos atributos, metodos y constructores, 
con atributos y metodos accesores
 */

/**
 *
 * @author 56982
 */
public class Clase3_20210526 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClsCurso Ccurso;
        ClsAlumno Calumno;
        //ArrayList<ClsAlumno> Calumno=new ArrayList<ClsAlumno>();
        ClsNotas Cnotas;
        char cond;
        int i;
        int notas;
        int Cant;
        int x;
        Scanner leer=new Scanner(System.in);
        
        Ccurso=new ClsCurso();
        
        Cnotas=new ClsNotas();
        System.out.println("ingrese descripcion del curso: ");
        Ccurso.setDescripcion(leer.nextLine());
        System.out.println("ingrese cantidad de alumnos del curso: ");
        Cant=leer.nextInt();
        for(i=0;i<Cant;i++){
            Calumno=new ClsAlumno();
            System.out.println("ingrese nombre del alumno: ");
            Calumno.setNombre(leer.next());
            System.out.println("ingrese edad del alumno: ");
            Calumno.setEdad(leer.nextInt());
            
            Ccurso.AgregarAlumnos(Calumno);
            //System.out.println(Calumno.getNombre());
            //Ccurso.MostrarAlumno(0);
            //if(Ccurso.Cantidadalumnos()>1){Ccurso.MostrarAlumno(1);}
            //System.out.println(Ccurso.getA(Ccurso.Cantidadalumnos()-1).getNombre());
            //System.out.println(Ccurso.Cantidadalumnos());
            //System.out.println(Ccurso.Cantidadalumnos());
            //Cnotas.setAlumno(Calumno);
            System.out.println("ingrese cantidad de notas: ");
            notas=leer.nextInt();
        //Cnotas=new ClsNotas();
            //Cnotas.setC_Notas(notas);
            //Cnotas.setIndexAlumno(i);
            
            for(x=1;x<=notas;x++){
                System.out.println("ingrese nota "+x+": ");
                Cnotas.NuevaNota(leer.nextDouble());
                //Ccurso.getA(i).AgregarNotas(Cnotas);
            }            
        }

        
        System.out.println("Curso: "+ Ccurso.getDescripcion());
        Cant=Ccurso.Cantidadalumnos();
        for(i=0;i<Cant;i++){
            //System.out.println("-->nombre completo: "+this.C_alumnos.get(i).getNombre()+" edad "+this.C_alumnos.get(i).getEdad() );
            System.out.println("nombre completo: "+Ccurso.getA(i).getNombre()+" edad "+Ccurso.getA(i).getEdad() );
            //Ccurso.MostrarAlumno(0);
            //Ccurso.MostrarAlumno(1);
            
            //for(x=0;x<2;x++){
            //    System.out.println(Ccurso.getA(i).getN(x));
            //}
            //System.out.println("Cantidad de Notas curso: "+Cnotas.getC_Notas());
        }
        System.out.println("Promedio de notas curso: "+Cnotas.Promedio());
    }
    
}
