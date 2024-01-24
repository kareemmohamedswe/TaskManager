package Pages;

import Database.Customer;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerPage extends JFrame {

    // Creates new form AddCustomer
    public CustomerPage() {
        initComponents();
        showData();
        this.setTitle("Customers");
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
        cstNumber = new javax.swing.JTextField();
        cstId = new javax.swing.JTextField();
        cstName = new javax.swing.JTextField();
        cstAddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cstTable = new javax.swing.JTable();
        updateCst = new javax.swing.JButton();
        addCst = new javax.swing.JButton();
        deleteCst = new javax.swing.JButton();
        searchCst = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address");

        jLabel3.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Number");

        cstNumber.setBackground(new java.awt.Color(204, 204, 204));

        cstId.setBackground(new java.awt.Color(204, 204, 204));

        cstName.setBackground(new java.awt.Color(204, 204, 204));

        cstAddress.setBackground(new java.awt.Color(204, 204, 204));
        cstAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstAddressActionPerformed(evt);
            }
        });

        cstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Number", "Address"
            }
        ));
        cstTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cstTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cstTable);

        updateCst.setBackground(new java.awt.Color(0, 102, 102));
        updateCst.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateCst.setForeground(new java.awt.Color(255, 255, 255));
        updateCst.setText("UBDATE");
        updateCst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCstActionPerformed(evt);
            }
        });

        addCst.setBackground(new java.awt.Color(0, 102, 102));
        addCst.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addCst.setForeground(new java.awt.Color(255, 255, 255));
        addCst.setText("ADD");
        addCst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCstActionPerformed(evt);
            }
        });

        deleteCst.setBackground(new java.awt.Color(0, 102, 102));
        deleteCst.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deleteCst.setForeground(new java.awt.Color(255, 255, 255));
        deleteCst.setText("DELETE");
        deleteCst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCstActionPerformed(evt);
            }
        });

        searchCst.setBackground(new java.awt.Color(0, 102, 102));
        searchCst.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchCst.setForeground(new java.awt.Color(255, 255, 255));
        searchCst.setText("SEARCH");
        searchCst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCstActionPerformed(evt);
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

        Refresh.setBackground(new java.awt.Color(0, 102, 102));
        Refresh.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Refresh.setForeground(new java.awt.Color(255, 255, 255));
        Refresh.setText("REFRESH");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
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
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cstName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cstId, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cstAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchCst, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateCst, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteCst, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(cstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cstId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cstAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateCst, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCst, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCst, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCst, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // show the data in the customer table
    private void showData() {
        try {
            Statement DB;
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "");
            DB = c.createStatement();
            ResultSet r = DB.executeQuery("select * from customers");
            DefaultTableModel tb = (DefaultTableModel) cstTable.getModel();
            Object[] data = new Object[4];
            int count = tb.getRowCount();
            for (int i = count - 1; i >= 0; i--) {
                tb.removeRow(i);
            }

            while (r.next()) {

                // storing all the data from the result set to array list
                cstdata.add(new Customer(
                        r.getString("cst_id"),
                        r.getString("cst_name"),
                        r.getString("cst_address"),
                        r.getString("cst_number")));
            }

            // get all the data from arraylist to the table model to show 
            for (int i = 0; i < cstdata.size(); i++) {
                data[0] = cstdata.get(i).getCst_id();
                data[1] = cstdata.get(i).getCst_name();
                data[2] = cstdata.get(i).getCst_number();
                data[3] = cstdata.get(i).getCst_address();

                tb.addRow(data);
            }
            
        } catch (SQLException aa) {
            JOptionPane.showMessageDialog(this, aa.getMessage());
        }

    }


    private void cstAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstAddressActionPerformed

    }//GEN-LAST:event_cstAddressActionPerformed

    // add the cusomer data to customer table in the data base
    private void addCstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCstActionPerformed
        if (evt.getSource() == addCst) {
            cst.addCustomer(cstId.getText(), cstName.getText(), cstAddress.getText(), cstNumber.getText());
            this.dispose();
            new CustomerPage().setVisible(true);
        }

    }//GEN-LAST:event_addCstActionPerformed

    // search on the cusomer data based on customer id
    private void searchCstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCstActionPerformed
        if (evt.getSource() == Refresh) {
            cstdata.clear();
            
            // delete the table rows to show the new rows
            DefaultTableModel tb = (DefaultTableModel) cstTable.getModel();
            int rows = tb.getRowCount();
            for (int i = rows - 1; i >= 0; i--) {tb.removeRow(i);}

            // get the Employee data from database based on the id
            try {
                Statement DB;
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager", "root", "");
                DB = c.createStatement();

                ResultSet r = DB.executeQuery("select * from customers where id = " + cstId.getText());

                Object[] data = new Object[8];

                while (r.next()) {
                    // storing all the data from the result set to array list 
                    cstdata.add(new Customer(
                            r.getString("cst_id"),
                            r.getString("cst_name"),
                            r.getString("cst_address"),
                            r.getString("cst_number")));
                }

                // get all the data from arraylist to the table model to show 
                for (int i = 0; i < cstdata.size(); i++) {
                    data[0] = cstdata.get(i).getCst_id();
                    data[1] = cstdata.get(i).getCst_name();
                    data[2] = cstdata.get(i).getCst_number();
                    data[3] = cstdata.get(i).getCst_address();

                    tb.addRow(data);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

        }
    }//GEN-LAST:event_searchCstActionPerformed

    // back to the previous bage
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (evt.getSource() == back) {
            if (AdminHome.Type.equalsIgnoreCase("admin")) {this.dispose(); new AdminHome().setVisible(true);}
            else if (AdminHome.Type.equalsIgnoreCase("employee")) {this.dispose(); new EmployeeHome().setVisible(true);}
            
        }

    }//GEN-LAST:event_backActionPerformed


    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        this.dispose();
        new CustomerPage().setVisible(true);
    }//GEN-LAST:event_RefreshActionPerformed

    // update the cusomer data to customer table in the data base
    private void updateCstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCstActionPerformed
        if (evt.getSource() == updateCst) {
            try {
                cst.updateCustomer(cstId.getText(), cstdata.get(selectedrow).getCst_id(), cstName.getText(), cstAddress.getText(), cstNumber.getText());
                JOptionPane.showMessageDialog(this, "Customer : " + cstdata.get(selectedrow).getCst_name() + " updated Succesfully ");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            this.dispose();
            new CustomerPage().setVisible(true);
        }
    }//GEN-LAST:event_updateCstActionPerformed

    // delete the cusomer data to customer table in the data base
    private void deleteCstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCstActionPerformed
        if (evt.getSource() == deleteCst) {
            try {
                cst.deleteCustomer(cstdata.get(selectedrow).getCst_id());
                JOptionPane.showMessageDialog(this, " Customer : " + cstdata.get(selectedrow).getCst_name() + " Deleted Succesfully");
                this.dispose();
                new CustomerPage().setVisible(true);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_deleteCstActionPerformed

    //get the selected row data 
    private void cstTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cstTableMouseClicked
        if (evt.getSource() == cstTable) {
            selectedrow = cstTable.getSelectedRow();
            cstName.setText(cstdata.get(selectedrow).getCst_name());
            cstId.setText(cstdata.get(selectedrow).getCst_id());
            cstNumber.setText(cstdata.get(selectedrow).getCst_number());
            cstAddress.setText(cstdata.get(selectedrow).getCst_address());
        }
    }//GEN-LAST:event_cstTableMouseClicked

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CustomerPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JButton addCst;
    private javax.swing.JButton back;
    private javax.swing.JTextField cstAddress;
    private javax.swing.JTextField cstId;
    private javax.swing.JTextField cstName;
    private javax.swing.JTextField cstNumber;
    private javax.swing.JTable cstTable;
    private javax.swing.JButton deleteCst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchCst;
    private javax.swing.JButton updateCst;
    // End of variables declaration//GEN-END:variables
    private final Customer cst = new Customer();
    private final ArrayList<Customer> cstdata = new ArrayList();
    private int selectedrow;
}
