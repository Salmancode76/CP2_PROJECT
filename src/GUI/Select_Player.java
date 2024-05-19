/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Logic.SportsLeague;
import Logic.Player;
import Logic.Team;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author salma
 */
public class Select_Player extends javax.swing.JFrame {

    /**
     * Creates new form Select_Player
     */
    
   private void loadTeamsFromFile() throws IOException {
    DefaultComboBoxModel dmcp = new DefaultComboBoxModel();
    //bind
    select_teamCombo.setModel(dmcp);    

    // Create a single instance of SportsLeague
    SportsLeague sp = new SportsLeague();

    //populating The combo box with team players
    for(int i=0; i<sp.getTeams().size(); i++){
        for(int j=0; j<sp.getTeams().get(i).getPlayers().size(); j++){
            select_teamCombo.addItem(sp.getTeams().get(i).getPlayers().get(j).toString());
        }
    }

    //populating The combo box with unassigned players
    for(int i=0; i<sp.getUnassign_players().size(); i++){
        select_teamCombo.addItem(sp.getUnassign_players().get(i).toString());
    }
}

    public Select_Player() throws IOException {
        initComponents();
        loadTeamsFromFile();
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
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_select_player = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        select_teamCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("");

        Title2.setBackground(new java.awt.Color(255, 255, 255));
        Title2.setFont(new java.awt.Font("Gadugi", 0, 90)); // NOI18N
        Title2.setForeground(new java.awt.Color(0, 127, 255));
        Title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title2.setText("Select Players");
        Title2.setToolTipText("");
        Title2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Main_panel2.setBackground(new java.awt.Color(255, 255, 255));
        Main_panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 10, true));

        btn_back.setBackground(new java.awt.Color(211, 211, 211));
        btn_back.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 127, 255));
        btn_back.setText("Go Back");
        btn_back.setToolTipText("");
        btn_back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.setPreferredSize(new java.awt.Dimension(231, 51));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_select_player.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btn_select_player.setForeground(new java.awt.Color(0, 127, 255));
        btn_select_player.setText("Select Player");
        btn_select_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_select_playerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(btn_select_player, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_select_player)
                .addGap(0, 158, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 127, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Select Player :");

        select_teamCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_teamComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 127, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Choose Player to edit");

        javax.swing.GroupLayout Main_panel2Layout = new javax.swing.GroupLayout(Main_panel2);
        Main_panel2.setLayout(Main_panel2Layout);
        Main_panel2Layout.setHorizontalGroup(
            Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panel2Layout.createSequentialGroup()
                .addGroup(Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_panel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Main_panel2Layout.createSequentialGroup()
                            .addContainerGap(144, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Main_panel2Layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(select_teamCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(44, 44, 44))))
                .addGap(123, 123, 123))
            .addGroup(Main_panel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Main_panel2Layout.setVerticalGroup(
            Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_teamCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(Main_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(112, 112, 112))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Title2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(343, 343, 343))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 983, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1129, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
          Manage_Players mp= new Manage_Players();
        mp.setVisible(true);
        this.setVisible(false);
        mp.setSize(this.getSize());
       
    }//GEN-LAST:event_btn_backActionPerformed

    private void select_teamComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_teamComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_teamComboActionPerformed

    private void btn_select_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_select_playerActionPerformed
     
       try {                                                  
           
           SportsLeague sp=null;
           try {
               sp = new SportsLeague();
           } catch (IOException ex) {
               Logger.getLogger(Select_Player.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           ArrayList<Team> allTeams = new SportsLeague().getTeams();
           Player selectedPlayer = null;
           
           
           for (Team team : allTeams) {
               for (Player player : team.getPlayers()) {
                   if (player.toString().equals(select_teamCombo.getSelectedItem().toString() )) {
                       selectedPlayer = player;
                       break;
                   }
               }
               if (selectedPlayer != null) {
                   break;
               }
           }
           
           for (int i=0;i<sp.getUnassign_players().size();i++ ){
               if(sp.getUnassign_players().get(i).toString().equals(select_teamCombo.getSelectedItem().toString())){
                   selectedPlayer = sp.getUnassign_players().get(i);
                   break;
               }
               
           }
           
// Pass the selected player to the Edit_Player page
if (selectedPlayer != null) {
    Edit_Player ep = new Edit_Player();
    try {
        ep = new Edit_Player(selectedPlayer);
    } catch (IOException ex) {
        Logger.getLogger(Select_Player.class.getName()).log(Level.SEVERE, null, ex);
    }
    ep.setVisible(true);
    this.setVisible(false);
    ep.setSize(this.getSize());
} else {
    // Handle the case where the selected player is not found
    System.out.println("Selected player not found");
}

       } catch (IOException ex) {
           Logger.getLogger(Select_Player.class.getName()).log(Level.SEVERE, null, ex);
       }
         
    }//GEN-LAST:event_btn_select_playerActionPerformed

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
            java.util.logging.Logger.getLogger(Select_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Select_Player().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Select_Player.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main_panel2;
    private javax.swing.JLabel Title2;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_select_player;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> select_teamCombo;
    // End of variables declaration//GEN-END:variables
}
