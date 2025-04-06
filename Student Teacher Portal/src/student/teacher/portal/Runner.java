
package student.teacher.portal;


public class Runner {

   

    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Admin admin = new Admin(
                "a", 
                "a",
                "harish",
                "aravind", 
                "Male",
                "03334455999", 
                "harish000@gmail.com",
                "namma chennai",
                "22333-4455-696-7",
                "Admin",
                "india",
                " ",
                "54000",
                "Active"
                
        );
        
        JDBC.insertData(admin);
        
        SignIn signIn = new SignIn();
        signIn.setVisible(true);
        
        
    }
    
   
}
