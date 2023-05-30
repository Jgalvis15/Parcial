/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomundial.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import proyectomundial.model.Seleccion;
import proyectomundial.util.BasedeDatos;

/**
 *
 * @author yflor
 */
public class UsuarioDAO {

    public UsuarioDAO() {
        BasedeDatos.conectar();
    }
    
     public boolean getSelecciones(String usuario ,String contraseña) {
        
        String sql = "SELECT * FROM poo.users where username= '"+ usuario+ "' and password='"+ contraseña+"'";
        List<Usuario> selecciones = new ArrayList<Usuario>();
        
        try {
            ResultSet result = BasedeDatos.ejecutarSQL(sql);
            
            if(result != null) {
            
                while (result.next()) { 
                    return true;
                }
            }
            
            return false;
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error consultando selecciones");
        }
        return false;
        
       
    }
     
    
    
}
