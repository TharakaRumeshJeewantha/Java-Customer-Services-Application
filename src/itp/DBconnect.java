
package itp;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBconnect {
    
    public static Connection connect()
    {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/suntex_weaving_industries","root","");
        }
        
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Connection Fail");
            
        }
        return conn;
    }

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
