package com.company;

public class Contact extends Collection {

    private String name;
    private String emailAddress;

    public Contact(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }
    public Contact(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmailAddress());

    }

}
