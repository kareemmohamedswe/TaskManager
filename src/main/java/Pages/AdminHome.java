
package Pages;

import java.awt.Dimension;
import java.awt.Toolkit;

public final class AdminHome extends javax.swing.JFrame {

    
    public AdminHome() {
        initComponents();
        showLoggerData();
        this.setTitle("Home");
        welcome.setText("WELCOME BACK "+AdminHome.name.toUpperCase());
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        moveTASK = new javax.swing.JButton();
        moveEMP = new javax.swing.JButton();
        moveCST = new javax.swing.JButton();
        moveBack = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Uname = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        Udept = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        Uid = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        moveToCalendar = new javax.swing.JButton();
        moveTorRquest = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        moveTorProject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        moveTASK.setBackground(new java.awt.Color(0, 102, 102));
        moveTASK.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        moveTASK.setForeground(new java.awt.Color(255, 255, 255));
        moveTASK.setText("TASKS");
        moveTASK.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moveTASK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveTASKActionPerformed(evt);
            }
        });

        moveEMP.setBackground(new java.awt.Color(0, 102, 102));
        moveEMP.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        moveEMP.setForeground(new java.awt.Color(255, 255, 255));
        moveEMP.setText("EMPLOYEE");
        moveEMP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moveEMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveEMPActionPerformed(evt);
            }
        });

        moveCST.setBackground(new java.awt.Color(0, 102, 102));
        moveCST.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        moveCST.setForeground(new java.awt.Color(255, 255, 255));
        moveCST.setText("CUSTOMERS");
        moveCST.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moveCST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveCSTActionPerformed(evt);
            }
        });

        moveBack.setBackground(new java.awt.Color(0, 102, 102));
        moveBack.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        moveBack.setForeground(new java.awt.Color(255, 255, 255));
        moveBack.setText("Log out");
        moveBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moveBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBackActionPerformed(evt);
            }
        });

        img.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\TaskManager\\src\\main\\java\\images\\20225040.jpg")); // NOI18N

        Uname.setFont(new java.awt.Font("Font Awesome 5 Free Regular", 1, 14)); // NOI18N
        Uname.setForeground(new java.awt.Color(0, 0, 0));
        Uname.setText("Name : karem mohamed");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Uname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Udept.setFont(new java.awt.Font("Font Awesome 5 Free Regular", 1, 14)); // NOI18N
        Udept.setForeground(new java.awt.Color(0, 0, 0));
        Udept.setText("Dept   SWE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Udept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Udept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Uid.setFont(new java.awt.Font("Font Awesome 5 Free Regular", 1, 14)); // NOI18N
        Uid.setForeground(new java.awt.Color(0, 0, 0));
        Uid.setText("ID      20225040");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Uid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Uid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Task Manager");

        moveToCalendar.setBackground(new java.awt.Color(0, 102, 102));
        moveToCalendar.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        moveToCalendar.setForeground(new java.awt.Color(255, 255, 255));
        moveToCalendar.setText("calendar");
        moveToCalendar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moveToCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToCalendarActionPerformed(evt);
            }
        });

        moveTorRquest.setBackground(new java.awt.Color(0, 102, 102));
        moveTorRquest.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        moveTorRquest.setForeground(new java.awt.Color(255, 255, 255));
        moveTorRquest.setText("Requests");
        moveTorRquest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moveTorRquest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveTorRquestActionPerformed(evt);
            }
        });

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("WELCOME BACK KAREM MOHAMED ");

        moveTorProject.setBackground(new java.awt.Color(0, 102, 102));
        moveTorProject.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        moveTorProject.setForeground(new java.awt.Color(255, 255, 255));
        moveTorProject.setText("projects");
        moveTorProject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moveTorProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveTorProjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(img)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(moveCST, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moveEMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moveTorRquest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moveToCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(moveTASK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moveTorProject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(moveBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moveToCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moveTorRquest, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moveCST, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moveTorProject, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moveEMP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moveTASK, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(moveBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcome))
                .addGap(17, 17, 17))
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

    
    
    public void showLoggerData(){
        img.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\TaskManager\\src\\main\\java\\images\\"+id+".jpg"));
        Udept.setText("Dept   "+dept);
        Uname.setText("Name : "+name);
        Uid.setText("ID      "+id);
    }
    
    private void moveEMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveEMPActionPerformed
        if (evt.getSource() == moveEMP )
        {this.dispose();
         new EmployeePage().setVisible(true);}

    }//GEN-LAST:event_moveEMPActionPerformed

    private void moveTASKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveTASKActionPerformed

        if (evt.getSource() == moveTASK){
            this.dispose();
            new TaskPage().setVisible(true);
        }
    }//GEN-LAST:event_moveTASKActionPerformed

    private void moveCSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveCSTActionPerformed

        this.dispose();
        new CustomerPage().setVisible(true);
    }//GEN-LAST:event_moveCSTActionPerformed

    private void moveBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBackActionPerformed

        this.dispose();
        new Log_in().setVisible(true);
    }//GEN-LAST:event_moveBackActionPerformed

    private void moveToCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToCalendarActionPerformed
        if (evt.getSource() == moveToCalendar){
            this.dispose(); new Calendar().setVisible(true);
        }
    }//GEN-LAST:event_moveToCalendarActionPerformed

    private void moveTorRquestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveTorRquestActionPerformed
        if (evt.getSource() == moveTorRquest){
            this.dispose(); new AssignedRequests().setVisible(true);
        }
    }//GEN-LAST:event_moveTorRquestActionPerformed

    private void moveTorProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveTorProjectActionPerformed
        if(evt.getSource() == moveTorProject){
            this.dispose();
            new ProjectPage().setVisible(true);
        }
    }//GEN-LAST:event_moveTorProjectActionPerformed

    
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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Udept;
    private java.awt.Label Uid;
    private java.awt.Label Uname;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton moveBack;
    private javax.swing.JButton moveCST;
    private javax.swing.JButton moveEMP;
    private javax.swing.JButton moveTASK;
    private javax.swing.JButton moveToCalendar;
    private javax.swing.JButton moveTorProject;
    private javax.swing.JButton moveTorRquest;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
    public static String id , name , dept ,Type ;
}
