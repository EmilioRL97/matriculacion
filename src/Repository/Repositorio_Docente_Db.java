
package Repository;

import Conexion.Conexion;
import Dominio.Representante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Repositorio_Docente_Db {
    Connection conn;
    List<Representante> representantes = new ArrayList<>();
     public void ingresar(Representante representante){
      try{
            conn = Conexion.open();
            PreparedStatement ps = conn.prepareStatement("insert into representante(parentesco, cedula,nombre,apellido, telefono, direccion, sexo, estado_civil)  values (?,?,?,?,?,?,?,?)");
            
            ps.setString(1, representante.getRepresentante());
            ps.setString(2, representante.getCedula());
            ps.setString(3, representante.getNombre());
            ps.setString(4, representante.getApellido());
            ps.setInt(5, representante.getTelefono());
            ps.setString(6, representante.getDireccion());
            ps.setString(7, representante.getSexo());
            ps.setString(8, representante.getEstado_civil());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Datos Ingresados Correctamente");
			
	} catch (SQLException e) {
            System.out.println("Error.." + e.getMessage());
	}    
    }
    
    public List<Representante> ConsultarId(Representante representante){
        try{
            conn = Conexion.open();
            String sql= "select * from representante where id_representante=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, representante.getId_representante() );
            
            ResultSet rs = ps.executeQuery();
	    while(rs.next()){
		Representante obj = new Representante(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6), rs.getString(7), rs.gestring(8),rs.getS;
	        representantes.add(obj);
	    }    
			
	} catch (SQLException e) {
            System.out.println("Error.." + e.getMessage());
	}
        return usuarios; 
    }
     
    public void modificar(Representante representante){   
        try{
            conn = Conexion.open();
            String sql="update usuarios set nombre=?, contraseña=? where id_usuario=" +usuario.getId_usuario();
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContraseña());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Datos Modificados Correctamente");
	} catch (SQLException e) {
            System.out.println("Error.." + e.getMessage());
	}
    }
      
    public void eliminar(Representante representante){
        try{
            conn = Conexion.open();
            String sql="delete from usuarios where id_usuario= " +usuario.getId_usuario();
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.execute();
            JOptionPane.showMessageDialog(null,"Datos Eliminados Correctamente");
	} catch (SQLException e) {
            System.out.println("Error.." + e.getMessage());
	}  
    }
    
   
    
    
     public List<Representante> LlenarPersonas(){
        String sql= "select * from usuarios order by nombre";
        try{
            conn=Conexion.open();
            PreparedStatement ps =conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
               Representante obj = new Representante(rs.getInt(1),rs.getString(2), rs.getString(3));
               usuarios.add(obj);
            }
        }catch(SQLException e){
            System.out.println("Error.." + e.getMessage());
        }
        
        return usuarios;
    }
}
