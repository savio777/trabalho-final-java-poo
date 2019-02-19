package facema.model;

/**
 *
 * @author savio
 */
public class Usuario extends Pessoa{
    
    private int carteiraTrab;
    private String email;
    private String senha;

    public int getCarteiraTrab() {
        return carteiraTrab;
    }

    public void setCarteiraTrab(int carteiraTrab) {
        this.carteiraTrab = carteiraTrab;
    }

    public String getEmail() {
        return email;
    }

    public void seEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
