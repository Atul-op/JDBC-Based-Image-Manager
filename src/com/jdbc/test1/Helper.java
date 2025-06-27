package com.jdbc.test1;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class Helper
{
    public static ImageIcon getImageIconById(int id,Connection con)
    {
        ImageIcon icon = null;
        try
        {
            String q = "select pic from table2 where tId = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, id);
            ResultSet set = pstmt.executeQuery();
            Blob bl;
            if(set.next())
            {
                bl = set.getBlob("pic");
                InputStream is = bl.getBinaryStream();
                Image image = ImageIO.read(is);
                icon = new ImageIcon(image);
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return icon;
    }
}
