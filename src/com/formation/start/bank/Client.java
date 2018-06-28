package com.formation.start.bank;

import java.util.ArrayList;

public class Client {

    private  static int compteur = 0;
    private int id;
    private String firstName;
    private String lastName;
    //private ArrayList<Account> account = new ArrayList<>();

    public Client(String firstName, String lastName) {
        this.id = ++compteur;
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public static int getCompteur(){
        return compteur;
    }

    public int getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
