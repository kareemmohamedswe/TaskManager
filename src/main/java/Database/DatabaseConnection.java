

package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    
    private Connection c ;
    Statement DB;
    
    
    public Connection connect () throws SQLException{
        c =DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "");
        return c;
    }
    
    
    public void WriteSql ( String SQL) throws SQLException 
    {
        
        DB = c.createStatement();
        DB.execute(SQL);
    }
    
    
    public void closeConnection () throws SQLException{
        c.close();
        DB.close();
    }
    
}
