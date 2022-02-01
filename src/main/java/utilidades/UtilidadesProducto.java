package utilidades;

import modelos.Almacen;
import modelos.Producto;
import modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {
    //a. public List<Producto> getPorTipo(List<Producto> productos,
    //TipoProducto tipo).
    //El método devuelve la lista de productos del tipo que se le pasa
    //como parámetro.

    public List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo){
        List<Producto> Lista_productos = new ArrayList<>();
        for(List<Producto> Producto: productos){
        if (productos.get(Producto).getTipoProducto().equals(tipo)){
            Lista_productos.add(Producto);
        }}
        return Lista_productos;
    }

    public List<Producto> getPorAlmacen (List<Producto> productos, Almacen almacen){
        List<Producto> ProductosDelAlmacen = new ArrayList<>();
        for(List<Producto> Producto: productos){
            if (productos.get(Producto).getAlmacen().equals(almacen)){
                ProductosDelAlmacen.add(Producto);
            }}
        return ProductosDelAlmacen;
    }
}
