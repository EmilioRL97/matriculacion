/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author server
 */
public class Docentes {
     private int id_docente;
    private long cedula;
    private String nombre;
    private String apellidos;
    private String sexo;
    private int telefono;
    private String direccion;
    private String nivel_de_estudio;
    private String especialidad;

    public Docentes(int id_docente, long cedula, String nombre, String apellidos, String sexo, int telefono, String direccion, String nivel_de_estudio, String especialidad) {
        this.id_docente = id_docente;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nivel_de_estudio = nivel_de_estudio;
        this.especialidad = especialidad;
    }

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNivel_de_estudio() {
        return nivel_de_estudio;
    }

    public void setNivel_de_estudio(String nivel_de_estudio) {
        this.nivel_de_estudio = nivel_de_estudio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
