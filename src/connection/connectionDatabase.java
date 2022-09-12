/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.*;
/**
 *
 * @author sanjay reddy
 */
public class connectionDatabase {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/quiz","root","sahithya");  
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
