package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.db.DBConnection;
import com.app.model.User;

public class UserDAO {

    public boolean register(User user) {
        String qur = "INSERT INTO users(username, email, password) VALUES(?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(qur)){
            
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            return false;
        }
    }

    public String getPasswordByUsername(String username) {
        String qur = "SELECT password FROM users WHERE username = ?";

        try (Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(qur)) {

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                return rs.getString("password");
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
