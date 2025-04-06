
package student.teacher.portal;

import java.util.Random;


public class Course {
    
    private String id;
    private String title;
    private int creditHours;
    private String type;
    private String category;


    private boolean assignStatus;
    
    
    public Course(){}
    
    
    
    public Course(String id, String title, int creditHours, String type, String category, boolean assignStatus){
        this.id = id;
        this.title = title;
        this.creditHours = creditHours;
        this.type = type;
        this.category = category;
        this.assignStatus = assignStatus;
    }
    
    
    public Course(String title, int creditHours, String type, String category) {
        
        this.title = title;
        this.creditHours = creditHours;
        this.type=type;
        this.category = category;
        id= idGenrator(title);
        assignStatus = false;
    }
    
    
    private String idGenrator(String title){
        String alpha = "";
        int beta = 0;
        int i = 0;
        while(i < 3){
            alpha += title.charAt(i);
            i++;
        }
        alpha = alpha.toUpperCase();
        Random rand = new Random();
        beta = rand.nextInt(1000);
        
        String res = alpha + beta;
        
        for (Course course : Admin.getCourses()) {
            if(course.getId().equals(res))
                idGenrator(title);
        }
        
        return res;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getAssignStatus() {
        return assignStatus;
    }

    public void setAssignStatus(boolean assignStatus) {
        this.assignStatus = assignStatus;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
