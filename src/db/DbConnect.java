
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DbConnect {
    public static Connection c;
    public static Statement st;
    public DbConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             c=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentersdb","root","Incapp@12");
             st=c.createStatement();
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
                
    }
}
