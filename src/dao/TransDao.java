/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbutil.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pojo.TransHistory;

public class TransDao {

    public static boolean saveHistory(TransHistory th) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into transhistory values(?,?,?,?)");
        ps.setInt(1, th.getAcc_no());
        ps.setString(2, th.getStatus());
        ps.setInt(3, th.getAmount());
        ps.setString(4, th.getTransDate());

        return ps.executeUpdate() == 1;
    }

    public static List<TransHistory> getLast10TransHistory(int acc_no) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from transhistory where acc_no= ? ");
        ps.setInt(1, acc_no);
//        order by transdate desc limit 10
        ResultSet rs = ps.executeQuery();
        List<TransHistory> history = new ArrayList<>();
        while(rs.next()) {
            TransHistory hs = new TransHistory();
            hs.setAcc_no(rs.getInt("acc_no"));
            hs.setStatus(rs.getString("status"));
            hs.setAmount(rs.getInt("amount"));
            hs.setTransDate(rs.getString("transdate"));
            history.add(hs);
        }
        return history;

    }
}
