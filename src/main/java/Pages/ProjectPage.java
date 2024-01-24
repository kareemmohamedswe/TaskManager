

package Pages;

import Database.Project;
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


public class ProjectPage extends javax.swing.JFrame {

    
    public ProjectPage() {
        initComponents();
        this.setTitle("Projects");
        ShowData();
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cstId = new javax.swing.JTextField();
        pId = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        dscribtion = new javax.swing.JTextField();
        dept = new javax.swing.JComboBox<>();
        addProject = new javax.swing.JButton();
        deleteProject = new javax.swing.JButton();
        updateProject = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectTable = new javax.swing.JTable();
        searchProject = new javax.swing.JButton();
        back = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Describtion");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("title");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DEPT.");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Project ID");

        cstId.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cstId.setBorder(null);
        cstId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstIdActionPerformed(evt);
            }
        });

        pId.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pId.setBorder(null);

        title.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        title.setBorder(null);

        dscribtion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        dscribtion.setBorder(null);

        dept.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SWE", "IS", "CS" }));
        dept.setBorder(null);
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });

        addProject.setBackground(new java.awt.Color(0, 102, 102));
        addProject.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addProject.setForeground(new java.awt.Color(255, 255, 255));
        addProject.setText("ADD");
        addProject.setBorder(null);
        addProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjectActionPerformed(evt);
            }
        });

        deleteProject.setBackground(new java.awt.Color(0, 102, 102));
        deleteProject.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deleteProject.setForeground(new java.awt.Color(255, 255, 255));
        deleteProject.setText("DELETE");
        deleteProject.setBorder(null);
        deleteProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProjectActionPerformed(evt);
            }
        });

        updateProject.setBackground(new java.awt.Color(0, 102, 102));
        updateProject.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateProject.setForeground(new java.awt.Color(255, 255, 255));
        updateProject.setText("UPDATE");
        updateProject.setBorder(null);
        updateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProjectActionPerformed(evt);
            }
        });

        projectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "TITLE", "DESCRIBTION", "DEPT.", "CST_ID"
            }
        ));
        projectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(projectTable);
        if (projectTable.getColumnModel().getColumnCount() > 0) {
            projectTable.getColumnModel().getColumn(2).setMinWidth(300);
        }

        searchProject.setBackground(new java.awt.Color(0, 102, 102));
        searchProject.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchProject.setForeground(new java.awt.Color(255, 255, 255));
        searchProject.setText("SEARCH");
        searchProject.setBorder(null);
        searchProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProjectActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(0, 102, 102));
        refresh.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("REFRESH");
        refresh.setBorder(null);
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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cstId, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(41, 41, 41)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dscribtion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addProject, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateProject, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteProject, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchProject, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cstId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dscribtion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateProject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    // method to show the  data of Employee in table
    public final void ShowData() {
        try {
            Statement DB;
            try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "")) {
                DB = c.createStatement();
                ResultSet r = DB.executeQuery("select * from project");
                DefaultTableModel tb = (DefaultTableModel) projectTable.getModel();
                Object [] data = new Object[5];
                int count = tb.getRowCount();
                for (int i = count-1 ; i>=0 ; i--){tb.removeRow(i);}
                while (r.next()) {
                    // storing all the data from the result set to array list
                    projectList.add(new Project(
                            r.getString("department"),
                            r.getString("id"),
                            r.getString("title"),
                            r.getString("describtion"),
                            r.getString("cstId")));
                }
                // get all the data from arraylist to the table model to show
                for (int i = 0; i < projectList.size(); i++) {
                    data[0] = projectList.get(i).getId();
                    data[1] = projectList.get(i).getTitle();
                    data[2] = projectList.get(i).getDescribtion();
                    data[3] = projectList.get(i).getDepartment();
                    data[4] = projectList.get(i).getCstId();
                    
                    tb.addRow(data);
                }
                DB.close(); c.close();
            }
        } catch (SQLException aa) {
            JOptionPane.showMessageDialog(this, aa.getMessage());
        }
    }

    private void cstIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cstIdActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptActionPerformed

    private void addProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProjectActionPerformed
        if(evt.getSource() == addProject){
            project.addProject(pId.getText(),
                cstId.getText(),
                dscribtion.getText(),
                (String)dept.getSelectedItem(),
                title.getText());
            this.dispose();
            new ProjectPage().setVisible(true);
        }
        
    }//GEN-LAST:event_addProjectActionPerformed

    private void deleteProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProjectActionPerformed
       if (evt.getSource() == deleteProject){
           try {
            project.deleteProject(projectList.get(selectedrow).getId());
            JOptionPane.showMessageDialog(this, "Project : "+projectList.get(selectedrow).getId()+" Deleted Succesfully ");
            this.dispose();
            new ProjectPage().setVisible(true);
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
       }
        
    }//GEN-LAST:event_deleteProjectActionPerformed

    private void projectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTableMouseClicked
        if (evt.getSource() == projectTable){
            selectedrow = projectTable.getSelectedRow();
                pId.setText(projectList.get(selectedrow).getId());
                cstId.setText(projectList.get(selectedrow).getCstId());
                dscribtion.setText(projectList.get(selectedrow).getDescribtion());
                title.setText(projectList.get(selectedrow).getTitle());
        }
    }//GEN-LAST:event_projectTableMouseClicked

    private void searchProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProjectActionPerformed
 if (evt.getSource() == searchProject){
           projectList.clear();
            // delete the table rows to show the new rows
            DefaultTableModel tb = (DefaultTableModel) projectTable.getModel();
            int rows = tb.getRowCount();
            for (int i = rows-1 ; i >= 0 ; i--){
                tb.removeRow(i);
            }
            
            // get the Employee data from database based on the id
            try {
                Statement DB;
               try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "")) {
                   DB = c.createStatement();
                   
                   ResultSet r = DB.executeQuery("select * from project where id = " + pId.getText());
                   
                   Object[] data = new Object[5];
                   
                   while (r.next()) {
                       // storing all the data from the result set to array list
                       projectList.add(new Project(r.getString("department"),
                               r.getString("id"),
                               r.getString("title"),
                               r.getString("describtion"),
                               r.getString("cstId")));
                   }
                   
                   // get all the data from arraylist to the table model to show
                   for (int i = 0; i < projectList.size(); i++) {
                       data[0] = projectList.get(i).getId();
                       data[1] = projectList.get(i).getTitle();
                       data[2] = projectList.get(i).getDescribtion();
                       data[3] = projectList.get(i).getDepartment();
                       data[4] = projectList.get(i).getCstId();
                       
                       tb.addRow(data);
                   }
                   DB.close();
               }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this , ex.getMessage());
            }
            
        }
    }                                         

    
    //back to --> AdminHome
    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {                                     
       
    }//GEN-LAST:event_searchProjectActionPerformed

    private void updateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProjectActionPerformed

        if (evt.getSource() == updateProject){
            try {
                project.ubdateProject(
                        pId.getText(),
                        projectList.get(selectedrow).getId(),
                        cstId.getText(),
                        dscribtion.getText(),
                        (String) dept.getSelectedItem(),
                        title.getText());
                        JOptionPane.showMessageDialog(this, "Project : "+projectList.get(selectedrow).getId()+" Updated Succesfully ");
                        this.dispose();
                        new ProjectPage().setVisible(true);                            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_updateProjectActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        if (evt.getSource() == refresh){
            this.dispose();
            new ProjectPage().setVisible(true); }
    }//GEN-LAST:event_refreshActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    if (evt.getSource() == back){
              this.dispose();
        new AdminHome().setVisible(true);
    
        }
        }//GEN-LAST:event_backActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new ProjectPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProject;
    private javax.swing.JButton back;
    private javax.swing.JTextField cstId;
    private javax.swing.JButton deleteProject;
    private javax.swing.JComboBox<String> dept;
    private javax.swing.JTextField dscribtion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pId;
    private javax.swing.JTable projectTable;
    private javax.swing.JButton refresh;
    private javax.swing.JButton searchProject;
    private javax.swing.JTextField title;
    private javax.swing.JButton updateProject;
    // End of variables declaration//GEN-END:variables
    public int selectedrow;
    public ArrayList<Project> projectList = new ArrayList<>();
    public Project project = new Project();
}
