package facema.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author savio
 */
public class Factory {
    
    public Connection connection(String bd, String user, String senha){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/"+bd, user, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
