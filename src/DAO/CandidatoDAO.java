/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Candidato;
import java.io.File;
import java.io.FileInputStream;
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
public class CandidatoDAO {

    Conexion conexion;

    public CandidatoDAO() {
        conexion = new Conexion();
    }

    public String InsertarCandidato(Candidato candidato) {
        String insert = "INSERT INTO ST_CANDIDATO (MATRICULA, NOMBRE, APELLIDOP, "
                + "APELLIDOM, CORREO, TELEFON, CARRERA, GENERACION, TEMATESIS, "
                + "DIRECTORTESIS, TRABAJA, LUGARTRABAJO, HORARIOTRABAJO, ACEPTADO, IMAGEN) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            Connection accesoBD = conexion.getConexion();
            accesoBD.setAutoCommit(false);
            File file = new File(candidato.getImagen());
            fis = new FileInputStream(file);
            ps = accesoBD.prepareStatement(insert);

            ps.setString(1, candidato.getMatricula());
            ps.setString(2, candidato.getNombre());
            ps.setString(3, candidato.getApellidoP());
            ps.setString(4, candidato.getApellidoM());
            ps.setString(5, candidato.getCorreo());
            ps.setString(6, candidato.getTelefon());
            ps.setString(7, candidato.getCarrera());
            ps.setString(8, candidato.getGeneracion());
            ps.setString(9, candidato.getTemaTesis());
            ps.setString(10, candidato.getDirectorTesis());
            ps.setString(11, candidato.getTrabaja());
            ps.setString(12, candidato.getLugarTrabajo());
            ps.setString(13, candidato.getHorarioTrabajo());
            ps.setString(14, "no");
            ps.setBinaryStream(15, fis, (int) file.length());

            ps.executeUpdate();
            accesoBD.commit();
            return "SE AGREGO CORRECTAMENTE A LA BASE DE DATOS";
        } catch (Exception ex) {
            Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "ERROR: NO SE AGREGO CORRECTAMENTE";
        } finally {
            try {
                ps.close();
                fis.close();
            } catch (Exception ex) {
                Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ResultSet VerCandidato() {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "SELECT * FROM ST_CANDIDATO";
            Statement consulta = accesoBD.createStatement();
            return consulta.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet ClickCandidato(String matricula) {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "SELECT * FROM ST_CANDIDATO WHERE MATRICULA=" + "'" + matricula + "'";
            Statement consulta = accesoBD.createStatement();
            return consulta.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String AceptarCandidato(String matricula) {
        try {
            Connection accesoBD = conexion.getConexion();
            String sql = "UPDATE ST_CANDIDATO SET ACEPTADO = 'si' WHERE MATRICULA =" + "'" + matricula + "'";
            Statement consulta = accesoBD.createStatement();
            consulta.executeQuery(sql);
            return "SE A AGREGADO EL CANDIDATO A UN GRUPO";
        } catch (SQLException ex) {
            Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "ERROR: NO SE PUDO AAGREGAR A UN GRUPO";
        }
        
    }
}
