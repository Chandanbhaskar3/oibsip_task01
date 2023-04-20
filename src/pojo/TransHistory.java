/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Date;


public class TransHistory {
    public TransHistory(){
    
}

    public TransHistory(int acc_no, String status, int amount, String transDate) {
        this.acc_no = acc_no;
        this.status = status;
        this.amount = amount;
        this.transDate = transDate;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }
    private int acc_no;
    private String status;
    private int amount;
    private String transDate;
    
}
