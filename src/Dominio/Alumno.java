
package Dominio;

import java.util.Date;

public class Alumno {
    private int id_alumno;
    private String cedula;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String nivel_de_grado;
    private int telefono;
    private Date fecha_de_nacimiento;
    private String certificado_aprovacion;
    private String certificado_medico;

    public Alumno(){
        
    }
    public Alumno(int id_alumno, String cedula, String nombre, String apellidos, String direccion, String nivel_de_grado, int telefono, Date fecha_de_nacimiento, String certificado_aprovacion, String certificado_medico) {
        this.id_alumno = id_alumno;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nivel_de_grado = nivel_de_grado;
        this.telefono = telefono;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.certificado_aprovacion = certificado_aprovacion;
        this.certificado_medico = certificado_medico;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNivel_de_grado() {
        return nivel_de_grado;
    }

    public void setNivel_de_grado(String nivel_de_grado) {
        this.nivel_de_grado = nivel_de_grado;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getCertificado_aprovacion() {
        return certificado_aprovacion;
    }

    public void setCertificado_aprovacion(String certificado_aprovacion) {
        this.certificado_aprovacion = certificado_aprovacion;
    }

    public String getCertificado_medico() {
        return certificado_medico;
    }

    public void setCertificado_medico(String certificado_medico) {
        this.certificado_medico = certificado_medico;
    }
    
}
