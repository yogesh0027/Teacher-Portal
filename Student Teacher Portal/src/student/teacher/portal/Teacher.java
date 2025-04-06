
package student.teacher.portal;

import java.util.ArrayList;


public class Teacher extends Person{
    
    private ArrayList<Course> courseList;
    
     public Teacher(){
         courseList = new ArrayList<>();
     }
    
    public Teacher(String userId, String password, String firstName, String lastName,
            String gender, String phoneNo, String address, String cnic, String role, 
            String email, String country, String city, String zipcode, String accountStatus, ArrayList<Course> assignedCourses) 
    {
        
        super(userId, password, firstName, lastName, gender, phoneNo, 
                address, cnic, role, email, country, city, zipcode, accountStatus);
        
        courseList = assignedCourses;
    
    }
    
    public Teacher(String userId, String password, String firstName, String lastName,
            String gender, String phoneNo, String address, String cnic, String role, 
            String email, String country, String city, String zipcode, String accountStatus) 
    {
        
        super(userId, password, firstName, lastName, gender, phoneNo, 
                address, cnic, role, email, country, city, zipcode, accountStatus);
        
        courseList = new ArrayList<>();
        
    
    }
    
    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    
}
