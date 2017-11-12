/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Asesor;
import Modelo.Grupo;
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
public class GruporDAO {

    Conexion conexion;

    public GruporDAO() {
        conexion = new Conexion();
    }

    public String InsertarMienbroAlGrupo(String matricula, int id_grupo) {
        String insert = "INSERT INTO ST_MI_GRUPO (ID_GRUPO, MATRICULA) VALUES(?,?)";  
   
        PreparedStatement ps = null;
        try {
            Connection accesoBD = conexion.getConexion();
            ps = accesoBD.prepareStatement(insert);
            
            ps.setInt(1, id_grupo);
            ps.setString(2, matricula);       
            
            
            ps.executeUpdate();
            accesoBD.commit();
            return "SE AGREGO CORRECTAMENTE A LA BASE DE DATOS";
        } catch (Exception ex) {
            Logger.getLogger(GruporDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "ERROR: NO SE AGREGO CORRECTAMENTE";
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(GruporDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public String InsertarGrupo(Grupo grupo) {
        
        String insert = "INSERT INTO ST_GRUPO (ID_GRUPO, ID_ASESOR) VALUES(?,?)";  
   
        PreparedStatement ps = null;
        try {
            Connection accesoBD = conexion.getConexion();
            ps = accesoBD.prepareStatement(insert);
            
            ps.setInt(1, grupo.getId_grupo());       
            ps.setInt(2, grupo.getId_asesor());
            
            ps.executeUpdate();
            accesoBD.commit();
            return "SE AGREGO CORRECTAMENTE A LA BASE DE DATOS";
        } catch (Exception ex) {
            Logger.getLogger(GruporDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "ERROR: NO SE AGREGO CORRECTAMENTE";
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(GruporDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public int numeroCandidatos(int grupo) {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "SELECT COUNT(*) AS NUMCAN FROM ST_MI_GRUPO WHERE ID_GRUPO="  + grupo ;
            Statement consulta = accesoBD.createStatement();
            ResultSet resultado = consulta.executeQuery(sql);
            if (resultado.next()) {
                return resultado.getInt("NUMCAN");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GruporDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int numeroGrupos( ) {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "SELECT COUNT(*) AS NUMGRUP FROM ST_GRUPO";
            Statement consulta = accesoBD.createStatement();
            ResultSet resultado = consulta.executeQuery(sql);
            if (resultado.next()) {
                return resultado.getInt("NUMGRUP");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GruporDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public ResultSet VerGrupos() {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "SELECT * FROM ST_GRUPO";
            Statement consulta = accesoBD.createStatement();
            return consulta.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(GruporDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet VerGrupos2() {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "SELECT C.MATRICULA, C.NOMBRE, C.APELLIDOP, M.ID_GRUPO, A.NOMBRE "
                    + "FROM ST_CANDIDATO C INNER JOIN ST_MI_GRUPO M "
                    + "ON(C.MATRICULA = M.MATRICULA) INNER JOIN ST_GRUPO G "
                    + "ON(M.ID_GRUPO = G.ID_GRUPO) INNER JOIN ST_ASESOR A "
                    + "ON(G.ID_ASESOR = A.ID_ASESOR)";
            Statement consulta = accesoBD.createStatement();
            return consulta.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(GruporDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

//
//    public ResultSet ClickAsesor(int id_asesor) {
//        try {
//            Connection accesoBD = conexion.getConexion();
//            String sql = "SELECT * FROM ST_ASESOR WHERE ID_ASESOR=" + "'" + id_asesor + "'";
//            Statement consulta = accesoBD.createStatement();
//            return consulta.executeQuery(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(GruporDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//
//    public String AceptarAsesor(int id_asesor) {
//        try {
//            Connection accesoBD = conexion.getConexion();
//            String sql = "UPDATE ST_ASESOR SET ASIGNADO = 'si' WHERE ID_ASESOR =" + "'" + id_asesor + "'";
//            Statement consulta = accesoBD.createStatement();
//            consulta.executeQuery(sql);
//            return "SE A AGREGADO EL CANDIDATO A UN GRUPO";
//        } catch (SQLException ex) {
//            Logger.getLogger(GruporDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return "ERROR: NO SE PUDO AAGREGAR A UN GRUPO";
//        }
//        
//    }
}
