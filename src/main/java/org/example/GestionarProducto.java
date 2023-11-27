package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionarProducto {

    static Scanner scanner = new Scanner(System.in);

    static List<Producto> productos = new ArrayList<>();

    public static void agregarProducto() {
        System.out.println("\n±----------------------------------------±" +
                "\nRegistro de producto a inventario" +
                "\n±----------------------------------------±");
        System.out.println("Registre id: ");
        String idscanner = scanner.next();
        System.out.println("Registre nombre:");
        String nombrescanner = scanner.next();
        System.out.println("Registre precio: ");
        double precioscanner = scanner.nextDouble();
        Producto producto = new Producto(idscanner, nombrescanner, precioscanner);
        productos.add(producto);

    }

    public static void elimiarProducto() {
        System.out.println("\n±----------------------------------------±" +
                "\nEliminar producto de inventario" +
                "\n±----------------------------------------±");
        System.out.println("Ingrese id del producto: ");
        String nombreIdScanner = scanner.next();

        for (Producto producto : productos) {
            if (nombreIdScanner.equals(producto.getId())) {
                productos.remove(producto);
                System.out.println("Producto eliminado");
                break;

            }
        }
    }

    public static void actulizarProducto() {
        System.out.println("\n±----------------------------------------±" +
                "\nActualizar producto" +
                "\n±----------------------------------------±");
        System.out.println("Ingrese id del producto: ");
        String idscanner = scanner.next();

        for (Producto producto : productos) {
            if (idscanner.equals(producto.getId())) {
                System.out.println("Ingrese nuevo nombre del producto: ");
                String nombreProducto = scanner.next();
                producto.setNombreProducto(nombreProducto);
                System.out.println("Ingrese nuevo precio: ");
                double precioProducto = scanner.nextDouble();
                producto.setPrecioProducto(precioProducto);
                break;
            }
        }
    }

    public static void listarProductos() {
        System.out.println("\n±----------------------------------------±" +
                "\nListar productos del inventario" +
                "\n±----------------------------------------±");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
