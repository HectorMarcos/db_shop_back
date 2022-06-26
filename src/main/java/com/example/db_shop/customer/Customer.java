package com.example.db_shop.customer;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity  /*ENTITY!!!*/
@Table(name = "CUSTOMERS") /*MAP ENTITY AS TABLE*/
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*Why Do We Do This???*/
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "BIRTHDATE")
    private String birthdate;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "CITY")
    private String city;
    @Column(name = "DIRECTION")
    private String direction;
    @Column(name = "POSTCODE")
    private String postCode;

    public Customer() {
    }

    public Customer(Long id,
                    String name,
                    String surname,
                    String birthdate,
                    String phone,
                    String country,
                    String city,
                    String direction,
                    String postCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.direction = direction;
        this.postCode = postCode;
    }

    public Customer(String name,
                    String surname,
                    String birthdate,
                    String phone,
                    String country,
                    String city,
                    String direction,
                    String postCode) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.direction = direction;
        this.postCode = postCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", phone='" + phone + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", direction='" + direction + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
