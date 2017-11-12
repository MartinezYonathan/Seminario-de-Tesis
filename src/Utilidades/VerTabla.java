package Utilidades;

import Conexion.Conexion;
import DAO.CandidatoDAO;
import Utilidades.RedimensionadorDeColumnas;
import Utilidades.TablaImagen;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VerTabla {

    Conexion conexion;
    private DefaultTableModel miTabla;//propiedades de la tabla

    public VerTabla() {
        conexion = new Conexion();
    }

    public void visualizar_tabla(JTable tabla) {
        CandidatoDAO candidatoDAO = new CandidatoDAO();
        ResultSet rs = candidatoDAO.VerCandidato();
        //Image img = null;   
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Matricula");
        dt.addColumn("Nombre");
        dt.addColumn("Foto");

        try {

            while (rs.next()) {
                if (rs.getObject(14).equals("no")) {
                    Object[] fila = new Object[3];
                    fila[0] = rs.getObject(1);
                    fila[1] = rs.getObject(2);
                    Blob blob = rs.getBlob(15);

                    if (blob != null) {
                        try {
                            byte[] data = blob.getBytes(1, (int) blob.length());
                            BufferedImage img = null;
                            try {
                                img = ImageIO.read(new ByteArrayInputStream(data));

                                img = resize(img, 200, 250);

                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                            }
                            ImageIcon icono = new ImageIcon(img);
                            fila[2] = new JLabel(icono);
                        } catch (Exception ex) {
                            fila[2] = "No Imagen";
                        }
                    } else {
                        fila[2] = "No Imagen";
                    }

                    dt.addRow(fila);
                }
            }

            tabla.setModel(dt);
            RedimensionadorDeColumnas.ajustarAnchoColumnas(tabla);
            tabla.setRowMargin(5);
            tabla.setRowHeight(250);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void visualizar_tabla_Grupos(JTable tabla) {
        
    }

    public static BufferedImage resize(BufferedImage bufferedImage, int newW, int newH) {
        int w = bufferedImage.getWidth();
        int h = bufferedImage.getHeight();
        BufferedImage bufim = new BufferedImage(newW, newH, bufferedImage.getType());
        Graphics2D g = bufim.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(bufferedImage, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return bufim;
    }

}
