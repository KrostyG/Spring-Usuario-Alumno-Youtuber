package com.example.springcoredojo.Usuario;

import org.springframework.stereotype.Component;

@Component
public class Youtuber {
    private String nombre;

    public Youtuber(String nombre) {
        this.nombre = nombre;
    }

    public Youtuber() {
    }

    @Override
    public String toString() {
        return "Youtuber{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
