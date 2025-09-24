
package StmtApps;

import DB.DBConnection;
import gympackage.gym;
import javax.swing.JOptionPane;
import userpack.userpage;


public class REGISTRATION extends javax.swing.JFrame {

   
    public REGISTRATION() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        userlogin = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adminlogin = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(102, 153, 255)));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userlogin.setClosable(true);
        userlogin.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        userlogin.setIconifiable(true);
        userlogin.setMaximizable(true);
        userlogin.setResizable(true);
        userlogin.setTitle("User Login");
        userlogin.setVisible(false);
        userlogin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StmtApps/63713518-3d-rendering-metal-dumbbell-with-gym-background.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 97));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setText("USER ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel4.setText("PASSWORD");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, 20));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 190, 34));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 190, 33));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 80, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StmtApps/MusclePumpTraining.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 280));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel6.setText("You’re only one workout away from a good mood");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 380, -1));

        userlogin.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 390));

        jPanel1.add(userlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, 420));

        adminlogin.setClosable(true);
        adminlogin.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        adminlogin.setIconifiable(true);
        adminlogin.setMaximizable(true);
        adminlogin.setResizable(true);
        adminlogin.setTitle("ADMIN LOG IN");
        adminlogin.setVisible(false);
        adminlogin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StmtApps/Dumbbell-STACK.jpg"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 87));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StmtApps/fitness-girl-computer-wallpaper-hd-61771-63608-hd-wallpapers.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, 234, 234));

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel11.setText("ADMIN ID");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 137, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel12.setText("PASSWORD");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 133, 150, 28));
        jPanel4.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 181, 150, 30));

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jButton7.setText("SUBMIT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jButton8.setText("NEXT");
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 100, -1));

        jLabel13.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jLabel13.setText("“Don’t count the days, make the days count\"");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 370, -1));

        adminlogin.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 380));

        jPanel1.add(adminlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 530, 410));

        jButton17.setBackground(new java.awt.Color(204, 204, 0));
        jButton17.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jButton17.setText("USER LOGIN");
        jButton17.setBorder(new javax.swing.border.MatteBorder(null));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 180, 30));

        jButton19.setBackground(new java.awt.Color(204, 204, 0));
        jButton19.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jButton19.setText("ADMIN LOGIN");
        jButton19.setBorder(new javax.swing.border.MatteBorder(null));
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton19MouseEntered(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 200, 30));
        jButton19.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StmtApps/16821.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1630, 820));

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 780));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -120, 1368, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
       String user=jTextField1.getText();
       String password=jPasswordField1.getText();
       DBConnection db=new DBConnection();
       db.pstmt=db.con.prepareStatement("select * from  userpage where user_id=? and password=?");
       db.pstmt.setString(1, user);
       db.pstmt.setString(2,password);
       db.rst=db.pstmt.executeQuery();
       if(db.rst.next())
       {
         setVisible(false);
        userpage U=new userpage();
         
           U.setVisible(true);
       }
       else
           JOptionPane.showMessageDialog(this,"invalid user or password");
       jTextField1.setText("");
       jPasswordField1.setText("");
      }
           
    
       
      
       catch(Exception e)
       {
e.printStackTrace();
       }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      try{
       String admin=jTextField3.getText();
       String password=jPasswordField3.getText();
       DBConnection db=new DBConnection();
       db.pstmt=db.con.prepareStatement("select * from  adminpage where admin_id=? and password=?");
       db.pstmt.setString(1,admin);
       db.pstmt.setString(2,password);
       db.rst=db.pstmt.executeQuery();
       if(db.rst.next())
       {setVisible(false);
         gym g=new gym();
         
           g.setVisible(true);
           
       }
       else
           JOptionPane.showMessageDialog(this,"invalid user or password");
       jTextField1.setText("");
       jPasswordField1.setText("");
      
      db.con.close();
db.rst.close();
db.pstmt.close();
}
       catch(Exception e)
       {
e.printStackTrace();
       }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
userlogin.setVisible(true); 
adminlogin.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
userlogin.setVisible(false);
        adminlogin.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseEntered


    }//GEN-LAST:event_jButton19MouseEntered

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRATION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame adminlogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JInternalFrame userlogin;
    // End of variables declaration//GEN-END:variables
}
