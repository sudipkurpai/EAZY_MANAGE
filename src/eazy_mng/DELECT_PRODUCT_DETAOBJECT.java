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
public class DELECT_PRODUCT_DETAOBJECT {
    public static int delet (String Product_id, String Product_name, String Description, 
            String Quantity, String Price, String Brand, String Category, 
            String Reason,String Manager_id, String Manager_name,String Date,String Time){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO delete_product (Product_id,Product_name,Description,Quantity,"
                           + "Price,Brand,Category,Reason,Manager_id,Manager_name,Date,Time) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, Product_id);
                   ps.setString(2, Product_name);
                   ps.setString(3, Description);
                   ps.setString(4, Quantity);
                   ps.setString(5, Price);
                   ps.setString(6, Brand);
                   ps.setString(7, Category);
                   ps.setString(8, Reason);
                   ps.setString(9, Manager_id);
                   ps.setString(10, Manager_name);
                   ps.setString(11, Date);
                   ps.setString(12, Time);
                            
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

 }
    
     public static int ret (String customer_name, String C_phone, String C_email, 
            String Invoice_no, String Order_date, String Refund_status, String Product_name, 
            String Product_id,String Quantity,String product_seal_status, String Reason,String Date,String Time){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO return_product (customer_name,C_phone,C_email,Invoice_no,"
                           + "Order_date,Refund_status,Product_name,Product_id,Quantity,product_seal_status,Reason,Date,Time) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, customer_name);
                   ps.setString(2, C_phone);
                   ps.setString(3, C_email);
                   ps.setString(4, Invoice_no);
                   ps.setString(5, Order_date);
                   ps.setString(6, Refund_status);
                   ps.setString(7, Product_name);
                   ps.setString(8, Product_id);
                   ps.setString(9, Quantity);
                   ps.setString(10, product_seal_status);
                   ps.setString(11, Reason);
                   ps.setString(12, Date);
                   ps.setString(13, Time);
                            
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

 }
     
      public static int Lost  (String Product_id, String Product_name, String Price, 
            String Lost_quantity, String Loss_amount, String Location, String How_lost,String Date,String Time){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO product_lost (Product_id,Product_name,Price,Lost_quantity,"
                           + "Loss_amount,Location,How_lost,Date,Time) VALUES (?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, Product_id);
                   ps.setString(2, Product_name);
                   ps.setString(3, Price);
                   ps.setString(4, Lost_quantity);
                   ps.setString(5, Loss_amount);
                   ps.setString(6, Location);
                   ps.setString(7, How_lost);
                  
                   ps.setString(8, Date);
                   ps.setString(9, Time);
                            
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

 }
}
