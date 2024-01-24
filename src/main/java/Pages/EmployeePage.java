
package Pages;

import Database.Employee;
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


public class EmployeePage extends javax.swing.JFrame {


    public EmployeePage() {

        initComponents();
        ShowData();
        this.setTitle("Employee");
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeedata = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        EmpId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EmpDept = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EmpPass = new javax.swing.JTextField();
        EmpType = new javax.swing.JTextField();
        EmpName = new javax.swing.JTextField();
        EmpNumber = new javax.swing.JTextField();
        EmpUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        EmpSalary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AddEmp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        UpdateEmp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        deleteEmp = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        searchEmp = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        REFRESH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        employeedata.setBorder(new javax.swing.border.MatteBorder(null));
        employeedata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Number", "Salary", "Department", "Type", "username", "password"
            }
        ));
        employeedata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeedataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeedata);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Number");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Type");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        AddEmp.setBackground(new java.awt.Color(0, 102, 102));
        AddEmp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AddEmp.setForeground(new java.awt.Color(255, 255, 255));
        AddEmp.setText("ADD");
        AddEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Salary");

        UpdateEmp.setBackground(new java.awt.Color(0, 102, 102));
        UpdateEmp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UpdateEmp.setForeground(new java.awt.Color(255, 255, 255));
        UpdateEmp.setText("UPDATE");
        UpdateEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmpActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        deleteEmp.setBackground(new java.awt.Color(0, 102, 102));
        deleteEmp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deleteEmp.setForeground(new java.awt.Color(255, 255, 255));
        deleteEmp.setText("DELETE");
        deleteEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmpActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("department");

        searchEmp.setBackground(new java.awt.Color(0, 102, 102));
        searchEmp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchEmp.setForeground(new java.awt.Color(255, 255, 255));
        searchEmp.setText("SEARCH");
        searchEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmpActionPerformed(evt);
            }
        });

        BACK.setBackground(new java.awt.Color(0, 102, 102));
        BACK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BACK.setForeground(new java.awt.Color(255, 255, 255));
        BACK.setText("BACK");
        BACK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        REFRESH.setBackground(new java.awt.Color(0, 102, 102));
        REFRESH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        REFRESH.setForeground(new java.awt.Color(255, 255, 255));
        REFRESH.setText("REFRESH");
        REFRESH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(309, 309, 309)))
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EmpSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmpNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpDept, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpPass, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpType, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(searchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(REFRESH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpSalary)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmpName)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpDept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(EmpType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REFRESH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // method to show the  data of Employee in table
    public final void ShowData() {
        try {
            Statement DB;
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "");
            DB = c.createStatement();
            ResultSet r = DB.executeQuery("select * from employee ");
            DefaultTableModel empdata = (DefaultTableModel) employeedata.getModel();
            Object [] data = new Object[8];
            
            while (r.next()) {
                // storing all the data from the result set to array list 
                emp1.add(new Employee(
                        r.getString("name"),
                        r.getString("number"),
                        r.getString("emp_type"),
                        r.getString("department"),
                        r.getString("id"),
                        r.getString("salary"),
                        r.getString("user_name"),
                        r.getString("user_password")));
            }
            // get all the data from arraylist to the table model to show 
            for (int i = 0; i < emp1.size(); i++) {
                data[0] = emp1.get(i).getId();
                data[1] = emp1.get(i).getName();
                data[2] = emp1.get(i).getNumber();
                data[3] = emp1.get(i).getSalary();
                data[4] = emp1.get(i).getDepartment();
                data[5] = emp1.get(i).getType();
                data[6] = emp1.get(i).getUsername();
                data[7] = emp1.get(i).getPassword();
                empdata.addRow(data);
            }
        } catch (SQLException aa) {
            JOptionPane.showMessageDialog(this, aa.getMessage());
        }
    }

    
    // add the Employee data by clicking on the add button 
    private void AddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpActionPerformed
        if (evt.getSource() == AddEmp) {

            emp.add(
                    EmpId.getText(),
                    EmpName.getText(),
                    EmpSalary.getText(),
                    EmpDept.getText(),
                    EmpType.getText(),
                    EmpNumber.getText(),
                    EmpUsername.getText(),
                    EmpPass.getText()
            );

            this.dispose();
            EmployeePage x = new EmployeePage();
            x.setVisible(true);
        }
    }//GEN-LAST:event_AddEmpActionPerformed

    
    //  update the Employee data by clicking on update button
    private void UpdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmpActionPerformed
        if (evt.getSource() == UpdateEmp) {

            try {
                emp.update(
                        EmpId.getText(),
                        emp1.get(selectedrow).getId(),
                        EmpName.getText(),
                        EmpSalary.getText(),
                        EmpDept.getText(),
                        EmpType.getText(),
                        EmpNumber.getText(),
                        EmpUsername.getText(),
                        EmpPass.getText());

                JOptionPane.showMessageDialog(this, "the emplyee whose name = " + emp1.get(selectedrow).getName() + " updated succesfully");
                this.dispose();
                EmployeePage x = new EmployeePage();
                x.setVisible(true);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }

    }//GEN-LAST:event_UpdateEmpActionPerformed

    
    // method to delete Employee by click on the eployee row and press delete button
    private void deleteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmpActionPerformed

        if (evt.getSource() == deleteEmp) {
            try {
                emp.delete(emp1.get(selectedrow).getId());
                JOptionPane.showMessageDialog(this, "the employee whose id = " + emp1.get(selectedrow).getId() + "is deleted succesfully");
                this.dispose();
                EmployeePage x = new EmployeePage();
                x.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(EmployeePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteEmpActionPerformed

    
    // when click on the row in the table the data showed in the text fields
    private void employeedataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeedataMouseClicked

        if (evt.getSource() == employeedata) {
            selectedrow = employeedata.getSelectedRow();
            EmpName.setText(emp1.get(selectedrow).getName());
            EmpId.setText(emp1.get(selectedrow).getId());
            EmpType.setText(emp1.get(selectedrow).getType());
            EmpSalary.setText(emp1.get(selectedrow).getSalary());
            EmpDept.setText(emp1.get(selectedrow).getDepartment());
            EmpNumber.setText(emp1.get(selectedrow).getNumber());
            EmpUsername.setText(emp1.get(selectedrow).getUsername());
            EmpPass.setText(emp1.get(selectedrow).getPassword());

        }


    }//GEN-LAST:event_employeedataMouseClicked

    
   //search on Employee based on his ID
    private void searchEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmpActionPerformed
        if (evt.getSource() == searchEmp){
           emp1.clear();
            // delete the table rows to show the new rows
            DefaultTableModel tb = (DefaultTableModel) employeedata.getModel();
            int rows = tb.getRowCount();
            for (int i = rows-1 ; i >= 0 ; i--){
                tb.removeRow(i);
            }
            
            // get the Employee data from database based on the id
            try {
                Statement DB;
                 Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "");
                DB = c.createStatement();
                
                ResultSet r = DB.executeQuery("select * from employee where id = " + EmpId.getText());
                
                Object[] data = new Object[8];
            
            while (r.next()) {
                // storing all the data from the result set to array list 
                emp1.add(new Employee(
                        r.getString("name"),
                        r.getString("number"),
                        r.getString("emp_type"),
                        r.getString("department"),
                        r.getString("id"),
                        r.getString("salary"),
                        r.getString("user_name"),
                        r.getString("user_password")));
            }
            
            // get all the data from arraylist to the table model to show 
            for (int i = 0; i < emp1.size(); i++) {
                data[0] = emp1.get(i).getId();
                data[1] = emp1.get(i).getName();
                data[2] = emp1.get(i).getNumber();
                data[3] = emp1.get(i).getSalary();
                data[4] = emp1.get(i).getDepartment();
                data[5] = emp1.get(i).getType();
                data[6] = emp1.get(i).getUsername();
                data[7] = emp1.get(i).getPassword();
                tb.addRow(data);
            }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this , ex.getMessage());
            }
            
        }
    }//GEN-LAST:event_searchEmpActionPerformed

    
    //back to --> AdminHome
    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        this.dispose();
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_BACKActionPerformed

    
    // refresh the current page
    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESHActionPerformed
        this.dispose();
        new EmployeePage().setVisible(true);
    }//GEN-LAST:event_REFRESHActionPerformed

    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            EmployeePage emp2 = new EmployeePage();
            emp2.setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmp;
    private javax.swing.JButton BACK;
    private javax.swing.JTextField EmpDept;
    private javax.swing.JTextField EmpId;
    private javax.swing.JTextField EmpName;
    private javax.swing.JTextField EmpNumber;
    private javax.swing.JTextField EmpPass;
    private javax.swing.JTextField EmpSalary;
    private javax.swing.JTextField EmpType;
    private javax.swing.JTextField EmpUsername;
    private javax.swing.JButton REFRESH;
    private javax.swing.JButton UpdateEmp;
    private javax.swing.JButton deleteEmp;
    private javax.swing.JTable employeedata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchEmp;
    // End of variables declaration//GEN-END:variables
    public int selectedrow;
    public ArrayList<Employee> emp1 = new ArrayList<>();
    public Employee emp = new Employee();
}
