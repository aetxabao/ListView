package com.pmdm.listview;

public class Merindad {
    private String numero;
    private String nombre;
    private String izena;

    public Merindad(String numero, String nombre, String izena){
        this.numero = numero;
        this.nombre = nombre;
        this.izena = izena;
    }

    public String getIzena() {
        return izena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

}
