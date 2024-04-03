
package Main;

import Sudoku.fourbyfour;
import Sudoku.ninebynine;
import java.awt.Color;
import javax.swing.ButtonGroup;


public class Selection extends javax.swing.JFrame {

    
    public Selection() {
        initComponents();
        init();
    }

static int level;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCustom1 = new login.PanelCustom();
        ezBtn = new swing.Button();
        mdmBtn = new swing.Button();
        hrdBtn = new swing.Button();
        rb1 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        panelCustom2 = new login.PanelCustom();
        fourBtn = new swing.Button();
        nineBtn = new swing.Button();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        nextBtn = new swing.Button();
        button1 = new swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        panelCustom1.setBackground(new java.awt.Color(44, 40, 57));
        panelCustom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCustom1MouseEntered(evt);
            }
        });

        ezBtn.setBackground(new java.awt.Color(204, 204, 255));
        ezBtn.setForeground(new java.awt.Color(51, 51, 51));
        ezBtn.setText("EASY");
        ezBtn.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        ezBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ezBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ezBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ezBtnMouseExited(evt);
            }
        });
        ezBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ezBtnActionPerformed(evt);
            }
        });

        mdmBtn.setBackground(new java.awt.Color(204, 204, 255));
        mdmBtn.setForeground(new java.awt.Color(51, 51, 51));
        mdmBtn.setText("MEDIUM");
        mdmBtn.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        mdmBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mdmBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mdmBtnMouseExited(evt);
            }
        });
        mdmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdmBtnActionPerformed(evt);
            }
        });

        hrdBtn.setBackground(new java.awt.Color(204, 204, 255));
        hrdBtn.setForeground(new java.awt.Color(51, 51, 51));
        hrdBtn.setText("HARD");
        hrdBtn.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        hrdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hrdBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hrdBtnMouseExited(evt);
            }
        });
        hrdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrdBtnActionPerformed(evt);
            }
        });

        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(rb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ezBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hrdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mdmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(ezBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(mdmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rb1)
                        .addGap(68, 68, 68)
                        .addComponent(rb2)
                        .addGap(49, 49, 49)))
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addComponent(hrdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                        .addComponent(rb3)
                        .addGap(112, 112, 112))))
        );

        panelCustom2.setBackground(new java.awt.Color(44, 40, 57));

        fourBtn.setBackground(new java.awt.Color(204, 204, 255));
        fourBtn.setForeground(new java.awt.Color(51, 51, 51));
        fourBtn.setText("4 x 4");
        fourBtn.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        fourBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fourBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fourBtnMouseExited(evt);
            }
        });
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });

        nineBtn.setBackground(new java.awt.Color(204, 204, 255));
        nineBtn.setForeground(new java.awt.Color(51, 51, 51));
        nineBtn.setText("9 x 9");
        nineBtn.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        nineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nineBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nineBtnMouseExited(evt);
            }
        });
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });

        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });

        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rb5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fourBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(nineBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(fourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCustom2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(rb4)))
                .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCustom2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(rb5)))
                .addGap(140, 140, 140))
        );

        nextBtn.setBackground(new java.awt.Color(44, 40, 57));
        nextBtn.setForeground(new java.awt.Color(204, 204, 255));
        nextBtn.setText("NEXT");
        nextBtn.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(44, 40, 57));
        button1.setForeground(new java.awt.Color(242, 242, 242));
        button1.setText("BACK");
        button1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(panelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ezBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ezBtnActionPerformed
        // TODO add your handling code here:
        rb1.setSelected(true);
        if(rb1.isSelected()){
            ezBtn.setBackground(new Color(234, 231, 177));
            ezBtn.setForeground(new Color(26, 77, 46));
            hrdBtn.setBackground(new Color(204,204,255));
            hrdBtn.setForeground(new Color(51,51,51));
            mdmBtn.setBackground(new Color(204,204,255));
            mdmBtn.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_ezBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        if(rb1.isSelected() && rb4.isSelected()){
            level=41;
            dispose();
            fourbyfour game = new fourbyfour(3,8,level);
        }else if(rb1.isSelected() && rb5.isSelected()){
            level=91;
            dispose();
            ninebynine game = new ninebynine(4,45,level);
        }else if(rb2.isSelected() && rb4.isSelected()){
            level=42;
            dispose();
            fourbyfour game = new fourbyfour(2,10,level);
        }else if(rb2.isSelected() && rb5.isSelected()){
            level=92;
            dispose();
            ninebynine game = new ninebynine(3,56,level);
        }else if(rb3.isSelected() && rb4.isSelected()){
            level=43;
            dispose();
            fourbyfour game = new fourbyfour(1,12,level);
        }else if(rb3.isSelected() && rb5.isSelected()){
            level=93;
            dispose();
            ninebynine game = new ninebynine(2,62,level);
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
        if(rb1.isSelected()){
            ezBtn.setBackground(new Color(234, 231, 177));
            ezBtn.setForeground(new Color(26, 77, 46));
            hrdBtn.setBackground(new Color(204,204,255));
            hrdBtn.setForeground(new Color(51,51,51));
            mdmBtn.setBackground(new Color(204,204,255));
            mdmBtn.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_rb1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Menu d = new Menu();
        d.setTitle("Sudoku");
        d.setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void mdmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdmBtnActionPerformed
        // TODO add your handling code here:
        rb2.setSelected(true);
        if(rb2.isSelected()){
            mdmBtn.setBackground(new Color(234, 231, 177));
            mdmBtn.setForeground(new Color(26, 77, 46));
            hrdBtn.setBackground(new Color(204,204,255));
            hrdBtn.setForeground(new Color(51,51,51));
            ezBtn.setBackground(new Color(204,204,255));
            ezBtn.setForeground(new Color(51,51,51));
        }
        
    }//GEN-LAST:event_mdmBtnActionPerformed

    private void hrdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrdBtnActionPerformed
        // TODO add your handling code here:
        rb3.setSelected(true);
        if(rb3.isSelected()){
            hrdBtn.setBackground(new Color(234, 231, 177));
            hrdBtn.setForeground(new Color(26, 77, 46));
            mdmBtn.setBackground(new Color(204,204,255));
            mdmBtn.setForeground(new Color(51,51,51));
            ezBtn.setBackground(new Color(204,204,255));
            ezBtn.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_hrdBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        // TODO add your handling code here:
        rb4.setSelected(true);
        if(rb4.isSelected()){
            fourBtn.setBackground(new Color(234, 231, 177));
            fourBtn.setForeground(new Color(26, 77, 46));
            nineBtn.setBackground(new Color(204,204,255));
            nineBtn.setForeground(new Color(51,51,51));
            
        }
    }//GEN-LAST:event_fourBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        // TODO add your handling code here:
        rb5.setSelected(true);
        if(rb5.isSelected()){
            nineBtn.setBackground(new Color(234, 231, 177));
            nineBtn.setForeground(new Color(26, 77, 46));
            fourBtn.setBackground(new Color(204,204,255));
            fourBtn.setForeground(new Color(51,51,51));
            
        }
    }//GEN-LAST:event_nineBtnActionPerformed

    private void panelCustom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCustom1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelCustom1MouseEntered

    private void ezBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ezBtnMouseEntered
        // TODO add your handling code here:
       // ezBtn.setBackground(new Color(234, 231, 177));
       //ezBtn.setForeground(new Color(26, 77, 46));
        
    }//GEN-LAST:event_ezBtnMouseEntered

    private void mdmBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mdmBtnMouseEntered
        // TODO add your handling code here:
       // mdmBtn.setBackground(new Color(234, 231, 177));
       // mdmBtn.setForeground(new Color(26, 77, 46));
    }//GEN-LAST:event_mdmBtnMouseEntered

    private void hrdBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hrdBtnMouseEntered
        // TODO add your handling code here:
        //hrdBtn.setBackground(new Color(234, 231, 177));
       // hrdBtn.setForeground(new Color(26, 77, 46));
    }//GEN-LAST:event_hrdBtnMouseEntered

    private void ezBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ezBtnMouseExited
        // TODO add your handling code here:
       // ezBtn.setBackground(new Color(204,204,255));
        //ezBtn.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_ezBtnMouseExited

    private void mdmBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mdmBtnMouseExited
        // TODO add your handling code here:
       // mdmBtn.setBackground(new Color(204,204,255));
       // mdmBtn.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_mdmBtnMouseExited

    private void hrdBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hrdBtnMouseExited
        // TODO add your handling code here:
        
         //   hrdBtn.setBackground(new Color(204,204,255));
          //  hrdBtn.setForeground(new Color(51,51,51));
        
        
    }//GEN-LAST:event_hrdBtnMouseExited

    private void fourBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourBtnMouseEntered
        // TODO add your handling code here:
        //fourBtn.setBackground(new Color(234, 231, 177));
        //fourBtn.setForeground(new Color(26, 77, 46));
    }//GEN-LAST:event_fourBtnMouseEntered

    private void nineBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineBtnMouseEntered
        // TODO add your handling code here:
       // nineBtn.setBackground(new Color(234, 231, 177));
       // nineBtn.setForeground(new Color(26, 77, 46));
    }//GEN-LAST:event_nineBtnMouseEntered

    private void fourBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourBtnMouseExited
        // TODO add your handling code here:
      //  fourBtn.setBackground(new Color(204,204,255));
      //  fourBtn.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_fourBtnMouseExited

    private void nineBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineBtnMouseExited
        // TODO add your handling code here:
       // nineBtn.setBackground(new Color(204,204,255));
       // nineBtn.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_nineBtnMouseExited

    private void ezBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ezBtnMouseClicked
        // TODO add your handling code here:
        if(rb1.isSelected()){
            ezBtn.setBackground(new Color(234, 231, 177));
            ezBtn.setForeground(new Color(26, 77, 46));
            hrdBtn.setBackground(new Color(204,204,255));
            hrdBtn.setForeground(new Color(51,51,51));
            mdmBtn.setBackground(new Color(204,204,255));
            mdmBtn.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_ezBtnMouseClicked

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        // TODO add your handling code here:
        if(rb3.isSelected()){
            hrdBtn.setBackground(new Color(234, 231, 177));
            hrdBtn.setForeground(new Color(26, 77, 46));
            mdmBtn.setBackground(new Color(204,204,255));
            mdmBtn.setForeground(new Color(51,51,51));
            ezBtn.setBackground(new Color(204,204,255));
            ezBtn.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
        if(rb2.isSelected()){
            mdmBtn.setBackground(new Color(234, 231, 177));
            mdmBtn.setForeground(new Color(26, 77, 46));
            hrdBtn.setBackground(new Color(204,204,255));
            hrdBtn.setForeground(new Color(51,51,51));
            ezBtn.setBackground(new Color(204,204,255));
            ezBtn.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        // TODO add your handling code here:
        if(rb4.isSelected()){
            fourBtn.setBackground(new Color(234, 231, 177));
            fourBtn.setForeground(new Color(26, 77, 46));
            nineBtn.setBackground(new Color(204,204,255));
            nineBtn.setForeground(new Color(51,51,51));
            
        }
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        // TODO add your handling code here:
        if(rb5.isSelected()){
            nineBtn.setBackground(new Color(234, 231, 177));
            nineBtn.setForeground(new Color(26, 77, 46));
            fourBtn.setBackground(new Color(204,204,255));
            fourBtn.setForeground(new Color(51,51,51));
            
        }
    }//GEN-LAST:event_rb5ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button ezBtn;
    private swing.Button fourBtn;
    private swing.Button hrdBtn;
    private javax.swing.JPanel jPanel1;
    private swing.Button mdmBtn;
    private swing.Button nextBtn;
    private swing.Button nineBtn;
    private login.PanelCustom panelCustom1;
    private login.PanelCustom panelCustom2;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    // End of variables declaration//GEN-END:variables

    private void init() {
        ButtonGroup bg1 = new ButtonGroup();
        
        ButtonGroup bg2 = new ButtonGroup();
        
        
        if(rb1.isSelected()){
            ezBtn.setBackground(new Color(234, 231, 177));
            ezBtn.setForeground(new Color(26, 77, 46));
            hrdBtn.setBackground(new Color(204,204,255));
            hrdBtn.setForeground(new Color(51,51,51));
            mdmBtn.setBackground(new Color(204,204,255));
            mdmBtn.setForeground(new Color(51,51,51));
        }else if(rb2.isSelected()){
            mdmBtn.setBackground(new Color(234, 231, 177));
            mdmBtn.setForeground(new Color(26, 77, 46));
            hrdBtn.setBackground(new Color(204,204,255));
            hrdBtn.setForeground(new Color(51,51,51));
        }
        else if(rb3.isSelected()){
            hrdBtn.setBackground(new Color(234, 231, 177));
            hrdBtn.setForeground(new Color(26, 77, 46));
            mdmBtn.setBackground(new Color(204,204,255));
            mdmBtn.setForeground(new Color(51,51,51));
            ezBtn.setBackground(new Color(204,204,255));
            ezBtn.setForeground(new Color(51,51,51));
        }
        bg1.add(rb1);
        bg1.add(rb3);
        bg1.add(rb2);
        bg2.add(rb4);
        bg2.add(rb5);
    }
}
