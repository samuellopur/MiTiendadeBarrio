package org.example;

import java.util.Date;
import java.util.Scanner;

public class Producto {


    private final String idProducto;
    private String nombreProducto;
    private double precioProducto;
    static private Date fecha;

    public Producto(String idProducto, String nombreProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        Producto.fecha = new Date();
    }

    public String getIdProducto() {

        return idProducto;
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
                "idProducto='" + idProducto + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto = " + precioProducto +
                ", fecha = " + fecha +
                '}';
    }



}
