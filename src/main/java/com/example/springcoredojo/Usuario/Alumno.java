package com.example.springcoredojo.Usuario;

public class Alumno {
    private String nombre;
    private String apeliido;
    private int edad;

    public Alumno(String nombre, String apeliido, int edad) {
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.edad = edad;
    }

    public Alumno() {
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apeliido='" + apeliido + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
