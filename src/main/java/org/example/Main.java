package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.GestionarProducto.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);


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