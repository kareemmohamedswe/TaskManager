
package Pages;

import Database.DatabaseConnection;
import Database.Task;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AssignedTask extends javax.swing.JFrame {

    /*** Creates new form AssignedTas***/
    public AssignedTask()   {
        initComponents();
        this.setTitle("Assigned Tasks");
        try {showAssignedTasks ();} catch (SQLException ex) {Logger.getLogger(AssignedTask.class.getName()).log(Level.SEVERE, null, ex);}
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        assignedTasks = new javax.swing.JTable();
        back = new javax.swing.JButton();
        approve = new javax.swing.JButton();
        disapprove = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        assignedTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "TITLE", "DESCRIBTION", "MNGR_ID", "START", "END", "CODE"
            }
        ));
        jScrollPane1.setViewportView(assignedTasks);
        if (assignedTasks.getColumnModel().getColumnCount() > 0) {
            assignedTasks.getColumnModel().getColumn(1).setMinWidth(280);
        }

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        approve.setBackground(new java.awt.Color(0, 102, 102));
        approve.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        approve.setForeground(new java.awt.Color(255, 255, 255));
        approve.setText("Approve");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });

        disapprove.setBackground(new java.awt.Color(0, 102, 102));
        disapprove.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        disapprove.setForeground(new java.awt.Color(255, 255, 255));
        disapprove.setText("Dissapprove");
        disapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disapproveActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(0, 102, 102));
        refresh.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(disapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // show  the assigned tasks in the Ui task table
    private void showAssignedTasks () throws SQLException
    {
        try{
        
            Statement st;
            try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "")) {
                st = c.createStatement();
                ResultSet r = st.executeQuery("select * from task where emp_id = " + AdminHome.id);
                DefaultTableModel tb = (DefaultTableModel) assignedTasks.getModel();
                Object[] data = new Object[6];
                int count = tb.getRowCount();
                for (int i = count - 1; i >= 0; i--) {tb.removeRow(i);}
                
                while (r.next()) {
                    // storing all the data from the result set to array list
                    assignedTasksList.add(new Task(
                            r.getString("code"),
                            r.getString("emp_id"),
                            r.getString("mng_id"),
                            r.getString("p_id"),
                            r.getString("title"),
                            r.getString("describtion"),
                            r.getString("phase"),
                            r.getString("start_date"),
                            r.getString("end_date"),
                            r.getString("status")));
                }
                
                // get all the data from arraylist to the table model to show
                for (int i = 0; i < assignedTasksList.size(); i++) {
                    data[0] = assignedTasksList.get(i).getTitle();
                    data[1] = assignedTasksList.get(i).getDescribtion();
                    data[2] = assignedTasksList.get(i).getMng_id();
                    data[3] = assignedTasksList.get(i).getStart_date();
                    data[4] = assignedTasksList.get(i).getEnd_date();
                    data[5] = assignedTasksList.get(i).getCode();
                    tb.addRow(data);
                }
                st.close();
            }
        }catch (SQLException ex){JOptionPane.showMessageDialog(this, ex.getMessage());}
                
    }
    
    
    // BACK TO THE EMPLOYEE HOME PAGE
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (evt.getSource() == back){
            this.dispose();
            new EmployeeHome().setVisible(true);
        }
    }//GEN-LAST:event_backActionPerformed

    
    // REFRESH THE CURRENT PAGE
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        if (evt.getSource() == refresh){
            this.dispose(); 
            new  AssignedTask().setVisible(true);
        }
    }//GEN-LAST:event_refreshActionPerformed

    
    // Update the task status in the data base to Approved
    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        
        if (evt.getSource() == approve){
            
            try {
                DB.connect();
                DB.WriteSql("update task set status = 'Approved' where code = " + assignedTasksList.get(selectedrow).getCode());
                JOptionPane.showMessageDialog(this, " The Task is Approved");
            } catch (SQLException ex) { JOptionPane.showMessageDialog(this, ex.getMessage());}
        }
        
    }//GEN-LAST:event_approveActionPerformed

    
    // Update the task status in the data base to Disapprove
    private void disapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disapproveActionPerformed
        
        if (evt.getSource() == disapprove){
            
            try {
                DB.connect();
                DB.WriteSql("update task set status = 'Disapproved' where code = " + assignedTasksList.get(selectedrow).getCode());
                DefaultTableModel tb = (DefaultTableModel) assignedTasks.getModel();
                 JOptionPane.showMessageDialog(this, " The Task is Disapproved");
                this.dispose();
                new AssignedTask().setVisible(true);
            } catch (SQLException ex) { JOptionPane.showMessageDialog(this, ex.getMessage());}
        }
        
    }//GEN-LAST:event_disapproveActionPerformed

   
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AssignedTask().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve;
    private javax.swing.JTable assignedTasks;
    private javax.swing.JButton back;
    private javax.swing.JButton disapprove;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
    private final Database.DatabaseConnection DB = new DatabaseConnection();
    private int selectedrow ;
    private final ArrayList <Task> assignedTasksList = new ArrayList<>();
}
