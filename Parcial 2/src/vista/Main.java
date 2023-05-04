/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import modelo.*;

/**
 *
 * @author ESTUDIANTES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Producto> productos= new ArrayList();
        
        Producto a = new Alimento("abc-204","manzana roja", 2000, 20, "SIN DESCUENTO");
        productos.add(a);
        Producto v = new Vehiculo("Chevrolet", "2010", "Aveo", 20000000);
        productos.add(v);
        Producto c = new Contrato(10000000,6000000);
        productos.add(c);
        
        imprimirProductos(productos);
       
    }
    
    public static void imprimirProductos(List<Producto> list){
        System.out.println("** PRODCUTOS");
        for(Producto p: list){
            System.out.println(p);
            System.out.println("---------------");
        }
    }
    
}
