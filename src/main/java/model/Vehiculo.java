package model;
import lombok.*;

import java.util.ArrayList;

@Getter
public class Vehiculo {

    private String placa;
    private String nombre,marca,modelo;
    private double kilometraje,precioAlquilerpordia;
    private int numeroSillas;
    private boolean esAutomatico;
    private ArrayList<String> rutasImagenes;

    //Constructor


    public Vehiculo() {
    }

    public Vehiculo(String placa, String nombre, String marca, String modelo, double kilometraje, double precioAlquilerpordia, int numeroSillas, boolean esAutomatico, ArrayList<String> rutasImagenes) {
        this.placa = placa;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.precioAlquilerpordia = precioAlquilerpordia;
        this.numeroSillas = numeroSillas;
        this.esAutomatico = esAutomatico;
        this.rutasImagenes = rutasImagenes;
    }

    //Metodos propios

    public void registrarVehiculos() {

    }
}
