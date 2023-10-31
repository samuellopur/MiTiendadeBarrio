package org.example;

import java.util.Arrays;

public class ProductsArray {

    // Array cadenas llamado `products` con un tamaño de 20.
    static String[] products = new String[20];

    public static void imprimirListaProductos() {
        // 2. Iniciala el array con 20 productos
        products[0] = "Leche";
        products[1] = "Queso";
        products[2] = "Pan";
        products[3] = "Kumis";
        products[4] = "Arroz";
        products[5] = "Jamon";
        products[6] = "Huevos";
        products[7] = "Harina";
        products[8] = "Cereal";
        products[9] = "Gelatina";
        products[10] = "Atun";
        products[11] = "Salchichas";
        products[12] = "Mermelada";
        products[13] = "Galletas";
        products[14] = "Mantequilla";
        products[15] = "Avena";
        products[16] = "Maizena";
        products[17] = "Mogollas";
        products[18] = "Bocadillo";
        products[19] = "Mani";
    }

    public static void filtrarProductosPorLetra(char letra) {
        System.out.print("\n**************************************\n Filtra productos por letra: " +
                "\n**************************************");
        for (String name : products) {
            if (name.startsWith(String.valueOf(letra))) {
                System.out.print("\n" + name);
            }
        }
        System.out.println("\n**************************************\n");
    }
    public static void imprimirEnOrdenAlfabetico() {
        Arrays.sort(products);
        System.out.print("\n**************************************\n Lista de productos en orden alfabetico: " +
                "\n**************************************");
        for (String name : products) {
            System.out.print("\n" + name);
        }
        System.out.println("\n**************************************\n");
    }


    public static void main(String[] args) {

        imprimirListaProductos();
        filtrarProductosPorLetra('M');
        imprimirEnOrdenAlfabetico();

    }

}
