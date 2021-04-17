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
    
}
