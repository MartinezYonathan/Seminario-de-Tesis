/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import DAO.CandidatoDAO;
import Modelo.Candidato;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author MABY
 */
public class JPCandidato extends javax.swing.JPanel {

    String matricula;
    String nombre;
    String apellidoP;
    String apellidoM;
    String correo;
    String telefon;
    String carrera;
    String generacion;
    String temaTesis;
    String directorTesis;
    String trabaja = "";
    String lugarTrabajo;
    String horarioTrabajo;
    String imagen;

    JFileChooser elegirImagen;
    CandidatoDAO candidatoDAO;
    Candidato candidato;
    Image preview;

    /**
     * Creates new form JPCandidato
     */
    public JPCandidato() {
        initComponents();
        candidatoDAO = new CandidatoDAO();
        buttonGroup1.add(jRBSi);
        buttonGroup1.add(jRBNo);

        jLabel12.setVisible(false);
        jLabel10.setVisible(false);
        txtHorarioTrabajo.setVisible(false);
        txtLugarTrabajo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        txtHorarioTrabajo = new javax.swing.JTextField();
        jLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        txtLugarTrabajo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTemaTesis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGeneracion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDirectorTesis = new javax.swing.JTextField();
        bntAgregar = new principal.MaterialButtomRectangle();
        btnAbrir = new principal.MaterialButtomRectangle();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jRBSi = new javax.swing.JRadioButton();
        jRBNo = new javax.swing.JRadioButton();

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Horario de Trabajo:");

        txtHorarioTrabajo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHorarioTrabajo.setForeground(new java.awt.Color(58, 159, 171));

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel.setText("Nombre: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Trabaja: ");

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre.setPreferredSize(new java.awt.Dimension(69, 23));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Apellido Paterno:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Lugar de Trabajo: ");

        txtApellidoP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtApellidoP.setForeground(new java.awt.Color(58, 159, 171));

        txtLugarTrabajo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLugarTrabajo.setForeground(new java.awt.Color(58, 159, 171));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Matricula:");

        txtMatricula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(58, 159, 171));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Apellido Materno:");

        lblimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagen.setText("Preview");

        txtApellidoM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtApellidoM.setForeground(new java.awt.Color(58, 159, 171));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Elegir Foto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Correo: ");

        txtCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(58, 159, 171));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Telefono:");

        txtTelefon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTelefon.setForeground(new java.awt.Color(58, 159, 171));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tema Tesis:");

        txtTemaTesis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTemaTesis.setForeground(new java.awt.Color(58, 159, 171));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Carrera: ");

        txtCarrera.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCarrera.setForeground(new java.awt.Color(58, 159, 171));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Generacion: ");

        txtGeneracion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGeneracion.setForeground(new java.awt.Color(58, 159, 171));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Director Tesis:");

        txtDirectorTesis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDirectorTesis.setForeground(new java.awt.Color(58, 159, 171));

        bntAgregar.setBackground(new java.awt.Color(58, 159, 171));
        bntAgregar.setForeground(new java.awt.Color(255, 255, 255));
        bntAgregar.setText("AGREGAR CANDIDATO");
        bntAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntAgregar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        bntAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgregarActionPerformed(evt);
            }
        });

        btnAbrir.setBackground(new java.awt.Color(58, 159, 171));
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("ABRIR...");
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrir.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(58, 159, 171));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("AGREGAR CANDIDATO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jRBSi.setText("SI");
        jRBSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSiActionPerformed(evt);
            }
        });

        jRBNo.setText("No");
        jRBNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGeneracion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtTemaTesis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirectorTesis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtLugarTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtHorarioTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBSi)
                                .addGap(28, 28, 28)
                                .addComponent(jRBNo)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(107, 107, 107))
                                .addComponent(btnAbrir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(49, 49, 49))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(bntAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtMatricula)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtGeneracion))
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTemaTesis)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirectorTesis)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRBSi)
                            .addComponent(jRBNo))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLugarTrabajo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHorarioTrabajo)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(bntAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bntAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgregarActionPerformed

        nombre = txtNombre.getText();
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar el nombre", "Error", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocusInWindow();
            return;
        }
        apellidoP = txtApellidoP.getText();
        if (apellidoP.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar el apellido paterno", "Error", JOptionPane.ERROR_MESSAGE);
            txtApellidoP.requestFocusInWindow();
            return;
        }
        apellidoM = txtApellidoM.getText();
        if (apellidoM.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar el apellido materno", "Error", JOptionPane.ERROR_MESSAGE);
            txtApellidoM.requestFocusInWindow();
            return;
        }
        matricula = txtMatricula.getText();
        if (matricula.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar la matricula", "Error", JOptionPane.ERROR_MESSAGE);
            txtMatricula.requestFocusInWindow();
            return;
        }
        correo = txtCorreo.getText();
        if (correo.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar el correo", "Error", JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocusInWindow();
            return;
        }
        telefon = txtTelefon.getText();
        if (telefon.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar el telefono celular", "Error", JOptionPane.ERROR_MESSAGE);
            txtTelefon.requestFocusInWindow();
            return;
        }
        carrera = txtCarrera.getText();
        if (carrera.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar la carrera", "Error", JOptionPane.ERROR_MESSAGE);
            txtCarrera.requestFocusInWindow();
            return;
        }
        generacion = txtGeneracion.getText();
        if (generacion.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar tu generacion", "Error", JOptionPane.ERROR_MESSAGE);
            txtGeneracion.requestFocusInWindow();
            return;
        }
        temaTesis = txtTemaTesis.getText();
        if (temaTesis.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar tu tema de tesis", "Error", JOptionPane.ERROR_MESSAGE);
            txtTemaTesis.requestFocusInWindow();
            return;
        }
        directorTesis = txtDirectorTesis.getText();
        if (directorTesis.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar tu director de resis", "Error", JOptionPane.ERROR_MESSAGE);
            txtDirectorTesis.requestFocusInWindow();
            return;
        }

        if (preview == null) {
            JOptionPane.showMessageDialog(null, "Te falto agregar tu foto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (trabaja.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar si trabajas", "Error", JOptionPane.ERROR_MESSAGE);
            txtDirectorTesis.requestFocusInWindow();
            return;
        }
        candidato = new Candidato(matricula, nombre, apellidoP, apellidoM, correo, telefon, carrera, generacion, temaTesis, directorTesis, trabaja, lugarTrabajo, horarioTrabajo, imagen);
        String resultado = candidatoDAO.InsertarCandidato(candidato);
        JOptionPane.showMessageDialog(null, resultado, "Correcto", JOptionPane.NO_OPTION);
    }//GEN-LAST:event_bntAgregarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed

        elegirImagen = new JFileChooser();
        elegirImagen.setCurrentDirectory(new File("Fotos"));
        elegirImagen.setMultiSelectionEnabled(false);
        int o = elegirImagen.showOpenDialog(this);
        if (o == JFileChooser.APPROVE_OPTION) {
            imagen = elegirImagen.getSelectedFile().getAbsolutePath();
            preview = Toolkit.getDefaultToolkit().getImage(imagen);
            if (preview != null) {
                lblimagen.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_DEFAULT));
                lblimagen.setIcon(icon);
            }
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void jRBSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSiActionPerformed
        if (jRBSi.isSelected()) {
            jLabel12.setVisible(true);
            jLabel10.setVisible(true);
            txtHorarioTrabajo.setVisible(true);
            txtLugarTrabajo.setVisible(true);

            trabaja = "si";

            lugarTrabajo = txtLugarTrabajo.getText();
            if (lugarTrabajo.equals("")) {
                JOptionPane.showMessageDialog(null, "Te falto agregar tu lugar de tranajo", "Error", JOptionPane.ERROR_MESSAGE);
                txtLugarTrabajo.requestFocusInWindow();
                return;
            }
            horarioTrabajo = txtHorarioTrabajo.getText();
            if (horarioTrabajo.equals("")) {
                JOptionPane.showMessageDialog(null, "Te falto agregar tu hora de trabajo", "Error", JOptionPane.ERROR_MESSAGE);
                txtHorarioTrabajo.requestFocusInWindow();
                return;
            }
        }
    }//GEN-LAST:event_jRBSiActionPerformed

    private void jRBNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNoActionPerformed
        if (jRBNo.isSelected()) {
            jLabel12.setVisible(false);
            jLabel10.setVisible(false);
            txtHorarioTrabajo.setVisible(false);
            txtLugarTrabajo.setVisible(false);

            trabaja = "no";
            horarioTrabajo = "null";
            lugarTrabajo = "null";

        }
    }//GEN-LAST:event_jRBNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButtomRectangle bntAgregar;
    private principal.MaterialButtomRectangle btnAbrir;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JRadioButton jRBNo;
    private javax.swing.JRadioButton jRBSi;
    private javax.swing.JLabel lblimagen;
    public static javax.swing.JLabel titulo;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirectorTesis;
    private javax.swing.JTextField txtGeneracion;
    private javax.swing.JTextField txtHorarioTrabajo;
    private javax.swing.JTextField txtLugarTrabajo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtTemaTesis;
    // End of variables declaration//GEN-END:variables
}
