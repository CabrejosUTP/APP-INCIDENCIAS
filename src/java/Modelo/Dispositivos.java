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
public class Dispositivos {
    
    int id_disp;
    String nombre_disp;
    String tipo_disp;

    public Dispositivos() {
    }

    public Dispositivos(int id_disp, String nombre_disp, String tipo_disp) {
        this.id_disp = id_disp;
        this.nombre_disp = nombre_disp;
        this.tipo_disp = tipo_disp;
    }

    public int getId_disp() {
        return id_disp;
    }

    public void setId_disp(int id_disp) {
        this.id_disp = id_disp;
    }

    public String getNombre_disp() {
        return nombre_disp;
    }

    public void setNombre_disp(String nombre_disp) {
        this.nombre_disp = nombre_disp;
    }

    public String getTipo_disp() {
        return tipo_disp;
    }

    public void setTipo_disp(String tipo_disp) {
        this.tipo_disp = tipo_disp;
    }
    
    
    
    
}
