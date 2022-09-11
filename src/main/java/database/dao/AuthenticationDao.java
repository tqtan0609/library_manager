package database.dao;
import service.Connection;
import moldel.Account;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthenticationDao {
    public static Account login(String userName, String passWord){
        Account account = null;
        java.sql.Connection con = service.Connection.getInstance().getConnection();
        String getData = "SELECT * FROM library_manger WHERE username LIKE ? AND password LIKE ? ";
        try (PreparedStatement pstmt = con.prepareStatement(getData)) {
            pstmt.setString(1, userName);
            pstmt.setString(2, passWord);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setUserName(resultSet.getString("username"));
                account.setPassWord(resultSet.getString("password"));
                account.setEmail(resultSet.getString("email"));
                account.setRole(resultSet.getInt("role"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return account;
    }
    public static int checkLogin(String userName, String passWord){
        Account acc = null;
        java.sql.Connection con = service.Connection.getInstance().getConnection();
        String getData = "SELECT * FROM library_manger WHERE username LIKE ? AND password LIKE ? ";
        try (PreparedStatement pstmt = con.prepareStatement(getData)) {
            pstmt.setString(1, userName);
            pstmt.setString(2, passWord);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                acc = new Account();
                acc.setRole(resultSet.getInt("role"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return acc.getRole();
    }
    public static int register(String userName, String passWord, String email){
        Account account = null;
        int  rowsAffected =0;
        java.sql.Connection con = service.Connection.getInstance().getConnection();
        String insertData = "INSERT INTO library_manger(username, password, email, role)" + " VALUES(?, ?, ?, ?";
        try (PreparedStatement pstmt = con.prepareStatement(insertData)) {
            pstmt.setString(1, userName);
            pstmt.setString(2, passWord);
            pstmt.setString(3, email);
            pstmt.setString(4, "0");
            rowsAffected = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowsAffected;
    }
}
