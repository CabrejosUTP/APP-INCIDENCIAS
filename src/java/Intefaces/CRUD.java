
package Intefaces;

import Modelo.Cliente;
import java.util.List;


public interface CRUD {
    // si no sale borrar esto
    public int validar(Cliente cl);
    public List listar();
    public Cliente list(int id);
    public boolean add(Cliente per);
    public boolean edit(Cliente per);
    public boolean eliminar(int id);
    public List buscar(String texto);
    
    
}
