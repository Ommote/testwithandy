package com.nology;

import com.nology.PersonStuff.Address;
import com.nology.PersonStuff.Person;
import com.nology.PersonStuff.Professor;
import com.nology.PersonStuff.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. In the personStuff package, re-create the code from the class diagram in slack

        // 2. Here in main, I want you to add one professor and two students, both students have different addresses, and the professors
        //    address is unknown. Use the scanner to set the professors address

        Scanner scanner = new Scanner(System.in);

//        Address profAddress = new Address(scanner.next());
        String street = scanner.next();
        String city = scanner.next();
        String county = scanner.next();
        String postalCode = scanner.next();
        String country = scanner.next();



        Address studentAddress1 = new Address("Main Street", "Manchester","Greater Manchester", "M1 23D", "UK");
        Address studentAddress2 = new Address("High Street", "London","Greater London", "NW2 2HJ", "UK");

        Student olivia = new Student("olivia", "0789823456", "olivia@yahoo.com", 12345, 60.00, studentAddress1);
        Student geoff = new Student("Geoff", "0767543889", "geoff@school.co.uk", 54321, 70.00, studentAddress2);

        Professor profTrevelyan = new Professor("Professor Trevelyan", "0778760987", "trevz@uni.ac.uk", 56000, new Address(street, city, county, postalCode, country));

        // 3. Test it out!

        System.out.println(olivia);
        System.out.println(geoff);
        System.out.println(profTrevelyan.getAddress());



        // 4. Rules: You can't look at any previous projects to help. Don't use intellij "generate" for constructors or getters and setters


}}
