package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static List<Producto> productos = new ArrayList<>();

    public static void main(String[] args) {

       correrMenu();
    }

    public static void displayMenu() {
        String menu ="""
                 |o|                         /////////////\\\\\\\\\\\\
                 |o|                        (((((((((((((   \\\\\\\\\\\\
                 |o|                        ))) ~~      ~~   (((
                 |o|                        ((( (*)     (*)  )))
                 |o|                        )))     <        (((\\s
                 |o|                        ((( '\\\\______/`   )))\\s
                 |o|                        )))\\\\___________/(((\\s
                 |o|                        (((   _)  (_    )))\\s\\s
                 |o|                              /\\\\__/\\\\""\"
                 ±----------------------------------------±
                 |   Administrador Mi Tienda de Barrio    |
                 ±----------------------------------------±
                 |  "1. Agregar producto                  |
                 |  "2. Eliminar producto                 |
                 |  "3. Actualizar producto               |
                 |  "4. Ver todos los productos           |
                 |  "5. Filtrar productos por precio      |
                 |  "6. Filtrar productos por categoria   |
                 |  "7. Generar reporte                   |
                 |  "8. Salir                             |
                 ±----------------------------------------±
                 \nDigita una opción entre 1 y 8:      =>  
                """;
        System.out.println(menu);
    }

    public static void correrMenu() {
        int eleccion;
        do {
            displayMenu();
            eleccion = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            seleccionarOpcion(eleccion);
        } while (eleccion < 9);
    }

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
            if (nombreIdScanner.equals(producto.getIdProducto())) {
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
            if (idscanner.equals(producto.getIdProducto())) {
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


    public static void seleccionarOpcion(int scanner) {
        switch (scanner) {
            case 1 -> agregarProducto();

            case 2 -> elimiarProducto();
            case 3 -> actulizarProducto();

            case 4 -> listarProductos();

            case 5 -> System.out.println("Productos filtrados por precio");
            case 6 -> System.out.println("Productos filtrados por categoria");
            case 7 -> System.out.println("Generar reporte");

            case 8 -> System.out.println("Salir");
            default -> System.out.println("Opcion invalida. Por favor intentalo de nuevo");
        }

    }

}