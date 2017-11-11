/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import DAO.CandidatoDAO;
import Utilidades.VerTabla;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author MABY
 */
public class JPVerCandidato extends javax.swing.JPanel {

    String matricula;
    int clic_tabla;
    boolean bandera = false;
    VerTabla v;
    CandidatoDAO candidatoDAO;

    /**
     * Creates new form JPCandidato
     */
    public JPVerCandidato() {
        initComponents();
        v = new VerTabla();
        candidatoDAO = new CandidatoDAO();
        v.visualizar_tabla(tabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlApellidoP = new javax.swing.JLabel();
        jlLugarTrabajo = new javax.swing.JLabel();
        jlMatricula = new javax.swing.JLabel();
        jlApellidoM = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jlCarrera = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlGeneracion = new javax.swing.JLabel();
        jltematesis = new javax.swing.JLabel();
        jlDirectorTesis = new javax.swing.JLabel();
        jlHorastrabajo = new javax.swing.JLabel();
        jlTrabaja = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cerrarSesion1 = new principal.MaterialButtomRectangle();

        jPanel2.setBackground(new java.awt.Color(58, 159, 171));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CANDIDATOS POR APROVAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Foto"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnActualizar.setBackground(new java.awt.Color(204, 255, 204));
        btnActualizar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 51, 255));
        btnActualizar.setText("Actualizar y Ver Tabla");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Carrera: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Generacion: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Director Tesis:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Horario de Trabajo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Trabaja: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Apellido Paterno:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Lugar de Trabajo: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Matricula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Apellido Materno:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Correo: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Telefono:");

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel.setText("Nombre: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tema Tesis:");

        jlApellidoP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlApellidoP.setText("Apellido Paterno:");

        jlLugarTrabajo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlLugarTrabajo.setText("Lugar de Trabajo: ");

        jlMatricula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlMatricula.setText("Matricula:");

        jlApellidoM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlApellidoM.setText("Apellido Materno:");

        jlCorreo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlCorreo.setText("Correo: ");

        jlTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTelefono.setText("Telefono:");

        jlCarrera.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlCarrera.setText("Carrera: ");

        jlNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlNombre.setText("Nombre: ");

        jlGeneracion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlGeneracion.setText("Generacion: ");

        jltematesis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jltematesis.setText("Tema Tesis:");

        jlDirectorTesis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDirectorTesis.setText("Director Tesis:");

        jlHorastrabajo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlHorastrabajo.setText("Horario de Trabajo:");

        jlTrabaja.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTrabaja.setText("Trabaja: ");

        jLabel13.setText("jLabel13");

        cerrarSesion1.setBackground(new java.awt.Color(58, 159, 171));
        cerrarSesion1.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion1.setText("ACEPTAR CANDIDATO");
        cerrarSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        cerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCorreo)
                            .addComponent(jlApellidoM)
                            .addComponent(jlApellidoP)
                            .addComponent(jlNombre)
                            .addComponent(jlMatricula)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlCarrera)
                                .addComponent(jlTelefono))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jltematesis)
                                    .addComponent(jlGeneracion)
                                    .addComponent(jlHorastrabajo)
                                    .addComponent(jlDirectorTesis)
                                    .addComponent(jlLugarTrabajo)
                                    .addComponent(jlTrabaja))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cerrarSesion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(jlNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlApellidoP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlApellidoM)
                        .addGap(18, 18, 18)
                        .addComponent(jlMatricula)
                        .addGap(18, 18, 18)
                        .addComponent(jlCorreo)
                        .addGap(18, 18, 18)
                        .addComponent(jlTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(jlCarrera)
                        .addGap(18, 18, 18)
                        .addComponent(jlGeneracion)
                        .addGap(18, 18, 18)
                        .addComponent(jltematesis)
                        .addGap(18, 18, 18)
                        .addComponent(jlDirectorTesis)
                        .addGap(18, 18, 18)
                        .addComponent(jlTrabaja)
                        .addGap(18, 18, 18)
                        .addComponent(jlLugarTrabajo)
                        .addGap(18, 18, 18)
                        .addComponent(jlHorastrabajo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        clic_tabla = tabla.rowAtPoint(evt.getPoint());

        matricula = "" + tabla.getValueAt(clic_tabla, 0);
        ResultSet rs = candidatoDAO.ClickCandidato(matricula);

        try {
            while (rs.next()) {
                jlMatricula.setText(rs.getObject(1).toString());
                jlNombre.setText(rs.getObject(2).toString());
                jlApellidoP.setText(rs.getObject(3).toString());
                jlApellidoM.setText(rs.getObject(4).toString());
                jlCorreo.setText(rs.getObject(5).toString());
                jlTelefono.setText(rs.getObject(6).toString());
                jlCarrera.setText(rs.getObject(7).toString());
                jlGeneracion.setText(rs.getObject(8).toString());
                jltematesis.setText(rs.getObject(9).toString());
                jlDirectorTesis.setText(rs.getObject(10).toString());
                jlTrabaja.setText(rs.getObject(11).toString());
                jlLugarTrabajo.setText(rs.getObject(12).toString());
                jlHorastrabajo.setText(rs.getObject(13).toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(JPVerCandidato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        v.visualizar_tabla(tabla);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesion1ActionPerformed
        candidatoDAO.AceptarCandidato(matricula);
        v.visualizar_tabla(tabla);
    }//GEN-LAST:event_cerrarSesion1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private principal.MaterialButtomRectangle cerrarSesion1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlApellidoM;
    private javax.swing.JLabel jlApellidoP;
    private javax.swing.JLabel jlCarrera;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlDirectorTesis;
    private javax.swing.JLabel jlGeneracion;
    private javax.swing.JLabel jlHorastrabajo;
    private javax.swing.JLabel jlLugarTrabajo;
    private javax.swing.JLabel jlMatricula;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTrabaja;
    private javax.swing.JLabel jltematesis;
    private javax.swing.JTable tabla;
    public static javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
