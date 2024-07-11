package com.project.product.productdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotBlank(message = "Address is mandatory")
    private String address;

    @NotBlank(message = "Address 2 is mandatory")
    private String addressTwo;

    @NotBlank(message = "city is mandatory")
    private String city;

    @NotBlank(message = "state is mandatory")
    private String state;
    @NotBlank(message = "postal code is mandatory")
    private String code;


    public User() {}

    public User(String name, String email, String address,String addressTwo,String city,String state,String code) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.addressTwo = addressTwo;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddressTwo() {
        return addressTwo;
    }
    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    //@Override
    //public String toString() {
      //  return "User{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    //}
}