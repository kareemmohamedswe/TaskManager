
package Database;

import Pages.CustomerPage;
import Pages.TaskPage;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Customer {
    
     public Employee emp = new Employee();
 // Customer atributes 
    private String cst_id,cst_name,cst_address,cst_number;
    private final DatabaseConnection DB = new DatabaseConnection();
            
 // empty constructor
    public Customer(){}
    
 // Customer constructor
    public Customer (String cst_id,String cst_name,String cst_address,String cst_number){
        
        this.cst_address=cst_address;
        this.cst_id=cst_id;
        this.cst_number=cst_number;
        this.cst_name=cst_name;
    }
    
    
  // all setter and getter methods 

    public String getCst_id() {
        return cst_id;
    }

    public void setCst_id(String cst_id) {
        this.cst_id = cst_id;
    }

    public String getCst_name() {
        return cst_name;
    }

    public void setCst_name(String cst_name) {
        this.cst_name = cst_name;
    }

    public String getCst_address() {
        return cst_address;
    }

    public void setCst_address(String cst_address) {
        this.cst_address = cst_address;
    }

    public String getCst_number() {
        return cst_number;
    }

    public void setCst_number(String cst_number) {
        this.cst_number = cst_number;
        
    }
    
    
    
     
        ///* Customer methods *///
    //---------------------//
    
    // first method in wich you can add Customer data in the data base
    public void addCustomer (String cst_id,String cst_name,String cst_address,String cst_number)
    {
        try {
                
                DB.connect();
                DB.WriteSql("insert into customers (cst_id,cst_name,cst_address,cst_number) values (" +  cst_id   + " , '" + cst_name + "'" + "," + "'" + cst_address + "' , '" + cst_number +"' );");
                DB.closeConnection();
                JOptionPane.showMessageDialog(new TaskPage(),"the data insert sucssesfully");
                
            } catch (SQLException aa) {
                JOptionPane.showMessageDialog(new TaskPage(),aa.getMessage());
            }
    }
    
    
    
    // second method to Delete the data of one Customer
    public void deleteCustomer (String ID) throws SQLException{
        
        DB.connect();
        DB.WriteSql("DELETE FROM Customers WHERE cst_id = "+ ID +" ; ");
        DB.closeConnection();
        
    }
    
    
    
    // third method to update the data of Customer
    public void updateCustomer (String newid , String cst_id,String cst_name,String cst_address,String cst_number) throws SQLException
    { 
        try {
            DB.connect();

            DB.WriteSql("update customers  "
                    + " set cst_id = " + newid  +  " , cst_name = '" + cst_name + "' , cst_address = '" + cst_address + "' , cst_number = '" + cst_number + "' \n"
                    + "where cst_id = " + cst_id);

            DB.closeConnection();
        }catch(SQLException aa){JOptionPane.showMessageDialog(new CustomerPage(),aa.getMessage());}
    }
}



