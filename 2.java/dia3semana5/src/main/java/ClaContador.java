/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class ClaContador {
    int cont;

    public ClaContador() {
        this.cont = 0;
    }    
    
    public ClaContador(int cont) {
        if (cont<0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }

    public void incrementar(){
        this.cont++;
    }
    public void decrementar(){
        if(this.cont>0){
            this.cont--;
        }else{
            this.cont=0;
        }
    }

    public void incrementar(int lim){
        int i;
        for(i=this.cont;i<=lim;i++){
            System.out.println(i);
        }

    }
    public void decrementar(int lim){
        int i;
        for(i=this.cont;i>=lim;i--){
            System.out.println(i);
        }
        
    }
    public void setCont(int cont) {
        if(cont>=0){
            this.cont = cont;
        }else{
            this.cont = 0;
        }
    }

    public int getCont() {
        return cont;
    }
    
}
