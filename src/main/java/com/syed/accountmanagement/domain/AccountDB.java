package com.syed.accountmanagement.domain;

import javax.persistence.*;

@Entity
public class AccountDB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private int accountNum;

    public AccountDB(){}

    public AccountDB(String firstName, String lastName, int accountNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNum = accountNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    @Override
    public String toString() {
        return "AccountDB{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNum=" + accountNum +
                '}';
    }
}
