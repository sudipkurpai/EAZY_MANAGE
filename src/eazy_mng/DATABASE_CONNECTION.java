/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Sudip Maiti
 */
public class DATABASE_CONNECTION {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/inventory_management","root","");
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
