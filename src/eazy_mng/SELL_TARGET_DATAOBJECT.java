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
 * @author RAGHUNATH DAS
 */
public class SELL_TARGET_DATAOBJECT {
     public static int SELL_T (String MANAGER_MANE, String MANAGER_ID, String DATE, 
            String TIME, String PRODUCT_ID, String PRODUCT_NAME, String FROM_DATE, 
            String TO_DATE,String QUANTITY, String DESCRIPTION){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO sales_target1 (MANAGER_NAME,MANAGER_ID,DATE,TIME,"
                           + "PRODUCT_ID,PRODUCT_NAME,FROM_DATE,TO_DATE,QUANTITY,DESCRIPTION) VALUES (?,?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, MANAGER_MANE);
                   ps.setString(2, MANAGER_ID);
                   ps.setString(3, DATE);
                   ps.setString(4, TIME); 
                   ps.setString(5, PRODUCT_ID);
                   ps.setString(6, PRODUCT_NAME);
                   ps.setString(7, FROM_DATE);
                   ps.setString(8, TO_DATE);
                   ps.setString(9, QUANTITY);
                   ps.setString(10, DESCRIPTION);                 
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

     }
}
