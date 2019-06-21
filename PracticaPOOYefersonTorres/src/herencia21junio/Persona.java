/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia21junio;

import static metodos.EstaticosyDinamicos.saludar;

/**
 *
 * @author yefersontorresberru
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private int cedula;
    private String sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void saludar() {
        System.out.println("Hola");
    }

    public void despedir() {
        System.out.println("Chao");
    }

    public static void main(String[] args) {
        Persona objeto = new Persona();
        objeto.setNombre("Manuel");
        System.out.println(objeto.getNombre());
    }

}
