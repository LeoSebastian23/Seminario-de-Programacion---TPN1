package com.proyecto.hotel.model;
import java.util.Scanner;

public class Huesped {

    private String nombre;
    private long dni;
    private long telefono;
    private String email;
    private String direccion;

    public huesped (String nombre, long dni, long telefono, String email, String direccion){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void ingresoDatos(){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Por favor ingrese el nombre del huesped");
        this.nombre = scanner.nextLine();
        System.out.println("Ingrese el DNI:");
        this.dni = scanner.nextLong();
        scanner.nextLine();
        System.out.println("ingrese e-mail:");
        this.nombre = scanner.nextLine();
        System.out.println("Ingrese la direccion:");
        this.nombre = scanner.nextLine();

        scanner.close();
    }

    //imprimir

    @Override
    public String toString(){
        return "Huesped{" +
                "nombre=" + nombre + '\'' + "Dni=" + dni +
                "telefono=" + email + '\'' + "Direccion=" + direccion + '\'' + '}';
    }
}

