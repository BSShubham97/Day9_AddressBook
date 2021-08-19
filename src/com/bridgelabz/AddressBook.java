package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phoneNumber;
    public String email;
    //SETTERS
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setZip(String zip){
        this.zip=zip;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setEmail(String email){
        this.email=email;
    }
    //GETTERS
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZip(){
        return zip;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }

    public void createContact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("NEW CONTACT:");
        System.out.print("Enter FIRST NAME: ");
        firstName=sc.next();
        setFirstName(firstName);
        System.out.print("Enter LAST NAME: ");
        lastName=sc.next();
        setLastName(lastName);
        System.out.print("Enter ADDRESS: ");
        address=sc.next();
        setAddress(address);
        System.out.print("Enter CITY: ");
        city=sc.next();
        setCity(city);
        System.out.print("Enter STATE: ");
        state=sc.next();
        setState(state);
        System.out.print("Enter ZIP: ");
        zip=sc.next();
        setZip(zip);
        System.out.print("Enter PHONE NUMBER: ");
        phoneNumber=sc.next();
        setPhoneNumber(phoneNumber);
        System.out.print("Enter E-MAIL: ");
        email=sc.next();
        setEmail(email);
    }

    public void displayAddressBook(){
        System.out.println("FIRST NAME: "+getFirstName());
        System.out.println("LAST NAME: "+getLastName());
        System.out.println("ADDRESS: "+getAddress());
        System.out.println("CITY: "+getCity());
        System.out.println("STATE: "+getState());
        System.out.println("ZIP: "+getZip());
        System.out.println("PHONE-NUMBER: "+getPhoneNumber());
        System.out.println("E-MAIL: "+getEmail());
    }



    public static void main(String[] args) {
        AddressBook addressBook=new AddressBook();
        addressBook.createContact();
        System.out.println("--------------------------------------");
        System.out.println("------------ADDRESS BOOK--------------");
        addressBook.displayAddressBook();
        System.out.println("--------------------------------------");
    }
}


