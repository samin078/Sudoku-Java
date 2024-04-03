
package Main;

import Sudoku.fourContinue;
import Sudoku.nineContinue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import login.Login;




public class Menu extends javax.swing.JFrame {

    static int flag =0;
    String time;
    int hint;
    int check;
    int level;
    public Menu() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\login2\\src\\icon\\suu_com_icon.png");
        this.setIconImage(icon.getImage());
        showCon();
        
        
    }
    
    public void showCon(){
        Connection dbconn = DBConnection.connectDB();
        
        if(dbconn != null){   
        try {
            
            PreparedStatement st;
            String sql = "SELECT * from nsaver";
            st = (PreparedStatement) dbconn.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                time=rs.getString(2);
                    hint=Integer.parseInt(rs.getString(4));
                    check=Integer.parseInt(rs.getString(5));
                    level=Integer.parseInt(rs.getString(3));
                if(rs.getString(1)==Login.tf1.getText())
                {
                    flag=1;
                    
                    if(flag==1)conBtn.setVisible(true);
                    else conBtn.setVisible(false);
                    break;
                    
                }
            }
            
            
               
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            System.out.println("The Connection is not available");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCustom1 = new login.PanelCustom();
        startBtn = new swing.Button();
        LdrBtn = new swing.Button();
        hlpBtn = new swing.Button();
        conBtn = new swing.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(44, 40, 57));
        jPanel1.setForeground(new java.awt.Color(41, 81, 163));

        panelCustom1.setBackground(new java.awt.Color(204, 204, 204));

        startBtn.setBackground(new java.awt.Color(37, 97, 163));
        startBtn.setBorder(null);
        startBtn.setForeground(new java.awt.Color(44, 40, 57));
        startBtn.setText("START");
        startBtn.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        LdrBtn.setBackground(new java.awt.Color(37, 97, 163));
        LdrBtn.setBorder(null);
        LdrBtn.setForeground(new java.awt.Color(44, 40, 57));
        LdrBtn.setText("LEADERBOARD");
        LdrBtn.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        LdrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LdrBtnActionPerformed(evt);
            }
        });

        hlpBtn.setBackground(new java.awt.Color(37, 97, 163));
        hlpBtn.setBorder(null);
        hlpBtn.setForeground(new java.awt.Color(44, 40, 57));
        hlpBtn.setText("RULES");
        hlpBtn.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        hlpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlpBtnActionPerformed(evt);
            }
        });

        conBtn.setBackground(new java.awt.Color(37, 97, 163));
        conBtn.setBorder(null);
        conBtn.setForeground(new java.awt.Color(44, 40, 57));
        conBtn.setText("CONTINUE");
        conBtn.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        conBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LdrBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(hlpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(conBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(LdrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(hlpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/suu_com_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        // TODO add your handling code here:
        
        
        dispose();
        Selection select = new Selection();
        select.setTitle("Select Level");
        select.setVisible(true);
    }//GEN-LAST:event_startBtnActionPerformed

    private void LdrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LdrBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Score frame = new Score();
        frame.setVisible(true);
        
    }//GEN-LAST:event_LdrBtnActionPerformed

    private void hlpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlpBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Rules r = new Rules();
        r.setVisible(true);
        
        
        
    }//GEN-LAST:event_hlpBtnActionPerformed

    private void conBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conBtnActionPerformed
        // TODO add your handling code here:
        
        
        
        dispose();
            fourContinue f =new fourContinue(time,hint,check,level);
        /*
        if(level<50){
            dispose();
            fourContinue f =new fourContinue(time,hint,check,level);
        }
        else if(level>50){
            dispose();
            nineContinue f =new nineContinue(time,hint,check,level);
        }
        */
        
        
    }//GEN-LAST:event_conBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button LdrBtn;
    private swing.Button conBtn;
    private swing.Button hlpBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private login.PanelCustom panelCustom1;
    private swing.Button startBtn;
    // End of variables declaration//GEN-END:variables
}
