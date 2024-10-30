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
public class Tecnicos {
    
    int id_tec;
    String cargo_tec;
    String nombre_tec;
    int telefono;
    String estado_tec;

    public Tecnicos() {
    }

    public Tecnicos(int id_tec, String cargo_tec, String nombre_tec, int telefono, String estado_tec) {
        this.id_tec = id_tec;
        this.cargo_tec = cargo_tec;
        this.nombre_tec = nombre_tec;
        this.telefono = telefono;
        this.estado_tec = estado_tec;
    }

    public int getId_tec() {
        return id_tec;
    }

    public void setId_tec(int id_tec) {
        this.id_tec = id_tec;
    }

    public String getCargo_tec() {
        return cargo_tec;
    }

    public void setCargo_tec(String cargo_tec) {
        this.cargo_tec = cargo_tec;
    }

    public String getNombre_tec() {
        return nombre_tec;
    }

    public void setNombre_tec(String nombre_tec) {
        this.nombre_tec = nombre_tec;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEstado_tec() {
        return estado_tec;
    }

    public void setEstado_tec(String estado_tec) {
        this.estado_tec = estado_tec;
    }
    
    
    
    
}
