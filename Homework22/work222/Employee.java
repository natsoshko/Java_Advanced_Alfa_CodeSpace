package com.alfabank.work222;

public class Employee {
    public Employee() {
        this.firstName = "Alex";
        this.lastName = "Ferguson";
        this.occupation = "coach";
        this.telephone = "0964582536";
        //numberOfEmployees++;
    }

    public Employee(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
        this.occupation = "footballer";
        this.telephone = "0964589878";
        //numberOfEmployees++;
    }
    public Employee(String fName, String lName, String sOccup, String sPhone) {
        this.firstName = fName;
        this.lastName = lName;
        this.occupation = sOccup;
        this.telephone = sPhone;
        //numberOfEmployees++;
    }

    {
        numberOfEmployees++;
    }

    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;
    private static int numberOfEmployees;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }



}