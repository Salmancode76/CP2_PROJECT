/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Logic.Team;

/**
 *
 * @author salma
 */
public class View_teams extends javax.swing.JFrame {

    /**
     * Creates new form View_teams
     */
    public View_teams() {
        initComponents();
    }
     public View_teams(Team view_team) {
        initComponents();
        if(view_team.getManager()==null){
            tmview_area.append("The team doesn't have a manager");
        }else{
                    tmview_area.append("Manager Name: "+view_team.getManager().getName()+" ID: "+view_team.getManager().getId()+" Salary: "+view_team.getManager().getSalary());
        }
        tmview_area.append("\n");
        if(view_team.getPlayers().isEmpty()){
            tmview_area.append("The team doesn't contain any players");
        }else{
        tmview_area.append("Players:");
        for(int i=0;i<view_team.getPlayers().size();i++){
            tmview_area.append(view_team.getPlayers().get(i).getName()+" ID: "+view_team.getPlayers().get(i).getId()+" Salary: "+view_team.getPlayers().get(i).getSalary());
            tmview_area.append("\n");
        }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Title2 = new javax.swing.JLabel();
        Main_panel2 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmview_area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Title2.setBackground(new java.awt.Color(255, 255, 255));
        Title2.setFont(new java.awt.Font("Gadugi", 0, 90)); // NOI18N
        Title2.setForeground(new java.awt.Color(0, 127, 255));
        Title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title2.setText("View Team");
        Title2.setToolTipText("");
        Title2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Main_panel2.setBackground(new java.awt.Color(255, 255, 255));
        Main_panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 10, true));

        jButton18.setBackground(new java.awt.Color(211, 211, 211));
        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 127, 255));
        jButton18.setText("Go Back");
        jButton18.setToolTipText("");
        jButton18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.setPreferredSize(new java.awt.Dimension(231, 51));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        tmview_area.setColumns(20);
        tmview_area.setRows(5);
        jScrollPane1.setViewportView(tmview_area);

        javax.swing.GroupLayout Main_panel2Layout = new javax.swing.GroupLayout(Main_panel2);
        Main_panel2.setLayout(Main_panel2Layout);
        Main_panel2Layout.setHorizontalGroup(
            Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panel2Layout.createSequentialGroup()
                .addGroup(Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_panel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Main_panel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)))
                .addGap(92, 92, 92))
        );
        Main_panel2Layout.setVerticalGroup(
            Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(Main_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Title2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1073, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try {
            // TODO add your handling code here:
            
            Select_Team_view V = new Select_Team_view();
            V.setVisible(true);
            this.setVisible(false);
            V.setSize(this.getSize());
        } catch (IOException ex) {
            Logger.getLogger(View_teams.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

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
            java.util.logging.Logger.getLogger(View_teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_teams().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main_panel2;
    private javax.swing.JLabel Title2;
    private javax.swing.JButton jButton18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tmview_area;
    // End of variables declaration//GEN-END:variables
}
