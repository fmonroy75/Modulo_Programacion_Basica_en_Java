
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
public class Clase3_20210525 {

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
        Scanner leer=new Scanner(System.in);
        
        Ccurso=new ClsCurso();
        Calumno=new ClsAlumno();
        Cnotas=new ClsNotas();
        System.out.println("ingrese descripcion del curso: ");
        Ccurso.setDescripcion(leer.nextLine());
        System.out.println("ingrese cantidad de alumnos del curso: ");
        Ccurso.setC_Alumnos(leer.nextInt());
        //for(i=0;i<Ccurso.getC_Alumnos();i++){
            System.out.println("ingrese nombre del alumno: ");
            Calumno.setNombre(leer.next());
            Calumno.setCurso(Ccurso);
        //}
        Cnotas.setAlumno(Calumno);
        System.out.println("ingrese cantidad de notas: ");
        notas=leer.nextInt();
        
        Cnotas.setC_Notas(notas);
        
        for(i=1;i<=notas;i++){
            System.out.println("ingrese nota "+i+": ");
            Cnotas.NuevaNota(leer.nextDouble());
        }
        
        System.out.println("nombre completo: "+Calumno.getNombre()+" curso "+Calumno.getCurso().getDescripcion()  );
        System.out.println("Promedio de notas: "+Cnotas.Promedio());
        System.out.println("Cantidad de Notas: "+Cnotas.getC_Notas());
    
    }
    
}
