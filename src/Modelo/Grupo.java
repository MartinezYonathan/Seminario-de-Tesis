/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 *
 * @author MABY
 */
public class Grupo {

    private int id_grupo;
    private int id_asesor;

    public Grupo(int id_grupo, int id_asesor) {
        this.id_grupo = id_grupo;
        this.id_asesor = id_asesor;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public int getId_asesor() {
        return id_asesor;
    }

    public void setId_asesor(int id_asesor) {
        this.id_asesor = id_asesor;
    }
    
    
    
}
