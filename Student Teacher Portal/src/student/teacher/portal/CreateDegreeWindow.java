/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.teacher.portal;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CreateDegreeWindow extends javax.swing.JFrame {

   
    public CreateDegreeWindow() {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icons8_Student_Male_50px.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocation(150, 10);
        setTitle("Student Teacher Portal");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        PNL_Wrapper = new javax.swing.JPanel();
        PNL_Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PNL_Footer = new javax.swing.JPanel();
        BTN_Back = new javax.swing.JButton();
        BTN_Create = new javax.swing.JButton();
        PNL_LeftPane = new javax.swing.JPanel();
        PNL_RightPane = new javax.swing.JPanel();
        PNL_MainBodyPane = new javax.swing.JPanel();
        PNL_BodyTop = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PNL_BodyBelow = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        TF_Name = new javax.swing.JTextField();
        JC_Type = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        JC_Duration = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        TF_TotalFee = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNL_Wrapper.setBackground(new java.awt.Color(255, 255, 255));
        PNL_Wrapper.setLayout(new java.awt.BorderLayout());

        PNL_Header.setBackground(new java.awt.Color(13, 56, 247));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Admin Settings Male_75px.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Degree Program");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Teacher Portal");

        javax.swing.GroupLayout PNL_HeaderLayout = new javax.swing.GroupLayout(PNL_Header);
        PNL_Header.setLayout(PNL_HeaderLayout);
        PNL_HeaderLayout.setHorizontalGroup(
            PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_HeaderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(884, Short.MAX_VALUE))
        );
        PNL_HeaderLayout.setVerticalGroup(
            PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_HeaderLayout.createSequentialGroup()
                .addGroup(PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PNL_HeaderLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PNL_HeaderLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        PNL_Wrapper.add(PNL_Header, java.awt.BorderLayout.PAGE_START);

        PNL_Footer.setBackground(new java.awt.Color(255, 255, 255));

        BTN_Back.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Back.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Back.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Go_Back_20px.png"))); // NOI18N
        BTN_Back.setText("  Back");
        BTN_Back.setBorder(null);
        BTN_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BackActionPerformed(evt);
            }
        });

        BTN_Create.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Create.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Create.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Plus_20px.png"))); // NOI18N
        BTN_Create.setText("  Create");
        BTN_Create.setBorder(null);
        BTN_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_FooterLayout = new javax.swing.GroupLayout(PNL_Footer);
        PNL_Footer.setLayout(PNL_FooterLayout);
        PNL_FooterLayout.setHorizontalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_FooterLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BTN_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 783, Short.MAX_VALUE)
                .addComponent(BTN_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        PNL_FooterLayout.setVerticalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_FooterLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        PNL_Wrapper.add(PNL_Footer, java.awt.BorderLayout.PAGE_END);

        PNL_LeftPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PNL_LeftPaneLayout = new javax.swing.GroupLayout(PNL_LeftPane);
        PNL_LeftPane.setLayout(PNL_LeftPaneLayout);
        PNL_LeftPaneLayout.setHorizontalGroup(
            PNL_LeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PNL_LeftPaneLayout.setVerticalGroup(
            PNL_LeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        PNL_Wrapper.add(PNL_LeftPane, java.awt.BorderLayout.LINE_START);

        PNL_RightPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PNL_RightPaneLayout = new javax.swing.GroupLayout(PNL_RightPane);
        PNL_RightPane.setLayout(PNL_RightPaneLayout);
        PNL_RightPaneLayout.setHorizontalGroup(
            PNL_RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PNL_RightPaneLayout.setVerticalGroup(
            PNL_RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        PNL_Wrapper.add(PNL_RightPane, java.awt.BorderLayout.LINE_END);

        PNL_MainBodyPane.setBackground(new java.awt.Color(255, 255, 255));
        PNL_MainBodyPane.setLayout(new java.awt.BorderLayout());

        PNL_BodyTop.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 56, 247));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create Degree Program");

        javax.swing.GroupLayout PNL_BodyTopLayout = new javax.swing.GroupLayout(PNL_BodyTop);
        PNL_BodyTop.setLayout(PNL_BodyTopLayout);
        PNL_BodyTopLayout.setHorizontalGroup(
            PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_BodyTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
                .addContainerGap())
        );
        PNL_BodyTopLayout.setVerticalGroup(
            PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_BodyTopLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        PNL_MainBodyPane.add(PNL_BodyTop, java.awt.BorderLayout.PAGE_START);

        PNL_BodyBelow.setBackground(new java.awt.Color(255, 255, 255));
        PNL_BodyBelow.setLayout(new java.awt.GridLayout(1, 3, 9, 9));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(1, 1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        TF_Name.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TF_Name.setForeground(new java.awt.Color(51, 51, 51));
        TF_Name.setBorder(null);
        TF_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NameActionPerformed(evt);
            }
        });

        JC_Type.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        JC_Type.setForeground(new java.awt.Color(51, 51, 51));
        JC_Type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None","B.Tech" ,"Bachelor", "Master", "M.Phil", "Ph.D" }));
        JC_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_TypeActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(13, 56, 247));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(13, 56, 247));
        jLabel20.setText("Type");

        jSeparator17.setBackground(new java.awt.Color(13, 56, 247));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(13, 56, 247));
        jLabel21.setText("Name");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(JC_Type, javax.swing.GroupLayout.Alignment.TRAILING, 0, 325, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator17))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(JC_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(TF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 56, 247));
        jLabel6.setText("Duration (years)");

        JC_Duration.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        JC_Duration.setForeground(new java.awt.Color(51, 51, 51));
        JC_Duration.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1", "2", "3", "4", "5", "6" }));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(13, 56, 247));
        jLabel22.setText("Total Fee");

        TF_TotalFee.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TF_TotalFee.setForeground(new java.awt.Color(51, 51, 51));
        TF_TotalFee.setBorder(null);
        TF_TotalFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_TotalFeeActionPerformed(evt);
            }
        });

        jSeparator18.setBackground(new java.awt.Color(13, 56, 247));

        jSeparator19.setBackground(new java.awt.Color(13, 56, 247));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_TotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JC_Duration, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(JC_Duration, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(TF_TotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 991, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 139, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 140, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel2);

        jPanel4.add(jPanel5);

        PNL_BodyBelow.add(jPanel4);

        PNL_MainBodyPane.add(PNL_BodyBelow, java.awt.BorderLayout.CENTER);

        PNL_Wrapper.add(PNL_MainBodyPane, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNL_Wrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNL_Wrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BackActionPerformed

        new DegreeWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_BackActionPerformed

    private void BTN_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CreateActionPerformed
   if(!JC_Type.getSelectedItem().toString().equals("None")  || !TF_Name.getText().isEmpty()
               || !JC_Duration.getSelectedItem().toString().equals("None") || !TF_TotalFee.getText().isEmpty())
        {
            try {
                DegreeProgram dp = new DegreeProgram(
                    JC_Type.getSelectedItem().toString(), 
                    TF_Name.getText(),
                    Integer.parseInt(JC_Duration.getSelectedItem().toString()),
                    Double.parseDouble(TF_TotalFee.getText()));

                    Admin.getDegrees().add(dp);
                     
                    JDBC.insertData(dp);
                    
                    JOptionPane.showMessageDialog(null, "Degree Created Successfully!");
                    //Set Fields empty
                    JC_Duration.setSelectedIndex(0);
                    JC_Type.setSelectedIndex(0);
                    TF_Name.setText("");
                    TF_TotalFee.setText("");
                    
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Something might be wrong !");
            } 
            catch (Exception ex) {
                Logger.getLogger(CreateDegreeWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Fill all the feilds !");
        }
       
    }//GEN-LAST:event_BTN_CreateActionPerformed

    private void TF_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NameActionPerformed

    private void TF_TotalFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_TotalFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_TotalFeeActionPerformed

    private void JC_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JC_TypeActionPerformed

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
            java.util.logging.Logger.getLogger(CreateDegreeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateDegreeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateDegreeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateDegreeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateDegreeWindow().setVisible(true);
            }
        });
    }
    
    private static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_Create;
    private javax.swing.JComboBox JC_Duration;
    private javax.swing.JComboBox JC_Type;
    private javax.swing.JPanel PNL_BodyBelow;
    private javax.swing.JPanel PNL_BodyTop;
    private javax.swing.JPanel PNL_Footer;
    private javax.swing.JPanel PNL_Header;
    private javax.swing.JPanel PNL_LeftPane;
    private javax.swing.JPanel PNL_MainBodyPane;
    private javax.swing.JPanel PNL_RightPane;
    private javax.swing.JPanel PNL_Wrapper;
    private javax.swing.JTextField TF_Name;
    private javax.swing.JTextField TF_TotalFee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
