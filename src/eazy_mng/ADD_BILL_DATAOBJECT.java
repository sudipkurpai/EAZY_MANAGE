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
public class ADD_BILL_DATAOBJECT {
    
     public static int add_bill (String C_name, String C_email, 
            String Phone,String Add,String Pin,String Invoice_id, String Date, String Time, String  Product_id, String Product_name, 
            String Description,String Quality, String Price, String Tax, String Total_without_gst,String Total_with_gst, String All_total,String Bill_status,String Payment_status){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO add_bill (C_name, C_email, Phone,Address,Pin, Invoice_id , Date, Time,Product_id, Product_name, Description, Quality, Price, Tax, Total_without_gst,Total_with_gst,All_total,Bill_status,Payment_status) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, C_name);  
                   System.out.println("111111111"+C_name);
                   ps.setString(2, C_email);
                 // System.out.println("22222"+C_email);
                   ps.setString(3, Phone);
                   ps.setString(4, Add);
                   ps.setString(5, Pin);
                  // System.out.println("333333"+Phone);
                   ps.setString(6, Invoice_id);
                 //  System.out.println("4444444444"+ Invoice_id);
                   ps.setString(7, Date);
                 //  System.out.println("55555551"+Product_id);
                   ps.setString(8, Time);
                    ps.setString(9, Product_id);
                 //  System.out.println("6666666"+ Product_id);
                   ps.setString(10, Product_name);
                 //  System.out.println("77777777777"+Description);
                   ps.setString(11, Description);
                 //  System.out.println("8888888888"+Standerd_cost);
                   ps.setString(12, Quality);
                 //  System.out.println("999999999"+Unit_price);
                   ps.setString(13, Price);
                 //  System.out.println("1010101010"+Mfg_date);
                   ps.setString(14, Tax);
                 //  System.out.println("1010101010"+Exp_date);
                   ps.setString(15, Total_without_gst);
                  // System.out.println("1010101010"+Quantity);
                   ps.setString(16, Total_with_gst);
                  // System.out.println("1010101010"+Category);
                   ps.setString(17, All_total);
                   ps.setString(18, Bill_status);
                   ps.setString(19, Payment_status);
                  status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
}
    
}
