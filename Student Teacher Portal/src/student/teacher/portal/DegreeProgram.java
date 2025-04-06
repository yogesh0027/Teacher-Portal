
package student.teacher.portal;

import java.util.ArrayList;
import java.util.Random;


public class DegreeProgram {
    
     //all attributes are in cammelCase Letters;
    
    
    private String id;

    
    private String type;
    private String name;
    
    private int duration;
    private int noOfQuarters;
    
    private double totalFee;
    
    
    private ArrayList<Course> courseList;

    
    
    
                //Constructors


    public DegreeProgram(){
    
        courseList = new ArrayList<>();
    }
    
    public DegreeProgram(String type, String name, int duration,int noofQuarters, double totalFee, ArrayList<Course>obj, String id) {
       
        this.type = type;
        this.name = name;
        this.duration = duration;
        this.noOfQuarters = this.noOfQuarters;
        this.totalFee = totalFee;
        this.id= id;
        courseList=obj;
        /*for (Course course : obj) {
            System.out.println(course.getId());
        }*/
        
        
    }
    
    public DegreeProgram(String type, String name, int duration, double totalFee) {
       
        this.type = type;
        this.name = name;
        this.duration = duration;
        this.noOfQuarters = duration*4;
        this.totalFee = totalFee;
        id= idGenrator(name);
        courseList = new ArrayList<>();
        //courseList
        
        
    }
    
    
    
                //Getters & Setters
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNoOfQuarters() {
        return noOfQuarters;
    }

    public void setNoOfQuarters(int noOfQuarters) {
        this.noOfQuarters = noOfQuarters;
    }

    
    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

   
    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    
    private String idGenrator(String name){
        String alpha = "";
        int beta = 0;
        int i = 0;
        
        try {
            
            while(i < 3){
                alpha += name.charAt(i);
                i++;
            }
        } 
        catch (StringIndexOutOfBoundsException e) {
            alpha = name;
        }
        alpha = alpha.toUpperCase();
        Random rand = new Random();
        beta = rand.nextInt(100);
        
        String res = alpha + beta;
        return res;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}