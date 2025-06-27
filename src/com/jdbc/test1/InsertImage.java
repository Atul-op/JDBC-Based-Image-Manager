package com.jdbc.test1;

import java.io.*;
import java.sql.*;
import javax.swing.*;
        
public class InsertImage
{
    public static void main(String[] args)
    {
        try
        {
            Connection c = ConnectionProvider.getConnection();
            
            String q = "insert into table2(pic) values (?)";
            PreparedStatement pstmt = c.prepareStatement(q);
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);
            pstmt.setBinaryStream(1, fis , fis.available());
            pstmt.executeUpdate();
//            System.out.println("Done...");
            JOptionPane.showMessageDialog(null,"Success...");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
