/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Alimento extends Producto implements tipoTarifa {

    private String codigo;
    private String descripcion;
    private double precioVenta;
    private int cantidadesVendidas;
    private String tipoTarifa;

    public Alimento() {
    }

    public Alimento(String codigo, String descripcion, double precioVenta, int cantidadesVendidas, String tipoTarifa) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.cantidadesVendidas = cantidadesVendidas;
        this.tipoTarifa = tipoTarifa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadesVendidas() {
        return cantidadesVendidas;
    }

    public void setCantidadesVendidas(int cantidadesVendidas) {
        this.cantidadesVendidas = cantidadesVendidas;
    }

    public String getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(String tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    @Override
    public void tarifa() {
        if ("EXCENTO IVA".equalsIgnoreCase(tipoTarifa)) {
            setTarifaIva(exentosIva);
        } else if ("CON DESCUENTO".equalsIgnoreCase(tipoTarifa)) {
            setTarifaIva(conDescuento);
        } else if ("SIN DESCUENTO".equalsIgnoreCase(tipoTarifa)) {
            setTarifaIva(sinDescuebto);
        } else {
            System.out.println("Numero digitado incorrecto");
        }
    }

    @Override
    public double calcularRecaudoIva() {
        return (cantidadesVendidas * precioVenta) * getTarifaIva();
    }

    @Override
    public String toString() {
        return "Alimento{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioVenta=" + precioVenta + ", cantidadesVendidas=" + 
                cantidadesVendidas + ", tipoTarifa=" + tipoTarifa + " Recaudo iva:" + calcularRecaudoIva() + "}";
    }
    
    
}
