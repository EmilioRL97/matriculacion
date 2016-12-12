
package Repository;

import Conexion.Conexion;
import Dominio.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Repositorio_Usuario_Db {
    Connection conn;
    List<Usuario> usuarios = new ArrayList<>();
    
    
    public void ingresar(Usuario usuario){
      try{
            conn = Conexion.open();
            PreparedStatement ps = conn.prepareStatement("insert into usuarios(nombre,contraseña)  values (?,?)");
            
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContraseña());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Datos Ingresados Correctamente");
			
	} catch (SQLException e) {
            System.out.println("Error.." + e.getMessage());
	}    
    }
    
    public List<Usuario> ConsultarId(Usuario usuario){
        try{
            conn = Conexion.open();
            String sql= "select * from usuarios where id_usuario=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, usuario.getId_usuario() );
            
            ResultSet rs = ps.executeQuery();
	    while(rs.next()){
		Usuario obj = new Usuario(rs.getInt(1),rs.getString(2), rs.getString(3));
	        usuarios.add(obj);
	    }    
			
	} catch (SQLException e) {
            System.out.println("Error.." + e.getMessage());
	}
        return usuarios; 
    }
     
    public void modificar(Usuario usuario){   
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
      
    public void eliminar(Usuario usuario){
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
    
    public List<Usuario> getPersonaByNombreOrContraseña(String val){
        List<Usuario> usuarios = new ArrayList<>();
       
        try{ 
            conn=Conexion.open();
            String sql="select * from usuarios where nombres like ? or contraseña like ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+val+"%");
            ps.setString(2, "%"+val+"%");
            
            ResultSet rs = ps.executeQuery();
	    while(rs.next()){
		Usuario obj = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3));
	        usuarios.add(obj);
	    }
        }catch(SQLException e){
            System.out.println("Error.." + e.getMessage());
        }
        
        return usuarios;
    }
    
     public List<Usuario> LlenarPersonas(){
        String sql= "select * from usuarios order by nombre";
        try{
            conn=Conexion.open();
            PreparedStatement ps =conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
               Usuario obj = new Usuario(rs.getInt(1),rs.getString(2), rs.getString(3));
               usuarios.add(obj);
            }
        }catch(SQLException e){
            System.out.println("Error.." + e.getMessage());
        }
        
        return usuarios;
    }
}
