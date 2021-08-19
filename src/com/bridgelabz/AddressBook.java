package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phoneNumber;
    public String email;

    //SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //GETTERS
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void createContact() {

        System.out.println("NEW CONTACT:");
        System.out.print("Enter FIRST NAME: ");
        firstName = sc.next();
        setFirstName(firstName);
        System.out.print("Enter LAST NAME: ");
        lastName = sc.next();
        setLastName(lastName);
        System.out.print("Enter ADDRESS: ");
        address = sc.next();
        setAddress(address);
        System.out.print("Enter CITY: ");
        city = sc.next();
        setCity(city);
        System.out.print("Enter STATE: ");
        state = sc.next();
        setState(state);
        System.out.print("Enter ZIP: ");
        zip = sc.next();
        setZip(zip);
        System.out.print("Enter PHONE NUMBER: ");
        phoneNumber = sc.next();
        setPhoneNumber(phoneNumber);
        System.out.print("Enter E-MAIL: ");
        email = sc.next();
        setEmail(email);
    }

    public void displayAddressBook() {
        System.out.println("FIRST NAME: " + getFirstName());
        System.out.println("LAST NAME: " + getLastName());
        System.out.println("ADDRESS: " + getAddress());
        System.out.println("CITY: " + getCity());
        System.out.println("STATE: " + getState());
        System.out.println("ZIP: " + getZip());
        System.out.println("PHONE-NUMBER: " + getPhoneNumber());
        System.out.println("E-MAIL: " + getEmail());
    }

    public void editContact() {
        System.out.println("SELECT THE OPTION YOU WANT TO EDIT");
        System.out.println("1.Firstname / 2.Lastname / 3.Address / 4.City / 5.State / 6.ZIP / 7.Phone / 8.Email");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter New:");
                firstName = sc.next();
                setFirstName(firstName);
                break;
            case 2:
                System.out.println("Enter New:");
                lastName = sc.next();
                setLastName(lastName);
                break;
            case 3:
                System.out.println("Enter New:");
                address = sc.next();
                setAddress(address);
                break;
            case 4:
                System.out.println("Enter New:");
                city = sc.next();
                setCity(city);
                break;
            case 5:
                System.out.println("Enter New:");
                state = sc.next();
                setState(state);
                break;
            case 6:
                System.out.println("Enter New:");
                zip = sc.next();
                setZip(zip);
                break;
            case 7:
                System.out.println("Enter New:");
                phoneNumber = sc.next();
                setPhoneNumber(phoneNumber);
                break;
            case 8:
                System.out.println("Enter New:");
                email = sc.next();
                setFirstName(email);
                break;

        }
    }




        public static void main (String[]args){
            AddressBook addressBook = new AddressBook();
            addressBook.createContact();
            System.out.println("--------------------------------------");
            System.out.println("------------ADDRESS BOOK--------------");
            addressBook.displayAddressBook();
            System.out.println("--------------------------------------");

            addressBook.editContact();
            addressBook.displayAddressBook();
    }
    }


