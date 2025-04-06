
package student.teacher.portal;

import java.util.ArrayList;


public class Admin extends Person{
    
    private static ArrayList<Course> courses;
    private static ArrayList<DegreeProgram> degrees;
    private static ArrayList<Student> students;
    private static ArrayList<Teacher> teachers;

   
    
    
    public Admin(){
        courses = JDBC.getCourses();
        degrees = JDBC.getDegrees();
        students = JDBC.getStudents();
        teachers = JDBC.getTeachers();
    }
    
    public Admin(
            String userId, String password, String firstName, String lastName, String gender, String phoneNo, String email,
            String address, String cnic, String role, String country, String city, String zipcode, String accountStatus
    ) 
    {
        super(
                userId, password, firstName, lastName, gender, phoneNo,
                address, cnic, role,email, country, city, zipcode, accountStatus
        );
        courses = JDBC.getCourses();
        degrees = JDBC.getDegrees();
        students = JDBC.getStudents();
        teachers = JDBC.getTeachers();
    }
    
    
    
    
    public static ArrayList<Course> getCourses() {
        return courses;
    }
    
    public static ArrayList<DegreeProgram> getDegrees() {
        return degrees;
    }

     public static ArrayList<Student> getStudents() {
        return students;
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }


}
