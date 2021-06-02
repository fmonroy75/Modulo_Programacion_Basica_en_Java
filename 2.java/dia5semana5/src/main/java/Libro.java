/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class Libro {
    private int idtitulo;
    private String Titulo;
    private String Autor;
    private int ejemplares;
    private int prestados;
    public Libro(){
        
    }
    public Libro(int idtitulo, String Titulo, String Autor, int ejemplares, int prestados) {
        this.idtitulo = idtitulo;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public int getIdtitulo() {
        return idtitulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setIdtitulo(int idtitulo) {
        this.idtitulo = idtitulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public boolean Disponible(int idlibro){
        //if(this.idtitulo==idlibro){
            if(this.prestados==this.ejemplares){
                return false;
            }else{
                return true;
            }
       // }else{
       //     System.out.println("No existe libro");
       //     return false;
       // }
    }
    
    public boolean Existe(int idlibro){
        if(this.idtitulo!=idlibro){
            System.out.println("No existe libro");
            return false;    
        }
    }
            
    
    public void Prestar(int idlibro){
        if (Disponible(idlibro)){
            this.prestados=this.prestados+1;
        }else{
            System.out.println("No hay ejemplares para prestar");
        }
    }
    
    public void Devolver(int idlibro){
        if (this.prestados>0){
            this.prestados=this.prestados-1;
        }else{
            System.out.println("No hay ejemplares prestados");
        }
    }
}
