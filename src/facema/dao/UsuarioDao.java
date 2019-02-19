package facema.dao;

import facema.factory.Factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author savio
 */
public class UsuarioDao {
    
    Connection conn; 
    
    public UsuarioDao(){
        this.conn = new Factory().connection("trab_ferds?autoReconnect=true&useSSL=false", "root", "");
    }
    
    public boolean validarcaoUser(String email, String senha){
        boolean valid=false;
        String sql = "SELECT * FROM usuario WHERE email=? and senha=?";
        try {
            PreparedStatement psm = this.conn.prepareStatement(sql);
            psm.setString(1, email);
            psm.setString(2, senha);
            ResultSet rs = psm.executeQuery();
            if(rs.next()){
                valid = true;
            }else{ 
                JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos!");
                valid = false;
            }
            psm.close();
            this.conn.close();
        } catch (SQLException e) {
            valid = false;
            throw new RuntimeException(e);
        }
        return valid;
    }
    
    /*public UsuarioDao(String adm, String usuario, String senha){
        this.addRoot(adm, usuario, senha);
    }
    
    public void addRoot(String adm, String usuario, String senha){
        String sql  = "INSERT INTO usuario (nome,email,senha) VALUES (?,?,?)";
        String sql1 = "SELECT * FROM usuario WHERE email=? and senha=?";
        try {
            PreparedStatement psm = this.conn.prepareStatement(sql);
            psm.setString(1, adm);
            psm.setString(2, usuario);
            psm.setString(3, senha);
           
            PreparedStatement psm1 = this.conn.prepareStatement(sql1);
            psm1.setString(1, usuario);
            psm1.setString(2, senha);
            ResultSet rs = psm1.executeQuery();
            
            if(rs.next()){
                psm.execute();
                psm.close();
            }
            
            rs.close();
            this.conn.close();
        } catch (SQLException e) {
         throw new RuntimeException(e);
        }
    }*/
    
    
}
