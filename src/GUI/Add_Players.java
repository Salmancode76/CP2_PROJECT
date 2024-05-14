/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import Logic.Player;
import Logic.Person;
import Logic.Team;
import Logic.SportsLeague;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.ArrayList;


/**
 *
 * @author salma
 */

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Add_Players extends javax.swing.JFrame {
    DefaultComboBoxModel<String> dmc = new DefaultComboBoxModel<>();

    public Add_Players() {
        initComponents();
        loadTeamsFromFile(); // Load teams from file when Add_Players frame is created
    }

    private void loadTeamsFromFile() {
      
    DefaultComboBoxModel dmc = new DefaultComboBoxModel();
    //bind
    dmc.addElement("No Team");
    //add data
    teamComboBox1.setModel(dmc);
   //populating The combo box
    ArrayList <Team> teams_temp= new SportsLeague().getTeams();
   for (int i=0;i< teams_temp.size();i++) {
    teamComboBox1.addItem(teams_temp.get(i).getName());
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

        GP_captain = new javax.swing.ButtonGroup();
        addPlayersPanel = new javax.swing.JPanel();
        addPlayersLabel = new javax.swing.JLabel();
        addPlayersInputPanel = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        Field = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        Field1 = new javax.swing.JPanel();
        addressTxt = new javax.swing.JTextField();
        DOB = new javax.swing.JPanel();
        dobLabel = new javax.swing.JLabel();
        dobTxt = new javax.swing.JTextField();
        Field3 = new javax.swing.JPanel();
        nationalityLabel = new javax.swing.JLabel();
        nationalityTxt = new javax.swing.JTextField();
        Field4 = new javax.swing.JPanel();
        salaryLabel = new javax.swing.JLabel();
        salaryTxt = new javax.swing.JTextField();
        Field5 = new javax.swing.JPanel();
        isCaptainLabel = new javax.swing.JLabel();
        Rbtn_yes = new javax.swing.JRadioButton();
        Rbtn_no = new javax.swing.JRadioButton();
        Field7 = new javax.swing.JPanel();
        teamLabel = new javax.swing.JLabel();
        teamComboBox1 = new javax.swing.JComboBox<>();
        Field6 = new javax.swing.JPanel();
        positionLabel = new javax.swing.JLabel();
        positionComboBox = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        addressLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addPlayersPanel.setBackground(new java.awt.Color(255, 255, 255));

        addPlayersLabel.setBackground(new java.awt.Color(255, 255, 255));
        addPlayersLabel.setFont(new java.awt.Font("Gadugi", 0, 90)); // NOI18N
        addPlayersLabel.setForeground(new java.awt.Color(0, 127, 255));
        addPlayersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPlayersLabel.setText("Add Players");
        addPlayersLabel.setToolTipText("");
        addPlayersLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addPlayersInputPanel.setBackground(new java.awt.Color(255, 255, 255));
        addPlayersInputPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 10, true));
        addPlayersInputPanel.setPreferredSize(new java.awt.Dimension(606, 641));

        backBtn.setBackground(new java.awt.Color(211, 211, 211));
        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 127, 255));
        backBtn.setText("Go Back");
        backBtn.setToolTipText("");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setPreferredSize(new java.awt.Dimension(231, 51));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
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
                .addGap(74, 74, 74)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field1Layout = new javax.swing.GroupLayout(Field1);
        Field1.setLayout(Field1Layout);
        Field1Layout.setHorizontalGroup(
            Field1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Field1Layout.setVerticalGroup(
            Field1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field1Layout.createSequentialGroup()
                .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        DOB.setBackground(new java.awt.Color(255, 255, 255));

        dobLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(0, 127, 255));
        dobLabel.setText("Enter Date of Birth:");

        dobTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DOBLayout = new javax.swing.GroupLayout(DOB);
        DOB.setLayout(DOBLayout);
        DOBLayout.setHorizontalGroup(
            DOBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DOBLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DOBLayout.setVerticalGroup(
            DOBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DOBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DOBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(35, 35, 35)
                .addComponent(nationalityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        javax.swing.GroupLayout Field4Layout = new javax.swing.GroupLayout(Field4);
        Field4.setLayout(Field4Layout);
        Field4Layout.setHorizontalGroup(
            Field4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        isCaptainLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        isCaptainLabel.setForeground(new java.awt.Color(0, 127, 255));
        isCaptainLabel.setText("Is Captain:");

        GP_captain.add(Rbtn_yes);
        Rbtn_yes.setText("Yes");
        Rbtn_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_yesActionPerformed(evt);
            }
        });

        GP_captain.add(Rbtn_no);
        Rbtn_no.setText("No");
        Rbtn_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field5Layout = new javax.swing.GroupLayout(Field5);
        Field5.setLayout(Field5Layout);
        Field5Layout.setHorizontalGroup(
            Field5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isCaptainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(258, 258, 258)
                .addComponent(Rbtn_yes)
                .addGap(72, 72, 72)
                .addComponent(Rbtn_no))
        );
        Field5Layout.setVerticalGroup(
            Field5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isCaptainLabel)
                    .addGroup(Field5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Rbtn_no, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(Rbtn_yes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Field7.setBackground(new java.awt.Color(255, 255, 255));

        teamLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        teamLabel.setForeground(new java.awt.Color(0, 127, 255));
        teamLabel.setText("Enter Team:");

        teamComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No-Team" }));
        teamComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field7Layout = new javax.swing.GroupLayout(Field7);
        Field7.setLayout(Field7Layout);
        Field7Layout.setHorizontalGroup(
            Field7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(242, 242, 242)
                .addComponent(teamComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Field7Layout.setVerticalGroup(
            Field7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamLabel)
                    .addComponent(teamComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field6.setBackground(new java.awt.Color(255, 255, 255));

        positionLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        positionLabel.setForeground(new java.awt.Color(0, 127, 255));
        positionLabel.setText("Enter Postion:");

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Attack", "Defence", "Midfielder", "Goal Keeper" }));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field6Layout = new javax.swing.GroupLayout(Field6);
        Field6.setLayout(Field6Layout);
        Field6Layout.setHorizontalGroup(
            Field6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(positionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(101, 101, 101)
                .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Field6Layout.setVerticalGroup(
            Field6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positionLabel)
                    .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        addressLabel.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(0, 127, 255));
        addressLabel.setText("Enter Address:");

        javax.swing.GroupLayout addPlayersInputPanelLayout = new javax.swing.GroupLayout(addPlayersInputPanel);
        addPlayersInputPanel.setLayout(addPlayersInputPanelLayout);
        addPlayersInputPanelLayout.setHorizontalGroup(
            addPlayersInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlayersInputPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addPlayersInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Field6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addPlayersInputPanelLayout.createSequentialGroup()
                        .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Field1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayersInputPanelLayout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Field7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addPlayersInputPanelLayout.setVerticalGroup(
            addPlayersInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlayersInputPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(addPlayersInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Field5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPlayersInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addPlayersPanelLayout = new javax.swing.GroupLayout(addPlayersPanel);
        addPlayersPanel.setLayout(addPlayersPanelLayout);
        addPlayersPanelLayout.setHorizontalGroup(
            addPlayersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlayersPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(addPlayersInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPlayersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addPlayersPanelLayout.setVerticalGroup(
            addPlayersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlayersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPlayersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPlayersInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(481, 481, 481))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPlayersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPlayersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
       Manage_Players mp= new Manage_Players();
        mp.setVisible(true);
        this.setVisible(false);
        mp.setSize(this.getSize());
        
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionComboBoxActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        Player pl = new Player();
        pl.setName(nameTxt.getText());
        pl.setAddress(addressTxt.getText());
        pl.setDob(dobTxt.getText());
        pl.setNationality(nationalityTxt.getText());
       double salary = Double.parseDouble(salaryTxt.getText());
       pl.setSalary(salary);
 
       if(Rbtn_yes.isSelected()==true){
           pl.setIsCaptain(true);
           
       }else{
           pl.setIsCaptain(false);
       }
       pl.setPosition(positionComboBox.getSelectedItem().toString());
       
for (int i=0;i<new SportsLeague().getTeams().size();i++){
    if (new SportsLeague().getTeams().get(i).getName().equals(teamComboBox1.getSelectedItem().toString())){
        pl.setTeam(new SportsLeague().getTeams().get(i));
    }
}      
       
    // Similarly, set other properties of the Player
System.out.printf("ID: %s%n", pl.getID());
System.out.printf("Name: %s%n", pl.getName());
System.out.printf("Address: %s%n", pl.getAddress());
System.out.printf("Date of Birth: %s%n", pl.getDob());
System.out.printf("Nationality: %s%n", pl.getNationality());
System.out.printf("Salary: %.2f%n", pl.getSalary());
System.out.printf("Is Captain: %s%n", pl.isIsCaptain());
System.out.printf("Position: %s%n", pl.getPosition());
System.out.println("Team is "+ pl.getTeam());
       // System.out.println(nameTxt.getText());
      // add(nameTxt.getText());

        
        
        
       
       
       
    }//GEN-LAST:event_addBtnActionPerformed

    private void teamComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamComboBox1ActionPerformed

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

    private void Rbtn_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbtn_noActionPerformed

    private void Rbtn_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_yesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbtn_yesActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Players().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DOB;
    private javax.swing.JPanel Field;
    private javax.swing.JPanel Field1;
    private javax.swing.JPanel Field3;
    private javax.swing.JPanel Field4;
    private javax.swing.JPanel Field5;
    private javax.swing.JPanel Field6;
    private javax.swing.JPanel Field7;
    private javax.swing.ButtonGroup GP_captain;
    private javax.swing.JRadioButton Rbtn_no;
    private javax.swing.JRadioButton Rbtn_yes;
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel addPlayersInputPanel;
    private javax.swing.JLabel addPlayersLabel;
    private javax.swing.JPanel addPlayersPanel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JLabel isCaptainLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.JTextField nationalityTxt;
    private javax.swing.JComboBox<String> positionComboBox;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField salaryTxt;
    public javax.swing.JComboBox<String> teamComboBox1;
    private javax.swing.JLabel teamLabel;
    // End of variables declaration//GEN-END:variables
}
