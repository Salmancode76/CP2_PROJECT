/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.*;
import Logic.SportsLeague;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salma
 */
public class Main_Page extends javax.swing.JFrame {

    /**
     * Creates new form Main_Page
     */
    public Main_Page() {
       
        initComponents();
        this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setExtendedState(Main_Page.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null); // Center the frame on the screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Main_panel = new javax.swing.JPanel();
        btn_Manage_Managers = new javax.swing.JButton();
        btn_pay_roll = new javax.swing.JButton();
        btn_Manage_Players = new javax.swing.JButton();
        btn_Manage_teams = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setFont(new java.awt.Font("Gadugi", 0, 90)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 127, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Sports League Manager");
        Title.setToolTipText("");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Main_panel.setBackground(new java.awt.Color(255, 255, 255));
        Main_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 10, true));

        btn_Manage_Managers.setBackground(new java.awt.Color(211, 211, 211));
        btn_Manage_Managers.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btn_Manage_Managers.setForeground(new java.awt.Color(0, 127, 255));
        btn_Manage_Managers.setText("Manage Managers");
        btn_Manage_Managers.setToolTipText("");
        btn_Manage_Managers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        btn_Manage_Managers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Manage_Managers.setMaximumSize(new java.awt.Dimension(231, 51));
        btn_Manage_Managers.setMinimumSize(new java.awt.Dimension(231, 51));
        btn_Manage_Managers.setPreferredSize(new java.awt.Dimension(231, 51));
        btn_Manage_Managers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Manage_ManagersActionPerformed(evt);
            }
        });

        btn_pay_roll.setBackground(new java.awt.Color(211, 211, 211));
        btn_pay_roll.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btn_pay_roll.setForeground(new java.awt.Color(0, 127, 255));
        btn_pay_roll.setText("Pay Report");
        btn_pay_roll.setToolTipText("");
        btn_pay_roll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        btn_pay_roll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pay_roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay_rollActionPerformed(evt);
            }
        });

        btn_Manage_Players.setBackground(new java.awt.Color(211, 211, 211));
        btn_Manage_Players.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btn_Manage_Players.setForeground(new java.awt.Color(0, 127, 255));
        btn_Manage_Players.setText("Manage Players");
        btn_Manage_Players.setToolTipText("");
        btn_Manage_Players.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        btn_Manage_Players.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Manage_Players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Manage_PlayersActionPerformed(evt);
            }
        });

        btn_Manage_teams.setBackground(new java.awt.Color(211, 211, 211));
        btn_Manage_teams.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btn_Manage_teams.setForeground(new java.awt.Color(0, 127, 255));
        btn_Manage_teams.setText("Manage Teams");
        btn_Manage_teams.setToolTipText("");
        btn_Manage_teams.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        btn_Manage_teams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Manage_teams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Manage_teamsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Main_panelLayout = new javax.swing.GroupLayout(Main_panel);
        Main_panel.setLayout(Main_panelLayout);
        Main_panelLayout.setHorizontalGroup(
            Main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pay_roll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Manage_Players, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Manage_Managers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Manage_teams, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        Main_panelLayout.setVerticalGroup(
            Main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_Manage_Players, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_Manage_Managers, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Manage_teams, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_pay_roll, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        btn_exit.setBackground(new java.awt.Color(211, 211, 211));
        btn_exit.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(0, 127, 255));
        btn_exit.setText("Exit");
        btn_exit.setToolTipText("");
        btn_exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(Main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_exit)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Manage_ManagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_ManagersActionPerformed
        // TODO add your handling code here:
         Manage_Managers mm= new Manage_Managers();
        mm.setVisible(true);
        
        this.setVisible(false);
        mm.setSize(this.getSize());
    }//GEN-LAST:event_btn_Manage_ManagersActionPerformed

    private void btn_pay_rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay_rollActionPerformed
        try {
            SportsLeague sp= new SportsLeague();
            sp.generatePayrollReport();
        } catch (IOException ex) {
            Logger.getLogger(Main_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_pay_rollActionPerformed

    private void btn_Manage_PlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_PlayersActionPerformed
        // TODO add your handling code here:
        Manage_Players mp= new Manage_Players();
        mp.setVisible(true);
        this.setVisible(false);
        mp.setSize(this.getSize());
    }//GEN-LAST:event_btn_Manage_PlayersActionPerformed

    private void btn_Manage_teamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_teamsActionPerformed
        // TODO add your handling code here:
          Manage_Teams mt= new Manage_Teams();
        mt.setVisible(true);
        this.setVisible(false);
        mt.setSize(this.getSize());
    }//GEN-LAST:event_btn_Manage_teamsActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
              

                new Main_Page().setVisible(true);
               
                
                               
      

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main_panel;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btn_Manage_Managers;
    private javax.swing.JButton btn_Manage_Players;
    private javax.swing.JButton btn_Manage_teams;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_pay_roll;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
