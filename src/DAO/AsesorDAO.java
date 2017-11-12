/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Asesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MABY
 */
public class AsesorDAO {

    Conexion conexion;

    public AsesorDAO() {
        conexion = new Conexion();
    }

    public String InsertarCandidato(Asesor asesor) {
        String insert = "INSERT INTO ST_ASESOR (ID_ASESOR, NOMBRE, "
                + "CUBICULO, CORREO, H_ASESORIOA, ASIGNADO) "
                + "VALUES(?,?,?,?,?,?)";  
        PreparedStatement ps = null;
        try {
            Connection accesoBD = conexion.getConexion();
            ps = accesoBD.prepareStatement(insert);
            
            int id_asesor = numeroAsesores() + 1;
            
            ps.setInt(1, id_asesor);
            ps.setString(2, asesor.getNombre());
            ps.setString(3, asesor.getCubículo());
            ps.setString(4, asesor.getCorreo());
            ps.setString(5, asesor.getHorarioAsesoria());
            ps.setString(6, "no");

            ps.executeUpdate();
            accesoBD.commit();
            return "SE AGREGO CORRECTAMENTE A LA BASE DE DATOS";
        } catch (Exception ex) {
            Logger.getLogger(AsesorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "ERROR: NO SE AGREGO CORRECTAMENTE";
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(AsesorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int numeroAsesores() {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "SELECT COUNT(*) AS NUMASE FROM ST_ASESOR";
            Statement consulta = accesoBD.createStatement();
            ResultSet resultado = consulta.executeQuery(sql);
            if (resultado.next()) {
                return resultado.getInt("NUMASE");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AsesorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public ResultSet VerAsesor() {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "SELECT * FROM ST_ASESOR";
            Statement consulta = accesoBD.createStatement();
            return consulta.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AsesorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet ClickAsesor(int id_asesor) {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "SELECT * FROM ST_ASESOR WHERE ID_ASESOR=" + "'" + id_asesor + "'";
            Statement consulta = accesoBD.createStatement();
            return consulta.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AsesorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String AceptarAsesor(int id_asesor) {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "UPDATE ST_ASESOR SET ASIGNADO = 'si' WHERE ID_ASESOR =" + "'" + id_asesor + "'";
            Statement consulta = accesoBD.createStatement();
            consulta.executeQuery(sql);
            return "SE A AGREGADO EL CANDIDATO A UN GRUPO";
        } catch (SQLException ex) {
            Logger.getLogger(AsesorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "ERROR: NO SE PUDO AAGREGAR A UN GRUPO";
        }
        
    }
    
}
