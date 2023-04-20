/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbutil.DBConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import pojo.AccountPojo;

public class AccountDao {

    public static boolean registerNewUser(AccountPojo ap) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into accounts values(?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, ap.getAcc_no());
        ps.setString(2, ap.getFirst_name());
        ps.setString(3, ap.getLast_name());
        ps.setDate(4, ap.getDob());
        ps.setString(5, ap.getMobile());
        ps.setString(6, ap.getAddress());
        ps.setString(7, ap.getOccupation());
        ps.setInt(8, ap.getBalance());
        ps.setString(9, ap.getPin());
        return ps.executeUpdate() == 1;
    }

    public static String getAccountDetails(AccountPojo pr) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select first_name from accounts where acc_no = ? and pin = ?");
        ps.setInt(1, pr.getAcc_no());
        ps.setString(2, pr.getPin());
        ResultSet rs = ps.executeQuery();
        String name = null;
        if (rs.next()) {
            name = rs.getString("first_name");
        }
        return name;
    }

    public static int getBalance(int acc_n) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from accounts where acc_no = ? ");
        ps.setInt(1, acc_n);
        ResultSet rs = ps.executeQuery();

        rs.next();
        int oldBalance = rs.getInt("balance");
        return oldBalance;
    }

    public static boolean depositeBalance(int acc_n, int new_balance, int oldBalance) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update accounts set balance = ? where acc_no = ?");
        ps.setInt(1, oldBalance + new_balance);
        ps.setInt(2, acc_n);
        return ps.executeUpdate() == 1;
    }

    public static boolean withdrawBalance(int acc_n, int withdrawMoney, int oldBalance) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update accounts set balance = ? where acc_no = ?");
        ps.setInt(1, oldBalance - withdrawMoney);
        ps.setInt(2, acc_n);
        return ps.executeUpdate() == 1;
    }

    public static String getAccountDetailsByAccNo(int acc_no) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select first_name from accounts where acc_no = ?");
        ps.setInt(1, acc_no);
        ResultSet rs = ps.executeQuery();
        String name = null;
        if (rs.next()) {
            name = rs.getString(1);
        }
        return name;
    }

    public static boolean depositeBalanceByAnother(int acc_n, int new_balance, int oldBalance1) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update accounts set balance = ? where acc_no = ?");
        ps.setInt(1, oldBalance1 + new_balance);
        ps.setInt(2, acc_n);
        return ps.executeUpdate() == 1;
    }

}
