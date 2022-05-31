package com.nology.PersonStuff;

public class Student extends Person {
    private int studentNumber;
    private double averageMark;
    private Address address;


    public Student(String name, String phoneNumber, String emailAddress, int studentNumber, double averageMark, Address address){
        super(name, phoneNumber, emailAddress);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.address = address;


    }
}
