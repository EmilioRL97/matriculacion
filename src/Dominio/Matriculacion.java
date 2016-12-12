/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;

/**
 *
 * @author Emilio
 */
public class Matriculacion {
    private int id_matricula;
    private int id_alumno;
    private String nombre;
    private String apellidos;
    private Double pago;
    private Date fecha;
    private Long cedula;
    private String grado_nivel;

    public Matriculacion(int id_matricula, int id_alumno, String nombre, String apellidos, Double pago, Date fecha, Long cedula, String grado_nivel) {
        this.id_matricula = id_matricula;
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pago = pago;
        this.fecha = fecha;
        this.cedula = cedula;
        this.grado_nivel = grado_nivel;
    }

    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getGrado_nivel() {
        return grado_nivel;
    }

    public void setGrado_nivel(String grado_nivel) {
        this.grado_nivel = grado_nivel;
    }
    
}
