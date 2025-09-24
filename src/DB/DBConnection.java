/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.*;
public class DBConnection 
{
    public Connection con;
public Statement stmt;
 public PreparedStatement pstmt;
    public ResultSet rst;
    public DBConnection()
    {
        try
    {
    Class.forName("com.mysql.jdbc.Driver");
//Class.forName("org.sqlite.JDBC");  
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
   // con=DriverManager.getConnection("jdbc:sqlite: gym.db");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }}


}
