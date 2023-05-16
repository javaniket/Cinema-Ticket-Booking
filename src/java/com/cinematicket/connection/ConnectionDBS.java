/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinematicket.connection;

import java.sql.*;

public class ConnectionDBS {
    public static Connection con;
    public static Connection getCon(){
        try{
      Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticket", "root", "abcd@123");
        }catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return con;
        }
}
