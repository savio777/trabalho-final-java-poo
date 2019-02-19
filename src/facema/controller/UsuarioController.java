package facema.controller;

import facema.dao.UsuarioDao;
import facema.view.TelaPrincipal;
//import javax.swing.JFrame;
import facema.view.TelaLogin;
import javax.swing.JFrame;

/**
 *
 * @author savio
 */
public class UsuarioController {
    
    private UsuarioDao user = new UsuarioDao();
    private TelaLogin login = new TelaLogin();
    private TelaPrincipal tela = new TelaPrincipal();
    
    public UsuarioController(){
    }
    
    public boolean validar(String email, String senha){
        if(this.user.validarcaoUser(email, senha)==true){
            this.tela.setVisible(true);
            this.tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
            return true;
            //tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }else{
            return false;
        }
    }
    
}
