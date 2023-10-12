/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class User {
    private String firstName; //text field data
    private String lastName; //text field data
    private String age;
    private String email;
    private String message; 
    private String patientType; // dropdown data
    private String gender;
    private String dob;
    private String path;
    
    public User(String fname, String lname, String dob, String age, String email, String message, String patientType, String gender, String path) {
        this.firstName = fname;
        this.lastName = lname;
        this.dob = dob;
        this.age = age;
        this.email =  email;
        this.message = message;
        this.patientType = patientType;
        this.gender = gender;
        this.path = path;
    }
    public User() {
        
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
