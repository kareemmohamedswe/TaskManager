
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


public class RequestsPage extends javax.swing.JFrame {


    public RequestsPage() {
        initComponents();
        this . setTitle("Requests");
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BACK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        BACK.setBackground(new java.awt.Color(0, 102, 102));
        BACK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BACK.setForeground(new java.awt.Color(255, 255, 255));
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DATE", "TIME", "REASON", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(requestsTable);
        if (requestsTable.getColumnModel().getColumnCount() > 0) {
            requestsTable.getColumnModel().getColumn(2).setMinWidth(300);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addComponent(BACK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void showData() {
        try {
            Statement DB;
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "");
            DB = c.createStatement();
            ResultSet r = DB.executeQuery("select * from requests where emp_id = " + AdminHome.id);
            Object[] data = new Object[4];
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
                data[3] = list.get(i).getStatus();

                tb.addRow(data);
            }
            
        } catch (SQLException aa) {
            JOptionPane.showMessageDialog(this, aa.getMessage());
        }

    }

    
    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        if (evt.getSource() == BACK){
            this.dispose();
            new AdminHome().setVisible(true);
        }
    }//GEN-LAST:event_BACKActionPerformed

 
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RequestsPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestsTable;
    // End of variables declaration//GEN-END:variables
    private final ArrayList <Requests> list = new ArrayList <> ();
    private final Requests request = new Requests();
}
