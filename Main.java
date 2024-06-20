package com.mycompany.productoapp1;

public class Main {
    public static void main(String[] args) {
        Telefono miTelefono = new Telefono();

        miTelefono.setNombre("Iphone 8 plus");
        miTelefono.setPrecio(350);
        miTelefono.setGarantia(12);
        miTelefono.setNumeroTelefono("0991271557");

        System.out.println("Nombre del producto: " + miTelefono.getNombre());
        System.out.println("Precio del producto: $" + miTelefono.getPrecio());
        System.out.println("Garantia del producto: " + miTelefono.getGarantia() + " meses");
        System.out.println("Numero de telefono: " + miTelefono.getNumeroTelefono());
    }
}
