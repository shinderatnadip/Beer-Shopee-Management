/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ratnadip
 */
public class Dbconnect {
     public static java.sql.Connection ConnectDb(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
        return con;
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    
}
public static void main(String[] args) {
        // TODO code application logic here
    }
    
}