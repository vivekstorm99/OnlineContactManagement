package org.signify.OnlineContactManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
    public Contact(){

    }
    
    public Long getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(Long user_Id) {
        User_Id = user_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Contact(Long user_Id, String name, String phoneNumber, String email) {
        User_Id = user_Id;
        Name = name;
        PhoneNumber = phoneNumber;
        Email = email;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long User_Id;
    private String Name;
    private String PhoneNumber;
    private String Email;

}
