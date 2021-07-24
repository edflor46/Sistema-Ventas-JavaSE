
package com.edflor.ventas.test;

import com.edflor.ventas.*;

/**
 *
 * @author luis.flores.ramirez
 */
public class VentasTest {
    public static void main(String[] args) {
        //Instancia productos
        Producto producto1 = new Producto("Camisa", 50.00); 
        Producto producto2 = new Producto("Pantalon", 100.00);
        Producto producto3 = new Producto("Playera", 100.00);
        
        //Instancia orden
        Orden orden1 = new Orden();
        //Ejecucion metodo agregarProducto
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        //Ejecucion metodo mostrarOrden
        orden1.mostrarOrden();
    }
}
