package com.connect.authentication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Signup {

    public String firstName;
    public String lastName;
    public String emailId;
    public String password;
    public String mobileNo;
    public String regionCode;
    public String state;
    public String country;
}
