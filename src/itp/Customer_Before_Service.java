
package itp;


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Customer_Before_Service extends javax.swing.JInternalFrame {
    Connection con= null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public Customer_Before_Service() {
     
        initComponents();
        con = DBconnect.connect();       
        
        txtCountItems2.setEnabled(false);
        txtCountItems3.setEnabled(false);
        txtCountItems4.setEnabled(false);
        txtCountItems5.setEnabled(false);
        txtCountItems6.setEnabled(false);
        
        txtHF2.setEnabled(false);
        txtHF3.setEnabled(false);
        txtHF4.setEnabled(false);
        txtHF5.setEnabled(false);
        txtHF6.setEnabled(false);
                
        txtCountItems1.setEnabled(false);
        txtHF1.setEnabled(false);
        txtHI1.setEnabled(false);
        txtWF1.setEnabled(false);
        txtWI1.setEnabled(false);
               
        txtHI2.setEnabled(false);
        txtHI3.setEnabled(false);
        txtHI4.setEnabled(false);
        txtHI5.setEnabled(false);
        txtHI6.setEnabled(false);
        
        txtWF2.setEnabled(false);
        txtWF3.setEnabled(false);
        txtWF4.setEnabled(false);
        txtWF5.setEnabled(false);
        txtWF6.setEnabled(false);
        
        txtWI2.setEnabled(false);
        txtWI3.setEnabled(false);
        txtWI4.setEnabled(false);
        txtWI5.setEnabled(false);
        txtWI6.setEnabled(false);
        txtdescr1.setEnabled(false);
        txtdescr2.setEnabled(false);
        txtdescr3.setEnabled(false);
        txtdescr4.setEnabled(false);
        txtdescr5.setEnabled(false);
        txtdescr6.setEnabled(false);
             
            incre();
            table();
         Calendar now = Calendar.getInstance();
          
		int month = now.get(Calendar.MONTH); 
                int date = now.get(Calendar.DATE); 
                int year = now.get(Calendar.YEAR);
                String Date = date + " - " + month + " - " + year;
                lblCDate.setText(Date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        txtTP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        lblSID = new javax.swing.JLabel();
        txtgrpid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmb1 = new javax.swing.JComboBox<>();
        cmb2 = new javax.swing.JComboBox<>();
        cmb3 = new javax.swing.JComboBox<>();
        cmb4 = new javax.swing.JComboBox<>();
        cmb5 = new javax.swing.JComboBox<>();
        cmb6 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtHF1 = new javax.swing.JTextField();
        txtHI1 = new javax.swing.JTextField();
        txtHF2 = new javax.swing.JTextField();
        txtHI2 = new javax.swing.JTextField();
        txtHF3 = new javax.swing.JTextField();
        txtHI3 = new javax.swing.JTextField();
        txtHF4 = new javax.swing.JTextField();
        txtHI4 = new javax.swing.JTextField();
        txtHF5 = new javax.swing.JTextField();
        txtHI5 = new javax.swing.JTextField();
        txtHF6 = new javax.swing.JTextField();
        txtHI6 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtWF1 = new javax.swing.JTextField();
        txtWF2 = new javax.swing.JTextField();
        txtWF3 = new javax.swing.JTextField();
        txtWF4 = new javax.swing.JTextField();
        txtWF5 = new javax.swing.JTextField();
        txtWF6 = new javax.swing.JTextField();
        txtWI1 = new javax.swing.JTextField();
        txtWI2 = new javax.swing.JTextField();
        txtWI3 = new javax.swing.JTextField();
        txtWI4 = new javax.swing.JTextField();
        txtWI5 = new javax.swing.JTextField();
        txtWI6 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtdescr1 = new javax.swing.JTextField();
        txtdescr2 = new javax.swing.JTextField();
        txtdescr3 = new javax.swing.JTextField();
        txtdescr4 = new javax.swing.JTextField();
        txtdescr5 = new javax.swing.JTextField();
        txtdescr6 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCountItems1 = new javax.swing.JTextField();
        txtCountItems2 = new javax.swing.JTextField();
        txtCountItems3 = new javax.swing.JTextField();
        txtCountItems4 = new javax.swing.JTextField();
        txtCountItems5 = new javax.swing.JTextField();
        txtCountItems6 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        lblCDate = new javax.swing.JLabel();

        setTitle("Customer Before Services");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/itp/24.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1050, 640));
        setMinimumSize(new java.awt.Dimension(1050, 640));
        setPreferredSize(new java.awt.Dimension(1050, 640));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(285, 57));
        jPanel1.setMinimumSize(new java.awt.Dimension(285, 57));

        jLabel1.setText("Customer ID   :");

        txtCID.setToolTipText("please enter customer ID here");
        txtCID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIDActionPerformed(evt);
            }
        });
        txtCID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCIDKeyReleased(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 51, 51));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setToolTipText("Search Customer Details");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCID)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(309, 215));
        jPanel2.setMinimumSize(new java.awt.Dimension(309, 215));

        jLabel2.setText("Before Service ID ");

        jLabel3.setText("Service Group ID");

        jLabel4.setText("Customer Name  ");

        jLabel5.setText("Telephone No             ");

        jLabel6.setText("Address                      ");

        txtLName.setEditable(false);
        txtLName.setToolTipText("you cannot edit ");
        txtLName.setEnabled(false);
        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        txtTP.setEditable(false);
        txtTP.setToolTipText("you cannot edit ");
        txtTP.setEnabled(false);

        txtAddress.setEditable(false);
        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        txtAddress.setToolTipText("you cannot edit ");
        txtAddress.setEnabled(false);
        jScrollPane1.setViewportView(txtAddress);

        lblSID.setEnabled(false);

        txtgrpid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgrpidKeyTyped(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(txtgrpid, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtTP)
                                    .addComponent(txtLName)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblSID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtgrpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setMaximumSize(new java.awt.Dimension(126, 222));
        jPanel3.setMinimumSize(new java.awt.Dimension(126, 222));

        jLabel8.setText("Type");

        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Windows", "Doors", "Others" }));
        cmb1.setToolTipText("please select");
        cmb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb1ItemStateChanged(evt);
            }
        });
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });

        cmb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Windows", "Doors", "Others" }));
        cmb2.setToolTipText("please select");
        cmb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb2ActionPerformed(evt);
            }
        });

        cmb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Windows", "Doors", "Others" }));
        cmb3.setToolTipText("please select");
        cmb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb3ActionPerformed(evt);
            }
        });

        cmb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Windows", "Doors", "Others" }));
        cmb4.setToolTipText("please select");
        cmb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb4ActionPerformed(evt);
            }
        });

        cmb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Windows", "Doors", "Others" }));
        cmb5.setToolTipText("please select");
        cmb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb5ActionPerformed(evt);
            }
        });

        cmb6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Windows", "Doors", "Others" }));
        cmb6.setToolTipText("please select");
        cmb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb1, 0, 102, Short.MAX_VALUE)
                    .addComponent(cmb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(cmb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(cmb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(cmb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(cmb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(cmb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(100, 221));
        jPanel5.setMinimumSize(new java.awt.Dimension(100, 221));

        jLabel10.setText("Height");

        jLabel13.setText("Feet");

        jLabel14.setText("Inches");

        txtHF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHF1KeyTyped(evt);
            }
        });

        txtHI1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHI1KeyTyped(evt);
            }
        });

        txtHF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHF2ActionPerformed(evt);
            }
        });
        txtHF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHF2KeyTyped(evt);
            }
        });

        txtHI2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHI2KeyTyped(evt);
            }
        });

        txtHF3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHF3KeyTyped(evt);
            }
        });

        txtHI3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHI3KeyTyped(evt);
            }
        });

        txtHF4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHF4KeyTyped(evt);
            }
        });

        txtHI4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHI4KeyTyped(evt);
            }
        });

        txtHF5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHF5KeyTyped(evt);
            }
        });

        txtHI5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHI5KeyTyped(evt);
            }
        });

        txtHF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHF6ActionPerformed(evt);
            }
        });
        txtHF6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHF6KeyTyped(evt);
            }
        });

        txtHI6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHI6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtHF1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHI1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHF2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHF3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHF4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHF5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHF6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHI3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(txtHI2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(txtHI4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(txtHI5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(txtHI6)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHI5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHI6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(103, 221));
        jPanel6.setMinimumSize(new java.awt.Dimension(103, 221));

        jLabel11.setText("Width");

        jLabel15.setText("Feet");

        jLabel16.setText("Inches");

        txtWF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWF1KeyTyped(evt);
            }
        });

        txtWF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWF2KeyTyped(evt);
            }
        });

        txtWF3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWF3KeyTyped(evt);
            }
        });

        txtWF4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWF4KeyTyped(evt);
            }
        });

        txtWF5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWF5KeyTyped(evt);
            }
        });

        txtWF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWF6ActionPerformed(evt);
            }
        });
        txtWF6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWF6KeyTyped(evt);
            }
        });

        txtWI1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWI1KeyTyped(evt);
            }
        });

        txtWI2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWI2KeyTyped(evt);
            }
        });

        txtWI3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWI3KeyTyped(evt);
            }
        });

        txtWI4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWI4KeyTyped(evt);
            }
        });

        txtWI5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWI5KeyTyped(evt);
            }
        });

        txtWI6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWI6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtWF6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(txtWF5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWF4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWF3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWF2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWF1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtWI1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txtWI2)
                            .addComponent(txtWI3)
                            .addComponent(txtWI4)
                            .addComponent(txtWI5)
                            .addComponent(txtWI6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWI5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWI6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setMaximumSize(new java.awt.Dimension(201, 220));
        jPanel7.setMinimumSize(new java.awt.Dimension(201, 220));

        jLabel12.setText("Descriptions");

        txtdescr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescr6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdescr1)
                    .addComponent(txtdescr2)
                    .addComponent(txtdescr3)
                    .addComponent(txtdescr4)
                    .addComponent(txtdescr5)
                    .addComponent(txtdescr6))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel12)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(30, 30, 30)
                .addComponent(txtdescr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescr4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescr5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescr6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setMaximumSize(new java.awt.Dimension(589, 49));
        jPanel8.setMinimumSize(new java.awt.Dimension(589, 49));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.setToolTipText("Do you want to save records ?");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.setToolTipText("you cannot edit ");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 255));
        jButton1.setText("Demo");
        jButton1.setToolTipText("Demo to test");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.setToolTipText("Do you want to delete records ?");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setMaximumSize(new java.awt.Dimension(80, 221));
        jPanel4.setMinimumSize(new java.awt.Dimension(80, 221));

        jLabel9.setText("No of Items");

        txtCountItems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountItems1ActionPerformed(evt);
            }
        });
        txtCountItems1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountItems1KeyTyped(evt);
            }
        });

        txtCountItems2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountItems2KeyTyped(evt);
            }
        });

        txtCountItems3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountItems3KeyTyped(evt);
            }
        });

        txtCountItems4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountItems4KeyTyped(evt);
            }
        });

        txtCountItems5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountItems5KeyTyped(evt);
            }
        });

        txtCountItems6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountItems6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCountItems6)
                    .addComponent(txtCountItems5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCountItems4)
                    .addComponent(txtCountItems3)
                    .addComponent(txtCountItems2)
                    .addComponent(txtCountItems1)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addComponent(txtCountItems1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCountItems2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCountItems3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCountItems4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCountItems5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCountItems6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "B_Service ID", "Group ID", "Customer ID", "Date", "Type", "No of Items", "Width", "Height", "Description", "Type", "No of Items ", "width ", "height ", "description ", "type ", "no of items ", "width ", "height ", "description ", "type ", "no of items ", "width ", "height ", "description ", "type ", "no of items ", "width ", "height ", "description ", "type ", "no of items ", "width ", "height ", "description "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(jTable4);

        jLabel17.setText("Date");

        lblCDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCDate.setForeground(new java.awt.Color(0, 153, 153));
        lblCDate.setText("jLabel18");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(lblCDate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lblCDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
       
    }//GEN-LAST:event_txtLNameActionPerformed

    
   public void incre() {
                             try {
            
             Connection conn = DBconnect.connect();
               Statement s = conn.createStatement();
             
            rs = s.executeQuery("SELECT * FROM before_service_details");
            while (rs.next()) {

                String ab = rs.getString("b_id");
                int ps = Integer.parseInt(ab);
                int ks = ps+1;
                 String ks1 = String.valueOf(ks);
                 lblSID.setText(ks1);
         }
           
        } catch (Exception e) {
          
            JOptionPane.showMessageDialog(null, " Invalid ID ");
            
        } 
   }
    
    
    private void txtHF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHF2ActionPerformed
        
    }//GEN-LAST:event_txtHF2ActionPerformed

    private void txtHF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHF6ActionPerformed
        
    }//GEN-LAST:event_txtHF6ActionPerformed

    private void txtWF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWF6ActionPerformed
        
    }//GEN-LAST:event_txtWF6ActionPerformed

    private void txtdescr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescr6ActionPerformed
        
    }//GEN-LAST:event_txtdescr6ActionPerformed

    private void txtHF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHF1KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHF1KeyTyped

    private void txtHI1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHI1KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHI1KeyTyped

    private void txtHF2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHF2KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHF2KeyTyped

    private void txtHI2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHI2KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHI2KeyTyped

    private void txtHF3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHF3KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHF3KeyTyped

    private void txtHI3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHI3KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHI3KeyTyped

    private void txtHF4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHF4KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHF4KeyTyped

    private void txtHI4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHI4KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHI4KeyTyped

    private void txtHF5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHF5KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHF5KeyTyped

    private void txtHI5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHI5KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHI5KeyTyped

    private void txtHF6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHF6KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHF6KeyTyped

    private void txtHI6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHI6KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtHI6KeyTyped

    private void txtWF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWF1KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWF1KeyTyped

    private void txtWI1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWI1KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWI1KeyTyped

    private void txtWF2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWF2KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWF2KeyTyped

    private void txtWI2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWI2KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWI2KeyTyped

    private void txtWF3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWF3KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWF3KeyTyped

    private void txtWI3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWI3KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWI3KeyTyped

    private void txtWF4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWF4KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWF4KeyTyped

    private void txtWI4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWI4KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWI4KeyTyped

    private void txtWF5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWF5KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWF5KeyTyped

    private void txtWI5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWI5KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWI5KeyTyped

    private void txtWF6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWF6KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWF6KeyTyped

    private void txtWI6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWI6KeyTyped
          char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtWI6KeyTyped
 public void table() {

        DefaultTableModel dtf = (DefaultTableModel) jTable4.getModel();
        dtf.setRowCount(0);

        try {
                Connection conn = DBconnect.connect();
                Statement s = conn.createStatement();
            
            rs=s.executeQuery("SELECT * FROM before_service_details");

            while (rs.next()) {

                Vector v = new Vector();

                v.add(rs.getString("b_id"));
                v.add(rs.getString("group_no"));
                v.add(rs.getString("customer_id"));
                v.add(rs.getString("dates"));
                v.add(rs.getString("type1"));
                v.add(rs.getString("width1"));
                v.add(rs.getString("height1"));
                v.add(rs.getString("no_of_items1"));
                v.add(rs.getString("description1"));
                v.add(rs.getString("type2"));
                v.add(rs.getString("width2"));
                v.add(rs.getString("height2"));
                v.add(rs.getString("no_of_items2"));
                v.add(rs.getString("description2"));
                v.add(rs.getString("type3"));
                v.add(rs.getString("width3"));
                v.add(rs.getString("height3"));
                v.add(rs.getString("no_of_items3"));                
                v.add(rs.getString("description3"));
                v.add(rs.getString("type4"));
                v.add(rs.getString("width4"));
                v.add(rs.getString("height4"));
                v.add(rs.getString("no_of_items4"));               
                v.add(rs.getString("description4"));
                v.add(rs.getString("type5"));
                v.add(rs.getString("width5"));
                v.add(rs.getString("height5"));
                v.add(rs.getString("no_of_items5"));                
                v.add(rs.getString("description5"));
                v.add(rs.getString("type6"));
                v.add(rs.getString("width6"));
                v.add(rs.getString("height6"));
                v.add(rs.getString("no_of_items6"));               
                v.add(rs.getString("description6"));
                
                
                            
                dtf.addRow(v);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Table load Fail");
        }
    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if(txtCID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Enter ID");
        }
    
            if(txtCID.getText().isEmpty())
        {
            ;
        }
        
        
         try {
            
             Connection conn = DBconnect.connect();
               Statement s = conn.createStatement();
             
            rs = s.executeQuery("SELECT * FROM customer WHERE id='" + txtCID.getText() + "'");
            while (rs.next()) {

                txtLName.setText(rs.getString("last_name"));
                txtTP.setText(rs.getString("contact_number"));
                txtAddress.setText(rs.getString("address_line2"));
         }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Customer ID");
            
        }        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtCountItems1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountItems1KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtCountItems1KeyTyped

    private void txtCountItems2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountItems2KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtCountItems2KeyTyped

    private void txtCountItems3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountItems3KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtCountItems3KeyTyped

    private void txtCountItems4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountItems4KeyTyped
        char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtCountItems4KeyTyped

    private void txtCountItems5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountItems5KeyTyped
        char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtCountItems5KeyTyped

    private void txtCountItems6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountItems6KeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtCountItems6KeyTyped

    private void Reset() {
        txtCID.setText("");

        txtgrpid.setText("");
        txtLName.setText("");
        txtTP.setText("");
        jLabel7.setText("");
        txtAddress.setText("");
        txtCountItems1.setText("");
        txtCountItems2.setText("");
        txtCountItems3.setText("");
        txtCountItems4.setText("");
        txtCountItems5.setText("");
        txtCountItems6.setText("");
        txtHF1.setText("");
        txtHF2.setText("");
        txtHF3.setText("");
        txtHF4.setText("");
        txtHF5.setText("");
        txtHF6.setText("");
        txtHI1.setText("");
        txtHI2.setText("");
        txtHI3.setText("");
        txtHI4.setText("");
        txtHI5.setText("");
        txtHI6.setText("");
        txtWF1.setText("");
        txtWF2.setText("");
        txtWF3.setText("");
        txtWF4.setText("");
        txtWF5.setText("");
        txtWF6.setText("");
        txtWI1.setText("");
        txtWI2.setText("");
        txtWI3.setText("");
        txtWI4.setText("");
        txtWI5.setText("");
        txtWI6.setText("");
        txtdescr1.setText("");
        txtdescr2.setText("");
        txtdescr3.setText("");
        txtdescr4.setText("");
        txtdescr5.setText("");
        txtdescr6.setText("");
        cmb1.setSelectedIndex(0);
        cmb2.setSelectedIndex(0);
        cmb3.setSelectedIndex(0);
        cmb4.setSelectedIndex(0);
        cmb5.setSelectedIndex(0);
        cmb6.setSelectedIndex(0);
        txtCountItems2.setEnabled(false);
        txtCountItems3.setEnabled(false);
        txtCountItems4.setEnabled(false);
        txtCountItems5.setEnabled(false);
        txtCountItems6.setEnabled(false);
        
        txtHF2.setEnabled(false);
        txtHF3.setEnabled(false);
        txtHF4.setEnabled(false);
        txtHF5.setEnabled(false);
        txtHF6.setEnabled(false);
        
        
        txtCountItems1.setEnabled(false);
        txtHF1.setEnabled(false);
        txtHI1.setEnabled(false);
        txtWF1.setEnabled(false);
        txtWI1.setEnabled(false);
        
        
        txtHI2.setEnabled(false);
        txtHI3.setEnabled(false);
        txtHI4.setEnabled(false);
        txtHI5.setEnabled(false);
        txtHI6.setEnabled(false);
        
        txtWF2.setEnabled(false);
        txtWF3.setEnabled(false);
        txtWF4.setEnabled(false);
        txtWF5.setEnabled(false);
        txtWF6.setEnabled(false);
        
        txtWI2.setEnabled(false);
        txtWI3.setEnabled(false);
        txtWI4.setEnabled(false);
        txtWI5.setEnabled(false);
        txtWI6.setEnabled(false);
        txtdescr1.setEnabled(false);
        txtdescr2.setEnabled(false);
        txtdescr3.setEnabled(false);
        txtdescr4.setEnabled(false);
        txtdescr5.setEnabled(false);
        txtdescr6.setEnabled(false);
        
        
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Reset();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        if(txtgrpid.getText().isEmpty())
        {
            jLabel7.setText("Invalid");
        } 
        
        else if (txtCID.getText().isEmpty()){
            jLabel7.setText("Invalid");
        }
        else if (txtLName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please select correct customer");
        }
        else {
// Height (merge feet & inches)

String m = txtHF1.getText();
String mm = txtHI1.getText();
String mmm = ( m + " - " + mm + "\"" );

String n = txtHF2.getText();
String nn = txtHI2.getText();
String nnn = ( n + " - " + nn + "\"" );

String o = txtHF3.getText();
String oo = txtHI3.getText();
String ooo = ( o + " - " + oo + "\"" );

String p = txtHF4.getText();
String pp = txtHI4.getText();
String ppp = ( p + " - " + pp + "\"" );

String q = txtHF5.getText();
String qq = txtHI5.getText();
String qqq = ( q + " - " + qq + "\"" );

String r = txtHF6.getText();
String rr = txtHI6.getText();
String rrr = ( r + " - " + rr + "\"" );

// Width (merge feet & inches)

String s = txtWF1.getText();
String ss = txtWI1.getText();
String sss = ( s + " - " + ss + "\"" );

String t = txtWF2.getText();
String tt = txtWI2.getText();
String ttt = ( t + " - " + tt + "\"" );

String u = txtWF3.getText();
String uu = txtWI3.getText();
String uuu = ( u + " - " + uu + "\"" );

String v = txtWF4.getText();
String vv = txtWI4.getText();
String vvv = ( v + " - " + vv + "\"" );

String w = txtWF5.getText();
String ww = txtWI5.getText();
String www = ( w + " - " + ww + "\"" );

String x = txtWF6.getText();
String xx = txtWI6.getText();
String xxx = ( x + " - " + xx + "\"" );
       
        
         try {
             
                String sql = "INSERT INTO before_service_details(b_id,group_no,customer_id,dates,type1,width1,height1,no_of_items1,description1,type2,width2,height2,no_of_items2,description2,type3,width3,height3,no_of_items3,description3,type4,width4,height4,no_of_items4,description4,type5,width5,height5,no_of_items5,description5,type6,width6,height6,no_of_items6,description6) VALUES('" + lblSID.getText() + "','" + txtgrpid.getText() + "','" + txtCID.getText() + "','" + lblCDate.getText() + "','" + cmb1.getSelectedItem().toString() + "','" + sss + "','" + mmm + "','" + txtCountItems1.getText() + "','" + txtdescr1.getText() + "','" + cmb2.getSelectedItem().toString() + "','" + ttt + "','" + nnn + "','" + txtCountItems2.getText() + "','" + txtdescr2.getText() + "','" + cmb3.getSelectedItem().toString() + "','" + uuu + "','" + ooo + "','" + txtCountItems3.getText() + "','" + txtdescr3.getText() + "','" + cmb4.getSelectedItem().toString() + "','" + vvv + "','" + ppp + "','" + txtCountItems4.getText() + "','" + txtdescr4.getText() + "','" + cmb5.getSelectedItem().toString() + "','" + www + "','" + qqq + "','" + txtCountItems5.getText() + "','" + txtdescr5.getText() + "','" + cmb6.getSelectedItem().toString() + "','" + xxx + "','" + rrr + "','" + txtCountItems6.getText() + "','" + txtdescr6.getText() + "')";            
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Saved Successfully");
            table();   
        Reset();
        incre();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data save Failed");
            }
        }   
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       /* txtCID.setText("11");
        lblSID.setText("1");
        txtgrpid.setText("3");
        txtLName.setText("Perera");
        txtTP.setText("0783870064");
        txtAddress.setText("Malambe"); */

        txtCountItems1.setText("4");
        txtCountItems2.setText("6");
        txtCountItems3.setText("4");
        txtCountItems4.setText("2");
        txtCountItems5.setText("4");
        txtCountItems6.setText("6");
        txtHF1.setText("5");
        txtHF2.setText("2");
        txtHF3.setText("6");
        txtHF4.setText("3");
        txtHF5.setText("7");
        txtHF6.setText("4");
        txtHI1.setText("32");
        txtHI2.setText("51");
        txtHI3.setText("63");
        txtHI4.setText("45");
        txtHI5.setText("31");
        txtHI6.setText("66");
        txtWF1.setText("4");
        txtWF2.setText("4");
        txtWF3.setText("6");
        txtWF4.setText("5");
        txtWF5.setText("3");
        txtWF6.setText("4");
        txtWI1.setText("65");
        txtWI2.setText("76");
        txtWI3.setText("68");
        txtWI4.setText("59");
        txtWI5.setText("76");
        txtWI6.setText("55");
        txtdescr1.setText("Wide Curl");
        txtdescr2.setText("Low Curl");
        txtdescr3.setText("Wooden Bar");
        txtdescr4.setText("More colorful");
        txtdescr5.setText("Darken color");
        txtdescr6.setText("Darken color");
        cmb1.setSelectedIndex(1);
        cmb2.setSelectedIndex(2);
        cmb3.setSelectedIndex(3);
        cmb4.setSelectedIndex(3);
        cmb5.setSelectedIndex(2);
        cmb6.setSelectedIndex(1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed
        
       boolean enable = cmb1.getSelectedItem().equals("Doors") ||cmb1.getSelectedItem().equals("Windows") || cmb1.getSelectedItem().equals("Others") ;
       txtCountItems1.setEnabled(enable);
        txtHF1.setEnabled(enable);
        txtHI1.setEnabled(enable);
        txtWF1.setEnabled(enable);
        txtWI1.setEnabled(enable);
        txtdescr1.setEnabled(enable);
       
    }//GEN-LAST:event_cmb1ActionPerformed

    private void cmb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb1ItemStateChanged
        
        
    }//GEN-LAST:event_cmb1ItemStateChanged

    private void cmb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb2ActionPerformed
              boolean enable = cmb2.getSelectedItem().equals("Doors") ||cmb2.getSelectedItem().equals("Windows") || cmb2.getSelectedItem().equals("Others") ;
       txtCountItems2.setEnabled(enable);
        txtHF2.setEnabled(enable);
        txtHI2.setEnabled(enable);
        txtWF2.setEnabled(enable);
        txtWI2.setEnabled(enable);
        txtdescr2.setEnabled(enable);
    }//GEN-LAST:event_cmb2ActionPerformed

    private void cmb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb3ActionPerformed
                      boolean enable = cmb3.getSelectedItem().equals("Doors") ||cmb3.getSelectedItem().equals("Windows") || cmb3.getSelectedItem().equals("Others") ;
       txtCountItems3.setEnabled(enable);
        txtHF3.setEnabled(enable);
        txtHI3.setEnabled(enable);
        txtWF3.setEnabled(enable);
        txtWI3.setEnabled(enable);
        txtdescr3.setEnabled(enable);
    }//GEN-LAST:event_cmb3ActionPerformed

    private void cmb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb4ActionPerformed
        
        boolean enable = cmb4.getSelectedItem().equals("Doors") ||cmb4.getSelectedItem().equals("Windows") || cmb4.getSelectedItem().equals("Others") ;
       txtCountItems4.setEnabled(enable);
        txtHF4.setEnabled(enable);
        txtHI4.setEnabled(enable);
        txtWF4.setEnabled(enable);
        txtWI4.setEnabled(enable);
        txtdescr4.setEnabled(enable);
        
        
    }//GEN-LAST:event_cmb4ActionPerformed

    private void cmb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb5ActionPerformed
       boolean enable = cmb5.getSelectedItem().equals("Doors") ||cmb5.getSelectedItem().equals("Windows") || cmb5.getSelectedItem().equals("Others") ;
       txtCountItems5.setEnabled(enable);
        txtHF5.setEnabled(enable);
        txtHI5.setEnabled(enable);
        txtWF5.setEnabled(enable);
        txtWI5.setEnabled(enable);
        txtdescr5.setEnabled(enable);
    }//GEN-LAST:event_cmb5ActionPerformed

    private void cmb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb6ActionPerformed
         boolean enable = cmb6.getSelectedItem().equals("Doors") ||cmb6.getSelectedItem().equals("Windows") || cmb6.getSelectedItem().equals("Others") ;
       txtCountItems6.setEnabled(enable);
        txtHF6.setEnabled(enable);
        txtHI6.setEnabled(enable);
        txtWF6.setEnabled(enable);
        txtWI6.setEnabled(enable);
        txtdescr6.setEnabled(enable);
    }//GEN-LAST:event_cmb6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int g = -1;
        while (g < 0)
        {
            
            String input = JOptionPane.showInputDialog("Please Enter Service ID");
            if(input.length() > 0)
            {
                
                 String sql = "delete from before_service_details where b_id=? ";
        try  { 
            pst = con.prepareStatement(sql);
            pst.setString(1, input);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Deleted");
            table();
              Reset();
              incre();
                         
        }
            
            catch(Exception e){
                    
                    JOptionPane.showMessageDialog(null,"Delete Fail");
                    
                    }
        
                
                
                g++;
            }
            else
                JOptionPane.showMessageDialog(null, "Invalid Service ID");
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIDKeyReleased
 
          
    }//GEN-LAST:event_txtCIDKeyReleased

    private void txtCountItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountItems1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountItems1ActionPerformed

    private void txtgrpidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgrpidKeyTyped
         char vchar = evt.getKeyChar();
       if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
           evt.consume();
       }
    }//GEN-LAST:event_txtgrpidKeyTyped

    private void txtCIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIDKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
        
         try {
            
             Connection conn = DBconnect.connect();
               Statement s = conn.createStatement();
             
            rs = s.executeQuery("SELECT * FROM customer WHERE id='" + txtCID.getText() + "'");
            while (rs.next()) {

                txtLName.setText(rs.getString("last_name"));
                txtTP.setText(rs.getString("contact_number"));
                txtAddress.setText(rs.getString("address_line2"));
         }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Customer ID");
            
        }        
        }
        else {
        txtLName.setText("");
        txtTP.setText("");
        txtAddress.setText("");
            
        }
    }//GEN-LAST:event_txtCIDKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
         
        if(txtgrpid.getText().isEmpty())
        {
            jLabel7.setText("Invalid");
        } 
        
        else if (txtCID.getText().isEmpty()){
            jLabel7.setText("Invalid");
        }
        else if (txtLName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please select correct customer");
        }
        else {
// Height (merge feet & inches)

String m = txtHF1.getText();
String mm = txtHI1.getText();
String mmm = ( m + " - " + mm + "\"" );

String n = txtHF2.getText();
String nn = txtHI2.getText();
String nnn = ( n + " - " + nn + "\"" );

String o = txtHF3.getText();
String oo = txtHI3.getText();
String ooo = ( o + " - " + oo + "\"" );

String p = txtHF4.getText();
String pp = txtHI4.getText();
String ppp = ( p + " - " + pp + "\"" );

String q = txtHF5.getText();
String qq = txtHI5.getText();
String qqq = ( q + " - " + qq + "\"" );

String r = txtHF6.getText();
String rr = txtHI6.getText();
String rrr = ( r + " - " + rr + "\"" );

// Width (merge feet & inches)

String s = txtWF1.getText();
String ss = txtWI1.getText();
String sss = ( s + " - " + ss + "\"" );

String t = txtWF2.getText();
String tt = txtWI2.getText();
String ttt = ( t + " - " + tt + "\"" );

String u = txtWF3.getText();
String uu = txtWI3.getText();
String uuu = ( u + " - " + uu + "\"" );

String v = txtWF4.getText();
String vv = txtWI4.getText();
String vvv = ( v + " - " + vv + "\"" );

String w = txtWF5.getText();
String ww = txtWI5.getText();
String www = ( w + " - " + ww + "\"" );

String x = txtWF6.getText();
String xx = txtWI6.getText();
String xxx = ( x + " - " + xx + "\"" );
       
        
         try {
             
                String sql = "INSERT INTO before_service_details(b_id,group_no,customer_id,dates,type1,width1,height1,no_of_items1,description1,type2,width2,height2,no_of_items2,description2,type3,width3,height3,no_of_items3,description3,type4,width4,height4,no_of_items4,description4,type5,width5,height5,no_of_items5,description5,type6,width6,height6,no_of_items6,description6) VALUES('" + lblSID.getText() + "','" + txtgrpid.getText() + "','" + txtCID.getText() + "','" + lblCDate.getText() + "','" + cmb1.getSelectedItem().toString() + "','" + sss + "','" + mmm + "','" + txtCountItems1.getText() + "','" + txtdescr1.getText() + "','" + cmb2.getSelectedItem().toString() + "','" + ttt + "','" + nnn + "','" + txtCountItems2.getText() + "','" + txtdescr2.getText() + "','" + cmb3.getSelectedItem().toString() + "','" + uuu + "','" + ooo + "','" + txtCountItems3.getText() + "','" + txtdescr3.getText() + "','" + cmb4.getSelectedItem().toString() + "','" + vvv + "','" + ppp + "','" + txtCountItems4.getText() + "','" + txtdescr4.getText() + "','" + cmb5.getSelectedItem().toString() + "','" + www + "','" + qqq + "','" + txtCountItems5.getText() + "','" + txtdescr5.getText() + "','" + cmb6.getSelectedItem().toString() + "','" + xxx + "','" + rrr + "','" + txtCountItems6.getText() + "','" + txtdescr6.getText() + "')";            
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Saved Successfully");
            table();   
        Reset();
        incre();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data save Failed");
            }
        }   
        
        
    }//GEN-LAST:event_jButton2KeyPressed

    private void txtCIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JComboBox<String> cmb2;
    private javax.swing.JComboBox<String> cmb3;
    private javax.swing.JComboBox<String> cmb4;
    private javax.swing.JComboBox<String> cmb5;
    private javax.swing.JComboBox<String> cmb6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lblCDate;
    private javax.swing.JLabel lblSID;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCID;
    private javax.swing.JTextField txtCountItems1;
    private javax.swing.JTextField txtCountItems2;
    private javax.swing.JTextField txtCountItems3;
    private javax.swing.JTextField txtCountItems4;
    private javax.swing.JTextField txtCountItems5;
    private javax.swing.JTextField txtCountItems6;
    private javax.swing.JTextField txtHF1;
    private javax.swing.JTextField txtHF2;
    private javax.swing.JTextField txtHF3;
    private javax.swing.JTextField txtHF4;
    private javax.swing.JTextField txtHF5;
    private javax.swing.JTextField txtHF6;
    private javax.swing.JTextField txtHI1;
    private javax.swing.JTextField txtHI2;
    private javax.swing.JTextField txtHI3;
    private javax.swing.JTextField txtHI4;
    private javax.swing.JTextField txtHI5;
    private javax.swing.JTextField txtHI6;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtTP;
    private javax.swing.JTextField txtWF1;
    private javax.swing.JTextField txtWF2;
    private javax.swing.JTextField txtWF3;
    private javax.swing.JTextField txtWF4;
    private javax.swing.JTextField txtWF5;
    private javax.swing.JTextField txtWF6;
    private javax.swing.JTextField txtWI1;
    private javax.swing.JTextField txtWI2;
    private javax.swing.JTextField txtWI3;
    private javax.swing.JTextField txtWI4;
    private javax.swing.JTextField txtWI5;
    private javax.swing.JTextField txtWI6;
    private javax.swing.JTextField txtdescr1;
    private javax.swing.JTextField txtdescr2;
    private javax.swing.JTextField txtdescr3;
    private javax.swing.JTextField txtdescr4;
    private javax.swing.JTextField txtdescr5;
    private javax.swing.JTextField txtdescr6;
    private javax.swing.JTextField txtgrpid;
    // End of variables declaration//GEN-END:variables
}
