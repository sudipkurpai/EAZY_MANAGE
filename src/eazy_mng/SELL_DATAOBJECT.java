/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Sudip Maiti
 */
public class SELL_DATAOBJECT {
    
 public static int sells (String Employee_name, String Emp_id, String Date, 
            String Time, String Product_name, String Product_id, String Quantity, 
            String Price,String Total,String Profit){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO sell (Employee_name,Emp_id,Date,Time,"
                           + "Product_name,Product_id,Quantity,Price,Total,Profit) VALUES (?,?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, Employee_name);
                   ps.setString(2, Emp_id);
                   ps.setString(3, Date);
                   ps.setString(4, Time);
                   ps.setString(5, Product_name);
                   ps.setString(6, Product_id);
                   ps.setString(7, Quantity);
                   ps.setString(8, Price);
                   ps.setString(9, Total); 
                    ps.setString(10, Profit);
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
             // System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
 }   
 public static int bill (String Product_id, String Quantity )
           {
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO bill_time (Product_id,Quantity) VALUES (?,?)");
                   ps.setString(1, Product_id);
                   ps.setString(2, Quantity);
                  
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
             // System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
 }   
    }
