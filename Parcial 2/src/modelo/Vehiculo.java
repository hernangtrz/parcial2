/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Vehiculo extends Producto{
    private String marca;
    private String modelo;
    private String linea;
    private double valor;

    public Vehiculo(String marca, String modelo, String linea, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularRecaudoIva() {
        if(valor <= 49470000){
            setTarifaIva((float) 0.015);
            return valor * getTarifaIva();
        } else if((valor > 49470000) && (valor <= 111305000)){
            setTarifaIva((float) 0.025);
            return valor * getTarifaIva();
        }
        setTarifaIva((float) 0.035);
        return valor * getTarifaIva();
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", linea=" + linea + ", valor=" + valor + " Recaudo iva: " + calcularRecaudoIva() + "}";
    }
    
    

}
