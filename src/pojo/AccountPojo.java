/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Date;

/**
 *
 * @author ck835
 */
public class AccountPojo {

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public AccountPojo(){
        
    }

    public AccountPojo(int acc_no, String first_name, String last_name, String address, String occupation, Date dob, String pin, int balance, String mobile) {
        this.acc_no = acc_no;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.occupation = occupation;
        this.dob = dob;
        this.pin = pin;
        this.balance = balance;
        this.mobile = mobile;
    }

    
    
    private int acc_no;
    private String first_name;
    private String last_name;
    private String address;
    private String occupation;
    private Date dob;
    private String pin;
    private int balance;
    private String mobile;
}
