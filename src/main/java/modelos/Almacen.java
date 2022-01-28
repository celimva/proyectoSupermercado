package modelos;

import java.util.Objects;

public class Almacen {
    private int identificador;
    private String nombre;
    private int capacidad;
    private Cliente cliente;
    private Producto producto;

    private TipoProducto tipoproducto;

    public Almacen(){

    }

    public Almacen(int identificador, String nombre, int capacidad, Cliente cliente, Producto producto, TipoProducto tipoproducto) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cliente = cliente;
        this.producto = producto;
        this.tipoproducto = tipoproducto;
    }

    public Almacen(int identificador, String nombre, int capacidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }



    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public TipoProducto getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(TipoProducto tipoproducto) {
        this.tipoproducto = tipoproducto;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", cliente=" + cliente +
                ", producto=" + producto +
                ", tipoproducto=" + tipoproducto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Almacen)) return false;
        Almacen almacen = (Almacen) o;
        return getIdentificador() == almacen.getIdentificador() && getCapacidad() == almacen.getCapacidad() && getNombre().equals(almacen.getNombre()) && getCliente().equals(almacen.getCliente()) && getProducto().equals(almacen.getProducto()) && getTipoproducto() == almacen.getTipoproducto();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), getNombre(), getCapacidad(), getCliente(), getProducto(), getTipoproducto());
    }
}
