
package Database;

import Pages.ProjectPage;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Project {

// all the class project atributes
private String department , id , title , describtion , cstId;
private final DatabaseConnection DB = new DatabaseConnection ();



// project constructor

public Project(){}

public Project(String department , String id , String title , String describtion , String cstId ){
    this.cstId=cstId;
    this.department=department;
    this.describtion = describtion;
    this.id=id;
}



// setter and getter
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public String getCstId() {
        return cstId;
    }

    public void setCstId(String cstId) {
        this.cstId = cstId;
    }


    
 // project methods 
    
 // first method in wich you can add project data in the data base
 public void addProject (String id , String cstId , String describtion , String department , String title ) 
    {
        try {
                
                DB.connect();
                DB.WriteSql("insert into project (id, cstid , title , department ,describtion) values (" +  id  + " , " + cstId  + " , '" + title + "' , " + "'" + department + "'" + "," + "'" + describtion + "' );");
                DB.closeConnection();
                JOptionPane.showMessageDialog(new ProjectPage(),"the data insert sucssesfully");
                
            } catch (SQLException aa) {
                JOptionPane.showMessageDialog(new ProjectPage(),aa.getMessage());
            }
    }
    
    
    
 // second method to Delete the data of one project
 public void deleteProject (String ID) throws SQLException{
        
        DatabaseConnection con = new DatabaseConnection();
        con.connect();
        con.WriteSql("DELETE FROM project WHERE id = "+ ID + " ; ");
        con.closeConnection();
        
    }
    
    
 // third method to update the project data
 public void ubdateProject (String newId ,String id , String cstId , String describtion , String department , String title ) throws SQLException
{
        DB.connect();
        
        DB.WriteSql("update project "
                   + " set id = "+ newId +" , department = '" + department +"' , describtion = '"+ describtion +"' , title = '"+title+"' \n"
                   + "where id = " + id);
        
       
        DB.closeConnection();
  }


}



