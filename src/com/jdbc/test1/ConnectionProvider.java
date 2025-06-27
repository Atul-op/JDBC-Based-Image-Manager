package com.jdbc.test1;
import java.sql.*;
public class ConnectionProvider
{
    private static Connection con;
    public static Connection getConnection()
    {
        try
        {
            if(con == null)
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://127.0.0.1:3306/firstdb";
                String username = "root";
                String password = "ENTER_PASSWORD";
                con = DriverManager.getConnection(url,username,password);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
