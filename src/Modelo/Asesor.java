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
public class Asesor {
    
    private int id_asesor;
    private String nombre;
    private String cubículo;
    private String correo;
    private String horarioAsesoria;

    /**
     *
     * @param nombre
     * @param asesor
     * @param cubículo
     * @param correo
     * @param horarioAsesoria
     */
    public Asesor(int id_asesor, String nombre, String cubículo, String correo, String horarioAsesoria) {    
        this.id_asesor = id_asesor;
        this.nombre = nombre;
        this.cubículo = cubículo;
        this.correo = correo;
        this.horarioAsesoria = horarioAsesoria;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_asesor() {
        return id_asesor;
    }

    /**
     *
     * @return id_asesor
     */
    public void setId_asesor(int id_asesor) {
        this.id_asesor = id_asesor;
    }

    /**
     *
     * @return
     */
    public String getCubículo() {
        return cubículo;
    }

    /**
     *
     * @param cubículo
     */
    public void setCubículo(String cubículo) {
        this.cubículo = cubículo;
    }

    /**
     *
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     */
    public String getHorarioAsesoria() {
        return horarioAsesoria;
    }

    /**
     *
     * @param horarioAsesoria
     */
    public void setHorarioAsesoria(String horarioAsesoria) {
        this.horarioAsesoria = horarioAsesoria;
    }
    
}
