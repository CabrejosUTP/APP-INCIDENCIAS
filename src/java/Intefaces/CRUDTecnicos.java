/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import Modelo.Tecnicos;
import java.util.List;

/**
 *
 * @author VictorG
 */
public interface CRUDTecnicos {
    public List listar();
    public Tecnicos list(int id);
    public boolean add(Tecnicos tec);
    public boolean edit(Tecnicos tec);
    public boolean eliminar(int id);
    
}
