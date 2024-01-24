
package Pages;

import Database.Requests;
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


public class AssignedRequests extends javax.swing.JFrame {

    /*** Creates new form AssignedRequests ***/
    public AssignedRequests() {
        initComponents();
        showData();
        this.setTitle("Reequests");
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        approve = new javax.swing.JButton();
        disapprove = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DATE", "TIME", "REASON", "ID", "EMP_NAME", "EMP_ID", "STATUS"
            }
        ));
        requestsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(requestsTable);
        if (requestsTable.getColumnModel().getColumnCount() > 0) {
            requestsTable.getColumnModel().getColumn(2).setMinWidth(300);
            requestsTable.getColumnModel().getColumn(3).setMinWidth(30);
            requestsTable.getColumnModel().getColumn(6).setMinWidth(50);
        }

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
        disapprove.setText("Disapprove");
        disapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disapproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(disapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
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

    
   // show the data in the customer table
    private void showData() {
        try {
            Statement DB;
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "");
            DB = c.createStatement();
            ResultSet r = DB.executeQuery("select * from requests");
            Object[] data = new Object[7];
            DefaultTableModel tb = (DefaultTableModel) requestsTable.getModel();
            int count = tb.getRowCount();
            for (int i = count - 1; i >= 0; i--) {
                tb.removeRow(i);
            }

            while (r.next()) {

                // storing all the data from the result set to array list
                list.add(new Requests(
                        r.getString("id"),
                        r.getString("emp_id"),
                        r.getString("emp_name"),
                        r.getString("reason"),
                        r.getString("date"),
                        r.getString("time"),
                        r.getString("status")));
            }

            // get all the data from arraylist to the table model to show 
            for (int i = 0; i < list.size(); i++) {
                data[0] = list.get(i).getDate();
                data[1] = list.get(i).getTime();
                data[2] = list.get(i).getReason();
                data[3] = list.get(i).getId();
                data[4] = list.get(i).getEmp_name();
                data[5] = list.get(i).getEmp_id();
                data[6] = list.get(i).getStatus();

                tb.addRow(data);
            }
            
        } catch (SQLException aa) {
            JOptionPane.showMessageDialog(this, aa.getMessage());
        }

    }



    private void requestsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestsTableMouseClicked
        if (evt.getSource() == requestsTable){
            selectedrow = requestsTable.getSelectedRow();
        }
    }//GEN-LAST:event_requestsTableMouseClicked

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        if (evt.getSource() == approve){
            try {
                request.approve(list.get(selectedrow).getId());
                JOptionPane.showMessageDialog(this, "The request is approved");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_approveActionPerformed

    private void disapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disapproveActionPerformed
        if (evt.getSource() == disapprove){
            try {
                request.disapprove(list.get(selectedrow).getId());
                JOptionPane.showMessageDialog(this, "The request is disapproved");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_disapproveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (evt.getSource() == back){
            this.dispose();
            new AdminHome().setVisible(true);
        }
    }//GEN-LAST:event_backActionPerformed


    
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AssignedRequests().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve;
    private javax.swing.JButton back;
    private javax.swing.JButton disapprove;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestsTable;
    // End of variables declaration//GEN-END:variables
    private final ArrayList <Requests> list = new ArrayList <> ();
    private final Requests request = new Requests();
    private int selectedrow  ;
    
}
