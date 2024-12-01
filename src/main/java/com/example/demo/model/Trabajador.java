package com.example.demo.model;

import lombok.Data;

@Data
public class Trabajador {

    private String nombre;
    private double sueldoBase;
    private int horasExtra;
    private double totalPagar;
    private double tarifaHora;

    public void CalcularSueldo() {
        tarifaHora = (sueldoBase / 160);
        totalPagar = sueldoBase + (horasExtra * 8);
    }
}
