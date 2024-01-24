
package Database;
import Pages.EmployeePage;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Employee extends User
{
    // all Employee atributes 
    private String name , number , type , department , id , salary , username ,password ;
    private final DatabaseConnection DB = new DatabaseConnection ();

    // Employee Constructors
    public Employee (){}
    
    public Employee (String name , String number , String type , String department , String id , String salary ,String username , String password)
    {
        this.department=department;
        this.id=id;
        this.name=name;
        this.number = number;
        this.salary=salary;
        this.type=type;
        this.username =username;
        this.password =password;
    }
    
    
        // all attributes setter and getter

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
    
    ///* Employee methods *///
    //---------------------//
    
    // first method in wich you can add Employee data in the data base
        @Override
    public void add (String id , String name , String salary , String department , String type , String number , String username , String password  )
    {
        try {
                
                DB.connect();
                DB.WriteSql("insert into employee (id, name , salary , department ,Emp_type,number , user_name , user_password) values (" +  id  + " , " + "'" + name + "'" + " , " + salary + " , " + "'" + department + "'" + "," + "'" + type + "' , '" + number + "' , '"+ username +"' , '" +password+"' );");
                DB.closeConnection();
                JOptionPane.showMessageDialog(new EmployeePage(),"the data insert sucssesfully");
                
            } catch (SQLException aa) {
                JOptionPane.showMessageDialog(new EmployeePage(),aa.getMessage());
            }
    }
    
    
    
    // second method to Delete the data of one EmployeePage
    @Override
    public void delete (String ID) throws SQLException{
        
        DB.connect();
        DB.WriteSql("DELETE FROM employee WHERE id = "+ ID + " ; ");
        DB.closeConnection();
        
    }
    
    
    
    // third method to update the data of Employee
    @Override
    public void update (String newId ,String id , String name , String salary , String department , String type , String number , String username , String password) throws SQLException{
        
        DB.connect();
        
        DB.WriteSql("update employee  "
                   + " set id = "+ newId + " , name = '" + name +"' , salary = " + salary + " , department = '" + department +"' , Emp_type = '"+ type +"' , number = '"+number+"' , user_name = '"+ username +"' , user_password = '"+password+"' \n"
                   + "where id = " + id);
        
       
        DB.closeConnection();
    }
}
