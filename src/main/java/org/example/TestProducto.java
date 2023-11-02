package org.example;

public class TestProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("123", "Queso", 4500);
        Producto producto2 = new Producto("1234", "Mantequilla", 3650);

        System.out.println(producto1);
        System.out.println(producto2);
    }
}
