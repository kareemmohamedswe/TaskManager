
package Database;

import Pages.TaskPage;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Task {

// the Task atributes
private String  code,emp_id, mng_id,p_id,title,describtion,phase,start_date,end_date ,status;
private final DatabaseConnection DB = new DatabaseConnection();
// empty task constructor
public Task(){}

// Task constructor
public Task(String code,String emp_id,String mng_id,String p_id,String title,String describtion,String phase,String start_date,String end_date ,String status)
{
    this.code= code;
    this.emp_id=emp_id;
    this.mng_id=mng_id;
    this.p_id=p_id;
    this.title=title;
    this.describtion=describtion;
    this.phase=phase;
    this.start_date=start_date;
    this.end_date=end_date;
    this.status=status;
}


    public String getStatus() {
        return status;
    }

// setter and getter methods
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getMng_id() {
        return mng_id;
    }

    public void setMng_id(String mng_id) {
        this.mng_id = mng_id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
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

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    
        ///* Task methods *///
    //---------------------//
    
    // first method in wich you can add Task data in the data base
    public void addTask (String code,String emp_id,String mng_id,String p_id,String title,String describtion,String phase,String start_date,String end_date , String status )
    {
        try {
                
                DB.connect();
                DB.WriteSql("insert into task (code,emp_id,mng_id,p_id,title,describtion,phase,start_date,end_date , status) values (" +  code  + " , " + emp_id  +" , "+  mng_id + " , " +p_id+ ", '" + title + "'" + "," + "'" + describtion + "' , '" + phase + "' , '"+ start_date +"' , '" +end_date+"' , '"+ status +"' );");
                DB.closeConnection();
                JOptionPane.showMessageDialog(new TaskPage(),"the data insert sucssesfully");
                
            } catch (SQLException aa) {
                JOptionPane.showMessageDialog(new TaskPage(),aa.getMessage());
            }
    }
    
    
    
    // second method to Delete the data of one Task
    public void deleteTask (String code) throws SQLException{
        
        DB.connect();
        DB.WriteSql("DELETE FROM task WHERE code = "+ code + " ; ");
        DB.closeConnection();
        
    }
    
    
    
    // third method to update the data of Task
    public void updateTask (String newCode , String code,String emp_id,String mng_id,String p_id,String title,String describtion,String phase,String start_date,String end_date,String status ) throws SQLException
    { 
        DB.connect();
        
        DB.WriteSql("update task  "
                   + "set code = "+ newCode + " , emp_id = " + emp_id +" , mng_id = " + mng_id + " , p_id = " + p_id +" , title = '"+ title +"' , describtion = '"+describtion+"' , phase = '"+ phase +"' , start_date = '"+start_date+"' , end_date = '"+end_date+ "' , status = '"+status+"' \n"
                   + "where code = "+code);
        
       
        DB.closeConnection();
    }
}



