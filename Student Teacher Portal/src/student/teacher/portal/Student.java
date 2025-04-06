
package student.teacher.portal;

import java.util.Random;


public class Student extends Person{
    
    DegreeProgram degree;

    
    
    public Student(){}
    
    public Student(String userID, String password, String firstName, String lastName, String gender,
            String phoneNo, String address, String cnic, String role, String email, String country,
            String city, String zipcode, String accountStatus, DegreeProgram degree) 
    {
        super(userID, password, firstName, lastName, gender, phoneNo,
              address, cnic, role, email, country, city, zipcode, accountStatus);
        
        this.degree=degree;
    }
    
    
   public DegreeProgram getDegree() {
        return degree;
    }
    
    
}
