package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public  void productos() {

        Scanner miscaner = new Scanner(System.in);

        String[] productname = new String[20];

        System.out.println("Lista productos");
        productname[0] = "Kumis";
        productname[1] = "Leche";
        productname[2] = "Mantequilla";
        productname[3] = "Alpinito";
        productname[4] = "Mantequilla";
        productname[5] = "Bolsas";
        productname[6] = "Cerveza";
        productname[7] = "Gelatina";
        productname[8] = "Ginebra";
        productname[9] = "Helado";
        productname[10] = "Huevos";
        productname[11] = "Shampoo";
        productname[12] = "Pilas";
        productname[13] = "Servilletas";
        productname[14] = "Pasta";
        productname[15] = "Carne";
        productname[16] = "Cera";
        productname[17] = "Cereal";
        productname[18] = "Enegizante";
        productname[19] = "Empanada";




        // 3. Imprimir los elementos del array.


        for (int i=0;i< productname.length;i++)
        {

            System.out.print(productname[i]+ "\n ");
        }
        System.out.println("---------");


        System.out.print("ingrese la letra buscar del producto: \n");
        String ingresar ;
        ingresar= miscaner.next();

        for (int i =0 ;i<productname.length;i++)
        {
            if (productname[i].startsWith(ingresar))
            {
                System.out.print(productname[i]+"\n");
            }

        }

        Arrays.sort(productname);
        System.out.print("Nombres ordenados alfabéticamente:\n ");
        for (String name : productname) {
            System.out.print(name + "\n ");
        }
        System.out.println();
    }
}