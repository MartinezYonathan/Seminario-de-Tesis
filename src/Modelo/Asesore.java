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
public class Asesore {
    
    private String nombre;
    private String asesor;
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
    public Asesore(String nombre, String asesor, String cubículo, String correo, String horarioAsesoria) {
        this.nombre = nombre;
        this.asesor = asesor;
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

    /**
     *
     * @return
     */
    public String getAsesor() {
        return asesor;
    }

    /**
     *
     * @param asesor
     */
    public void setAsesor(String asesor) {
        this.asesor = asesor;
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
