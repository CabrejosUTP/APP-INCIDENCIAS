/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUDTecnicos;
import Modelo.Tecnicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VictorG
 */
public class TecnicoDAO implements CRUDTecnicos {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Tecnicos t=new Tecnicos();

    @Override
    public List listar() {
        ArrayList<Tecnicos>list=new ArrayList<>();
         String sql="select * from tecnicos";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Tecnicos te=new Tecnicos();
                te.setId_tec(rs.getInt("id_tec"));
                te.setCargo_tec(rs.getString("cargo_tec"));
                te.setNombre_tec(rs.getString("nombre_tec"));
                te.setTelefono(rs.getInt("telefono"));
                te.setEstado_tec(rs.getString("estado_tec"));
                list.add(te);
            }
        } catch (Exception e) {
        }
        return list;
  
    }

    @Override
    public Tecnicos list(int id) {
       String sql="select * from tecnicos where id_tec="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                t.setId_tec(rs.getInt("id_tec"));
                t.setCargo_tec(rs.getString("cargo_tec"));
                t.setNombre_tec(rs.getString("nombre_tec"));
                t.setTelefono(rs.getInt("telefono"));
                t.setEstado_tec(rs.getString("estado_tec"));
                
            }
        } catch (Exception e) {
        }
        return t;
    }

    @Override
    public boolean add(Tecnicos tec) {
        String sql="insert into tecnicos(id_tec, cargo_tec, nombre_tec, telefono, estado_tec)values('"+tec.getId_tec()+"','"+tec.getCargo_tec()+"','"+tec.getNombre_tec()+"','"+tec.getTelefono()+"','"+tec.getEstado_tec()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Tecnicos tec) {
       String sql="update tecnicos set cargo_tec='"+tec.getCargo_tec()+"',nombre_tec='"+tec.getNombre_tec()+"',telefono='"+tec.getTelefono()+"',estado_tec='"+tec.getEstado_tec()+"'where id_tec="+tec.getId_tec();
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
    
}
