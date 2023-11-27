package org.example;

import java.util.List;

public interface ProductoServicio {

    void agregarProducto(Producto producto);
    void elimiarProducto(int id);
    Producto listarProductos(int id);
    List<Producto> getAllProducts();
}
