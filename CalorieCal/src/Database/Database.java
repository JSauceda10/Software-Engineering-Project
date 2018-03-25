/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;

/**
 *
 * @author yessi
 */
public class Database {
  private static Statement connection;
    
    private static Database singletonOfDatabase = new Database();
    
    public static Database getSingletonOfDatabase() {    
     return singletonOfDatabase;
    }
    
    private Database(){
        connection = setConnection();
    }
    
    private Statement setConnection() {
        try {
            //1. Get a connectio to ddatabase
            System.out.println("Connecting to database...");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1398");
            Statement myStat = myConn.createStatement();
            System.out.println("Connected to database...");
            return (Statement) myStat;
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return null;
    }
    
    public static Statement getStatement() {
        return connection;
    }
}

