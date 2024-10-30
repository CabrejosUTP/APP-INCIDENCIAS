/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author VictorG
 */
public class Cliente {
    int dni_cliente;
    String nombre_cliente;
    String direccion_cliente;
    int telefono;
    String contra;

    public Cliente() {
    }

    public Cliente(int dni_cliente, String nombre_cliente, String direccion_cliente, int telefono, String contra) {
        this.dni_cliente = dni_cliente;
        this.nombre_cliente = nombre_cliente;
        this.direccion_cliente = direccion_cliente;
        this.telefono = telefono;
        this.contra = contra;
    }

    public int getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(int dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
}
