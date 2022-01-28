package modelos;

import java.util.Objects;

public class Cliente {
   private int identificador;
   private String dni;
   private String nombre;
   private String apellidos;
   private Almacen almacen;
   private Producto producto;
   private TipoProducto tipoProducto;

   public Cliente(){

   }

   public Cliente(int identificador, String dni, String nombre, String apellidos, Almacen almacen, Producto producto, TipoProducto tipoProducto) {
      this.identificador = identificador;
      this.dni = dni;
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.almacen = almacen;
      this.producto = producto;
      this.tipoProducto = tipoProducto;
   }

   public Cliente(int identificador, String dni, String nombre, String apellidos) {
      this.identificador = identificador;
      this.dni = dni;
      this.nombre = nombre;
      this.apellidos = apellidos;
   }

   public int getIdentificador() {
      return identificador;
   }

   public void setIdentificador(int identificador) {
      this.identificador = identificador;
   }

   public String getDni() {
      return dni;
   }

   public void setDni(String dni) {
      this.dni = dni;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellidos() {
      return apellidos;
   }

   public void setApellidos(String apellidos) {
      this.apellidos = apellidos;
   }

   public Almacen getAlmacen() {
      return almacen;
   }

   public void setAlmacen(Almacen almacen) {
      this.almacen = almacen;
   }

   public Producto getProducto() {
      return producto;
   }

   public void setProducto(Producto producto) {
      this.producto = producto;
   }

   public TipoProducto getTipoProducto() {
      return tipoProducto;
   }

   public void setTipoProducto(TipoProducto tipoProducto) {
      this.tipoProducto = tipoProducto;
   }

   @Override
   public String toString() {
      return "Cliente{" +
              "identificador=" + identificador +
              ", dni='" + dni + '\'' +
              ", nombre='" + nombre + '\'' +
              ", apellidos='" + apellidos + '\'' +
              ", almacen=" + almacen +
              ", producto=" + producto +
              ", tipoProducto=" + tipoProducto +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Cliente)) return false;
      Cliente cliente = (Cliente) o;
      return getIdentificador() == cliente.getIdentificador() && getDni().equals(cliente.getDni()) && getNombre().equals(cliente.getNombre()) && getApellidos().equals(cliente.getApellidos()) && getAlmacen().equals(cliente.getAlmacen()) && getProducto().equals(cliente.getProducto()) && getTipoProducto() == cliente.getTipoProducto();
   }

   @Override
   public int hashCode() {
      return Objects.hash(getIdentificador(), getDni(), getNombre(), getApellidos(), getAlmacen(), getProducto(), getTipoProducto());
   }
}
