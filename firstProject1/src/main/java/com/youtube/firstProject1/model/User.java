package com.youtube.firstProject1.model;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@DynamicUpdate
@Table(name= "test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;  
   
    private String contact;   
    public String idNumber;
    private String idType;
    private String vname;
    
    public User() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ",  contact=" + contact + ", idNumber="
                + idNumber + ", idType=" + idType + ", vname=" + vname + "]";
    }


    }