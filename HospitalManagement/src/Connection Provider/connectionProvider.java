

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import java.sql.DriverManager;
//import static registration.Provider.*;

/**
 *
 * @author PAVAN
 */
public class connectionProvider {
    public static Connection gtCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Pavan@123");
            return con;
            
        }
        catch(Exception e){
           return null;
        }  
    }
  
    
}
