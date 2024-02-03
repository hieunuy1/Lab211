/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tung
 */
public class Contact {
    private int contactId;
    private String fullname;
    private String group;
    private String address;
    private String phone;
    private String lastname;
    private String fisrtname;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFisrtname() {
        return fisrtname;
    }

    public void setFisrtname(String fisrtname) {
        this.fisrtname = fisrtname;
    }

    public Contact(int contactId, String fullname, String group, String address, String phone, String lastname, String fisrtname) {
        this.contactId = contactId;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.lastname = lastname;
        this.fisrtname = fisrtname;
    }
  
    public Contact(){
    }
    
}
