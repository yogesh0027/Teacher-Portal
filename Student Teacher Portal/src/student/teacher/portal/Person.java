

package student.teacher.portal;


public class Person {
    
   
    
    private String userId;
    private String password;
    
    
    private String firstName;
    private String lastName;
    private String gender;
    
    private String phoneNo;
    private String address;
    private String cnic;
    
    private String role;
    private String email;
    
    private String country;
    private String city;
    private String zipcode;
    
    private String accountStatus;

    
    
                //Constructors
    
    
    public Person(){}
    
    
    public Person(String userId, String password, String firstName, String lastName, String gender, String phoneNo, 
             String address, String cnic, String role, String email, String country, String city, String zipcode, 
            String accountStatus) {
        this.userId = userId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.address = address;
        this.cnic = cnic;
        this.role = role;
        this.email = email;
        this.country = country;
        this.city = city;
        this.zipcode = zipcode;
        this.accountStatus=accountStatus;
    }

    
                //Getters & Setters
    
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
    
    
}
