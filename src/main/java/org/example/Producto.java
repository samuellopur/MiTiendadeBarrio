package org.example;

import java.util.Date;

public class Producto {


    private final String id;
    private String nombreProducto;
    private double precioProducto;
    static private Date fecha;

    public Producto(String id, String nombreProducto, double precioProducto) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        Producto.fecha = new Date();
    }

    public String getId() {

        return id;
    }

    public String getNombreProducto() {

        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {

        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {

        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {

        this.precioProducto = precioProducto;
    }

    /*public static Date getFecha() {
        return fecha;
    }*/

    public static void setFecha(Date fecha) {
        Producto.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Producto { " +
                "id='" + id + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto = " + precioProducto +
                ", fecha = " + fecha +
                '}';
    }



}
