/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JTextField;

/**
 *
 * @author Sudip Maiti
 */
public class ADD_NEW_PRODUCT_DETAOBJ {
    public static int add_new_product (String Manager_name, String Man_id, 
            String Date,String Transaction_id, String Product_id, String Product_name, String  Vendor, String Description, 
            String Standerd_cost,String Unit_price, String Mfg_date, String Exp_date, String Quantity,String Category, String Brand,String Total,String Time){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO add_new_product (Manager_name, Man_id, Date,Time, Transaction_id , Product_id, Product_name,Vendor_Name, Description, Standerd_cost, Unit_price, Mfg_date, Exp_date, Quantity, Category, Brand,Total) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, Manager_name);  
                   System.out.println("111111111"+Manager_name);
                   ps.setString(2, Man_id);
                 // System.out.println("22222"+Man_id);
                   ps.setString(3, Date);
                   ps.setString(4, Time);
                     
                  // System.out.prin    tln("333333"+EMAIL);
                   ps.setString( 5, Transaction_id);
                 //  System.out.println("4444444444"+ Transaction_id);
                   ps.setString(6, Product_id);
                 //  System.out.println("55555551"+Product_id);
                   ps.setString(7, Product_name);
                    ps.setString(8, Vendor);
                 //  System.out.println("6666666"+ Product_name);
                   ps.setString(9, Description);
                 //  System.out.println("77777777777"+Description);
                   ps.setString(10, Standerd_cost);
                 //  System.out.println("8888888888"+Standerd_cost);
                   ps.setString(11, Unit_price);
                 //  System.out.println("999999999"+Unit_price);
                   ps.setString(12, Mfg_date);
                 //  System.out.println("1010101010"+Mfg_date);
                   ps.setString(13, Exp_date);
                 //  System.out.println("1010101010"+Exp_date);
                   ps.setString(14, Quantity);
                  // System.out.println("1010101010"+Quantity);
                   ps.setString(15, Category);
                  // System.out.println("1010101010"+Category);
                   ps.setString(16, Brand);
                   //System.out.println("1010101010"+Brand);
                   ps.setString(17, Total);
                   
                  status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
}
    
    public static int Update_product ( String Description,String Standerd_cost,String Unit_price, String Mfg_date, String Exp_date, String Quantity,String Category, String Brand,String Total,String Date,String Time,String Product_id){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("Update add_new_product set  Description=?, Standerd_cost=?, Unit_price=?, Mfg_date=?, Exp_date=?, Quantity=?, Category=?, Brand=?,Total=?,Date=?,Time=? where Product_id =?");
                 
                   
                   ps.setString(1, Description);
                   ps.setString(2, Standerd_cost);
                   System.out.println("8888888888"+Standerd_cost);
                   ps.setString(3, Unit_price);
                   System.out.println("999999999"+Unit_price);
                   ps.setString(4, Mfg_date);
                   ps.setString(5, Exp_date);
                   ps.setString(6, Quantity);
                   ps.setString(7, Category);
                   ps.setString(8, Brand);
                   ps.setString(9,Total);
                   ps.setString(10, Date);
                     ps.setString(11, Time);
                   ps.setString(12, Product_id);
                    
                   System.out.println("Producttt"+Product_id);
                  status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("upddddddddddddddproooooo"+status);
              return status;
    }
     public static int purchase (String vendor_name,String Manager_name, String Man_id, 
            String Date_Time,String Transaction_id, String Product_id, String Product_name, String Description, 
            String Standerd_cost,String Unit_price, String Mfg_date, String Exp_date, String Quantity,String Category, String Brand,String Total, String comp){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO purchase (VENDOR_NAME	, MANAGER_NAME, MAN_ID, DATE_TIME , TRANSACTION_ID, PRODUCT_ID, PRODUCT_NAME, DESCRIPTION, STANDERD_COST, UNIT_PRICE, MFG_DATE, EXP_DATE, QUANTITY, CATEGORY,BRAND,TOTAL,COM_NAME) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                 
                   
                  ps.setString(1, Manager_name);  
                   System.out.println("111111111"+Manager_name);
                   ps.setString(2, Man_id);
                 // System.out.println("22222"+Man_id);
                   ps.setString(3, Date_Time);
                  // System.out.println("333333"+EMAIL);
                   ps.setString(4, Transaction_id);
                 //  System.out.println("4444444444"+ Transaction_id);
                   ps.setString(5, Product_id);
                 //  System.out.println("55555551"+Product_id);
                   ps.setString(6, Product_name);
                 //  System.out.println("6666666"+ Product_name);
                   ps.setString(7, Description);
                 //  System.out.println("77777777777"+Description);
                   ps.setString(8, Standerd_cost);
                 //  System.out.println("8888888888"+Standerd_cost);
                   ps.setString(9, Unit_price);
                 //  System.out.println("999999999"+Unit_price);
                   ps.setString(10, Mfg_date);
                 //  System.out.println("1010101010"+Mfg_date);
                   ps.setString(11, Exp_date);
                 //  System.out.println("1010101010"+Exp_date);
                   ps.setString(12, Quantity);
                  // System.out.println("1010101010"+Quantity);
                   ps.setString(13, Category);
                  // System.out.println("1010101010"+Category);
                   ps.setString(14, Brand);
                   //System.out.println("1010101010"+Brand);
                   ps.setString(15, Total);
                  status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
     }
}