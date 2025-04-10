package student.teacher.portal;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class TeacherMenuWindow extends javax.swing.JFrame {

    /**
     * Creates new form TeacherMenuWindow
     */
    
    Teacher teacher;
    
    Color OnEnteredColor;
    Color OnExitedColor;
    
    public TeacherMenuWindow(Teacher tea) {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icons8_Student_Male_50px.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocation(150, 10);
        setTitle("Student Teacher Portal");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        teacher = tea;
        
        OnEnteredColor= new Color(190,190,190);
        OnExitedColor = new Color(220,220,220);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PNL_Wrapper = new javax.swing.JPanel();
        PNL_Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BTN_Settings = new javax.swing.JButton();
        PNL_Footer = new javax.swing.JPanel();
        BTN_LogOut = new javax.swing.JButton();
        PNL_LeftPane = new javax.swing.JPanel();
        PNL_RightPane = new javax.swing.JPanel();
        PNL_MainBodyPane = new javax.swing.JPanel();
        PNL_BodyBelow = new javax.swing.JPanel();
        jPanel0 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PNL_Profile = new javax.swing.JPanel();
        BTN_Profile = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        PNL_MyCourses = new javax.swing.JPanel();
        BTN_MyCourses = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        PNL_Attendance = new javax.swing.JPanel();
        BTN_Attendance = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNL_Wrapper.setBackground(new java.awt.Color(255, 255, 255));
        PNL_Wrapper.setLayout(new java.awt.BorderLayout());

        PNL_Header.setBackground(new java.awt.Color(13, 56, 247));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Admin Settings Male_75px.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Teacher");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Teacher Portal");

        jPanel1.setBackground(new java.awt.Color(13, 56, 247));

        BTN_Settings.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Settings_30px.png"))); // NOI18N
        BTN_Settings.setBorder(null);
        BTN_Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BTN_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PNL_HeaderLayout.setVerticalGroup(
            PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_HeaderLayout.createSequentialGroup()
                .addGroup(PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(PNL_HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PNL_Wrapper.add(PNL_Header, java.awt.BorderLayout.PAGE_START);

        PNL_Footer.setBackground(new java.awt.Color(255, 255, 255));

        BTN_LogOut.setBackground(new java.awt.Color(13, 56, 247));
        BTN_LogOut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_LogOut.setForeground(new java.awt.Color(255, 255, 255));
        BTN_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Logout_Rounded_Left_20px.png"))); // NOI18N
        BTN_LogOut.setText("  Log Out");
        BTN_LogOut.setBorder(null);
        BTN_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_FooterLayout = new javax.swing.GroupLayout(PNL_Footer);
        PNL_Footer.setLayout(PNL_FooterLayout);
        PNL_FooterLayout.setHorizontalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_FooterLayout.createSequentialGroup()
                .addContainerGap(909, Short.MAX_VALUE)
                .addComponent(BTN_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PNL_FooterLayout.setVerticalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_FooterLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BTN_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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
            .addGap(0, 389, Short.MAX_VALUE)
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
            .addGap(0, 389, Short.MAX_VALUE)
        );

        PNL_Wrapper.add(PNL_RightPane, java.awt.BorderLayout.LINE_END);

        PNL_MainBodyPane.setBackground(new java.awt.Color(255, 255, 255));
        PNL_MainBodyPane.setLayout(new java.awt.BorderLayout());

        PNL_BodyBelow.setBackground(new java.awt.Color(255, 255, 255));
        PNL_BodyBelow.setLayout(new java.awt.GridLayout(3, 3, 9, 9));

        jPanel0.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel0Layout.setVerticalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        PNL_BodyBelow.add(jPanel0);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        PNL_BodyBelow.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        PNL_BodyBelow.add(jPanel3);

        PNL_Profile.setBackground(new java.awt.Color(220, 220, 220));
        PNL_Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PNL_ProfileMouseEntered(evt);
            }
        });

        BTN_Profile.setBackground(new java.awt.Color(220, 220, 220));
        BTN_Profile.setForeground(new java.awt.Color(13, 56, 247));
        BTN_Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Male User_60px.png"))); // NOI18N
        BTN_Profile.setBorder(null);
        BTN_Profile.setBorderPainted(false);
        BTN_Profile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_ProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_ProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_ProfileMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BTN_ProfileMouseReleased(evt);
            }
        });
        BTN_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ProfileActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Profile");

        javax.swing.GroupLayout PNL_ProfileLayout = new javax.swing.GroupLayout(PNL_Profile);
        PNL_Profile.setLayout(PNL_ProfileLayout);
        PNL_ProfileLayout.setHorizontalGroup(
            PNL_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BTN_Profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        PNL_ProfileLayout.setVerticalGroup(
            PNL_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_ProfileLayout.createSequentialGroup()
                .addComponent(BTN_Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PNL_BodyBelow.add(PNL_Profile);

        PNL_MyCourses.setBackground(new java.awt.Color(220, 220, 220));

        BTN_MyCourses.setBackground(new java.awt.Color(220, 220, 220));
        BTN_MyCourses.setForeground(new java.awt.Color(13, 56, 247));
        BTN_MyCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Invoice_50px_2.png"))); // NOI18N
        BTN_MyCourses.setBorder(null);
        BTN_MyCourses.setBorderPainted(false);
        BTN_MyCourses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_MyCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_MyCoursesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_MyCoursesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_MyCoursesMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BTN_MyCoursesMouseReleased(evt);
            }
        });
        BTN_MyCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MyCoursesActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("My Courses");

        javax.swing.GroupLayout PNL_MyCoursesLayout = new javax.swing.GroupLayout(PNL_MyCourses);
        PNL_MyCourses.setLayout(PNL_MyCoursesLayout);
        PNL_MyCoursesLayout.setHorizontalGroup(
            PNL_MyCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BTN_MyCourses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        PNL_MyCoursesLayout.setVerticalGroup(
            PNL_MyCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_MyCoursesLayout.createSequentialGroup()
                .addComponent(BTN_MyCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PNL_BodyBelow.add(PNL_MyCourses);

        PNL_Attendance.setBackground(new java.awt.Color(220, 220, 220));

        BTN_Attendance.setBackground(new java.awt.Color(220, 220, 220));
        BTN_Attendance.setForeground(new java.awt.Color(13, 56, 247));
        BTN_Attendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Timesheet_55px.png"))); // NOI18N
        BTN_Attendance.setBorder(null);
        BTN_Attendance.setBorderPainted(false);
        BTN_Attendance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_Attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_AttendanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_AttendanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_AttendanceMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BTN_AttendanceMouseReleased(evt);
            }
        });
        BTN_Attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AttendanceActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Attendance");

        javax.swing.GroupLayout PNL_AttendanceLayout = new javax.swing.GroupLayout(PNL_Attendance);
        PNL_Attendance.setLayout(PNL_AttendanceLayout);
        PNL_AttendanceLayout.setHorizontalGroup(
            PNL_AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BTN_Attendance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        PNL_AttendanceLayout.setVerticalGroup(
            PNL_AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_AttendanceLayout.createSequentialGroup()
                .addComponent(BTN_Attendance, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PNL_BodyBelow.add(PNL_Attendance);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        PNL_BodyBelow.add(jPanel);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        PNL_BodyBelow.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        PNL_BodyBelow.add(jPanel8);

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

    private void BTN_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SettingsActionPerformed
        
    }//GEN-LAST:event_BTN_SettingsActionPerformed

    private void BTN_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LogOutActionPerformed
        this.dispose();
        new SignIn().setVisible(true);
    }//GEN-LAST:event_BTN_LogOutActionPerformed

    private void BTN_MyCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_MyCoursesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_MyCoursesMouseClicked

    private void BTN_MyCoursesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_MyCoursesMouseEntered
        BTN_MyCourses.setBackground(OnEnteredColor);
        PNL_MyCourses.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_MyCoursesMouseEntered

    private void BTN_MyCoursesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_MyCoursesMouseExited
        BTN_MyCourses.setBackground(OnExitedColor);
        PNL_MyCourses.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_MyCoursesMouseExited

    private void BTN_MyCoursesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_MyCoursesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_MyCoursesMouseReleased

    private void BTN_MyCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MyCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_MyCoursesActionPerformed

    private void BTN_AttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_AttendanceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_AttendanceMouseClicked

    private void BTN_AttendanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_AttendanceMouseEntered
       BTN_Attendance.setBackground(OnEnteredColor);
        PNL_Attendance.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_AttendanceMouseEntered

    private void BTN_AttendanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_AttendanceMouseExited
       BTN_Attendance.setBackground(OnExitedColor);
        PNL_Attendance.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_AttendanceMouseExited

    private void BTN_AttendanceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_AttendanceMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_AttendanceMouseReleased

    private void BTN_AttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AttendanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_AttendanceActionPerformed

    private void BTN_ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseClicked
        
        new ProfileWindow(teacher).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_ProfileMouseClicked

    private void BTN_ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseEntered
        BTN_Profile.setBackground(OnEnteredColor);
        PNL_Profile.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_ProfileMouseEntered

    private void BTN_ProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseExited
        BTN_Profile.setBackground(OnExitedColor);
        PNL_Profile.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_ProfileMouseExited

    private void BTN_ProfileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ProfileMouseReleased

    private void BTN_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ProfileActionPerformed

    private void PNL_ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PNL_ProfileMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PNL_ProfileMouseEntered

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Attendance;
    private javax.swing.JButton BTN_LogOut;
    private javax.swing.JButton BTN_MyCourses;
    private javax.swing.JButton BTN_Profile;
    private javax.swing.JButton BTN_Settings;
    private javax.swing.JPanel PNL_Attendance;
    private javax.swing.JPanel PNL_BodyBelow;
    private javax.swing.JPanel PNL_Footer;
    private javax.swing.JPanel PNL_Header;
    private javax.swing.JPanel PNL_LeftPane;
    private javax.swing.JPanel PNL_MainBodyPane;
    private javax.swing.JPanel PNL_MyCourses;
    private javax.swing.JPanel PNL_Profile;
    private javax.swing.JPanel PNL_RightPane;
    private javax.swing.JPanel PNL_Wrapper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
