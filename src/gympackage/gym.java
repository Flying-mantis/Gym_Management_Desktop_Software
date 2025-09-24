package gympackage;

import DB.DBConnection;
import PrintPackage.JComponentVista;
import StmtApps.REGISTRATION;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Vector;
import javax.swing.JOptionPane;
public class gym extends javax.swing.JFrame {
   int invc=0;
String uid="Shiv";
    public gym() {
    initComponents();
    uid="111";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        adminpage = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        admindetail = new javax.swing.JInternalFrame();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jTextField17 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        changepassword = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        employeeregistration = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        designation = new javax.swing.JInternalFrame();
        jPanel11 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        equipmentdetail = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        medicinein = new javax.swing.JInternalFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        purchasemed = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        purchaseequipment = new javax.swing.JInternalFrame();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        medicineout = new javax.swing.JInternalFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        passcode = new javax.swing.JInternalFrame();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        salemedicines = new javax.swing.JInternalFrame();
        jPanel10 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        manager = new javax.swing.JInternalFrame();
        jPanel15 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        storemanager = new javax.swing.JInternalFrame();
        jPanel16 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        trainer = new javax.swing.JInternalFrame();
        jPanel17 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        sweeper = new javax.swing.JInternalFrame();
        jPanel18 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        invioce = new javax.swing.JInternalFrame();
        jPanel19 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminpage.setTitle("ADMIN PAGE");
        adminpage.setVisible(true);
        adminpage.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admindetail.setClosable(true);
        admindetail.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        admindetail.setIconifiable(true);
        admindetail.setMaximizable(true);
        admindetail.setResizable(true);
        admindetail.setTitle("ADMIIN DETAIL");
        admindetail.setVisible(false);
        admindetail.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(0, 153, 153));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StmtApps/hd-wallpapers-desktop-8226iznzu-4s-1366x768 - Copy.jpg"))); // NOI18N
        admindetail.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 744, 69));

        jLabel27.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel27.setText("NAME");
        admindetail.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel28.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel28.setText("FATHER'S NAME");
        admindetail.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel29.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel29.setText("NATIONALITY");
        admindetail.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel30.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel30.setText("MOBILE NUMBER");
        admindetail.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel31.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel31.setText("EMAIL ADDRESS");
        admindetail.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel32.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel32.setText("SEX");
        admindetail.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel33.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel33.setText("MARITAL STATUS");
        admindetail.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel34.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel34.setText("DATE OF BIRTH");
        admindetail.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel35.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel35.setText("ADDRESS");
        admindetail.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        admindetail.getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 380, 30));
        admindetail.getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 380, -1));
        admindetail.getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 380, -1));
        admindetail.getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 380, -1));
        admindetail.getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 380, -1));

        jRadioButton5.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jRadioButton5.setText("MALE");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        admindetail.getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jRadioButton6.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jRadioButton6.setText("FEMALE");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        admindetail.getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jRadioButton7.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jRadioButton7.setText("SINGLE");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        admindetail.getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jRadioButton8.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jRadioButton8.setText("MARRID");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        admindetail.getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));
        admindetail.getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 390, -1));

        jButton11.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jButton11.setText("SUBMIT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        admindetail.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        jButton12.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jButton12.setText("CANCEL");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        admindetail.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));
        admindetail.getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 400, 80));

        jPanel1.add(admindetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 760, 530));

        changepassword.setClosable(true);
        changepassword.setIconifiable(true);
        changepassword.setMaximizable(true);
        changepassword.setResizable(true);
        changepassword.setTitle("CHANGE PASSWORD");
        changepassword.setVisible(false);
        changepassword.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/fitness-club-or-gym-logo-with-strong-illustration_csp54902425.jpg"))); // NOI18N
        changepassword.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel3.setText("Old Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel4.setText("New Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel5.setText("Confirm Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 30));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 200, 30));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 200, 30));

        changepassword.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 390, 210));

        jPanel1.add(changepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 410, 340));

        employeeregistration.setClosable(true);
        employeeregistration.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        employeeregistration.setIconifiable(true);
        employeeregistration.setMaximizable(true);
        employeeregistration.setResizable(true);
        employeeregistration.setTitle("EMPLOYEE REGISTRATION");
        employeeregistration.setVisible(false);
        employeeregistration.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StmtApps/International-Personal-Training-Banner1.jpg"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel9.setText("NAME");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel14.setText("FATHER'S NAME");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel15.setText("NATIONALITY");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel16.setText("MOBILE NO");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel17.setText("EMAIL ADDRESS");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel18.setText("SEX");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel19.setText("MARITAL STATUS");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel20.setText("DATE OF BIRTH");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 310, 30));
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 310, -1));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 310, -1));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 310, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 310, -1));

        jRadioButton1.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jRadioButton1.setText("MALE");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jRadioButton2.setText("FEMALE");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jRadioButton3.setText("SINGLE");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jRadioButton4.setText("MARRID");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 320, -1));

        jLabel21.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel21.setText("REGISTRATION DATE");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 320, 30));

        jButton5.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jButton5.setText("SUBMIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        jButton6.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jButton6.setText("CANCEL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 90, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel7.setText("ADDRESS");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 320, 80));

        jButton3.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jButton3.setText("GENERATE PASSCODE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel12.setText("POST");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "manager", "store manager", "tariner", "sweeper" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 320, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel1.setText("SALARY");
        jLabel1.setToolTipText("");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, 20));
        jPanel3.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 320, 30));

        employeeregistration.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 560));

        jPanel1.add(employeeregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 730, 570));

        designation.setClosable(true);
        designation.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        designation.setIconifiable(true);
        designation.setMaximizable(true);
        designation.setResizable(true);
        designation.setTitle("DEGIGNATION");
        designation.setVisible(false);

        jPanel11.setBackground(new java.awt.Color(255, 204, 255));

        jLabel36.setBackground(new java.awt.Color(102, 0, 102));
        jLabel36.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel36.setText("MANAGER");

        jButton4.setFont(new java.awt.Font("Lucida Fax", 3, 24)); // NOI18N
        jButton4.setText("KNOW ABOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(54, 54, 54))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 153, 204));

        jLabel37.setBackground(new java.awt.Color(51, 0, 51));
        jLabel37.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel37.setText("STORE MANAGER");

        jPanel13.setBackground(new java.awt.Color(255, 153, 153));

        jLabel38.setBackground(new java.awt.Color(51, 0, 51));
        jLabel38.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel38.setText("TRAINER");

        jPanel14.setBackground(new java.awt.Color(204, 153, 255));

        jLabel39.setBackground(new java.awt.Color(51, 0, 51));
        jLabel39.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel39.setText("SWEEPER");

        jButton13.setFont(new java.awt.Font("Lucida Fax", 3, 24)); // NOI18N
        jButton13.setText("KNOW ABOUT");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addGap(46, 46, 46))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13))
                .addGap(23, 23, 23))
        );

        jButton8.setFont(new java.awt.Font("Lucida Fax", 3, 24)); // NOI18N
        jButton8.setText("KNOW ABOUT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(44, 44, 44))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(29, 29, 29)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton7.setFont(new java.awt.Font("Lucida Fax", 3, 24)); // NOI18N
        jButton7.setText("KNOW ABOUT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(47, 47, 47))
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(29, 29, 29)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton14.setBackground(new java.awt.Color(255, 102, 255));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(51, 0, 51));
        jButton14.setText("CANCEL");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout designationLayout = new javax.swing.GroupLayout(designation.getContentPane());
        designation.getContentPane().setLayout(designationLayout);
        designationLayout.setHorizontalGroup(
            designationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(designationLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jButton14)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        designationLayout.setVerticalGroup(
            designationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(designationLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 900, 550));

        equipmentdetail.setClosable(true);
        equipmentdetail.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        equipmentdetail.setResizable(true);
        equipmentdetail.setTitle("GYM EQUIPMENT");
        equipmentdetail.setVisible(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel95.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 0, 0));
        jLabel95.setText("-: EQUIPMENT DETAIL :-");
        jPanel6.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel96.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 0, 0));
        jLabel96.setText("NAME OF EQUIPMENT");
        jPanel6.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jTextField42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField42KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField42KeyTyped(evt);
            }
        });
        jPanel6.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 280, 30));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable8);

        jPanel6.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 850, 450));

        javax.swing.GroupLayout equipmentdetailLayout = new javax.swing.GroupLayout(equipmentdetail.getContentPane());
        equipmentdetail.getContentPane().setLayout(equipmentdetailLayout);
        equipmentdetailLayout.setHorizontalGroup(
            equipmentdetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        equipmentdetailLayout.setVerticalGroup(
            equipmentdetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(equipmentdetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 860, 590));

        medicinein.setClosable(true);
        medicinein.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        medicinein.setIconifiable(true);
        medicinein.setMaximizable(true);
        medicinein.setResizable(true);
        medicinein.setTitle("MEDICINES  STOCK IN");
        medicinein.setVisible(false);
        medicinein.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        medicinein.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/slide-1-1.jpg"))); // NOI18N
        medicinein.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 685, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        medicinein.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 680, 390));

        jPanel1.add(medicinein, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 700, 510));

        purchasemed.setClosable(true);
        purchasemed.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        purchasemed.setIconifiable(true);
        purchasemed.setMaximizable(true);
        purchasemed.setResizable(true);
        purchasemed.setTitle("PURCHASE ITEM");
        purchasemed.setVisible(false);
        purchasemed.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel48.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 204, 102));
        jLabel48.setText("MADICINE NAME");

        jLabel49.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 204, 102));
        jLabel49.setText("MADICINE PRICE");

        jLabel50.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 204, 102));
        jLabel50.setText("QUANTITY");

        jLabel51.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 204, 102));
        jLabel51.setText("CELL NO");
        jLabel51.setToolTipText("");

        jLabel52.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 204, 103));
        jLabel52.setText("MANUFACTURING DATE");

        jLabel53.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 204, 104));
        jLabel53.setText("EXPIRY DATE");

        jLabel54.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 204, 103));
        jLabel54.setText("REORDER LEVEL");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel53)
                    .addComponent(jLabel52)
                    .addComponent(jLabel51)
                    .addComponent(jLabel50)
                    .addComponent(jLabel49)
                    .addComponent(jLabel48))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel48)
                .addGap(36, 36, 36)
                .addComponent(jLabel49)
                .addGap(38, 38, 38)
                .addComponent(jLabel50)
                .addGap(45, 45, 45)
                .addComponent(jLabel51)
                .addGap(41, 41, 41)
                .addComponent(jLabel52)
                .addGap(38, 38, 38)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(29, 29, 29))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 400));
        jPanel4.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 330, -1));
        jPanel4.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 330, -1));
        jPanel4.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 330, -1));
        jPanel4.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 330, -1));
        jPanel4.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 330, -1));

        jLabel55.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel55.setText("DD");
        jPanel4.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel56.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel56.setText("MM");
        jPanel4.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jLabel57.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel57.setText("YYYY");
        jPanel4.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jLabel58.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel58.setText("DD");
        jPanel4.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jLabel59.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel59.setText("MM");
        jPanel4.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        jLabel60.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel60.setText("YYYY");
        jPanel4.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel4.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013" }));
        jPanel4.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));
        jPanel4.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel4.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(51, 51, 0));
        jButton19.setText("ADD");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(51, 51, 0));
        jButton20.setText("CANCEL");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        purchasemed.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 720, 420));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/banner_products.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        purchasemed.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        jPanel1.add(purchasemed, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 740, 530));

        purchaseequipment.setClosable(true);
        purchaseequipment.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        purchaseequipment.setIconifiable(true);
        purchaseequipment.setMaximizable(true);
        purchaseequipment.setResizable(true);
        purchaseequipment.setTitle("Purchase Equipment");
        purchaseequipment.setVisible(false);
        purchaseequipment.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel89.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 0));
        jLabel89.setText("PURCHASE EQUIPMENT");
        purchaseequipment.getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel90.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 0, 0));
        jLabel90.setText("EQUIPMENT NAME");
        purchaseequipment.getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel91.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 0, 0));
        jLabel91.setText("EQUIPMENT COST");
        purchaseequipment.getContentPane().add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel92.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 0, 0));
        jLabel92.setText("MODEL NUMBER");
        purchaseequipment.getContentPane().add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel93.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 0, 0));
        jLabel93.setText("QUANTITY");
        purchaseequipment.getContentPane().add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel94.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 0, 0));
        jLabel94.setText("DISCRIPTION");
        purchaseequipment.getContentPane().add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));
        purchaseequipment.getContentPane().add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 300, 30));
        purchaseequipment.getContentPane().add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 300, 30));
        purchaseequipment.getContentPane().add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 300, 30));
        purchaseequipment.getContentPane().add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 300, 30));
        purchaseequipment.getContentPane().add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 300, 30));

        jButton25.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(204, 0, 0));
        jButton25.setText("SUBMIT");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        purchaseequipment.getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        jButton26.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jButton26.setForeground(new java.awt.Color(204, 0, 0));
        jButton26.setText("CANCEL");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        purchaseequipment.getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.jpg"))); // NOI18N
        purchaseequipment.getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        jPanel1.add(purchaseequipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 820, 530));

        medicineout.setClosable(true);
        medicineout.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        medicineout.setIconifiable(true);
        medicineout.setMaximizable(true);
        medicineout.setResizable(true);
        medicineout.setTitle("MEDICINE OUT");
        medicineout.setVisible(false);
        medicineout.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/join-banner - Copy.jpg"))); // NOI18N
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel9.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 610, 350));

        medicineout.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        jPanel1.add(medicineout, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 640, 480));

        passcode.setClosable(true);
        passcode.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        passcode.setIconifiable(true);
        passcode.setMaximizable(true);
        passcode.setResizable(true);
        passcode.setTitle("PASCODE");
        passcode.setVisible(false);
        passcode.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StmtApps/Aloft-London-Excel-Docklands-Gym.jpg"))); // NOI18N
        passcode.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 451, -1));

        jLabel23.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel23.setText("USER NAME");
        passcode.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 93, -1, -1));

        jLabel24.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel24.setText("PASSWORD");
        passcode.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 146, -1, -1));
        passcode.getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 89, 220, 28));
        passcode.getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 142, 220, 29));

        jLabel25.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel25.setText("CONFERM PASSWORD");
        passcode.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 205, -1, -1));
        passcode.getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 201, 217, 29));

        jButton9.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jButton9.setText("REGISTER");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        passcode.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 259, -1, -1));

        jButton10.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jButton10.setText("CANCEL");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        passcode.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 259, -1, -1));

        jPanel1.add(passcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 470, 330));

        salemedicines.setClosable(true);
        salemedicines.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        salemedicines.setTitle("SALE MEDICINES");
        salemedicines.setVisible(false);
        salemedicines.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(204, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 51));
        jLabel97.setText("CELL NUMBER");
        jPanel10.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, -1));

        jLabel62.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 204, 51));
        jLabel62.setText("SALE MEDICINES");
        jPanel10.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel63.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 0));
        jLabel63.setText("MEDICINE NAME");
        jPanel10.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel64.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 51));
        jLabel64.setText("MEDICINE PRICE");
        jPanel10.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel65.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 51));
        jLabel65.setText("MEDICINE QUANTITY");
        jPanel10.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel66.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 51));
        jLabel66.setText("EXPIRY DATE");
        jPanel10.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel67.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 51));
        jLabel67.setText("MANUFACTURING DATE");
        jPanel10.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel68.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 51));
        jLabel68.setText("CUSTOMER NAME");
        jPanel10.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel69.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 51));
        jLabel69.setText("CUSTOMER MOBILE NO");
        jPanel10.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));
        jPanel10.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 280, 30));
        jPanel10.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 280, -1));
        jPanel10.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 280, -1));
        jPanel10.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 290, 30));
        jPanel10.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 290, -1));
        jPanel10.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 290, -1));

        jTextField37.setBackground(new java.awt.Color(240, 240, 240));
        jPanel10.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 290, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 280, -1));

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 0, 102));
        jButton21.setText("BUY NOW");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 0, 102));
        jButton22.setText("GENERATE BILL");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 0, 102));
        jButton23.setText("CANCEL");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/456.jpg"))); // NOI18N
        jPanel10.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 480));

        salemedicines.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jPanel1.add(salemedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 820, 530));

        manager.setClosable(true);
        manager.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        manager.setTitle("manager");
        manager.setVisible(false);

        jPanel15.setBackground(new java.awt.Color(255, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel40.setText("Manager detail");
        jPanel15.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 20, -1, -1));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setText("BACK");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel41.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jLabel41.setText("Search by manager name");
        jLabel41.setToolTipText("");

        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField22KeyReleased(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        javax.swing.GroupLayout managerLayout = new javax.swing.GroupLayout(manager.getContentPane());
        manager.getContentPane().setLayout(managerLayout);
        managerLayout.setHorizontalGroup(
            managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(managerLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel41)
                .addGap(42, 42, 42)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        managerLayout.setVerticalGroup(
            managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
        );

        jPanel1.add(manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 940, 510));

        storemanager.setClosable(true);
        storemanager.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        storemanager.setTitle("Store manager");
        storemanager.setVisible(false);

        jPanel16.setBackground(new java.awt.Color(255, 204, 204));

        jLabel42.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel42.setText("Store Manager detail");

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setText("BACK");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jButton16)
                .addGap(285, 285, 285)
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton16))
        );

        jLabel43.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jLabel43.setText("Search by store manager name");
        jLabel43.setToolTipText("");

        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField23KeyReleased(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout storemanagerLayout = new javax.swing.GroupLayout(storemanager.getContentPane());
        storemanager.getContentPane().setLayout(storemanagerLayout);
        storemanagerLayout.setHorizontalGroup(
            storemanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(storemanagerLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel43)
                .addGap(42, 42, 42)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );
        storemanagerLayout.setVerticalGroup(
            storemanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storemanagerLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(storemanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
        );

        jPanel1.add(storemanager, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 940, 510));

        trainer.setClosable(true);
        trainer.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        trainer.setTitle("Trainer");
        trainer.setVisible(false);

        jPanel17.setBackground(new java.awt.Color(255, 204, 204));

        jLabel44.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel44.setText("Trainer detail");

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setText("BACK");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jButton17)
                .addGap(285, 285, 285)
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton17))
        );

        jLabel45.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jLabel45.setText("Search by Trainer name");
        jLabel45.setToolTipText("");

        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField24KeyReleased(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout trainerLayout = new javax.swing.GroupLayout(trainer.getContentPane());
        trainer.getContentPane().setLayout(trainerLayout);
        trainerLayout.setHorizontalGroup(
            trainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(trainerLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel45)
                .addGap(42, 42, 42)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
            .addComponent(jScrollPane5)
        );
        trainerLayout.setVerticalGroup(
            trainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainerLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(trainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
        );

        jPanel1.add(trainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 940, 510));

        sweeper.setClosable(true);
        sweeper.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        sweeper.setTitle("Sweeper");
        sweeper.setVisible(false);

        jPanel18.setBackground(new java.awt.Color(255, 204, 204));

        jLabel46.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel46.setText("Sweeper detail");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(19, 19, 19))
        );

        jLabel47.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jLabel47.setText("Search by Sweeper name");
        jLabel47.setToolTipText("");

        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField25KeyReleased(evt);
            }
        });

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setText("BACK");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sweeperLayout = new javax.swing.GroupLayout(sweeper.getContentPane());
        sweeper.getContentPane().setLayout(sweeperLayout);
        sweeperLayout.setHorizontalGroup(
            sweeperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sweeperLayout.createSequentialGroup()
                .addComponent(jButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sweeperLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel47)
                .addGap(42, 42, 42)
                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
            .addComponent(jScrollPane6)
        );
        sweeperLayout.setVerticalGroup(
            sweeperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sweeperLayout.createSequentialGroup()
                .addGroup(sweeperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18))
                .addGap(18, 18, 18)
                .addGroup(sweeperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
        );

        jPanel1.add(sweeper, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 940, 510));

        invioce.setClosable(true);
        invioce.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        invioce.setTitle("invoice");
        invioce.setVisible(false);
        invioce.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INVOICE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(51, 0, 153))); // NOI18N
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel70.setText("Company name");
        jPanel19.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel71.setText("GYM MANAGEMENT SYSTEM");
        jPanel19.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel72.setText("Lucknow-206022");
        jPanel19.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel73.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel73.setText("Phone no-8279592138");
        jPanel19.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel74.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel74.setText("Email id-shivamdubey3147@gmail.com");
        jPanel19.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jButton24.setBackground(new java.awt.Color(153, 153, 153));
        jButton24.setText("PRINT");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, -1));

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel75.setText("Customer Name :");
        jPanel20.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel76.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel76.setText("Customer contact no :");
        jPanel20.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel77.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel77.setText("Invoice no :");
        jPanel20.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel78.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel78.setText("Date :");
        jPanel20.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));
        jPanel20.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 28, 130, -1));
        jPanel20.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 10));
        jPanel20.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 110, 10));
        jPanel20.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 110, 10));
        jPanel20.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 180, 20));
        jPanel20.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 180, 10));
        jPanel20.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 120, 10));
        jPanel20.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 120, 10));
        jPanel20.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 190, 20));
        jPanel20.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 190, 20));
        jPanel20.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 130, 20));
        jPanel20.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 120, 20));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 730, 100));

        jLabel83.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel83.setText("Customer Signature");
        jPanel19.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel84.setFont(new java.awt.Font("Lucida Fax", 1, 11)); // NOI18N
        jLabel84.setText("Total Price");
        jPanel19.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        jLabel85.setFont(new java.awt.Font("Lucida Fax", 1, 11)); // NOI18N
        jLabel85.setText("Due Ammount");
        jPanel19.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));
        jPanel19.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 220, 10));
        jPanel19.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 80, 10));
        jPanel19.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 80, 10));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        jPanel19.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 750, 150));

        jLabel86.setFont(new java.awt.Font("Lucida Fax", 1, 11)); // NOI18N
        jLabel86.setText("Total Price");
        jPanel19.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));
        jPanel19.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 394, 100, 20));

        invioce.getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        jPanel1.add(invioce, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 830, 490));

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton27.setText("BACK");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 600, -1, -1));

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 63)); // NOI18N
        jLabel98.setText("Unlock Your");
        jPanel1.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 400, -1));

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 63)); // NOI18N
        jLabel99.setText("Fitness Potiential");
        jPanel1.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 580, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/321.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -12, 1380, 790));

        adminpage.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        jMenu1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jMenu1.setText("Employee detail");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.png"))); // NOI18N
        jMenuItem9.setText("Employee Registration");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jMenu2.setText("Designation");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.png"))); // NOI18N
        jMenuItem10.setText("About designation");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jMenu3.setText("Admin detail");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.png"))); // NOI18N
        jMenuItem8.setText("ADMIN DETAIL");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jMenu4.setText("Gym Eqipment");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.png"))); // NOI18N
        jMenuItem6.setText("purchase equipment");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.png"))); // NOI18N
        jMenuItem7.setText("detail");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jMenu6.setText("Medicines");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.png"))); // NOI18N
        jMenuItem2.setText("PURCHASE MEDICINES");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.png"))); // NOI18N
        jMenuItem3.setText("SALE MEDICINES");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.png"))); // NOI18N
        jMenuItem4.setText("MEDICINES STOCK IN");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.png"))); // NOI18N
        jMenuItem5.setText("MEDICINES STOCK OUT");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu7.setBackground(new java.awt.Color(153, 153, 153));
        jMenu7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jMenu7.setText("Account");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/111.png"))); // NOI18N
        jMenuItem1.setText("CHANGE PASSWORD");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuBar1.add(jMenu7);

        adminpage.setJMenuBar(jMenuBar1);

        jDesktopPane1.add(adminpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
   salemedicines.setVisible(true); 
jComboBox8.removeAllItems();
jComboBox8.addItem("select");
try{
DBConnection db=new DBConnection();
db.pstmt=db.con.prepareStatement("select medicine_name from medicinepur");
db.rst=db.pstmt.executeQuery();
while(db.rst.next())
{
jComboBox8.addItem(db.rst.getString(1));
}
db.pstmt=db.con.prepareStatement("Select max(invc_no)from invoice_detail");
db.rst=db.pstmt.executeQuery();
while(db.rst.next())
{
 invc=db.rst.getInt(1);
invc++;
}
db.con.close();
db.rst.close();
db.pstmt.close();
}
catch(Exception e)
{
e.printStackTrace();
}   // TODO add y
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
admindetail.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
changepassword.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try
        {
        String o_pswd=jTextField1.getText();
        String n_pswd=jTextField2.getText();
        String c_pswd=jTextField3.getText();
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("select * from adminpage where admin_id=? and `Password`=?");
        db.pstmt.setString(1,uid);
        db.pstmt.setString(2,o_pswd);
        db.rst=db.pstmt.executeQuery(); 
                
        if(db.rst.next())
        {
           
            if(n_pswd.equals(c_pswd))
            {
               
                db.pstmt=db.con.prepareStatement("update adminpage set Password=? where admin_id=?");
                db.pstmt.setString(2,uid);
                db.pstmt.setString(1,n_pswd);
                int i=db.pstmt.executeUpdate();
                      
                if(i>0)
                        {
                            JOptionPane.showMessageDialog(this,"Password Updated");
                            changepassword.setVisible(false);
                        }
                        else
                        {
                        JOptionPane.showMessageDialog(this,"ERROR!!!!!!");
                       
                        }
                        }
              else
              {
                        JOptionPane.showMessageDialog(this,"new and conferm password is not match");
                        
               }
                
            } 
        else
        {
                    JOptionPane.showMessageDialog(this,"old password does not match");
        }
        db.con.close();
        db.rst.close();
        db.pstmt.close();
        }   
         
        catch(Exception e)
        {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
  try{
      DBConnection db=new DBConnection();
      Vector<Vector<String>>data=new Vector<Vector<String>>();
      data.removeAllElements();
      Vector<String>header=new Vector<String>();
      header.removeAllElements();
      header.add("Madicine name");
      header.add("Medicine Price");
      header.add("quantity");
      header.add("Expiry date");
      header.add("Manufaturing date");
      header.add("Reorder level");
      String str=jTextField11.getText();
      db.stmt=db.con.createStatement();
      db.rst=db.stmt.executeQuery("select medicine_name,medicine_price,quantity,exp_date,mft_date,r_lev from medicinepur ");
      while(db.rst.next())
      {
          Vector<String>data1=new Vector<String>();
          data1.add(db.rst.getString(1));
          data1.add(db.rst.getString(2));
          data1.add(db.rst.getString(3));
          data1.add(db.rst.getString(4));
          data1.add(db.rst.getString(5));
          data1.add(db.rst.getString(6));
          data1.add("\n");
          data.add(data1);
      }
      jTable1.setModel(new javax.swing.table.DefaultTableModel(data,header));
      medicinein.setVisible(true);
      db.con.close();
      db.rst.close();
      db.stmt.close();
      }
      catch(Exception e)
      {
e.printStackTrace();
              // TODO add your handling code here:
    }                                            
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
  try{
      DBConnection db=new DBConnection();
      Vector<Vector<String>>data=new Vector<Vector<String>>();
      data.removeAllElements();
      Vector<String>header=new Vector<String>();
      header.removeAllElements();
      header.add("row no");
      header.add("Madicine name");
      header.add("Medicine Price");
      header.add("quantity");
      header.add("Expiry date");
      header.add("Manufaturing date");
      header.add("Customer Name");
      header.add("Customer Mob no");
      header.add("Purchasing date");
      String str=jTextField11.getText();
      db.stmt=db.con.createStatement();
      db.rst=db.stmt.executeQuery("select cell_no,medicine_name,medicine_price,quantity,exp_date,mft_date,cus_name,cus_mob,date from medicinesale ");
      while(db.rst.next())
      {
          Vector<String>data1=new Vector<String>();
          data1.add(db.rst.getString(1));
          data1.add(db.rst.getString(2));
          data1.add(db.rst.getString(3));
          data1.add(db.rst.getString(4));
          data1.add(db.rst.getString(5));
          data1.add(db.rst.getString(6));
          data1.add(db.rst.getString(7));
          data1.add(db.rst.getString(8));
           data1.add(db.rst.getString(9));
          data1.add("\n");
          data.add(data1);
      }
      jTable2.setModel(new javax.swing.table.DefaultTableModel(data,header));
      medicineout.setVisible(true);
      db.con.close();
      db.rst.close();
      db.stmt.close();
      }
      catch(Exception e)
      {
e.printStackTrace();
              // TODO add your handling code here:
    }          // TODO add your handling code here:
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
try{

DBConnection db=new DBConnection();
db.pstmt=db.con.prepareStatement("insert into admindetail"+"(name,father,nationality,mobile,email,sex,merital,dob,address)"+"values(?,?,?,?,?,?,?,?,?)");

db.pstmt.setString(1,jTextField12.getText());
db.pstmt.setString(2,jTextField13.getText());
db.pstmt.setString(3,jTextField14.getText());
db.pstmt.setString(4,jTextField15.getText());
db.pstmt.setString(5,jTextField16.getText());
String sex="";
if(jRadioButton5.isSelected())
{
sex="Male";    
}
if(jRadioButton6.isSelected())
{
sex="Female";    
}        
db.pstmt.setString(6,sex); 
String merital="";
if(jRadioButton7.isSelected())
{
merital="Single";    
}
if(jRadioButton8.isSelected())
{
merital="Marrid";    
}
db.pstmt.setString(7,merital); 

db.pstmt.setString(8,jTextField17.getText());
db.pstmt.setString(9,jTextField18.getText());
int i=db.pstmt.executeUpdate();
if(i>0)
{
    JOptionPane.showMessageDialog(this,"submitted Successfully");
    jTextField12.setText("");
    jTextField13.setText("");
    jTextField14.setText("");
    jTextField15.setText("");
    jTextField16.setText("");
     jTextField17.setText("");
     jTextField18.setText("");
     
     
}
else
{
    JOptionPane.showMessageDialog(this,"cannot register");
}

db.con.close();
db.pstmt.close();}
catch(Exception e)
{
    e.printStackTrace();
}
// TODO add your handling code here:
                                            
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
admindetail.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
admindetail.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
  purchasemed.setVisible(false);  
        employeeregistration.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
   employeeregistration.setVisible(false);
        purchasemed.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        employeeregistration.setVisible(false);
        purchasemed.setVisible(false);     // TODO add your handling code here:
        purchaseequipment.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
employeeregistration.setVisible(false);
        
   passcode.setVisible(true);
jTextField19.setText(namee);
    }//GEN-LAST:event_jButton3ActionPerformed
String namee="";
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
try{

DBConnection db=new DBConnection();
db.pstmt=db.con.prepareStatement("insert into empreg(name,father,nationality,mobile,email,sex,marital,dob,regdate,address,post,salary)"+"values(?,?,?,?,?,?,?,?,?,?,?,?)");

db.pstmt.setString(1,jTextField4.getText());
db.pstmt.setString(2,jTextField5.getText());
db.pstmt.setString(3,jTextField6.getText());
db.pstmt.setString(4,jTextField7.getText());
db.pstmt.setString(5,jTextField8.getText());
//
String sex="";
if(jRadioButton1.isSelected())
{
sex="Male";    
}
if(jRadioButton2.isSelected())
{
sex="Female";    
}        
db.pstmt.setString(6,sex); 
String marital="";
if(jRadioButton3.isSelected())
{
marital="Single";    
}
if(jRadioButton4.isSelected())
{
marital="Marrid";    
}
db.pstmt.setString(7,marital); 
db.pstmt.setString(8,jTextField9.getText());
db.pstmt.setString(9,jTextField10.getText());
db.pstmt.setString(10,jTextField11.getText());
String po="";
db.pstmt.setString(11,po);
 
db.pstmt.setString(11,(String)jComboBox1.getSelectedItem());

String sal="";
db.pstmt.setString(12,sal);
   
db.pstmt.setString(12,jTextField21.getText());



int i=db.pstmt.executeUpdate();
if(i>0)
{
    JOptionPane.showMessageDialog(this,"submitted Successfully");
    namee=jTextField4.getText();
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    jTextField8.setText("");
     jTextField9.setText("");
     jTextField10.setText("");
      jTextField11.setText("");
     jTextField21.setText("");
}
else
{
    JOptionPane.showMessageDialog(this,"cannot register");
}

db.con.close();
db.pstmt.close();
}
catch(Exception e)
{
    e.printStackTrace();
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
jRadioButton1.setSelected(true);        // TODO add your handling code here:
jRadioButton2.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
jRadioButton1.setSelected(false);        // TODO add your handling code here:
jRadioButton2.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
jRadioButton3.setSelected(true);        // TODO add your handling code here:
jRadioButton4.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
jRadioButton4.setSelected(true);        // TODO add your handling code here:
jRadioButton3.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
jRadioButton5.setSelected(true);        // TODO add your handling code here:
jRadioButton6.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
jRadioButton6.setSelected(true);        // TODO add your handling code here:
jRadioButton5.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
jRadioButton7.setSelected(true);        // TODO add your handling code here:
jRadioButton8.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
jRadioButton8.setSelected(true);        // TODO add your handling code here:
jRadioButton7.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       try{

DBConnection db=new DBConnection();
db.pstmt=db.con.prepareStatement("insert into userpage"+"(user_id,password,confirm_password)"+"values(?,?,?)");
//db.pstmt=db.con.prepareStatement("insert into pascode"+"(user,password,confirm_password)"+"values(?,?,?)");

db.pstmt.setString(1,jTextField19.getText());
db.pstmt.setString(2,jTextField20.getText());
db.pstmt.setString(3,jPasswordField2.getText());

int i=db.pstmt.executeUpdate();
if(i>0)
{
    JOptionPane.showMessageDialog(this,"submitted Successfully");
    jTextField19.setText("");
    jTextField20.setText("");
    jPasswordField2.setText("");
   
 }
else
{
    JOptionPane.showMessageDialog(this,"cannot submitted");
}

db.con.close();
db.pstmt.close();
}
catch(Exception e)
{
    e.printStackTrace();
}     // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
  designation.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 designation.setVisible(false);
 
        manager.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
  designation.setVisible(false);
        storemanager.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     designation.setVisible(false);
        trainer.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
     designation.setVisible(false);
        sweeper.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
   designation.setVisible(false);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
designation.setVisible(true);  
manager.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
designation.setVisible(true);
storemanager.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
designation.setVisible(true); 
trainer.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
designation.setVisible(true); 
 sweeper.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
employeeregistration.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
passcode.setVisible(false); 
employeeregistration.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField22KeyReleased

try{
      DBConnection db=new DBConnection();
    
      Vector<Vector<String>>data=new Vector<Vector<String>>();
         data.removeAllElements();
      Vector<String>header=new Vector<String>();
      header.removeAllElements();
     
      header.add("Manager name");
       header.add("father's name");
      header.add("Mobile no");
      header.add("email");
      header.add("Address");
      header.add("salary");
      
      String str=jTextField22.getText();
      db.stmt=db.con.createStatement();
      db.rst=db.stmt.executeQuery("SELECT * FROM empreg WHERE post='manager'");
      while(db.rst.next())
      {   Vector<String>data1=new Vector<String>();
          data1.add(db.rst.getString(1));
          data1.add(db.rst.getString(2));
          data1.add(db.rst.getString(4));
          data1.add(db.rst.getString(5));
          data1.add(db.rst.getString(10));
          data1.add(db.rst.getString(12));
             data1.add("\n");
          data.add(data1);
      }
      jTable3.setModel(new javax.swing.table.DefaultTableModel(data,header));
      
      db.con.close();
      db.rst.close();
      db.stmt.close();
      }
      catch(Exception e)
      {
e.printStackTrace();
      }        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22KeyReleased

    private void jTextField23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyReleased
   
try{
      DBConnection db=new DBConnection();
    
      Vector<Vector<String>>data=new Vector<Vector<String>>();
         data.removeAllElements();
      Vector<String>header=new Vector<String>();
      header.removeAllElements();
     
      header.add(" Store Manager name");
       header.add(" father's name");
      header.add("Mobile no");
      header.add("email");
      header.add("Address");
      header.add("salary");
      
      String str=jTextField23.getText();
      db.stmt=db.con.createStatement();
      db.rst=db.stmt.executeQuery("SELECT * FROM empreg WHERE post='store manager'");
      while(db.rst.next())
      {   Vector<String>data1=new Vector<String>();
          data1.add(db.rst.getString(1));
          data1.add(db.rst.getString(2));
          data1.add(db.rst.getString(4));
          data1.add(db.rst.getString(5));
          data1.add(db.rst.getString(10));
           data1.add(db.rst.getString(12));
          
             data1.add("\n");
          data.add(data1);
      }
      jTable4.setModel(new javax.swing.table.DefaultTableModel(data,header));
      
      db.con.close();
      db.rst.close();
      db.stmt.close();
      }
      catch(Exception e)
      {
e.printStackTrace();
      }        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23KeyReleased

    private void jTextField24KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField24KeyReleased

try{
      DBConnection db=new DBConnection();
    
      Vector<Vector<String>>data=new Vector<Vector<String>>();
         data.removeAllElements();
      Vector<String>header=new Vector<String>();
      header.removeAllElements();
     
      header.add("Trainer name");
      header.add("father's name");
      header.add("Mobile no");
      header.add("email");
      header.add("Address");
      header.add("salary");
      
      String str=jTextField24.getText();
      db.stmt=db.con.createStatement();
      db.rst=db.stmt.executeQuery("SELECT * FROM empreg WHERE post='tariner'");
      while(db.rst.next())
      {   Vector<String>data1=new Vector<String>();
          data1.add(db.rst.getString(1));
          data1.add(db.rst.getString(2));
          data1.add(db.rst.getString(4));
          data1.add(db.rst.getString(5));
          data1.add(db.rst.getString(10));
             data1.add(db.rst.getString(12));
             data1.add("\n");
          data.add(data1);
      }
      jTable5.setModel(new javax.swing.table.DefaultTableModel(data,header));
      
      db.con.close();
      db.rst.close();
      db.stmt.close();
      }
      catch(Exception e)
      {
e.printStackTrace();
      }        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24KeyReleased

    private void jTextField25KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField25KeyReleased
   
try{
      DBConnection db=new DBConnection();
    
      Vector<Vector<String>>data=new Vector<Vector<String>>();
         data.removeAllElements();
      Vector<String>header=new Vector<String>();
      header.removeAllElements();
     
      header.add("sweeper name");
       header.add("father's name");
      header.add("Mobile no");
      header.add("email");
      header.add("Address");
      header.add("salary");
      
      String str=jTextField25.getText();
      db.stmt=db.con.createStatement();
      db.rst=db.stmt.executeQuery("SELECT * FROM empreg WHERE post='sweeper'");
      while(db.rst.next())
      {   Vector<String>data1=new Vector<String>();
          data1.add(db.rst.getString(1));
          data1.add(db.rst.getString(2));
          data1.add(db.rst.getString(4));
          data1.add(db.rst.getString(5));
          data1.add(db.rst.getString(10));
           data1.add(db.rst.getString(12));
          
             data1.add("\n");
          data.add(data1);
      }
      jTable6.setModel(new javax.swing.table.DefaultTableModel(data,header));
      
      db.con.close();
      db.rst.close();
      db.stmt.close();
      }
      catch(Exception e)
      {
e.printStackTrace();
      }        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25KeyReleased

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
try{
String exp=jComboBox3.getSelectedItem()+":"+jComboBox4.getSelectedItem()+":"+jComboBox6.getSelectedItem();
String mft=jComboBox2.getSelectedItem()+":"+jComboBox7.getSelectedItem()+":"+jComboBox5.getSelectedItem();
DBConnection db=new DBConnection();
db.pstmt=db.con.prepareStatement("insert into medicinepur"+"(medicine_name,medicine_price,cell_no,quantity,exp_date,mft_date,r_lev)"+"values(?,?,?,?,?,?,?)");

db.pstmt.setString(1,jTextField26.getText());
db.pstmt.setString(2,jTextField27.getText());
db.pstmt.setString(4,jTextField28.getText());
db.pstmt.setString(3,jTextField29.getText());
db.pstmt.setString(5,exp);
db.pstmt.setString(6,mft);
db.pstmt.setString(7,jTextField30.getText());
int i=db.pstmt.executeUpdate();
if(i>0)
{
    JOptionPane.showMessageDialog(this,"Madicine added Successfully");
    jTextField26.setText("");
    jTextField27.setText("");
    jTextField28.setText("");
     jComboBox3.setSelectedItem("Select");
     jComboBox4.setSelectedItem("Select");
     jComboBox6.setSelectedItem("Select");
     jComboBox2.setSelectedItem("Select");
     jComboBox7.setSelectedItem("Select");
     jComboBox5.setSelectedItem("Select");
    jTextField29.setText("");
    jTextField30.setText("");
    
}
else
{
    JOptionPane.showMessageDialog(this,"ERROR!!!!!!!!!!!");
}

db.con.close();
db.pstmt.close();}
catch(Exception e)
{
    e.printStackTrace();
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
int st=Integer.parseInt(jTextField33.getText());
try
{
    DBConnection db=new DBConnection();
    
     String nname=(String)jComboBox8.getSelectedItem();
      db.pstmt=db.con.prepareStatement("select quantity from medicinepur where medicine_name='"+nname+"'");
     db.rst=db.pstmt.executeQuery();
    
    if(db.rst.next())
    {
        int st1=db.rst.getInt(1);
        if(st1>st)
        {
            System.out.println("section1");
            int it=st1-st;
            db.pstmt=db.con.prepareStatement("update medicinepur set quantity=? where medicine_name='"+nname+"'");
            db.pstmt.setInt(1,it);
           int i1=db.pstmt.executeUpdate();
           db.pstmt=db.con.prepareStatement("insert into invoice_detail(date,medicine_name,medicine_price,quantity,exp_date,mft_date,cus_name,cus_mob,invc_no)values(curdate(),?,?,?,?,?,?,?,?)");
           db.pstmt.setString(1,nname);
           db.pstmt.setString(2,jTextField32.getText());
           db.pstmt.setString(3,jTextField33.getText());
           db.pstmt.setString(4,jTextField34.getText());
           db.pstmt.setString(5,jTextField35.getText());
           db.pstmt.setString(6,jTextField36.getText());
           db.pstmt.setString(7,jTextField37.getText());
          db.pstmt.setInt(8,invc);
            System.out.println("section2");
             
            int i2=db.pstmt.executeUpdate();
             System.out.println("section20");
    db.pstmt=db.con.prepareStatement("insert into medicinesale(cell_no,medicine_name,medicine_price,quantity,exp_date,mft_date,cus_name,cus_mob,date)values(?,?,?,?,?,?,?,?,curdate())");
    //db.rst=db.pstmt.executeQuery();
    db.pstmt.setString(1,jTextField43.getText());
    db.pstmt.setString(2,nname);
    db.pstmt.setString(3,jTextField32.getText());
    db.pstmt.setString(4,jTextField33.getText());
   db.pstmt.setString(5,jTextField34.getText());
    db.pstmt.setString(6,jTextField35.getText());
    db.pstmt.setString(7,jTextField36.getText());
    db.pstmt.setString(8,jTextField37.getText());
   // db.pstmt.setString(8,date);
     System.out.println("section3");
     int i3=db.pstmt.executeUpdate();
     
      if(jTextField43.getText().equals("") && jTextField26.getText().equals(""))
      {
          JOptionPane.showMessageDialog(this,"plese enter the costomer detail");
      } 
                          else if(i1>0 && i2>0 && i3>0)
                  {
                        JOptionPane.showMessageDialog(this,"Card added successfully");
                      int a1=JOptionPane.showConfirmDialog(this,"do you want to continue ");
                     
                  if(a1==0)
                  {
                
                  jTextField32.setText("");
                  jTextField33.setText("");
                  jTextField34.setText("");
                  jTextField35.setText("");
                  jTextField43.setText("");
                  
                  jComboBox8.setSelectedItem("select");
                  
                  }
                  else 
                      {
                        JOptionPane.showMessageDialog(this,"Please Generate Invoice Bill"); 
                      }
                 }
        
                   else
                  {
                        JOptionPane.showMessageDialog(this,"ERROR!!!!!!!!!!!!!");
                  }
        
                  }    
                   else
                  {
                  JOptionPane.showMessageDialog(this,"Quantity is not avilable");
                  jComboBox8.setSelectedItem("select");
                  jTextField32.setText("");
                  jTextField33.setText("");
                  jTextField34.setText("");
                  jTextField35.setText("");
                 // jTextField36.setText("");
                  //jTextField37.setText("");
                  }
            }
       db.con.close();
db.rst.close();
db.pstmt.close();
}
        catch(Exception e)
                {
                  
                e.printStackTrace();
                }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
     JComponentVista Vista = new JComponentVista(jPanel3, new PageFormat());
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPageable(Vista);
        try {
            if (pj.printDialog()) {
                pj.print();

            }
        } catch (PrinterException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
try{
invioce.setVisible(true);
salemedicines.setVisible(false);
DBConnection db=new DBConnection();
String date=(String)jComboBox8.getSelectedItem();
String con=jTextField12.getText();
Vector<Vector<String>>data=new Vector <Vector<String>>();
data.removeAllElements();
Vector<String>header=new Vector<String>();
header.removeAllElements();
header.add("invoice Number");
header.add("Medicine Name");
header.add("No of items");
header.add("Price");
header.add("Total Price");
db.stmt=db.con.createStatement();
db.rst=db.stmt.executeQuery("select medicine_name,quantity ,medicine_price from invoice_detail where date=curdate() and invc_no='"+invc+"'");
while(db.rst.next())
{
    int qu=db.rst.getInt(2);
    int pr=db.rst.getInt(3);
    int tp=qu*pr;
    Vector<String>data1=new Vector<String>();
    data1.add(String.valueOf(invc));
      data1.add(db.rst.getString(1));
      data1.add(String.valueOf(qu));
      data1.add(String.valueOf(pr));
      data1.add(String.valueOf(tp));
      data.add(data1);
}
jTable7.setModel(new javax.swing.table.DefaultTableModel(data,header) );
db.stmt=db.con.createStatement();
db.rst=db.stmt.executeQuery("select cus_name,cus_mob,invc_no,date from invoice_detail where `date`=curdate() and invc_no='"+invc+"'");
if(db.rst.next())
{
    jLabel79.setText(db.rst.getString(1));
jLabel80.setText(db.rst.getString(2));
jLabel81.setText(String.valueOf(invc));
jLabel82.setText(db.rst.getString(4));
jComboBox8.setSelectedItem("select");
jTextField32.setText("");
jTextField33.setText("");
jTextField34.setText("");
jTextField35.setText("");
jTextField36.setText("");
jTextField37.setText("");

salemedicines.setVisible(false);

}
else{
   invioce.setVisible(false);
    JOptionPane.showMessageDialog(this,"please enter the customer detail");
}
db.con.close();
db.rst.close();
db.stmt.close();
}
catch(Exception e)
{
    e.printStackTrace();
            
}
double sum=0;

for(int p=0;p<jTable7.getRowCount();p++)
{
sum = sum+Double.parseDouble(jTable7.getValueAt(p,4).toString());
}
jLabel87.setText(String.valueOf(sum));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
salemedicines.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
 purchaseequipment.setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
purchasemed.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
changepassword.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
try{
DBConnection db=new DBConnection();
db.pstmt=db.con.prepareStatement("insert into pureqp"+"(eqp_name,eqp_cost,model_no,quantity,discription)"+"values(?,?,?,?,?)");

db.pstmt.setString(1,jTextField31.getText());
db.pstmt.setString(2,jTextField38.getText());
db.pstmt.setString(3,jTextField39.getText());
db.pstmt.setString(4,jTextField40.getText());
db.pstmt.setString(5,jTextField41.getText());
int i=db.pstmt.executeUpdate();
if(i>0)
{
    JOptionPane.showMessageDialog(this,"Successfully added");
    jTextField31.setText("");
    jTextField38.setText("");
    jTextField39.setText("");
    jTextField40.setText("");
    jTextField41.setText("");
    
}
else
{
    JOptionPane.showMessageDialog(this,"ERROR!!!!!!!!!!!");
}

db.con.close();
db.pstmt.close();}
catch(Exception e)
{
    e.printStackTrace();
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jTextField42KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField42KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42KeyTyped

    private void jTextField42KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField42KeyReleased
   equipmentdetail.setVisible(true);
try{
      DBConnection db=new DBConnection();
    
      Vector<Vector<String>>data=new Vector<Vector<String>>();
         data.removeAllElements();
      Vector<String>header=new Vector<String>();
      header.removeAllElements();
      header.add("Equipment name");
      header.add("Equipment cost");
      header.add("Model number");
      header.add("quantity");
      header.add("Discription");
      String str=jTextField42.getText();
      db.stmt=db.con.createStatement();
      db.rst=db.stmt.executeQuery("select eqp_name,eqp_cost,model_no,quantity,discription from pureqp where eqp_name like\'"+str+"%\'order by eqp_name");
      while(db.rst.next())
      {   Vector<String>data1=new Vector<String>();
          data1.add(db.rst.getString(1));
          data1.add(db.rst.getString(2));
          data1.add(db.rst.getString(3));
          data1.add(db.rst.getString(4));
          data1.add(db.rst.getString(5));
          
             data1.add("\n");
          data.add(data1);
      }
      jTable8.setModel(new javax.swing.table.DefaultTableModel(data,header));
      
      db.con.close();
      db.rst.close();
      db.stmt.close();
      }
      catch(Exception e)
      {
e.printStackTrace();
      }        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42KeyReleased

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
 equipmentdetail.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
   // TODO add your handling code here:
    try{
DBConnection db=new DBConnection();
String nname=jComboBox8.getSelectedItem().toString();
db.stmt=db.con.createStatement();
db.rst=db.stmt.executeQuery("select medicine_price,cell_no,quantity,mft_date,exp_date from medicinepur where medicine_name='"+nname+"'");
if(db.rst.next())
{
jTextField32.setText(db.rst.getString(1));
jTextField43.setText(db.rst.getString(2));
//jTextField33.setText(db.rst.getString(3));
jTextField35.setText(db.rst.getString(4));
jTextField34.setText(db.rst.getString(5));
}
db.con.close();
db.rst.close();
db.stmt.close();
}

catch(Exception e)
{
e.printStackTrace();
}
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
 new REGISTRATION().setVisible(true);

  gym g=new gym();
         
           g.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

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
            java.util.logging.Logger.getLogger(gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gym().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame admindetail;
    private javax.swing.JInternalFrame adminpage;
    private javax.swing.JInternalFrame changepassword;
    private javax.swing.JInternalFrame designation;
    private javax.swing.JInternalFrame employeeregistration;
    private javax.swing.JInternalFrame equipmentdetail;
    private javax.swing.JInternalFrame invioce;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    public javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JInternalFrame manager;
    private javax.swing.JInternalFrame medicinein;
    private javax.swing.JInternalFrame medicineout;
    private javax.swing.JInternalFrame passcode;
    private javax.swing.JInternalFrame purchaseequipment;
    private javax.swing.JInternalFrame purchasemed;
    private javax.swing.JInternalFrame salemedicines;
    private javax.swing.JInternalFrame storemanager;
    private javax.swing.JInternalFrame sweeper;
    private javax.swing.JInternalFrame trainer;
    // End of variables declaration//GEN-END:variables
}
