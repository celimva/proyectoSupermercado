package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {
    private int identificador;
    private String codigo;
    private String descripcion;
    private LocalDate fechaCaducidad;
    private double Precio;
    Enum TipoProducto;
    private Almacen Almacen;
    private Cliente cliente;


    public Producto(int identificador, String codigo, String descripcion, LocalDate fechaCaducidad, double precio, Enum tipoProducto, modelos.Almacen almacen, Cliente cliente) {
        this.identificador = identificador;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaCaducidad = fechaCaducidad;
        Precio = precio;
        TipoProducto = tipoProducto;
        Almacen = almacen;
        this.cliente = cliente;
    }
    public Producto(int identificador, String codigo, String descripcion, LocalDate fechaCaducidad, double precio, Enum tipoProducto) {
        this.identificador = identificador;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaCaducidad = fechaCaducidad;
        Precio = precio;
        TipoProducto = tipoProducto;

    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public Enum getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(Enum tipoProducto) {
        TipoProducto = tipoProducto;
    }

    public modelos.Almacen getAlmacen() {
        return Almacen;
    }

    public void setAlmacen(modelos.Almacen almacen) {
        Almacen = almacen;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return getIdentificador() == producto.getIdentificador() && Double.compare(producto.getPrecio(), getPrecio()) == 0 && Objects.equals(getCodigo(), producto.getCodigo()) && Objects.equals(getDescripcion(), producto.getDescripcion()) && Objects.equals(getFechaCaducidad(), producto.getFechaCaducidad()) && Objects.equals(getTipoProducto(), producto.getTipoProducto()) && Objects.equals(getAlmacen(), producto.getAlmacen()) && Objects.equals(getCliente(), producto.getCliente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), getCodigo(), getDescripcion(), getFechaCaducidad(), getPrecio(), getTipoProducto(), getAlmacen(), getCliente());
    }

    @Override
    public String toString() {
        return "Producto{" +
                "identificador=" + identificador +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", Precio=" + Precio +
                ", TipoProducto=" + TipoProducto +
                ", Almacen=" + Almacen +
                ", cliente=" + cliente +
                '}';
    }
}