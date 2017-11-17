package com.alldeals.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by Bi on 11/16/17.
 */
@Entity(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Long id;

    @NotEmpty(message = "*Please provide your password")
    private String street;

    @NotEmpty(message = "*Please provide your password")
    private String city;

    @Size(min = 2, max = 2, message = "*Please provide your password")
    @Pattern(regexp = "^[A-Z]{2,2}$")
    @NotEmpty(message = "*Please provide your password")
    private String state;

    @NotEmpty(message = "*Please provide your password")
    @Pattern(regexp = "^[\\d]{5,5}$")
    private String zip;

    public Address() {}

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
