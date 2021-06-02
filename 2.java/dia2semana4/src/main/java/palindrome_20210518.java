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
public class palindrome_20210518 {
    public static void main(String[] args) {
        //int i=0;
        int des;
        String cadena;
        String cadena2="";
        //boolean err;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese palabra a determinar: ");
        cadena=leer.nextLine();
        cadena=cadena.toLowerCase();
        des=cadena.length()-1;
        System.out.println(cadena.length());
        while(des>=0){
            cadena2=cadena2.concat(cadena.substring(des,des+1));
            //System.out.println(cadena.substring(3,1));
            des=des-1;
        }
        System.out.println("cadena original: " +cadena);
        System.out.println("nueva cadena : " +cadena2);
        if (cadena.equals(cadena2)){
            System.out.println("Son Palindromes ");
        }else{
            System.out.println("NO Son Palindromes ");
        }
    }    
}
