/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Attendance {
    
    private String id , name , date, time ;
    private final Date Date = new Date(); 
    private final SimpleDateFormat Time = new SimpleDateFormat("hh : mm a");
    private final SimpleDateFormat DATE = new SimpleDateFormat("dd / MM / yyyy");
    private final DatabaseConnection DB = new DatabaseConnection();

    public Attendance (){}
    
    public Attendance (String id , String name , String date , String time)
    {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time =time;
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

    // setter and getter methods
    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 
    
    //  methods of attenadance class
    
    public void attend (String name , String id) throws SQLException{
        DB.connect();
        DB.WriteSql("insert into attendance (emp_id , emp_name , attendance_time , attendance_date ) "
                + "values ( '"+id + " ' , '"+ name + "' , '" + DATE.format(Date) + "' , '" + Time.format(Date) + "' )");
        DB.closeConnection();
    }
    
    
    
     
    
    
    
    
    
}
