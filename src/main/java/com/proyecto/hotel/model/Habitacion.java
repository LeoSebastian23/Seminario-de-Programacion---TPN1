package com.proyecto.hotel.model;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Habitacion")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int numero;
    private String tipo;
    private int tarifaPorNoche;

    // Constructor Model
    public Habitacion(int numero, String tipo, int tarifaPorNoche) {
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
