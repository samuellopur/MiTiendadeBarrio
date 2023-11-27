package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.GestionarProducto.productos;

public class ProductServiceImpl {

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }


    public void elimiarProducto(int id) {
        productos.removeIf(producto -> productos.add() == id);
    }


    public Producto findById(int id) {
        return productos.stream().filter(producto -> Boolean.parseBoolean(producto.getId ()id).findFirst().orElse(null));
    }


    public List<Producto> listarProductos() {
        return new ArrayList<>(productos);
    }
}
