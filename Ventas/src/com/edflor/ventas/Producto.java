package com.edflor.ventas;

/**
 *
 * @author luis.flores.ramirez
 */
public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    //Constructor vacio para inicializar el contador id producto
    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
    //GET && SET
    public int getIdProducto(){
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
