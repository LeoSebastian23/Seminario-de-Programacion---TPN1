package com.example.demoAPI.Models;
//import javax.persistence.*;

//@Table(name = "Habitacion")
public class HabitacionModel {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    protected Long id;
    protected int numero;
    protected String tipo;
    protected int tarifaPorNoche;

    // Constructor Model
    public HabitacionModel(int numero, String tipo, int tarifaPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.tarifaPorNoche = tarifaPorNoche;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTarifaPorNoche() {
        return tarifaPorNoche;
    }

    public void setTarifaPorNoche(int tarifaPorNoche) {
        this.tarifaPorNoche = tarifaPorNoche;
    }
}