package com.mycompany.productoapp1;

public class Telefono extends Electronico {
    private String numeroTelefono;

    public Telefono() {
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void mostrarInformacionCompleta() {
        mostrarInformacion();
        System.out.println("Numero de Telefono: " + numeroTelefono);
    }
}
