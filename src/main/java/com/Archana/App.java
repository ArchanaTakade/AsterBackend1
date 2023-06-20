package com.Archana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:1008/student_db";
        String username = "root";
        String password = "Shreesamarth@99";
        Connection conn = DriverManager.getConnection(url,username,password);
         Statement stm = conn.createStatement();
         ResultSet rs = stm.executeQuery("Select * from student1");;
         
         
         while(rs.next()) {
        	 System.out.println(rs.getInt("rollno")+ " " + rs.getString("name"));
        
         
    }
         conn.close();
}
}
