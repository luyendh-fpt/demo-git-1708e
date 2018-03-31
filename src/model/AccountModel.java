/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author xuanhung
 */
public class AccountModel {

    public void save(Account account) throws SQLException{
        Connection cnn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/technobank?useUnicode=true&characterEncoding=utf-8",
                "root", "");
        Statement stt = cnn.createStatement();
        stt.execute("insert into accounts (name, balance) values ('" 
                + account.getName() + "', " + account.getBalance() + ")");
    }    

    public ArrayList<Account> query() throws SQLException{
        ArrayList<Account> listAccount = new ArrayList<>();
        Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technobank?useUnicode=true&characterEncoding=utf-8", "root", "");
        Statement stt = cnn.createStatement();
        ResultSet rs = stt.executeQuery("select * from accounts");
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int balance = rs.getInt("balance");
            Account account = new Account(name, balance);
            account.setId(id);
            listAccount.add(account);            
        }
        return listAccount;
    }
    
}
