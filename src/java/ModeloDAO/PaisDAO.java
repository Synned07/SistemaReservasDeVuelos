/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;
import Interfaces.PaisInterface;
import Modelo.Pais;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Config.Conexion;
import java.sql.Connection;

public class PaisDAO implements PaisInterface{
    PreparedStatement ps;
    ResultSet rs;
    Connection conexion;
    
    public PaisDAO() throws ClassNotFoundException{
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
    @Override
    public List<Pais> listarPaises() {
        List<Pais> paises = new ArrayList<>();
        
        String cmd = "SELECT * FROM pais";
        try{
            ps = conexion.prepareStatement(cmd);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Pais pais = new Pais();
                pais.setId(rs.getInt("id"));
                pais.setPaisNombre(rs.getString("paisnombre"));
                paises.add(pais);
            }
 
            return paises;
        }catch(SQLException e){
            return null;
        }
        
    }
    
    
    public List<Pais> tipoPais(String nombre){
        List<Pais> pais = new ArrayList<>();
        
        for(Pais j : listarPaises()){
            if(j.getPaisNombre().equals(nombre)){
                pais.add(j);
                break;
            }
        }
        
        return pais;
    }
    
}