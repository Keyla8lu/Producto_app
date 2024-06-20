package com.mycompany.productoapp1;

public class Electronico extends Producto {
    private int garantia;

    public Electronico() {
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Garantia: " + garantia + " meses");
    }
}
