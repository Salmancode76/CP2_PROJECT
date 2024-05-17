/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import Logic.Player;
import Logic.SportsLeague;
import Logic.Team;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author faisa
 */
public class Edit_Player extends javax.swing.JFrame {

    
    private Player editPlayer;
    private int id_play;


    
    public Edit_Player() {
        initComponents();
       

    }
    /**
     * Creates new form Edit_Player
     * @param edit_Play
     * 
     */
    //passing edit_Play from select player page
    public Edit_Player(Player edit_Play) throws IOException { 
        
        initComponents();
          //setting the values in there correct components
         this.editPlayer=edit_Play;
        txt_edit_pla_name.setText(edit_Play.getName());
        txtAddress.setText(edit_Play.getAddress());
        txt_dob.setText(edit_Play.getDob());
        txt_natio.setText(edit_Play.getNationality());
        txt_salary.setText(String.valueOf((double) edit_Play.getSalary()));
        if(edit_Play.isIsCaptain()){
            Rbtn_yes.setSelected(true);
            
        }else{
            Rbtn_no.setSelected(true);
        }
        
        positionComboBox.setSelectedItem(edit_Play.getPosition());
        

       

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTG_captain = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        Title2 = new javax.swing.JLabel();
        Main_panel2 = new javax.swing.JPanel();
        Field = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_edit_pla_name = new javax.swing.JTextField();
        Field1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        Field2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        Field3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_natio = new javax.swing.JTextField();
        Field4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        Field5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Rbtn_yes = new javax.swing.JRadioButton();
        Rbtn_no = new javax.swing.JRadioButton();
        Field7 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        Field6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        positionComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Title2.setBackground(new java.awt.Color(255, 255, 255));
        Title2.setFont(new java.awt.Font("Gadugi", 0, 90)); // NOI18N
        Title2.setForeground(new java.awt.Color(0, 127, 255));
        Title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title2.setText("Edit Player Details");
        Title2.setToolTipText("");
        Title2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Main_panel2.setBackground(new java.awt.Color(255, 255, 255));
        Main_panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 10, true));

        Field.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 127, 255));
        jLabel1.setText("Enter Name:");

        txt_edit_pla_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edit_pla_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FieldLayout = new javax.swing.GroupLayout(Field);
        Field.setLayout(FieldLayout);
        FieldLayout.setHorizontalGroup(
            FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(86, 86, 86)
                .addComponent(txt_edit_pla_name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FieldLayout.setVerticalGroup(
            FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FieldLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_edit_pla_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 127, 255));
        jLabel2.setText("Enter Address:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field1Layout = new javax.swing.GroupLayout(Field1);
        Field1.setLayout(Field1Layout);
        Field1Layout.setHorizontalGroup(
            Field1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field1Layout.setVerticalGroup(
            Field1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 127, 255));
        jLabel3.setText("Enter Date of Birth:");

        txt_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field2Layout = new javax.swing.GroupLayout(Field2);
        Field2.setLayout(Field2Layout);
        Field2Layout.setHorizontalGroup(
            Field2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field2Layout.setVerticalGroup(
            Field2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 127, 255));
        jLabel4.setText("Enter Nationality:");

        txt_natio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_natioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field3Layout = new javax.swing.GroupLayout(Field3);
        Field3.setLayout(Field3Layout);
        Field3Layout.setHorizontalGroup(
            Field3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(txt_natio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field3Layout.setVerticalGroup(
            Field3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_natio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 127, 255));
        jLabel5.setText("Enter Salary:");

        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });
        txt_salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_salaryKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salaryKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout Field4Layout = new javax.swing.GroupLayout(Field4);
        Field4.setLayout(Field4Layout);
        Field4Layout.setHorizontalGroup(
            Field4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field4Layout.setVerticalGroup(
            Field4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 127, 255));
        jLabel6.setText("Make Captain:");

        BTG_captain.add(Rbtn_yes);
        Rbtn_yes.setText("Yes");
        Rbtn_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_yesActionPerformed(evt);
            }
        });

        BTG_captain.add(Rbtn_no);
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
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(195, 195, 195)
                .addComponent(Rbtn_yes)
                .addGap(72, 72, 72)
                .addComponent(Rbtn_no)
                .addGap(29, 29, 29))
        );
        Field5Layout.setVerticalGroup(
            Field5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Field5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Rbtn_no, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(Rbtn_yes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        Field7.setBackground(new java.awt.Color(255, 255, 255));

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

        btn_save.setBackground(new java.awt.Color(211, 211, 211));
        btn_save.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btn_save.setForeground(new java.awt.Color(0, 127, 255));
        btn_save.setText("Save");
        btn_save.setToolTipText("");
        btn_save.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 255), 4, true));
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.setPreferredSize(new java.awt.Dimension(231, 51));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Field7Layout = new javax.swing.GroupLayout(Field7);
        Field7.setLayout(Field7Layout);
        Field7Layout.setHorizontalGroup(
            Field7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Field7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Field7Layout.setVerticalGroup(
            Field7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field7Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(Field7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Field6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 127, 255));
        jLabel7.setText("Enter Postion:");

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Attack", "Defender", "Midfield", "Goal Keeper", "Forward" }));
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
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(107, 107, 107)
                .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Field6Layout.setVerticalGroup(
            Field6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Field6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Field6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Main_panel2Layout = new javax.swing.GroupLayout(Main_panel2);
        Main_panel2.setLayout(Main_panel2Layout);
        Main_panel2Layout.setHorizontalGroup(
            Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Field6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Main_panel2Layout.setVerticalGroup(
            Main_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Field5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Field6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title2, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(Main_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Title2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(447, 447, 447))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1074, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1227, Short.MAX_VALUE)
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
        Select_Player sp= new Select_Player();
        sp.setVisible(true);
        this.setVisible(false);
        sp.setSize(this.getSize());
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        FileOutputStream fo = null;
       SportsLeague sp = new SportsLeague(); 
       
        //changing the player info
         
            if(editPlayer.getTeam()==null){
            sp.editPlayerDetails(editPlayer, txt_edit_pla_name.getText(), txtAddress.getText(), txt_dob.getText(), txt_natio.getText(), Double.parseDouble(txt_salary.getText()), positionComboBox.getSelectedItem().toString());
   
                
            File file_edit_pla = new File("remain_players.txt");
                try {
                    fo = new FileOutputStream(file_edit_pla);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Edit_Player.class.getName()).log(Level.SEVERE, null, ex);
                }
            try {
                ObjectOutputStream oos = new ObjectOutputStream(fo);
                oos.writeObject(sp.getUnassign_players());
            } catch (IOException ex) {
                Logger.getLogger(Edit_Player.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }else{
                sp.editPlayerDetails(editPlayer, txt_edit_pla_name.getText(), txtAddress.getText(), txt_dob.getText(), txt_natio.getText(), Double.parseDouble(txt_salary.getText()), positionComboBox.getSelectedItem().toString());              
                          
                 if (Rbtn_yes.isSelected()) {
            sp.designateCaptain(editPlayer, editPlayer.getTeam());
        } else {
            sp.undesignateCaptain(editPlayer, editPlayer.getTeam());
        }
                      
                
            File file_edit_team = new File("teams.txt");              
            try {
                FileOutputStream    fot= new FileOutputStream(file_edit_team);
                ObjectOutputStream oost = new ObjectOutputStream(fot);
                oost.writeObject(sp.getTeams());
            } catch (IOException ex) {
                Logger.getLogger(Edit_Player.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
                
              

        
        
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_edit_pla_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edit_pla_nameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_edit_pla_nameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionComboBoxActionPerformed

    private void Rbtn_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_yesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbtn_yesActionPerformed

    private void Rbtn_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbtn_noActionPerformed

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

    private void txt_natioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_natioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_natioActionPerformed

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salaryActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_salaryActionPerformed

    private void txt_salaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salaryKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salaryKeyPressed

    private void txt_salaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salaryKeyTyped
        // TODO add your handling code here:
         char c= evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            evt.consume();
        }
    }//GEN-LAST:event_txt_salaryKeyTyped

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
            java.util.logging.Logger.getLogger(Edit_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BTG_captain;
    private javax.swing.JPanel Field;
    private javax.swing.JPanel Field1;
    private javax.swing.JPanel Field2;
    private javax.swing.JPanel Field3;
    private javax.swing.JPanel Field4;
    private javax.swing.JPanel Field5;
    private javax.swing.JPanel Field6;
    private javax.swing.JPanel Field7;
    private javax.swing.JPanel Main_panel2;
    private javax.swing.JRadioButton Rbtn_no;
    private javax.swing.JRadioButton Rbtn_yes;
    private javax.swing.JLabel Title2;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> positionComboBox;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_edit_pla_name;
    private javax.swing.JTextField txt_natio;
    private javax.swing.JTextField txt_salary;
    // End of variables declaration//GEN-END:variables
}
