
package Pages;

import Database.Task;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TaskPage extends javax.swing.JFrame {

    /*** Creates new form AddTask ***/
    public TaskPage() {
        initComponents();
        showTasks();
        this.setTitle("Tasks");
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        empid = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        pID = new javax.swing.JTextField();
        start = new javax.swing.JTextField();
        end = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        dscrb = new javax.swing.JTextField();
        phase = new javax.swing.JComboBox<>();
        addTsk = new javax.swing.JButton();
        deleteTsk = new javax.swing.JButton();
        updateTsk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();
        searchTsk = new javax.swing.JButton();
        back = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Code");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("employee id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Describtion");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("title");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Project id");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("End Date");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Start Date");

        empid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empidActionPerformed(evt);
            }
        });

        phase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "pending", "under work", "done" }));
        phase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phaseActionPerformed(evt);
            }
        });

        addTsk.setBackground(new java.awt.Color(0, 102, 102));
        addTsk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addTsk.setForeground(new java.awt.Color(255, 255, 255));
        addTsk.setText("ADD");
        addTsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTskActionPerformed(evt);
            }
        });

        deleteTsk.setBackground(new java.awt.Color(0, 102, 102));
        deleteTsk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deleteTsk.setForeground(new java.awt.Color(255, 255, 255));
        deleteTsk.setText("DELETE");
        deleteTsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTskActionPerformed(evt);
            }
        });

        updateTsk.setBackground(new java.awt.Color(0, 102, 102));
        updateTsk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateTsk.setForeground(new java.awt.Color(255, 255, 255));
        updateTsk.setText("UPDATE");
        updateTsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTskActionPerformed(evt);
            }
        });

        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "emp id", "project id", "title", "start time", "end time", "Describtion", "phase", "Status", "Code"
            }
        ));
        taskTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taskTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(taskTable);

        searchTsk.setBackground(new java.awt.Color(0, 102, 102));
        searchTsk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchTsk.setForeground(new java.awt.Color(255, 255, 255));
        searchTsk.setText("SEARCH");
        searchTsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTskActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(0, 102, 102));
        refresh.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phase");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(231, 231, 231)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(dscrb, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(219, 219, 219)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(pID))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(end, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(phase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(addTsk, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateTsk, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteTsk, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchTsk, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(636, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dscrb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTsk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateTsk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteTsk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTsk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(507, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // to show all the tasks data in the tasks table 
    private void showTasks (){
        try {
                Statement DB;
                try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "")) {
                DB = c.createStatement();
                ResultSet r = DB.executeQuery("select * from task ;");
                DefaultTableModel tb = (DefaultTableModel) taskTable.getModel();
                Object [] data = new Object[10];
                int count = tb.getRowCount();
                for (int i = count-1 ; i>=0 ; i--){tb.removeRow(i);}
                while (r.next()) {
                    // storing all the data from the result set to array list
                    tasksData.add(new Task(
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
                for (int i = 0; i < tasksData.size(); i++) {
                    data[0] = tasksData.get(i).getEmp_id();
                    data[1] = tasksData.get(i).getP_id();
                    data[2] = tasksData.get(i).getTitle();
                    data[3] = tasksData.get(i).getStart_date();
                    data[4] = tasksData.get(i).getEnd_date();
                    data[5] = tasksData.get(i).getDescribtion();
                    data[6] = tasksData.get(i).getPhase();
                    data[7] = tasksData.get(i).getStatus();
                    data[8] = tasksData.get(i).getCode();
                    data[9] = tasksData.get(i).getStatus();
                    tb.addRow(data);
                }
                DB.close(); c.close();
            }
        } catch (SQLException aa) {
            JOptionPane.showMessageDialog(this, aa.getMessage());
        }
    }

   
    private void phaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phaseActionPerformed

    private void empidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empidActionPerformed

    
    // to add task 
    private void addTskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTskActionPerformed
        if (evt.getSource() == addTsk) {

            task.addTask(code.getText(),
                    empid.getText(),
                    AdminHome.id,
                    pID.getText(),
                    title.getText(),
                    dscrb.getText(),
                    (String) phase.getSelectedItem(),
                    start.getText(),
                    end.getText(),
                    "");
            this.dispose();
            new TaskPage().setVisible(true);
        }
    }//GEN-LAST:event_addTskActionPerformed

    
    // UPDATE TASKS
    private void updateTskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTskActionPerformed
        if (evt.getSource() == updateTsk){
            
            try {
                task.updateTask(code.getText(),
                        tasksData.get(selectedrow).getCode(),
                        empid.getText(),
                        AdminHome.id,
                        pID.getText(),
                        title.getText(),
                        dscrb.getText(),
                        (String) phase.getSelectedItem(),
                        start.getText(),
                        end.getText(),
                        "");
                this.dispose();
            new TaskPage().setVisible(true);
            } catch (SQLException ex) { JOptionPane.showMessageDialog(this, ex.getMessage());}
        }
    }//GEN-LAST:event_updateTskActionPerformed

    
    // GET THE SELECTED ROW AND SHOW ITS DATA
    private void taskTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskTableMouseClicked
        if (evt.getSource() == taskTable) {
            selectedrow = taskTable.getSelectedRow();
            code.setText(tasksData.get(selectedrow).getCode());
            dscrb.setText(tasksData.get(selectedrow).getDescribtion());
            empid.setText(tasksData.get(selectedrow).getEmp_id());
            pID.setText(tasksData.get(selectedrow).getP_id());
            start.setText(tasksData.get(selectedrow).getStart_date());
            title.setText(tasksData.get(selectedrow).getTitle());
            end.setText(tasksData.get(selectedrow).getEnd_date());
        }
    }//GEN-LAST:event_taskTableMouseClicked

    
    // TO DELETE A SELECTED TASK
    private void deleteTskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTskActionPerformed
      if(evt.getSource()== deleteTsk){
          try {
            task.deleteTask(tasksData.get(selectedrow).getCode());
            JOptionPane.showMessageDialog(this, tasksData.get(selectedrow).getCode()+" Deleted succesfully");
        } catch (SQLException ex) {JOptionPane.showMessageDialog(this, ex.getMessage());}
      }
        
    }//GEN-LAST:event_deleteTskActionPerformed

    
    // SEARCH ON TASK DEPEND ON THE TASK CODE
    private void searchTskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTskActionPerformed
     if (evt.getSource() == searchTsk){
           tasksData.clear();
            // delete the table rows to show the new rows
            DefaultTableModel tb = (DefaultTableModel) taskTable.getModel();
            int rows = tb.getRowCount();
            for (int i = rows-1 ; i >= 0 ; i--){
                tb.removeRow(i);
            }
            
            // get the employee data from database based on the id
             try {
            Statement DB;
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "");
            DB = c.createStatement();
            ResultSet r = DB.executeQuery("select * from task where code = " + code.getText());
            Object [] data = new Object[10];
            
            while (r.next()) {
                // storing all the data from the result set to array list 
                tasksData.add(new Task(
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
            for (int i = 0; i < tasksData.size(); i++) {
                data[0] = tasksData.get(i).getEmp_id();
                data[1] = tasksData.get(i).getP_id();
                data[2] = tasksData.get(i).getTitle();
                data[3] = tasksData.get(i).getStart_date();
                data[4] = tasksData.get(i).getEnd_date();
                data[5] = tasksData.get(i).getDescribtion();
                data[6] = tasksData.get(i).getPhase();
                data[7] = tasksData.get(i).getStatus();
                data[8] = tasksData.get(i).getCode();
                data[9] = tasksData.get(i).getStatus();
                tb.addRow(data);
                DB.close(); c.close();
            }
        } catch (SQLException aa) {
            JOptionPane.showMessageDialog(this, aa.getMessage());
        }
     }
    }//GEN-LAST:event_searchTskActionPerformed

    
    // BACK TO THE ADMIN HOME BAGE
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if ( evt.getSource() == back){
            this.dispose();
            new AdminHome().setVisible(true);
        }
    }//GEN-LAST:event_backActionPerformed

    
    // REFRESH THE CURRENT PAGE
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
             this.dispose();
            new TaskPage().setVisible(true);
       
    }//GEN-LAST:event_refreshActionPerformed

    
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TaskPage().setVisible(true);
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTsk;
    private javax.swing.JButton back;
    private javax.swing.JTextField code;
    private javax.swing.JButton deleteTsk;
    private javax.swing.JTextField dscrb;
    private javax.swing.JTextField empid;
    private javax.swing.JTextField end;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pID;
    private javax.swing.JComboBox<String> phase;
    private javax.swing.JButton refresh;
    private javax.swing.JButton searchTsk;
    private javax.swing.JTextField start;
    private javax.swing.JTable taskTable;
    private javax.swing.JTextField title;
    private javax.swing.JButton updateTsk;
    // End of variables declaration//GEN-END:variables
    public  Task task = new Task();
    private int selectedrow;
    private final ArrayList <Task> tasksData = new ArrayList();
}
