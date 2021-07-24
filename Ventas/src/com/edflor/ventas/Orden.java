
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
   
   //Agregar producto
   public void agregarProducto(Producto producto){
       if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
           productos[contadorProductos++] = producto;
       }else{
           System.out.println("Se ha superado el maximo de productos " + Orden.MAX_PRODUCTOS);
       }
   }
   
}
