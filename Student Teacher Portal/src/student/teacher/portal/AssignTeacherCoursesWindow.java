package student.teacher.portal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AssignTeacherCoursesWindow extends javax.swing.JFrame {

    /**
     * Creates new form AssignTeacherCoursesWindow
     *
     */
    String teacherID;
    JTable RightTable;
    JTable LeftTable;
    
    public AssignTeacherCoursesWindow( String id) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icons8_Student_Male_50px.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocation(150, 10);
        setTitle("Student Teacher Portal");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        teacherID = id;
        
        showRightTable();
        showLeftTable();
        
        for (Teacher teacher : Admin.getTeachers()) 
                            {
                                if(teacher.getUserId().equals(teacherID))
                                {
                                    jLabel4.setText(teacher.getFirstName()+ " "+ teacher.getLastName()+" Courses");
                                }
                            }
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
        PNL_Footer = new javax.swing.JPanel();
        BTN_Back = new javax.swing.JButton();
        BTN_Save = new javax.swing.JButton();
        PNL_LeftPane = new javax.swing.JPanel();
        PNL_RightPane = new javax.swing.JPanel();
        PNL_MainBodyPane = new javax.swing.JPanel();
        PNL_BodyTop = new javax.swing.JPanel();
        BTN_Search = new javax.swing.JButton();
        BTN_Remove = new javax.swing.JButton();
        BTN_Add = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PNL_BodyBelow = new javax.swing.JPanel();
        PNL_Left = new javax.swing.JPanel();
        PNL_Right = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNL_Wrapper.setBackground(new java.awt.Color(255, 255, 255));
        PNL_Wrapper.setLayout(new java.awt.BorderLayout());

        PNL_Header.setBackground(new java.awt.Color(13, 56, 247));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Admin Settings Male_75px.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Teacher Courses");

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
                .addContainerGap(711, Short.MAX_VALUE))
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

        BTN_Save.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Save.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Save.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Ok_20px_1.png"))); // NOI18N
        BTN_Save.setText("  Save");
        BTN_Save.setBorder(null);
        BTN_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_FooterLayout = new javax.swing.GroupLayout(PNL_Footer);
        PNL_Footer.setLayout(PNL_FooterLayout);
        PNL_FooterLayout.setHorizontalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_FooterLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BTN_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 616, Short.MAX_VALUE)
                .addComponent(BTN_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        PNL_FooterLayout.setVerticalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_FooterLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGap(0, 393, Short.MAX_VALUE)
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
            .addGap(0, 393, Short.MAX_VALUE)
        );

        PNL_Wrapper.add(PNL_RightPane, java.awt.BorderLayout.LINE_END);

        PNL_MainBodyPane.setBackground(new java.awt.Color(255, 255, 255));
        PNL_MainBodyPane.setLayout(new java.awt.BorderLayout());

        PNL_BodyTop.setBackground(new java.awt.Color(255, 255, 255));

        BTN_Search.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Search.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Search.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Search_20px.png"))); // NOI18N
        BTN_Search.setText("  Search");
        BTN_Search.setBorder(null);
        BTN_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SearchActionPerformed(evt);
            }
        });

        BTN_Remove.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Remove.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Remove.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Trash_Can_20px.png"))); // NOI18N
        BTN_Remove.setText("  Remove");
        BTN_Remove.setBorder(null);
        BTN_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RemoveActionPerformed(evt);
            }
        });

        BTN_Add.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Add.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Add.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Double_Left_20px.png"))); // NOI18N
        BTN_Add.setText("  Include");
        BTN_Add.setBorder(null);
        BTN_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AddActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 56, 247));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Teacher Name");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 56, 247));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Available Courses");

        javax.swing.GroupLayout PNL_BodyTopLayout = new javax.swing.GroupLayout(PNL_BodyTop);
        PNL_BodyTop.setLayout(PNL_BodyTopLayout);
        PNL_BodyTopLayout.setHorizontalGroup(
            PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_BodyTopLayout.createSequentialGroup()
                .addComponent(BTN_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PNL_BodyTopLayout.setVerticalGroup(
            PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_BodyTopLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        PNL_MainBodyPane.add(PNL_BodyTop, java.awt.BorderLayout.PAGE_START);

        PNL_BodyBelow.setBackground(new java.awt.Color(255, 255, 255));
        PNL_BodyBelow.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        PNL_Left.setBackground(new java.awt.Color(204, 204, 204));
        PNL_Left.setLayout(new java.awt.BorderLayout());
        PNL_BodyBelow.add(PNL_Left);

        PNL_Right.setBackground(new java.awt.Color(204, 204, 204));
        PNL_Right.setLayout(new java.awt.BorderLayout());
        PNL_BodyBelow.add(PNL_Right);

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

        new TeacherWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_BackActionPerformed

    private void BTN_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SaveActionPerformed
        for (Teacher teacher : Admin.getTeachers()) {
                            if(teacher.getUserId().equals(teacherID))
                            {
                                try {
                                    JDBC.updateData(teacher);
                                    
                                    for (Course course : Admin.getCourses()) {
                                        JDBC.updateData(course);
                                        //break;
                                    }
                                    
                                    JOptionPane.showMessageDialog(null, "Courses saved successfully !");
                                } catch (Exception ex) {
                                    Logger.getLogger(AssignDegreeCoursesWindow.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                break;
                            }
        }
    }//GEN-LAST:event_BTN_SaveActionPerformed

    private void BTN_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SearchActionPerformed

    }//GEN-LAST:event_BTN_SearchActionPerformed

    private void BTN_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RemoveActionPerformed
                
        try {
            
        String courseID = (String) LeftTable.getValueAt(LeftTable.getSelectedRow(), 0);
        
        for (Teacher teacher : Admin.getTeachers()) 
         {
                  if(teacher.getUserId().equals(teacherID))
                  {
                            for (Course course : teacher.getCourseList()) 
                                    {
                                        if(course.getId().equals(courseID))
                                        {
                                            for (Course adminCorse : Admin.getCourses()) {
                                                if(adminCorse.getId().equals(courseID)){
                                                    adminCorse.setAssignStatus(false);
                                                }
                                            }
                                            
                                            teacher.getCourseList().remove(course);
                                            
                                            PNL_Right.removeAll();
                                            PNL_Right.updateUI();
                                            showRightTable();
                                            break;
                                        }
                                        
                                    }   
                            break;
                                    
                  }
        }
        
        PNL_Left.removeAll();
        PNL_Left.updateUI();
        showLeftTable();
                              
        
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Please select a course first !");
        } 

       
    }//GEN-LAST:event_BTN_RemoveActionPerformed

    private void BTN_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AddActionPerformed
        try {
            
                String courseID = (String) RightTable.getValueAt(RightTable.getSelectedRow(), 0);
                
                boolean typeSetted = false;
                Course newCourse = new Course();
                //String type= "";
                
                
                    
                    //if(RB_Core.isSelected()){
                       // type = "Core";
                   // }else{
                        //type = "Elective";
                    //}
                    for (Course course : Admin.getCourses())
                    {
                        if(course.getId().equals(courseID))
                        {
                            newCourse = course;
                            for (Teacher teacher : Admin.getTeachers()) 
                            {
                                if(teacher.getUserId().equals(teacherID))
                                {
                                    for (Course course1 : teacher.getCourseList()) 
                                    {
                                        if(course1.getId().equals(courseID))
                                        {
                                            //course1.setType(type);
                                            typeSetted = true;
                                            
                                            
                                            JOptionPane.showMessageDialog(null, "Course Already Exist !");
                                            
                                            //PNL_Left.removeAll();
                                            //PNL_Left.updateUI();
                                            //showLeftTable();
                                            
                                            break;
                                        }
                                        
                                    }
                                    
                                    
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    if(!typeSetted){
                        for (Teacher teacher : Admin.getTeachers()) {
                            if(teacher.getUserId().equals(teacherID))
                            {
                                newCourse.setAssignStatus(true);
                                //JDBC.updateData(newCourse);
                                teacher.getCourseList().add(newCourse);
                                
                                PNL_Left.removeAll();
                                PNL_Left.updateUI();
                                showLeftTable();
                                
                                PNL_Right.removeAll();
                                PNL_Right.updateUI();
                                showRightTable();
                                break;
                            }
                        }
                    }
            
                
                
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Please select a course first !");
        }
            
    }//GEN-LAST:event_BTN_AddActionPerformed
    private void showRightTable(){
        int rowSize = 0;
        
        for (Course course : Admin.getCourses()) {
            if(!course.getAssignStatus()){
                rowSize++;
            }
        }
        
        Object[][] data = new Object[rowSize][5];
        
        int i =0;
        for (Course c : Admin.getCourses())
        {    
            if(!c.getAssignStatus()){
                    data[i][0]=c.getId();
                    data[i][1]=c.getTitle();
                    data[i][2]=c.getCreditHours();
                    data[i][3]=c.getType();
                    data[i][4]=c.getCategory();
              
                i++;
            }
        }
        
        
        // Column Names 
        String[] columnNames = { "ID", "Title", "Cr. Hr", "Type", "Category" }; 
  
        RightTable = new JTable(data, columnNames); 
        RightTable.setRowHeight(28);
        
        javax.swing.table.TableColumn column = RightTable.getColumnModel().getColumn(1);
        column.setMinWidth(200);
        
        
        JScrollPane sp = new JScrollPane(RightTable);
        PNL_Right.add(sp);
        
        
      Font f = new Font("Trebuchet MS", Font.PLAIN, 14);
      JTableHeader header = RightTable.getTableHeader();
      header.setFont(f);
              
      Color c= new Color(13,56,247);
      Color c2= new Color(255,255,255);
      header.setBackground(c);
      header.setForeground(c2);
      
      
      JTableHeader th = RightTable.getTableHeader();
      th.setPreferredSize(new Dimension(100, 30));
      
      
        
    }
    
    private void showLeftTable(){
        int count = 0;
        for (Teacher teacher : Admin.getTeachers()) {
            if(teacher.getUserId().equals(teacherID)){
                for (Course c : teacher.getCourseList())
                    {   
                      count++;
                    }
            }
        }
        
        Object[][] data = new Object[count][3];
        
        int i =0;
        
        for (Teacher teacher : Admin.getTeachers()) {
            
            if(teacher.getUserId().equals(teacherID)){
                for (Course c : teacher.getCourseList())
                    {    
                        data[i][0]=c.getId();
                        data[i][1]=c.getTitle();
                        data[i][2]=c.getType();
                        i++;

                    }
                
            }
        }
        
        
        // Column Names 
        String[] columnNames = { "ID", "Title", "Type"}; 
  
        // Initializing the JTable 
        LeftTable = new JTable(data, columnNames); 
        LeftTable.setRowHeight(28);
        
        javax.swing.table.TableColumn column = LeftTable.getColumnModel().getColumn(1);
        column.setMinWidth(250);
        
        
        JScrollPane sp = new JScrollPane(LeftTable);
        PNL_Left.add(sp);
        
        
      Font f = new Font("Trebuchet MS", Font.PLAIN, 14);
      JTableHeader header = LeftTable.getTableHeader();
      header.setFont(f);
              
      Color c= new Color(13,56,247);
      Color c2= new Color(255,255,255);
      header.setBackground(c);
      header.setForeground(c2);
      
      
      JTableHeader th = LeftTable.getTableHeader();
      th.setPreferredSize(new Dimension(100, 30));
      
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Add;
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_Remove;
    private javax.swing.JButton BTN_Save;
    private javax.swing.JButton BTN_Search;
    private javax.swing.JPanel PNL_BodyBelow;
    private javax.swing.JPanel PNL_BodyTop;
    private javax.swing.JPanel PNL_Footer;
    private javax.swing.JPanel PNL_Header;
    private javax.swing.JPanel PNL_Left;
    private javax.swing.JPanel PNL_LeftPane;
    private javax.swing.JPanel PNL_MainBodyPane;
    private javax.swing.JPanel PNL_Right;
    private javax.swing.JPanel PNL_RightPane;
    private javax.swing.JPanel PNL_Wrapper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
