/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.*;
public class connectjava {
    Connection conn=null;
public static Connection ConnectDb()
{
try{
Class.forName("org.sqlite.JDBC");       //for mysql ("com.mysql.jdbc.Driver");
Connection conn= DriverManager.getConnection("jdbc:sqlite://D:\\8. Project\\project\\project.sqlite");       //(jdbc:mysql://location)
//JOptionPane.showMessageDialog(null,"Connection Established");
return conn;
}

catch(Exception e)
{
JOptionPane.showMessageDialog(null,e);
return null;
}

}
    
}
