
package itp;

import java.awt.event.KeyEvent;

public class Calculator extends javax.swing.JInternalFrame {

String op;
String an;

double fn;
double result;
double sn;

    public Calculator() {
        initComponents();      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtanswer = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnminus = new javax.swing.JButton();
        btndevide = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnerace = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();
        btnplus = new javax.swing.JButton();

        setClosable(true);
        setTitle("Calculator");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/itp/cal.png"))); // NOI18N
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtanswer.setEditable(false);
        txtanswer.setFont(new java.awt.Font("DS-Digital", 0, 28)); // NOI18N
        txtanswer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtanswer.setToolTipText("you cannot edit this. please use buttons to entering");
        txtanswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtanswerKeyPressed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnminus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnminus.setText("-");
        btnminus.setToolTipText("minus");
        btnminus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminusActionPerformed(evt);
            }
        });
        btnminus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnminusKeyPressed(evt);
            }
        });

        btndevide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndevide.setText("/");
        btndevide.setToolTipText("divide");
        btndevide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndevide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndevideActionPerformed(evt);
            }
        });
        btndevide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btndevideKeyPressed(evt);
            }
        });

        btnmulti.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmulti.setText("x");
        btnmulti.setToolTipText("multiply");
        btnmulti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });
        btnmulti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnmultiKeyPressed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 153, 153));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn1KeyPressed(evt);
            }
        });

        btnerace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnerace.setForeground(new java.awt.Color(255, 0, 0));
        btnerace.setText("C");
        btnerace.setToolTipText("clear");
        btnerace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnerace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneraceActionPerformed(evt);
            }
        });
        btnerace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btneraceKeyPressed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 153, 153));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn2KeyPressed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 153, 153));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn4KeyPressed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 153, 153));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn3KeyPressed(evt);
            }
        });

        btndot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndot.setText(".");
        btndot.setToolTipText("dot");
        btndot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        btndot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btndotKeyPressed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 153, 153));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        btn5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn5KeyPressed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 153, 153));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        btn8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn8KeyPressed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 153, 153));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        btn9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn9KeyPressed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 153, 153));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        btn6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn6KeyPressed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 153, 153));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        btn7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn7KeyPressed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 153, 153));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        btn0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn0KeyPressed(evt);
            }
        });

        btnequal.setBackground(new java.awt.Color(0, 51, 51));
        btnequal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnequal.setForeground(new java.awt.Color(255, 255, 255));
        btnequal.setText("=");
        btnequal.setToolTipText("equal");
        btnequal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });
        btnequal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnequalKeyPressed(evt);
            }
        });

        btnplus.setBackground(new java.awt.Color(102, 0, 0));
        btnplus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnplus.setForeground(new java.awt.Color(255, 255, 255));
        btnplus.setText("+");
        btnplus.setToolTipText("plus");
        btnplus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });
        btnplus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnplusKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndevide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmulti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnequal, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnplus, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnerace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndevide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnerace, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtanswer))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtanswer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String ev = txtanswer.getText()+btn9.getText();
        txtanswer.setText(ev); 
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String ev = txtanswer.getText()+btn1.getText();
        txtanswer.setText(ev);        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String ev = txtanswer.getText()+btn2.getText();
        txtanswer.setText(ev); 
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String ev = txtanswer.getText()+btn3.getText();
        txtanswer.setText(ev); 
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String ev = txtanswer.getText()+btn4.getText();
        txtanswer.setText(ev); 
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String ev = txtanswer.getText()+btn5.getText();
        txtanswer.setText(ev); 
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String ev = txtanswer.getText()+btn6.getText();
        txtanswer.setText(ev); 
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String ev = txtanswer.getText()+btn7.getText();
        txtanswer.setText(ev); 
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String ev = txtanswer.getText()+btn8.getText();
        txtanswer.setText(ev); 
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String ev = txtanswer.getText()+btn0.getText();
        txtanswer.setText(ev); 
    }//GEN-LAST:event_btn0ActionPerformed

    private void btneraceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneraceActionPerformed
        txtanswer.setText("");
    }//GEN-LAST:event_btneraceActionPerformed

    private void btndevideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndevideActionPerformed
        fn = Double.parseDouble(txtanswer.getText());
        txtanswer.setText("");
        op = "/";
    }//GEN-LAST:event_btndevideActionPerformed

    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
        fn = Double.parseDouble(txtanswer.getText());
        txtanswer.setText("");
        op = "*";
    }//GEN-LAST:event_btnmultiActionPerformed

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusActionPerformed
        fn = Double.parseDouble(txtanswer.getText());
        txtanswer.setText("");
        op = "+";
    }//GEN-LAST:event_btnplusActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        String ev = txtanswer.getText()+btndot.getText();
        txtanswer.setText(ev);
    }//GEN-LAST:event_btndotActionPerformed

    private void btnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminusActionPerformed
        fn = Double.parseDouble(txtanswer.getText());
        txtanswer.setText("");
        op = "-";
    }//GEN-LAST:event_btnminusActionPerformed

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed
        sn = Double.parseDouble(txtanswer.getText());
        if (op == "+")
        {
            result = fn + sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
        else if (op == "*")
        {
            result = fn * sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
        else if (op == "-")
        {
            result = fn - sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
        else if (op == "/")
        {
            result = fn / sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
  
    }//GEN-LAST:event_btnequalActionPerformed

    private void btn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_1) {
            String ev = txtanswer.getText()+btn1.getText();
            txtanswer.setText(ev);   
        }
    }//GEN-LAST:event_btn1KeyPressed

    private void btn2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_2) {
        String ev = txtanswer.getText()+btn2.getText();
        txtanswer.setText(ev); 
        }
    }//GEN-LAST:event_btn2KeyPressed

    private void btn3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn3KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_3) {
        String ev = txtanswer.getText()+btn3.getText();
        txtanswer.setText(ev);    
        }
    }//GEN-LAST:event_btn3KeyPressed

    private void btn4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn4KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_4) {
        String ev = txtanswer.getText()+btn4.getText();
        txtanswer.setText(ev);    
        }
    }//GEN-LAST:event_btn4KeyPressed

    private void btn5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn5KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_5) {
        String ev = txtanswer.getText()+btn5.getText();
        txtanswer.setText(ev);    
        }
    }//GEN-LAST:event_btn5KeyPressed

    private void btn6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn6KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_6) {
        String ev = txtanswer.getText()+btn6.getText();
        txtanswer.setText(ev);    
        }
    }//GEN-LAST:event_btn6KeyPressed

    private void btn7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn7KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_7) {
        String ev = txtanswer.getText()+btn7.getText();
        txtanswer.setText(ev);    
        }
    }//GEN-LAST:event_btn7KeyPressed

    private void btn8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn8KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_8) {
        String ev = txtanswer.getText()+btn8.getText();
        txtanswer.setText(ev);     
        }
    }//GEN-LAST:event_btn8KeyPressed

    private void btn9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn9KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_9) {
       String ev = txtanswer.getText()+btn9.getText();
       txtanswer.setText(ev);     
       }
    }//GEN-LAST:event_btn9KeyPressed

    private void btn0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn0KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_0) {
        String ev = txtanswer.getText()+btn0.getText();
        txtanswer.setText(ev);     
        }
    }//GEN-LAST:event_btn0KeyPressed

    private void btneraceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btneraceKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_CLEAR) {
        txtanswer.setText("");    
        }
    }//GEN-LAST:event_btneraceKeyPressed

    private void btnmultiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnmultiKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_MULTIPLY) {
        fn = Double.parseDouble(txtanswer.getText());
        txtanswer.setText("");
        op = "*";    
        }
    }//GEN-LAST:event_btnmultiKeyPressed

    private void btndevideKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btndevideKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SUBTRACT) {
        fn = Double.parseDouble(txtanswer.getText());
        txtanswer.setText("");
        op = "/";    
        }
    }//GEN-LAST:event_btndevideKeyPressed

    private void btnminusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnminusKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_MINUS) {
         fn = Double.parseDouble(txtanswer.getText());
         txtanswer.setText("");
         op = "-";    
         }
    }//GEN-LAST:event_btnminusKeyPressed

    private void btndotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btndotKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_STOP) {
        String ev = txtanswer.getText()+btndot.getText();
        txtanswer.setText(ev);    
        }
    }//GEN-LAST:event_btndotKeyPressed

    private void btnequalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnequalKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_EQUALS) {
        sn = Double.parseDouble(txtanswer.getText());
        if (op == "+")
        {
            result = fn + sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
        else if (op == "*")
        {
            result = fn * sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
        else if (op == "-")
        {
            result = fn - sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
        else if (op == "/")
        {
            result = fn / sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }     
      }
    }//GEN-LAST:event_btnequalKeyPressed

    private void btnplusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnplusKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_PLUS) {
       fn = Double.parseDouble(txtanswer.getText());
       txtanswer.setText("");
       op = "+";    
       } 
    }//GEN-LAST:event_btnplusKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void txtanswerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanswerKeyPressed
            if(evt.getKeyCode()==KeyEvent.VK_1) {
            String ev = txtanswer.getText()+btn1.getText();
            txtanswer.setText(ev);   
        } 
            		if(evt.getKeyCode()==KeyEvent.VK_2) {
        String ev = txtanswer.getText()+btn2.getText();
        txtanswer.setText(ev); 
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_3) {
        String ev = txtanswer.getText()+btn3.getText();
        txtanswer.setText(ev);    
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_4) {
        String ev = txtanswer.getText()+btn4.getText();
        txtanswer.setText(ev);    
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_5) {
        String ev = txtanswer.getText()+btn5.getText();
        txtanswer.setText(ev);    
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_6) {
        String ev = txtanswer.getText()+btn6.getText();
        txtanswer.setText(ev);    
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_7) {
        String ev = txtanswer.getText()+btn7.getText();
        txtanswer.setText(ev);    
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_8) {
        String ev = txtanswer.getText()+btn8.getText();
        txtanswer.setText(ev);     
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_9) {
        String ev = txtanswer.getText()+btn9.getText();
        txtanswer.setText(ev);     
       }
	   
	    if(evt.getKeyCode()==KeyEvent.VK_0) {
        String ev = txtanswer.getText()+btn0.getText();
        txtanswer.setText(ev);     
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_CLEAR) {
        txtanswer.setText("");    
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_MULTIPLY) {
        fn = Double.parseDouble(txtanswer.getText());
        txtanswer.setText("");
        op = "*";    
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_C) {
        fn = Double.parseDouble(txtanswer.getText());
        txtanswer.setText("");
        op = "/";    
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_MINUS) {
        fn = Double.parseDouble(txtanswer.getText());
        txtanswer.setText("");
        op = "-";    
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_COMPOSE) {
        String ev = txtanswer.getText()+btndot.getText();
        txtanswer.setText(ev);    
        }
		
		if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
        sn = Double.parseDouble(txtanswer.getText());
        if (op == "+")
        {
            result = fn + sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
        else if (op == "*")
        {
            result = fn * sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
        else if (op == "-")
        {
            result = fn - sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
        else if (op == "/")
        {
            result = fn / sn;
            an = String.format("%.0f", result);
            txtanswer.setText(an);
        }
      
        }
		if(evt.getKeyCode()==KeyEvent.VK_PLUS) {
        fn = Double.parseDouble(txtanswer.getText());
        txtanswer.setText("");
        op = "+";    
        } 
    }//GEN-LAST:event_txtanswerKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btndevide;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnerace;
    private javax.swing.JButton btnminus;
    private javax.swing.JButton btnmulti;
    private javax.swing.JButton btnplus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtanswer;
    // End of variables declaration//GEN-END:variables
}
