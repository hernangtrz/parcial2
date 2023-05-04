/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public abstract class Producto {
    private double valorProducto;
    private float tarifaIva;
    
    public abstract double calcularRecaudoIva();

    public Producto() {
    }

    public double getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(double valorProducto) {
        this.valorProducto = valorProducto;
    }

    public float getTarifaIva() {
        return tarifaIva;
    }

    public void setTarifaIva(float tarifaIva) {
        this.tarifaIva = tarifaIva;
    }
    
    
}
