package com.example.model;


import java.util.*;
import javax.xml.bind.annotation.*;
 
@XmlRootElement
public class Customer {
 
    private int id;
    private String name;
    private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
 
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
 
    @XmlElementWrapper
    @XmlElement(name="phoneNumber")
    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }
 
}