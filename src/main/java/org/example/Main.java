package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static List<Producto> productos = new ArrayList<>();


    public static void main(String[] args) {
        correrMenu();
    }

    public static void displayMenu() {

        System.out.println(
                """
                        |o|                         /////////////\\\\\\
                        |o|                        (((((((((((((   \\\\\\
                        |o|                        ))) ~~      ~~   (((
                        |o|                        ((( (*)     (*)  )))
                        |o|                        )))     <        (((\s
                        |o|                        ((( '\\______/`   )))\s
                        |o|                        )))\\___________/(((\s
                        |o|                        (((   _)  (_    )))\s\s
                        |o|                              /\\__/\\""");
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Eliminar producto                     |");
        System.out.println("3. Actualizar producto                   |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Filtrar productos por precio          |");
        System.out.println("6. Filtrar productos por categoria       |");
        System.out.println("7. Generar reporte                       |");
        System.out.println("8. Salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("\nDigita una opción entre 1 y 8:        =>  ");
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