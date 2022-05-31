package com.nology.PersonStuff;

public class Professor extends Person {
    private int salary;
    private Address address;


    public Professor(String name, String phoneNumber, String emailAddress, int salary, Address address) {
        super(name,phoneNumber, emailAddress);
        this.salary = salary;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
