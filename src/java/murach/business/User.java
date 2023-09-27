/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateofBirth;
    private String heardFrom;
    private String receiveAnnouce;
    private String contactBy;
    
    
    public User(){
        firstName = "";
        lastName = "";
        email = "";
        dateofBirth = "";
        heardFrom = "";
        receiveAnnouce = "";
        contactBy = "";
    }
    public User(String firstName, String lastName, String email, String dateofBirth, String heardFrom,String receiveAnnouce, String contactBy ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateofBirth = dateofBirth;
        this.heardFrom= heardFrom;
        this.receiveAnnouce= receiveAnnouce;
        this.contactBy= contactBy;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getDateofBirth(){
        return dateofBirth;
    }
    public void setDateofBirth(String dateofBirth){
        this.dateofBirth = dateofBirth;
    }
    public String getHeardFrom(){
        return heardFrom;
    }
    public void setHeardFrom(String heardFrom){
        this.heardFrom = heardFrom;
    }
    public String getReceiveAnnouce(){
        return receiveAnnouce;
    }
    public void setReceiveAnnouce(String receiveAnnouce){
        this.receiveAnnouce = receiveAnnouce;
    }
    public String getContactBy(){
        return contactBy;
    }
    public void setContactBy(String contactBy){
        this.contactBy = contactBy;
    }
}
