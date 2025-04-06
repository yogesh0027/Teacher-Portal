
package student.teacher.portal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class JDBC {
          private static final String USER = "root";
	private static final String PASS = "root";
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
          private static final String ser_URL = "jdbc:mysql://localhost/";
          
        

          private static final String dbName = "studentteacherportal";
          private static final String tableAdmin = "Admin";
          private static final String tableCourses = "Courses";
          private static final String tableDegrees = "Degrees";
          private static final String tableStudent = "Student";
          private static final String tableTeacher = "Teacher";
          private static final String db_URL = ser_URL+dbName;
          
         
          public static Admin isUser(String username, String password){
		try{
			Connection conn = get_Connection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableAdmin);
			while(rs.next()){
				if(rs.getString("userID").equals(username) 
                                                && rs.getString("password").equals(password)){
                                            Admin admin = new Admin(rs.getString("userID"), rs.getString("password"), 
                                                    rs.getString("first"), rs.getString("last"), rs.getString("gender"), 
                                                    rs.getString("phno"), rs.getString("email"), rs.getString("address"), 
                                                    rs.getString("cnic"), rs.getString("role"), rs.getString("country"), 
                                                    rs.getString("city"), rs.getString("zipcode"), 
                                                    rs.getString("accountstatus"));
                                            
                                            
					return admin;
				}
			}
			
		}catch(Exception e){
                        e.printStackTrace();
		}
                    
		return null;
	}


          
          public static ArrayList<Course> getCourses(){
              ArrayList<Course> courses = new ArrayList<>();
		try{
			Connection conn = get_Connection();
                              createCoursesTableIfNotExists();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableCourses);
			while(rs.next()){
				
                                            Course course = new Course(rs.getString("courseID"), rs.getString("title"), 
                                                    rs.getInt("credithours"), rs.getString("type"), rs.getString("category"), 
                                                    rs.getBoolean("assignstatus"));
                                            
                                            courses.add(course);
			}
		}catch(Exception e){
                        e.printStackTrace();
		}
                    return courses;
	}
          
          
          public static ArrayList<DegreeProgram> getDegrees(){
              
              ArrayList<DegreeProgram> degrees = new ArrayList<>();
	
              try{
			Connection conn = get_Connection();
                              createDegreeTableIfNotExists();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableDegrees);
			while(rs.next()){
			
                                String coursesStr = rs.getString("courses");
                                String[] coursesIDArr = coursesStr.split("-");
                                ArrayList<Course> courseslist = new ArrayList<>();
                                for (int i = 0; i < coursesIDArr.length; i++) {
                                    //System.err.println(coursesIDArr[i]);
                                    for (Course course : Admin.getCourses()) {
                                         //System.out.println(course.getId());
                                        if(course.getId().equals(coursesIDArr[i])){
                                            courseslist.add(course);
                                           //System.out.println(course.getId());
                                            break;
                                            }
                                        }
                                    }
                                        
                                DegreeProgram dp = new DegreeProgram(rs.getString("type"), rs.getString("name"),
                                        rs.getInt("duration"), rs.getInt("noofquarters"),rs.getDouble("totalfee"),
                                        courseslist, rs.getString("id"));
                                
                                  /*for (Course course : courseslist) {
                                      System.out.println(course.getId());
                                  }*/
                               
                                degrees.add(dp);
                                            
			}
		}catch(Exception e){
                        e.printStackTrace();
		}
                    return degrees;
	}
          
          
          public static ArrayList<Student> getStudents(){
              ArrayList<Student> students = new ArrayList<>();
		try{
			Connection conn = get_Connection();
                              createStudentTableIfNotExists();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableStudent);
			while(rs.next()){
                                  
                                  String degID = rs.getString("degreeID");
                                  DegreeProgram deg = new DegreeProgram();
                                  
                                  for (DegreeProgram degree : Admin.getDegrees()) {
                                      if(degree.getId().equals(degID)){
                                          deg = degree;
                                      }
                                  }
				
                                            Student student = new Student(rs.getString("userID"), rs.getString("password"), 
                                                    rs.getString("first"), rs.getString("last"), rs.getString("gender"), 
                                                    rs.getString("phno"), rs.getString("address"), rs.getString("cnic"), 
                                                    rs.getString("role"), rs.getString("email"), rs.getString("country"), 
                                                    rs.getString("city"), rs.getString("zipcode"), 
                                                    rs.getString("accountstatus"), deg);
                                            
                                            students.add(student);
			}
		}catch(Exception e){
                        e.printStackTrace();
		}
                    return students;
	}
          public static ArrayList<Teacher> getTeachers(){
              ArrayList<Teacher> teachers = new ArrayList<>();
		try{
			Connection conn = get_Connection();
                              createTeacherTableIfNotExists();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableTeacher);
			while(rs.next())
                              {
                                  ArrayList<Course> courseslist = new ArrayList<>();
                                  try {
                                    String coursesStr = rs.getString("courses");
                                    String[] coursesIDArr = coursesStr.split("-");
                                    for (int i = 0; i < coursesIDArr.length; i++) {
                                        //System.err.println(coursesIDArr[i]);
                                        for (Course course : Admin.getCourses()) {
                                             //System.out.println(course.getId());
                                            if(course.getId().equals(coursesIDArr[i])){
                                                courseslist.add(course);
                                               //System.out.println(course.getId());
                                                break;
                                                }
                                            }
                                        }
                                   } catch (NullPointerException e) {}
				
                                            Teacher teacher = new Teacher(rs.getString("userID"), rs.getString("password"), 
                                                    rs.getString("first"), rs.getString("last"), rs.getString("gender"), 
                                                    rs.getString("phno"), rs.getString("address"), rs.getString("cnic"), 
                                                    rs.getString("role"), rs.getString("email"), rs.getString("country"), 
                                                    rs.getString("city"), rs.getString("zipcode"), 
                                                    rs.getString("accountstatus"), courseslist);
                                            
                                            teachers.add(teacher);
			}
		}catch(Exception e){
                        e.printStackTrace();
		}
                    return teachers;
	}
          
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          
          public static void insertData(Admin admin)
                            throws Exception{
		try{
			
			Connection conn = get_Connection();
                              createAdminTableIfNotExists();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO "+tableAdmin+"" 
                              + "(userID, password, first, last, gender, phno, email,"
                              + " address, cnic, role, country, city, zipcode, accountstatus"
                              + ")"
			+"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                              
                                stmt.setString(1, admin.getUserId());
                                stmt.setString(2, admin.getPassword());
                                stmt.setString(3, admin.getFirstName());
                                stmt.setString(4, admin.getLastName());
                                stmt.setString(5, admin.getGender());
                                stmt.setString(6, admin.getPhoneNo());
                                stmt.setString(7, admin.getEmail());
                                stmt.setString(8, admin.getAddress());
                                stmt.setString(9, admin.getCnic());
                                stmt.setString(10, admin.getRole());
                                stmt.setString(11, admin.getCountry());
                                stmt.setString(12, admin.getCity());
                                stmt.setString(13, admin.getZipcode());
                                stmt.setString(14, admin.getAccountStatus());
                              
                              
                              
                              
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Information Udated!");
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
          public static void insertData(Student student)
                            throws Exception{
              
		try{
			
			Connection conn = get_Connection();
                              createStudentTableIfNotExists();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO "+tableStudent+"" 
                              + "(userID, password, first, last, gender, phno, email,"
                              + "address, role, cnic, country, city, zipcode, accountstatus, degreeID"
                              + ")"
			+"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                              
                                stmt.setString(1, student.getUserId());
                                stmt.setString(2, student.getPassword());
                                stmt.setString(3, student.getFirstName());
                                stmt.setString(4, student.getLastName());
                                stmt.setString(5, student.getGender());
                                stmt.setString(6, student.getPhoneNo());
                                stmt.setString(7, student.getEmail());
                                stmt.setString(8, student.getAddress());
                                stmt.setString(9, student.getCnic());
                                stmt.setString(10, student.getRole());
                                stmt.setString(11, student.getCountry());
                                stmt.setString(12, student.getCity());
                                stmt.setString(13, student.getZipcode());
                                stmt.setString(14, student.getAccountStatus());
                                stmt.setString(15, student.getDegree().getId());
                                
                               
                              
                              
                              
                              
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Information Udated!");
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
          public static void insertData(Teacher teacher)
                            throws Exception{
		try{
			
			Connection conn = get_Connection();
                              createStudentTableIfNotExists();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO "+tableTeacher+"" 
                              + "(userID, password, first, last, gender, phno, email,"
                              + "address, role, cnic, country, city, zipcode, accountstatus"
                              + ")"
			+"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                              
                                stmt.setString(1, teacher.getUserId());
                                stmt.setString(2, teacher.getPassword());
                                stmt.setString(3, teacher.getFirstName());
                                stmt.setString(4, teacher.getLastName());
                                stmt.setString(5, teacher.getGender());
                                stmt.setString(6, teacher.getPhoneNo());
                                stmt.setString(7, teacher.getEmail());
                                stmt.setString(8, teacher.getAddress());
                                stmt.setString(9, teacher.getCnic());
                                stmt.setString(10, teacher.getRole());
                                stmt.setString(11, teacher.getCountry());
                                stmt.setString(12, teacher.getCity());
                                stmt.setString(13, teacher.getZipcode());
                                stmt.setString(14, teacher.getAccountStatus());
                              
                              
                              
                              
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Information Udated!");
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
          public static void insertData(Course course)
                            throws Exception{
		try{
			
			Connection conn = get_Connection();
                              createCoursesTableIfNotExists();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO "+tableCourses+"" 
                              + "(courseID, title, credithours, type, category, assignstatus"
                              + ")"
			+"VALUES (?, ?, ?, ?, ?, ?)");
                              
                                stmt.setString(1, course.getId());
                                stmt.setString(2, course.getTitle());
                                stmt.setInt(3, course.getCreditHours());
                                stmt.setString(4, course.getType());
                                stmt.setString(5, course.getCategory());
                                stmt.setBoolean(6, course.getAssignStatus());
                              
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Information Udated!");
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
          public static void insertData(DegreeProgram degree)
                            throws Exception{
                String coursesStr = "";

                try {

                for (Course course: degree.getCourseList()) {
                    coursesStr += course.getId()+"-";
                }

                } 
                catch (NullPointerException e) 
                {
                    coursesStr = "";
                }                
		try{
			
			Connection conn = get_Connection();
                        createCoursesTableIfNotExists();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO "+tableDegrees+"" 
                              + "(id, type, name, duration, noofquarters, totalfee, courses"
                              + ")"
			+"VALUES (?,?, ?, ?, ?, ?, ?)");
                              
                                stmt.setString(1, degree.getId());
                                stmt.setString(2, degree.getType());
                                stmt.setString(3, degree.getName());
                                stmt.setInt(4, degree.getDuration());
                                stmt.setInt(5, degree.getNoOfQuarters());
                                stmt.setDouble(6, degree.getTotalFee());
                                stmt.setString(7, coursesStr);
                              
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Information Udated!");
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          
                   public static void updateData(Admin admin)
                            throws Exception{
                       
		try{
			
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE "+tableAdmin+" SET first = ?, last = ?,"
                                      + "gender = ?, phno = ?, email = ?, address = ?, cnic = ?, country = ?,"
                                      + "city = ?, accountstatus = ?, zipcode = ? WHERE userID = ?");
                                stmt.setString(1, admin.getFirstName());
                                stmt.setString(2, admin.getLastName());
                                stmt.setString(3, admin.getGender());
                                stmt.setString(4, admin.getPhoneNo());
                                stmt.setString(5, admin.getEmail());
                                stmt.setString(6, admin.getAddress());
                                stmt.setString(7, admin.getCnic());
                                stmt.setString(8, admin.getCountry());
                                stmt.setString(9, admin.getCity());
                                stmt.setString(10, admin.getAccountStatus());
                                stmt.setString(11, admin.getZipcode());
                                stmt.setString(12, admin.getUserId());
                              
                              
			stmt.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}
                }
                   
                   public static void updateData(Student stu)
                            throws Exception{
                       
		try{
			
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE "+tableStudent+" SET first = ?, last = ?,"
                                      + "gender = ?, phno = ?, email = ?, address = ?, cnic = ?, country = ?,"
                                      + "city = ?, accountstatus = ?, zipcode = ? WHERE userID = ?");
                                stmt.setString(1, stu.getFirstName());
                                stmt.setString(2, stu.getLastName());
                                stmt.setString(3, stu.getGender());
                                stmt.setString(4, stu.getPhoneNo());
                                stmt.setString(5, stu.getEmail());
                                stmt.setString(6, stu.getAddress());
                                stmt.setString(7, stu.getCnic());
                                stmt.setString(8, stu.getCountry());
                                stmt.setString(9, stu.getCity());
                                stmt.setString(10, stu.getAccountStatus());
                                stmt.setString(11, stu.getZipcode());
                                stmt.setString(12, stu.getUserId());
                              
			stmt.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}
                }
                   
                   public static void updateData(Teacher teacher)
                            throws Exception{
                       
                       String coursesStr = "";
              
              try {
              
              for (Course course: teacher.getCourseList()) {
                  coursesStr += course.getId()+"-";
                  //System.out.println(course.getId());
              }
              
              } 
              catch (NullPointerException e) 
              {
                  coursesStr = "";
              }
                         
		try{
			
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE "+tableTeacher+" SET first = ?, last = ?,"
                                      + "gender = ?, phno = ?, email = ?, address = ?, cnic = ?, country = ?,"
                                      + "city = ?, accountstatus = ?, zipcode = ?, courses = ? WHERE userID = ?");
                                stmt.setString(1, teacher.getFirstName());
                                stmt.setString(2, teacher.getLastName());
                                stmt.setString(3, teacher.getGender());
                                stmt.setString(4, teacher.getPhoneNo());
                                stmt.setString(5, teacher.getEmail());
                                stmt.setString(6, teacher.getAddress());
                                stmt.setString(7, teacher.getCnic());
                                stmt.setString(8, teacher.getCountry());
                                stmt.setString(9, teacher.getCity());
                                stmt.setString(10, teacher.getAccountStatus());
                                stmt.setString(11, teacher.getZipcode());
                                stmt.setString(12, coursesStr);
                                stmt.setString(13, teacher.getUserId());
                              
			stmt.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}
                }
                   
                   public static void updateData(Course course)
                            throws Exception{
                       
		try{
			
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE "+tableCourses+" SET title = ?, "
                                      + "credithours = ?, category = ?, type = ?, assignstatus = ? WHERE courseID = ?");
                                stmt.setString(1, course.getTitle());
                                stmt.setInt(2, course.getCreditHours());
                                stmt.setString(3, course.getCategory());
                                stmt.setString(4, course.getType());
                                stmt.setBoolean(5, course.getAssignStatus());
                                stmt.setString(6, course.getId());
                              
			stmt.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}
                    
                    
	}
                  
          public static void updateData(DegreeProgram degree)
                            throws Exception{
              String coursesStr = "";
              
              try {
              
              for (Course course: degree.getCourseList()) {
                  coursesStr += course.getId()+"-";
                  //System.out.println(course.getId());
              }
              
              } 
              catch (NullPointerException e) 
              {
                  coursesStr = "";
              }
                       
		try{
			
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE "+tableDegrees+" SET name = ?, "
                                      + "duration = ?, type = ?, totalfee = ?, courses = ? WHERE id = ?");
                                stmt.setString(1, degree.getName());
                                stmt.setInt(2, degree.getDuration());
                                stmt.setString(3, degree.getType());
                                stmt.setDouble(4, degree.getTotalFee());
                                stmt.setString(5, coursesStr);
                                stmt.setString(6, degree.getId());
                              
                                stmt.executeUpdate();
                              
		}catch(Exception e){
			System.out.println(e);
		}
                    
                    
	}
                   
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          /////////////////////////////////////////////////////////////////////////////////////////////////////
         public static void removeCourse(String id){
             try{
                 Connection conn = get_Connection();
                 String sql = "DELETE FROM "+tableCourses+" WHERE courseID=?";
                 
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 stmt.setString(1, id);
                 
                 stmt.executeUpdate();
             }catch(Exception ex){
                 System.out.println(ex);
             }
         }
         
         public static void removeDegree(String id){
             try{
                 Connection conn = get_Connection();
                 String sql = "DELETE FROM "+tableDegrees+" WHERE id=?";
                 
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 stmt.setString(1, id);
                 
                 stmt.executeUpdate();
             }catch(Exception ex){
                 System.out.println(ex);
             }
         }
         
         public static void removeStudent(String id){
             try{
                 Connection conn = get_Connection();
                 String sql = "DELETE FROM "+tableStudent+" WHERE userID=?";
                 
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 stmt.setString(1, id);
                 
                 stmt.executeUpdate();
             }catch(Exception ex){
                 System.out.println(ex);
             }
         }
         public static void removeTeacher(String id){
             try{
                 Connection conn = get_Connection();
                 String sql = "DELETE FROM "+tableTeacher+" WHERE userID=?";
                 
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 stmt.setString(1, id);
                 
                 stmt.executeUpdate();
             }catch(Exception ex){
                 System.out.println(ex);
             }
         }
          
          
          public static void changePass(Admin admin)
                            throws Exception{
                       
		try{
			
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE "+tableAdmin+" SET password = ?"
                                      + " WHERE userID = ?");
                                stmt.setString(1, admin.getPassword());
                                stmt.setString(2, admin.getUserId());
                              
                              
			stmt.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          public static void changePass(Student stu)
                            throws Exception{
                       
		try{
			
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE "+tableStudent+" SET password = ?"
                                      + " WHERE userID = ?");
                                stmt.setString(1, stu.getPassword());
                                stmt.setString(2, stu.getUserId());
                              
                              
			stmt.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
          
          public static void createAdminTableIfNotExists()throws Exception{
		
		try{
			
			Connection conn = get_Connection();
                              createDataBaseIfNotExists(dbName);
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS "+tableAdmin+""
                                      + "(userID varchar(32) NOT NULL,"
                                      + "password varchar(32) NOT NULL,"
                                      + "first varchar(32) NOT NULL,"
                                      + "last varchar(32) NOT NULL,"
                                      + "gender varchar(6) NOT NULL,"
                                      + "phno varchar(32) NOT NULL,"
                                      + "email varchar(32) NOT NULL,"
                                      + "address varchar(64),"
                                      + "cnic varchar(32) NOT NULL,"
                                      + "role varchar(32),"
                                      + "country varchar(16),"
                                      + "city varchar(32),"
                                      + "zipcode varchar(16),"
                                      + "accountstatus varchar(16),"
                                      + "PRIMARY KEY ( userID ))"; 
			stmt.executeUpdate(sql);
			System.out.println("Table Created!");
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
          
          
          public static void createCoursesTableIfNotExists()throws Exception{
		
		try{
			
			Connection conn = get_Connection();
                              createDataBaseIfNotExists(dbName);
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS "+tableCourses+""
                                      + "(courseID varchar(7) NOT NULL,"
                                      + "title varchar(64) NOT NULL,"
                                      + "credithours INTEGER NOT NULL,"
                                      + "type varchar(32) NOT NULL,"
                                      + "category varchar(32) NOT NULL,"
                                      + "assignstatus BIT,"
                                      + "PRIMARY KEY ( courseID ))"; 
			stmt.executeUpdate(sql);
			System.out.println("Table Created!");
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
          public static void createDegreeTableIfNotExists()throws Exception{
		
		try{
			
			Connection conn = get_Connection();
                              createDataBaseIfNotExists(dbName);
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS "+tableDegrees+""
                                      + "(id varchar(8) NOT NULL,"
                                      + "type varchar(32) NOT NULL,"
                                      + "name varchar(64) NOT NULL,"
                                      + "duration INTEGER NOT NULL,"
                                      + "noofquarters INTEGER NOT NULL,"
                                      + "totalfee DOUBLE NOT NULL,"
                                      + "courses varchar(255),"
                                      + "PRIMARY KEY(id) )";
			stmt.executeUpdate(sql);
			System.out.println("Table "+tableDegrees+"Created!");
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
          
          
          public static void createStudentTableIfNotExists()throws Exception{
		
		try{
			
			Connection conn = get_Connection();
                              createDataBaseIfNotExists(dbName);
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS "+tableStudent+""
                                      + "(userID varchar(32) NOT NULL,"
                                      + "password varchar(32) NOT NULL,"
                                      + "first varchar(32) NOT NULL,"
                                      + "last varchar(32) NOT NULL,"
                                      + "gender varchar(6) NOT NULL,"
                                      + "phno varchar(32),"
                                      + "email varchar(32),"
                                      + "address varchar(128),"
                                      + "cnic varchar(32),"
                                      + "role varchar(32),"
                                      + "country varchar(32),"
                                      + "city varchar(32),"
                                      + "zipcode varchar(16),"
                                      + "accountstatus varchar(16),"
                                      + "degreeID varchar(16),"
                                      + "PRIMARY KEY ( userID ))";
			stmt.executeUpdate(sql);
			System.out.println("Table Created!");
                              
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
          
          public static void createTeacherTableIfNotExists()throws Exception{
		
		try{
			
			Connection conn = get_Connection();
                              createDataBaseIfNotExists(dbName);
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS "+tableTeacher+""
                                      + "(userID varchar(32) NOT NULL,"
                                      + "password varchar(32) NOT NULL,"
                                      + "first varchar(32) NOT NULL,"
                                      + "last varchar(32) NOT NULL,"
                                      + "gender varchar(6) NOT NULL,"
                                      + "phno varchar(32),"
                                      + "email varchar(32),"
                                      + "address varchar(128),"
                                      + "cnic varchar(32),"
                                      + "role varchar(32),"
                                      + "country varchar(32),"
                                      + "city varchar(32),"
                                      + "zipcode varchar(16),"
                                      + "accountstatus varchar(16),"
                                      + "courses varchar(255),"
                                      + "PRIMARY KEY ( userID ))";
			stmt.executeUpdate(sql);
			System.out.println("Table Created!");
                              
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
          
          
          
          /////////////////////////////////////////////////////////////////////////////////////////////////////////
          /////////////////////////////////////////////////////////////////////////////////////////////////////////
          
          public  static void createDataBaseIfNotExists(String dbName)throws Exception{
		try{
			Class.forName(JDBC_DRIVER);	
			Connection conn = DriverManager.getConnection(ser_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			String sql = "CREATE DATABASE IF NOT EXISTS "+dbName;
			stmt.executeUpdate(sql);
			System.out.println("Database "+dbName+" Created!");
		}catch(Exception e){ 
			System.out.println(e);
		}
		
		
	}
          
            
          
          public static Connection get_Connection()throws Exception{////////////////////
		try{
			Class.forName(JDBC_DRIVER);
                              createDataBaseIfNotExists(dbName);
			Connection conn = DriverManager.getConnection(db_URL, USER, PASS);
			System.out.println("Connection Established!");
			return conn;
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
          }///////////////////////////////////////////////////////////////////////////////////////////

   
}