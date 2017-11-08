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
public class Candidato {   
    private String matricula;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String correo;
    private String telefon;
    private String carrera;
    private String generacion;
    private String temaTesis;
    private String directorTesis;
    private String trabaja;
    private String lugarTrabajo;
    private String horarioTrabajo;
    private String imagen;

    /**
     *
     * @param nombre nombre del candidato
     * @param apellidoP apellido paterno del candidatos
     * @param apellidoM apellido maternoi del candidato
     * @param matricula boleta del candidato
     * @param correo correo electronico del candidato
     * @param telefon telefono celular del candidato
     * @param carrera carrera del candidato
     * @param generacion numero de generacion del candidato
     * @param temaTesis tema de tesis del candidato
     * @param directorTesis director de tesis para el candidato
     * @param trabaja si trabaja o no trabaja del candidato
     * @param lugarTrabajo lugar de trabajo del candidato si trabaja
     * @param horarioTrabajo horarioi de trabaja del candidato si trabaja
     */
    public Candidato(String matricula, String nombre, String apellidoP, String apellidoM, String correo, String telefon, String carrera, String generacion, String temaTesis, String directorTesis, String trabaja, String lugarTrabajo, String horarioTrabajo, String imagen) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correo = correo;
        this.telefon = telefon;
        this.carrera = carrera;
        this.generacion = generacion;
        this.temaTesis = temaTesis;
        this.directorTesis = directorTesis;
        this.trabaja = trabaja;
        this.lugarTrabajo = lugarTrabajo;
        this.horarioTrabajo = horarioTrabajo;
        this.imagen = imagen;
    }

    public Candidato(String matricula, String nombre, String apellidoP, String apellidoM, String correo, String telefon, String carrera, String generacion, String temaTesis, String directorTesis, String trabaja, String imagen) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correo = correo;
        this.telefon = telefon;
        this.carrera = carrera;
        this.generacion = generacion;
        this.temaTesis = temaTesis;
        this.directorTesis = directorTesis;
        this.trabaja = trabaja;
        this.imagen = imagen;
    }

    /**
     *
     * @return el candidato creado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre del candidato
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return el nombre del candidato
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     *
     * @param apellidoP
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     *
     * @return
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     *
     * @param apellidoM
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
    public String getTelefon() {
        return telefon;
    }

    /**
     *
     * @param telefon
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     *
     * @return
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     *
     * @param carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     *
     * @return
     */
    public String getGeneracion() {
        return generacion;
    }

    /**
     *
     * @param generacion
     */
    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    /**
     *
     * @return
     */
    public String getTemaTesis() {
        return temaTesis;
    }

    /**
     *
     * @param temaTesis
     */
    public void setTemaTesis(String temaTesis) {
        this.temaTesis = temaTesis;
    }

    /**
     *
     * @return
     */
    public String getDirectorTesis() {
        return directorTesis;
    }

    /**
     *
     * @param directorTesis
     */
    public void setDirectorTesis(String directorTesis) {
        this.directorTesis = directorTesis;
    }

    /**
     *
     * @return
     */
    public String getTrabaja() {
        return trabaja;
    }

    /**
     *
     * @param trabaja
     */
    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    /**
     *
     * @return
     */
    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    /**
     *
     * @param lugarTrabajo
     */
    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    /**
     *
     * @return
     */
    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    /**
     *
     * @param horarioTrabajo
     */
    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    
}
