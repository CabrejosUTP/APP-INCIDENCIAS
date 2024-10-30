/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VictorG
 */
public class ClienteDAO implements CRUD {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente c=new Cliente();
    int r;

    @Override
    public List listar() {
       ArrayList<Cliente>list=new ArrayList<>();
        String sql="select * from clientes";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cli=new Cliente();
                cli.setDni_cliente(rs.getInt("dni_cli"));
                cli.setNombre_cliente(rs.getString("nomb_cli"));
                cli.setDireccion_cliente(rs.getString("direcc_cli"));
                cli.setTelefono(rs.getInt("telefono"));
                cli.setContra(rs.getString("contrasena"));
                list.add(cli);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Cliente list(int id) {
         String sql="select * from clientes where dni_cli="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                c.setDni_cliente(rs.getInt("dni_cli"));
                c.setNombre_cliente(rs.getString("nomb_cli"));
                c.setDireccion_cliente(rs.getString("direcc_cli"));
                c.setTelefono(rs.getInt("telefono"));
                c.setContra(rs.getString("contrasena"));
                
            }
        } catch (Exception e) {
        }
        return c;
    }

    @Override
    public boolean add(Cliente per) {
        String sql="insert into clientes(dni_cli, nomb_cli, direcc_cli, telefono, contrasena)values('"+per.getDni_cliente()+"','"+per.getNombre_cliente()+"','"+per.getDireccion_cliente()+"','"+per.getTelefono()+"','"+per.getContra()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Cliente per) {
        String sql="update clientes set nomb_cli='"+per.getNombre_cliente()+"',direcc_cli='"+per.getDireccion_cliente()+"',telefono='"+per.getTelefono()+"',contrasena='"+per.getContra()+"'where dni_cli="+per.getDni_cliente();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int validar(Cliente cl) {
        
        String sql="select * from clientes where dni_cli=? and contrasena=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cl.getDni_cliente());
            ps.setString(2, cl.getContra());
            ps.executeQuery();
            while(rs.next()){
                r=r+1;
                cl.setDni_cliente(rs.getInt("dni_cli"));
                cl.setContra(rs.getString("contrasena"));
            }
            
            if(r==1){
                return 1;
            }else{
                return 0;
            }
            
        } catch (Exception e) {
            return 0;
        }
        
    }

    @Override
    public List buscar(String texto) {
        List<Cliente> lista=new ArrayList<>();
        String sql;
        sql="select * from clientes where dni_cli like '%"+texto+"%'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {   
                Cliente cli=new Cliente();
                cli.setDni_cliente(rs.getInt("dni_cli"));
                lista.add(cli);
                
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
}
