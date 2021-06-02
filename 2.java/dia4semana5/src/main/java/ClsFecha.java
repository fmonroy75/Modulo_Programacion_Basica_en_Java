/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class ClsFecha {
    int Dia;
    int Mes;
    int Año;

    
    public ClsFecha(){
        
    }
    public ClsFecha(int Dia, int Mes, int Año) {
        this.Dia = Dia;
        this.Mes = Mes;
        this.Año = Año;
    }

    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }

    public int getAño() {
        return Año;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }
    
    public boolean FechaCorrecta(){
        boolean aux=true;
        if(Año<0 || Año>9999){
            aux=false;
        }else if(Mes<0 || Mes>12){
            aux=false;
        }else{
            if(Mes==1 || Mes==3 || Mes==5 || Mes==7 || Mes==8 || Mes==10 || Mes==12){
                if(Dia<0 || Dia>31){
                    aux=false;
                }
            }else if(Mes==4 || Mes==6 || Mes==9 || Mes==11){
                if(Dia<0 || Dia>30){
                    aux=false;
                }
            }else if(Mes==2){
                //System.out.println(EsBisiesto());
                if (EsBisiesto()){
                    if(Dia<0 || Dia>29){
                        aux=false;
                    }
                }else{
                    if(Dia<0 || Dia>28){
                    aux=false;
                    }

                }
            }
        }
        return aux;
    }
           
    public String DiaSiguiente(){
        this.Dia++;
        if(!this.FechaCorrecta()){
            this.Dia=1;
            this.Mes++;
            if(!this.FechaCorrecta()){
                Mes=1;
                Año++;
            }
        }
        return (Dia+"-"+Mes+"-"+Año);
    }
    
    
    public boolean EsBisiesto(){
        boolean aux;
        if (Año%4==0 && Año%100!=0 || Año%400==0){
            aux=true;
        }else{
            aux=false;
        }
        return aux;
    }
            
}
