/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import Modelo.Dispositivos;
import java.util.List;

/**
 *
 * @author VictorG
 */
public interface CRUDDispositivo {
    public List listar();
    public Dispositivos list(int id);
    public boolean add(Dispositivos dis);
    public boolean edit(Dispositivos dis);
    public boolean eliminar(int id);
}
