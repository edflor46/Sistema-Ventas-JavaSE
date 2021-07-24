
package com.edflor.ventas;

/**
 *
 * @author luis.flores.ramirez
 */
public class Orden {
   private int idOrden;
   private Producto productos[];
   private static int contadorOrdenes;
   private int contadorProductos;
   private static final int MAX_PRODUCTOS = 10;
   
   //Constructor vacio: Inicializar variables idOrden && productos[]
   public Orden(){
       this.idOrden = ++Orden.contadorOrdenes;
       this.productos = new Producto[Orden.MAX_PRODUCTOS];
   }
   
}
