import modelos.*;

import java.time.LocalDate;

import static modelos.TipoProducto.ALIMENTACION;

public class pruebaVI {
    public static void main(String[] args) {
        Almacen almacen1 = new Almacen(1,"Manuela S.L.", 20);
        Cliente cliente1= new Cliente(1, "2738137", "Sergio", "Molina");
        Factura factura1= new Factura(3, "StringcodigoFactura", 3.50, 1.50, 0.30, 5.30, LocalDate.now(), LocalDate.now(), true);
        LineaFactura LineaFactura1= new LineaFactura(2,3);
        Producto Macarrones= new Producto(3,"13134","macarrones", LocalDate.of(2023, 10 ,9),5.5,ALIMENTACION);

        System.out.println(almacen1);
        System.out.println(cliente1);
        System.out.println(factura1);
        System.out.println(LineaFactura1);
        System.out.println(Macarrones);
    }


}









