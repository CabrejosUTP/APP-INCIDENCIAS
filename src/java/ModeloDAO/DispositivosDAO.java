/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUDDispositivo;
import Modelo.Dispositivos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VictorG
 */
public class DispositivosDAO implements CRUDDispositivo{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Dispositivos d=new Dispositivos();

    @Override
    public List listar() {
        ArrayList<Dispositivos>list=new ArrayList<>();
        String sql="select * from dispositivos";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Dispositivos dis=new Dispositivos();
                dis.setId_disp(rs.getInt("id_disp"));
                dis.setNombre_disp(rs.getString("nombre_disp"));
                dis.setTipo_disp(rs.getString("tipo_disp"));
                list.add(dis);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Dispositivos list(int id) {
        String sql="select * from dispositivos where id_disp="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                d.setId_disp(rs.getInt("id_disp"));
                d.setNombre_disp(rs.getString("nombre_disp"));
                d.setTipo_disp(rs.getString("tipo_disp"));
                
            }
        } catch (Exception e) {
        }
        return d;
    }

    @Override
    public boolean add(Dispositivos dis) {
        String sql="insert into dispositivos(id_disp, nombre_disp, tipo_disp)values('"+dis.getId_disp()+"','"+dis.getNombre_disp()+"','"+dis.getTipo_disp()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Dispositivos dis) {
        String sql="update dispositivos set nombre_disp='"+dis.getNombre_disp()+"',tipo_disp='"+dis.getTipo_disp()+"'where id_disp="+dis.getId_disp();
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
