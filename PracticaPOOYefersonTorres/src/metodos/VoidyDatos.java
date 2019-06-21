/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author yefersontorresberru Mostrar las diferencias entre los metodos void y
 * los que devuelven datos de tipo Objeto o tipos primitivos
 */
public class VoidyDatos {

    // Es un metodo de tipo void que suma dos numeros y presenta el resultado en pantalla
    public void sumar(int numero1, int numero2) {// recibe 2 numeros de tipo entero
        System.out.println("La suma es" + (numero1 + numero2));// presetna el resultado en pantallas
    }
    // los metodos que devuelven datos pueden ser de diferentes tipos como
    // int, double, String, char, booleno y tambien pueden ser Objetos

    public int sumar1(int numero1, int numero2) {
        return numero1 + numero2; // devolvemos el valor
    }

    public String unirCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }

    public boolean iniciaSesion(String usuario, String password) {
        boolean valor = false;
        if (usuario.equals("admin") && password.equals("1234")) {
            valor = true;
        }
        return valor;
    }

    public static void main(String[] args) {
        VoidyDatos objeto = new VoidyDatos();// creamos un objeto
        objeto.sumar(10, 8);// llamamos al metodo sumar y enviamos 2 numeros
        int resultado = objeto.sumar1(40, 10);//guardo lo que devuelve el metodo sumar1
        System.out.printf("la suma es" + resultado);
        int resultado1 = objeto.sumar1(50, 20);
        System.out.println(resultado1 + resultado);
        String cadena = objeto.unirCadenas("Hola ", "Mundo");
        System.out.println("La cadena unida es: " + cadena);
        boolean variableinicio=objeto.iniciaSesion("admin", "1234");
        System.out.println(variableinicio);
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el usuario");
        String usuario=entrada.next();
        System.out.println("Ingrese la contrasena");
        String password=entrada.next();
        boolean iniciosesion=objeto.iniciaSesion(usuario, password);
        if(iniciosesion){
            System.out.println("Bienvenido al sistema");
        }else{
            System.out.println("Credenciales incorrectas");
        }
    }
}
