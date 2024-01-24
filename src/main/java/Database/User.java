
package Database;

import java.sql.SQLException;


public abstract class User {
    
    private int id ;
    private String salary;
    
    public  User(){}
    
    public abstract void add (String id , String name , String salary , String department , String type , String number , String username , String password  );
    public abstract void delete (String ID) throws SQLException;
    public abstract void update (String newId ,String id , String name , String salary , String department , String type , String number , String username , String password) throws SQLException;
    
}
