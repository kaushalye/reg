package com.example.model;
 

import javax.xml.bind.annotation.*;
 
public class PhoneNumber {
 
    private String type;
    private String value;
 
    @XmlAttribute
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    @XmlValue
    public String getValue() {
        return value;
    }
 
    public void setValue(String value) {
        this.value = value;
    }
}