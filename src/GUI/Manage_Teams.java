/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author faisa
 */
public class Manage_Teams extends javax.swing.JFrame {

    /**
     * Creates new form Manage_Teams
     */
    public Manage_Teams() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageTeamsPanel = new javax.swing.JPanel();
        manageTeamsLabel = new javax.swing.JLabel();
        manageTeamsMenuPanel = new javax.swing.JPanel();
        View_TeamsBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        Add_TeamsBtn = new javax.swing.JButton();
        Edit_TeamsBtn = new javax.swing.JButton();
        Delete_TeamsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manageTeamsPanel.setBackground(new java.awt.Color(255, 255, 255));

        manageTeamsLabel.setBackground(new java.awt.Color(255, 255, 255));
        manageTeamsLabel.setFont(new java.awt.Font("Gadugi", 0, 90)); // NOI18N
        manageTeamsLabel.setForeground(new java.awt.Color(0, 127, 255));
        manageTeamsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageTeamsLabel.setText("Manage Teams");
        manageTeamsLabel.setToolTipText("");
        manageTeamsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        manageTeamsMenuPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageTeamsMenuPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 10, true));

        View_TeamsBtn.setBackground(new java.awt.Color(211, 211, 211));
        View_TeamsBtn.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        View_TeamsBtn.setForeground(new java.awt.Color(0, 127, 255));
        View_TeamsBtn.setText("View Teams");
        View_TeamsBtn.setToolTipText("");
        View_TeamsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        View_TeamsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        View_TeamsBtn.setPreferredSize(new java.awt.Dimension(175, 51));
        View_TeamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_TeamsBtnActionPerformed(evt);
            }
        });

        BackBtn.setBackground(new java.awt.Color(211, 211, 211));
        BackBtn.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(0, 127, 255));
        BackBtn.setText("Go Back");
        BackBtn.setToolTipText("");
        BackBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        BackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBtn.setPreferredSize(new java.awt.Dimension(231, 51));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        Add_TeamsBtn.setBackground(new java.awt.Color(211, 211, 211));
        Add_TeamsBtn.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Add_TeamsBtn.setForeground(new java.awt.Color(0, 127, 255));
        Add_TeamsBtn.setText("Add Teams");
        Add_TeamsBtn.setToolTipText("");
        Add_TeamsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        Add_TeamsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_TeamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_TeamsBtnActionPerformed(evt);
            }
        });

        Edit_TeamsBtn.setBackground(new java.awt.Color(211, 211, 211));
        Edit_TeamsBtn.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Edit_TeamsBtn.setForeground(new java.awt.Color(0, 127, 255));
        Edit_TeamsBtn.setText("Edit Teams");
        Edit_TeamsBtn.setToolTipText("");
        Edit_TeamsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        Edit_TeamsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Edit_TeamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_TeamsBtnActionPerformed(evt);
            }
        });

        Delete_TeamsBtn.setBackground(new java.awt.Color(211, 211, 211));
        Delete_TeamsBtn.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Delete_TeamsBtn.setForeground(new java.awt.Color(0, 127, 255));
        Delete_TeamsBtn.setText("Delete Teams");
        Delete_TeamsBtn.setToolTipText("");
        Delete_TeamsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        Delete_TeamsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete_TeamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_TeamsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageTeamsMenuPanelLayout = new javax.swing.GroupLayout(manageTeamsMenuPanel);
        manageTeamsMenuPanel.setLayout(manageTeamsMenuPanelLayout);
        manageTeamsMenuPanelLayout.setHorizontalGroup(
            manageTeamsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageTeamsMenuPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(manageTeamsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageTeamsMenuPanelLayout.createSequentialGroup()
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(manageTeamsMenuPanelLayout.createSequentialGroup()
                        .addGroup(manageTeamsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(View_TeamsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Add_TeamsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Edit_TeamsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                            .addComponent(Delete_TeamsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        manageTeamsMenuPanelLayout.setVerticalGroup(
            manageTeamsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageTeamsMenuPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(View_TeamsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(Add_TeamsBtn)
                .addGap(21, 21, 21)
                .addComponent(Edit_TeamsBtn)
                .addGap(21, 21, 21)
                .addComponent(Delete_TeamsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout manageTeamsPanelLayout = new javax.swing.GroupLayout(manageTeamsPanel);
        manageTeamsPanel.setLayout(manageTeamsPanelLayout);
        manageTeamsPanelLayout.setHorizontalGroup(
            manageTeamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageTeamsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(manageTeamsPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(manageTeamsMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        manageTeamsPanelLayout.setVerticalGroup(
            manageTeamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageTeamsPanelLayout.createSequentialGroup()
                .addComponent(manageTeamsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageTeamsMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(manageTeamsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(manageTeamsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void View_TeamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_TeamsBtnActionPerformed
        try {
            // TODO add your handling code here:
            
            Select_Team_view V = new Select_Team_view();
            V.setVisible(true);
            this.setVisible(false);
            V.setSize(this.getSize());
        } catch (IOException ex) {
            Logger.getLogger(Manage_Teams.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_View_TeamsBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        
        Main_Page MP = new Main_Page();
        MP.setVisible(true);
        this.setVisible(false);
        MP.setSize(this.getSize());
    }//GEN-LAST:event_BackBtnActionPerformed

    private void Add_TeamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_TeamsBtnActionPerformed
        // TODO add your handling code here:
        
        Add_team V = new Add_team();
        V.setVisible(true);
        this.setVisible(false);
        V.setSize(this.getSize());
        
    }//GEN-LAST:event_Add_TeamsBtnActionPerformed

    private void Edit_TeamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_TeamsBtnActionPerformed
        try {
            // TODO add your handling code here:
            
            Select_Team V = new Select_Team();
            V.setVisible(true);
            this.setVisible(false);
            V.setSize(this.getSize());
        } catch (IOException ex) {
            Logger.getLogger(Manage_Teams.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Edit_TeamsBtnActionPerformed

    private void Delete_TeamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_TeamsBtnActionPerformed
        // TODO add your handling code here:
        Delete_Team dt = new Delete_Team();
        dt.setVisible(true);
        this.setVisible(false);
        dt.setSize(this.getSize());
        
    }//GEN-LAST:event_Delete_TeamsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Manage_Teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Teams().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_TeamsBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton Delete_TeamsBtn;
    private javax.swing.JButton Edit_TeamsBtn;
    private javax.swing.JButton View_TeamsBtn;
    private javax.swing.JLabel manageTeamsLabel;
    private javax.swing.JPanel manageTeamsMenuPanel;
    private javax.swing.JPanel manageTeamsPanel;
    // End of variables declaration//GEN-END:variables
}
