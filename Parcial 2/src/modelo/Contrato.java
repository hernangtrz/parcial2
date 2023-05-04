/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Contrato extends Producto{
    private double monto;
    private double deducciones;

    public Contrato(double monto, double deducciones) {
        this.monto = monto;
        this.deducciones = deducciones;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    @Override
    public double calcularRecaudoIva() {
         return (monto - deducciones) * 0.19;
    } 

    @Override
    public String toString() {
        return "Contrato{" + "monto=" + monto + ", deducciones=" + deducciones + " Recaudo iva: " + calcularRecaudoIva() + '}';
    }
    
    
}
