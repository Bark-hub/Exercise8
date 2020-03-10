package com.company;

public class BusinessContact extends Collection{

    private String phoneNumber;

    public BusinessContact(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public BusinessContact() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phone Number: " + getPhoneNumber());

    }

}