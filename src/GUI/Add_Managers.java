/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package GUI;
import Logic.*;
import Logic.Manager;
import Logic.Person;
import Logic.Player;
import Logic.Team;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Add_Managers extends javax.swing.JFrame 
{
    private void loadTeamsFromFile() 
    {
      
        try {
            DefaultComboBoxModel dmc = new DefaultComboBoxModel();
            //bind
            //add data
            teamComboBox.setModel(dmc);
            //populating The combo box
            ArrayList <Team> teams_temp= new SportsLeague().getTeams();
            for (int i=0;i< teams_temp.size();i++)
            {
                teamComboBox.addItem(teams_temp.get(i).getName());
            }    } catch (IOException ex) {
            Logger.getLogger(Add_Managers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Creates new form Add_Managers
     */
    public Add_Managers() 
    {
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

        addManagersPanel = new javax.swing.JPanel();
        addMngslbl = new javax.swing.JLabel();
        addMngsInputPanel = new javax.swing.JPanel();
        goBackBtn = new javax.swing.JButton();
        Field = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        Field1 = new javax.swing.JPanel();
        addressLabel = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        Field2 = new javax.swing.JPanel();
        dobLabel = new javax.swing.JLabel();
        dobTxt = new javax.swing.JTextField();
        Field3 = new javax.swing.JPanel();
        nationalityLabel = new javax.swing.JLabel();
        nationalityTxt = new javax.swing.JTextField();
        Field4 = new javax.swing.JPanel();
        salaryLabel = new javax.swing.JLabel();
        salaryTxt = new javax.swing.JTextField();
        Field5 = new javax.swing.JPanel();
        bonusLabel = new javax.swing.JLabel();
        bonusTxt = new javax.swing.JTextField();
        Field6 = new javax.swing.JPanel();
        qualificationsLabel = new javax.swing.JLabel();
        qualificationsTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        teamComboBox = new javax.swing.JComboBox<>();
        teamLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addManagersPanel.setBackground(new java.awt.Color(255, 255, 255));

        addMngslbl.setBackground(new java.awt.Color(255, 255, 255));
        addMngslbl.setFont(new java.awt.Font("Gadugi", 0, 90)); // NOI18N
        addMngslbl.setForeground(new java.awt.Color(0, 127, 255));
        addMngslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addMngslbl.setText("Add Managers");
        addMngslbl.setToolTipText("");
        addMngslbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addMngsInputPanel.setBackground(new java.awt.Color(255, 255, 255));
        addMngsInputPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 10, true));

        goBackBtn.setBackground(new java.awt.Color(211, 211, 211));
        goBackBtn.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        goBackBtn.setForeground(new java.awt.Color(0, 127, 255));
        goBackBtn.setText("Go Back");
        goBackBtn.setToolTipText("");
        goBackBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        goBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackBtn.setPreferredSize(new java.awt.Dimension(231, 51));
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        Field.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 127, 255));
        nameLabel.setText("Enter Name:");

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FieldLayout = new javax.swing.GroupLayout(Field);
        Field.setLayout(FieldLayout);
        FieldLayout.setHorizontalGroup(
            FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(86, 86, 86)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FieldLayout.setVerticalGroup(
            FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FieldLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field1.setBackground(new java.awt.Color(255, 255, 255));

        addressLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(0, 127, 255));
        addressLabel.setText("Enter Address:");

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field1Layout = new javax.swing.GroupLayout(Field1);
        Field1.setLayout(Field1Layout);
        Field1Layout.setHorizontalGroup(
            Field1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68)
                .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field1Layout.setVerticalGroup(
            Field1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field2.setBackground(new java.awt.Color(255, 255, 255));

        dobLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(0, 127, 255));
        dobLabel.setText("Enter Date of Birth:");

        dobTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field2Layout = new javax.swing.GroupLayout(Field2);
        Field2.setLayout(Field2Layout);
        Field2Layout.setHorizontalGroup(
            Field2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field2Layout.setVerticalGroup(
            Field2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobLabel))
                .addContainerGap())
        );

        Field3.setBackground(new java.awt.Color(255, 255, 255));

        nationalityLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        nationalityLabel.setForeground(new java.awt.Color(0, 127, 255));
        nationalityLabel.setText("Enter Nationality:");

        nationalityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field3Layout = new javax.swing.GroupLayout(Field3);
        Field3.setLayout(Field3Layout);
        Field3Layout.setHorizontalGroup(
            Field3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(nationalityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(nationalityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field3Layout.setVerticalGroup(
            Field3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalityLabel)
                    .addComponent(nationalityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field4.setBackground(new java.awt.Color(255, 255, 255));

        salaryLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        salaryLabel.setForeground(new java.awt.Color(0, 127, 255));
        salaryLabel.setText("Enter Salary:");

        salaryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryTxtActionPerformed(evt);
            }
        });
        salaryTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout Field4Layout = new javax.swing.GroupLayout(Field4);
        Field4.setLayout(Field4Layout);
        Field4Layout.setHorizontalGroup(
            Field4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field4Layout.setVerticalGroup(
            Field4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLabel)
                    .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field5.setBackground(new java.awt.Color(255, 255, 255));

        bonusLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        bonusLabel.setForeground(new java.awt.Color(0, 127, 255));
        bonusLabel.setText("Enter Bonus Percentage:");

        bonusTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonusTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field5Layout = new javax.swing.GroupLayout(Field5);
        Field5.setLayout(Field5Layout);
        Field5Layout.setHorizontalGroup(
            Field5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bonusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(bonusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field5Layout.setVerticalGroup(
            Field5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bonusLabel)
                    .addComponent(bonusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field6.setBackground(new java.awt.Color(255, 255, 255));

        qualificationsLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        qualificationsLabel.setForeground(new java.awt.Color(0, 127, 255));
        qualificationsLabel.setText("Enter Qualifications:");

        qualificationsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualificationsTxtActionPerformed(evt);
            }
        });
        qualificationsTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qualificationsTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout Field6Layout = new javax.swing.GroupLayout(Field6);
        Field6.setLayout(Field6Layout);
        Field6Layout.setHorizontalGroup(
            Field6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qualificationsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93)
                .addComponent(qualificationsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field6Layout.setVerticalGroup(
            Field6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qualificationsLabel)
                    .addComponent(qualificationsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        addBtn.setBackground(new java.awt.Color(211, 211, 211));
        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 127, 255));
        addBtn.setText("Add");
        addBtn.setToolTipText("");
        addBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setPreferredSize(new java.awt.Dimension(231, 51));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        teamComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamComboBoxActionPerformed(evt);
            }
        });

        teamLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        teamLabel.setForeground(new java.awt.Color(0, 127, 255));
        teamLabel.setText("Enter Team:");

        javax.swing.GroupLayout addMngsInputPanelLayout = new javax.swing.GroupLayout(addMngsInputPanel);
        addMngsInputPanel.setLayout(addMngsInputPanelLayout);
        addMngsInputPanelLayout.setHorizontalGroup(
            addMngsInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMngsInputPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addMngsInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Field6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addMngsInputPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(teamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addMngsInputPanelLayout.createSequentialGroup()
                        .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        addMngsInputPanelLayout.setVerticalGroup(
            addMngsInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMngsInputPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(Field5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(Field6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addMngsInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamLabel))
                .addGap(26, 26, 26)
                .addGroup(addMngsInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addManagersPanelLayout = new javax.swing.GroupLayout(addManagersPanel);
        addManagersPanel.setLayout(addManagersPanelLayout);
        addManagersPanelLayout.setHorizontalGroup(
            addManagersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addMngslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(addManagersPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(addMngsInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        addManagersPanelLayout.setVerticalGroup(
            addManagersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addManagersPanelLayout.createSequentialGroup()
                .addComponent(addMngslbl, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMngsInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(479, 479, 479))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1082, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addManagersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1348, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addManagersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        // TODO add your handling code here:
        
        Manage_Managers M = new Manage_Managers();
        M.setVisible(true);
        this.setVisible(false);
        M.setSize(this.getSize());
        
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try 
        {
      // Check if any field is empty
    if (nameTxt.getText().trim().isEmpty() || addressTxt.getText().trim().isEmpty() || dobTxt.getText().trim().isEmpty() || 
        nationalityTxt.getText().trim().isEmpty() || salaryTxt.getText().trim().isEmpty() || bonusTxt.getText().trim().isEmpty() || 
        qualificationsTxt.getText().trim().isEmpty() || teamComboBox.getSelectedItem() == null) 
    {
        JOptionPane.showMessageDialog(null, "All fields must be filled out!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if any field is empty
    }
    if (Double.parseDouble(salaryTxt.getText())<0) 
        {
             JOptionPane.showMessageDialog(null, "SALARY CAN'T BE NEGATIVE!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
            
        }
   if (Double.parseDouble(bonusTxt.getText())<0) 
        {
             JOptionPane.showMessageDialog(null, "BONUS CAN'T BE NEGATIVE!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
            
        }


        Manager m1 = new Manager();
        SportsLeague sl = new SportsLeague();
        Team tm = new Team();
        m1.setName(nameTxt.getText());
        m1.setAddress(addressTxt.getText());
        m1.setDob(dobTxt.getText());
        m1.setNationality(nationalityTxt.getText());

        double salary = Double.parseDouble(salaryTxt.getText());
        m1.setSalary(salary);

        double bonusPercentage = Double.parseDouble(bonusTxt.getText());
        m1.setBonusPercentage(bonusPercentage);

        m1.setQualifications(qualificationsTxt.getText());
        for (int i = 0; i < sl.getTeams().size(); i++) 
        {
            if (sl.getTeams().get(i).getName().equals(teamComboBox.getSelectedItem().toString())) 
            {
                tm = sl.getTeams().get(i);
            }
        }
        
        if (!sl.designateManager(m1, tm))
        {
            JOptionPane.showMessageDialog(null, "A Team MUST have only 1 Manager", "Manager Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if manager designation fails
        }

        String file_path_player = "managers.txt";
        String file_path_team = "teams.txt";
        try (FileOutputStream fosp = new FileOutputStream(file_path_player);
             FileOutputStream fost = new FileOutputStream(file_path_team);
             ObjectOutputStream oosp = new ObjectOutputStream(fosp);
             ObjectOutputStream oost = new ObjectOutputStream(fost)) 
        {
            oosp.writeObject(sl.getManagers());
            oost.writeObject(sl.getTeams());
            System.out.println("Manager Added");
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Add_Managers.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Manager added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

    } 
        catch (IOException ex) 
        {
        Logger.getLogger(Add_Managers.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (NumberFormatException ex)
        {
        JOptionPane.showMessageDialog(null, "Please enter valid numbers for salary and bonus percentage!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void teamComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamComboBoxActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_nameTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void dobTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTxtActionPerformed

    private void nationalityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityTxtActionPerformed

    private void salaryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryTxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_salaryTxtActionPerformed

    private void bonusTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonusTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bonusTxtActionPerformed

    private void qualificationsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualificationsTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualificationsTxtActionPerformed

    private void salaryTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryTxtKeyTyped
        // TODO add your handling code here:
            char c= evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            evt.consume();
        }
    }//GEN-LAST:event_salaryTxtKeyTyped

    private void qualificationsTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qualificationsTxtKeyTyped
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_qualificationsTxtKeyTyped

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
            java.util.logging.Logger.getLogger(Add_Managers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Managers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Managers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Managers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Managers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Field;
    private javax.swing.JPanel Field1;
    private javax.swing.JPanel Field2;
    private javax.swing.JPanel Field3;
    private javax.swing.JPanel Field4;
    private javax.swing.JPanel Field5;
    private javax.swing.JPanel Field6;
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel addManagersPanel;
    private javax.swing.JPanel addMngsInputPanel;
    private javax.swing.JLabel addMngslbl;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JLabel bonusLabel;
    private javax.swing.JTextField bonusTxt;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.JTextField nationalityTxt;
    private javax.swing.JLabel qualificationsLabel;
    private javax.swing.JTextField qualificationsTxt;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JComboBox<String> teamComboBox;
    private javax.swing.JLabel teamLabel;
    // End of variables declaration//GEN-END:variables
}
