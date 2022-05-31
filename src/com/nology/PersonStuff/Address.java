package com.nology.PersonStuff;

public class Address {
    private String street;
    private String city;
    private String county;
    private String postalCode;
    private String country;

    public Address(String street, String city, String county, String postalCode, String country){
        this.street = street;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
        this.country = country;
    }
}
