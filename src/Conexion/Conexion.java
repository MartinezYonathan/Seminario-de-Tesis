/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase sirve para conectar la base de datos de Oracle al programa.
 *
 * @author Clases
 */
public class Conexion {

    Connection conexion;

    /**
     * Constructor Sin parametros de entrada
     */
    public Conexion() {
    }

    /**
     * Regresa la coneccion y retorna el DriveMangaer que contiene la direccion
     * de la BD, contraseña y usuario de la BD.
     *
     * @return conn
     */
    public Connection getConexion() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String bDatos = "jdbc:oracle:thin:@localhost:1521:XE";
            conexion = DriverManager.getConnection(bDatos, "system", "oracle");
            System.out.println("En linea");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
}
