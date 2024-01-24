/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Requests {
    
    private String  id,emp_id,emp_name,reason,date,time,status;
    private final Date Date = new Date(); 
    private final SimpleDateFormat Time = new SimpleDateFormat("hh : mm a");
    private final SimpleDateFormat DATE = new SimpleDateFormat("dd / MM / yyyy");
    private final DatabaseConnection DB = new DatabaseConnection();
    
    public Requests (){}
    
    public Requests(String id ,String emp_id, String emp_name, String reason, String date, String time, String status ){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.reason=reason;
        this.status=status;
        this.time=time;
        this.date=date;
        this.id =id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public void addRequest(String emp_id, String emp_name, String reason) throws SQLException{
        DB.connect();
        DB.WriteSql("insert into requests (emp_id,emp_name,reason,date,time)"
                + "values ( " + emp_id  + " , '"+emp_name+"' , '"+reason+"' , '"+DATE.format(Date)+"' , '"+Time.format(Date)+"' );");
        DB.closeConnection();
        
    }
    
    public void approve (String id ) throws SQLException{
        
        DB.connect();
        
        DB.WriteSql("update requests set status = 'Approved' where id = " + id);
        
        DB.closeConnection();
    }

    
    public void disapprove (String id ) throws SQLException{
        
        DB.connect();
        
        DB.WriteSql("update requests set status = 'Disapproved' where id = " + id);
        
        DB.closeConnection();
    }
}
