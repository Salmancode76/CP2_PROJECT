/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

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

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Main_panel = new javax.swing.JPanel();
        View_Teams = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Add_Teams = new javax.swing.JButton();
        Edit_Teams = new javax.swing.JButton();
        Delete_Teams = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setFont(new java.awt.Font("Gadugi", 0, 90)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 127, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Manage Teams");
        Title.setToolTipText("");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Main_panel.setBackground(new java.awt.Color(255, 255, 255));
        Main_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 10, true));

        View_Teams.setBackground(new java.awt.Color(211, 211, 211));
        View_Teams.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        View_Teams.setForeground(new java.awt.Color(0, 127, 255));
        View_Teams.setText("View Teams");
        View_Teams.setToolTipText("");
        View_Teams.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        View_Teams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        View_Teams.setPreferredSize(new java.awt.Dimension(175, 51));
        View_Teams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_TeamsActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(211, 211, 211));
        Back.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 127, 255));
        Back.setText("Go Back");
        Back.setToolTipText("");
        Back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.setPreferredSize(new java.awt.Dimension(231, 51));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Add_Teams.setBackground(new java.awt.Color(211, 211, 211));
        Add_Teams.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Add_Teams.setForeground(new java.awt.Color(0, 127, 255));
        Add_Teams.setText("Add Teams");
        Add_Teams.setToolTipText("");
        Add_Teams.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        Add_Teams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_Teams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_TeamsActionPerformed(evt);
            }
        });

        Edit_Teams.setBackground(new java.awt.Color(211, 211, 211));
        Edit_Teams.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Edit_Teams.setForeground(new java.awt.Color(0, 127, 255));
        Edit_Teams.setText("Edit Teams");
        Edit_Teams.setToolTipText("");
        Edit_Teams.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        Edit_Teams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Edit_Teams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_TeamsActionPerformed(evt);
            }
        });

        Delete_Teams.setBackground(new java.awt.Color(211, 211, 211));
        Delete_Teams.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Delete_Teams.setForeground(new java.awt.Color(0, 127, 255));
        Delete_Teams.setText("Delete Teams");
        Delete_Teams.setToolTipText("");
        Delete_Teams.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        Delete_Teams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete_Teams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_TeamsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Main_panelLayout = new javax.swing.GroupLayout(Main_panel);
        Main_panel.setLayout(Main_panelLayout);
        Main_panelLayout.setHorizontalGroup(
            Main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_panelLayout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Main_panelLayout.createSequentialGroup()
                        .addGroup(Main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(View_Teams, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Add_Teams, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Edit_Teams, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                            .addComponent(Delete_Teams, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        Main_panelLayout.setVerticalGroup(
            Main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(View_Teams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(Add_Teams)
                .addGap(21, 21, 21)
                .addComponent(Edit_Teams)
                .addGap(21, 21, 21)
                .addComponent(Delete_Teams)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(Main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void View_TeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_TeamsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_TeamsActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void Add_TeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_TeamsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_TeamsActionPerformed

    private void Edit_TeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_TeamsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Edit_TeamsActionPerformed

    private void Delete_TeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_TeamsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete_TeamsActionPerformed

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
    private javax.swing.JButton Add_Teams;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete_Teams;
    private javax.swing.JButton Edit_Teams;
    private javax.swing.JPanel Main_panel;
    private javax.swing.JLabel Title;
    private javax.swing.JButton View_Teams;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}