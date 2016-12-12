
package Repository;

import Conexion.Conexion;
import Dominio.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Repositorio_Alumno_Db {
     Connection conn;
    List<Alumno> alumnos = new ArrayList<>();
    
    
    public void ingresar(Alumno alumno){
      try{
            conn = Conexion.open();
            PreparedStatement ps = conn.prepareStatement("insert into alumnos(cedula,nombre,apellidos, direccion, nivel_de_grado,telefono,fecha_nacimiento, certificado_aprovacion,certificado_medico)  values (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, alumno.getCedula());
            ps.setString(2,alumno.getNombre());
            ps.setString(3, alumno.getApellidos());
            ps.setString(4, alumno.getDireccion());
            ps.setString(5, alumno.getNivel_de_grado());
            ps.setInt(6, alumno.getTelefono());
            ps.setDate(7, (Date) alumno.getFecha_de_nacimiento());
            ps.setString(8, alumno.getCertificado_aprovacion());
            ps.setString(9,alumno.getCertificado_medico());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Datos Ingresados Correctamente");
			
	} catch (SQLException e) {
            System.out.println("Error.." + e.getMessage());
	}    
    }
    
    public List<Alumno> ConsultarId(Alumno alumno){
        try{
            conn = Conexion.open();
            String sql= "select * from alumnos where id_alumno=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, alumno.getId_alumno() );
            
            ResultSet rs = ps.executeQuery();
	    while(rs.next()){
		Alumno obj = new Alumno (rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7), rs.getDate(8), rs.getString(9),rs.getString(10));
	        alumnos.add(obj);
	    }    
			
	} catch (SQLException e) {
            System.out.println("Error.." + e.getMessage());
	}
        return alumnos; 
    }
     
    public void modificar(Alumno alumno){   
        try{
            conn = Conexion.open();
            String sql="update alumnos set cedula=?, nombre=?, apellidos=? ,direccion=? , nivel_de_grado=? ,telefono=? ,fecha_nacimiento=? , certificado_aprovacion=? ,certificado_medico=? where id_alumno=" +alumno.getId_alumno();
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.setString(1, alumno.getCedula());
            ps.setString(2,alumno.getNombre());
            ps.setString(3, alumno.getApellidos());
            ps.setString(4, alumno.getDireccion());
            ps.setString(5, alumno.getNivel_de_grado());
            ps.setInt(6, alumno.getTelefono());
            ps.setDate(7, (Date) alumno.getFecha_de_nacimiento());
            ps.setString(8, alumno.getCertificado_aprovacion());
            ps.setString(9,alumno.getCertificado_medico());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Datos Modificados Correctamente");
	} catch (SQLException e) {
            System.out.println("Error.." + e.getMessage());
	}
    }
      
    public void eliminar(Alumno alumno){
        try{
            conn = Conexion.open();
            String sql="delete from alumnos where id_alumno= " +alumno.getId_alumno();
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.execute();
            JOptionPane.showMessageDialog(null,"Datos Eliminados Correctamente");
	} catch (SQLException e) {
            System.out.println("Error.." + e.getMessage());
	}  
    }
    
  
    
     public List<Alumno> LlenarPersonas(){
        String sql= "select * from alumnos order by nombre";
        try{
            conn=Conexion.open();
            PreparedStatement ps =conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
               Alumno obj = new Alumno(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7), rs.getDate(8), rs.getString(9),rs.getString(10));
               alumnos.add(obj);
            }
        }catch(SQLException e){
            System.out.println("Error.." + e.getMessage());
        }
        
        return alumnos;
    }
}
