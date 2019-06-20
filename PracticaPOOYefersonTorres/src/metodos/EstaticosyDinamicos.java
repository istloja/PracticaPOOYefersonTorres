/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author yefersontorresberru
 */
public class EstaticosyDinamicos {
    public static void main(String[] args) {
        saludar();// para llamar un metodo estatico
        //Si quiero llamar a despedir debo crear un objeto
        EstaticosyDinamicos objeto=new EstaticosyDinamicos();// creo un objeto
        objeto.despedir();// asi se llama a un metodo no estatico
    }
    
    public static void saludar(){ //Este es un metodo estatico
        System.out.println("Hola");
    }
    public void despedir(){//Este es un metodo NO estatico
        System.out.println("CHao");
    }
}
