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
public class ATTEDENCE_DATAOBJ {
    
    
    public static int atten (String emp_id, String emp_name, 
            String mng_name,String Mng_id, String in_time, String out_time, String break_time, 
            String date,String Status){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO attendance (EMP_ID, EMP_NAME, ATTENDANCE_BY, MNG_ID , IN_TIME, OUT_TIME, BREAK_TIME, DATE, STATUS) VALUES (?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, emp_id);  
                   System.out.println("111111111"+emp_id);
                   ps.setString(2, emp_name);
                 // System.out.println("22222"+Man_id);
                   ps.setString(3, mng_name);
                  // System.out.println("333333"+EMAIL);
                   ps.setString(4, Mng_id);
                 //  System.out.println("4444444444"+ Transaction_id);
                   ps.setString(5, in_time);
                 //  System.out.println("55555551"+Product_id);
                   ps.setString(6, out_time);
                 //  System.out.println("6666666"+ Product_name);
                   ps.setString(7, break_time);
                 //  System.out.println("77777777777"+Description);
                   ps.setString(8, date);
                 //  System.out.println("8888888888"+Standerd_cost);
                   ps.setString(9, Status);
                 //  System.out.println("999999999"+Unit_price);
                   
                  status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
}
    
    
    public static int update ( String out_time, String break_time,String Status,String emp_id,String date){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("update attendance set OUT_TIME =?, BREAK_TIME=?, STATUS=? where EMP_ID =? and DATE = ? ");
                  ps.setString(1, out_time);
                   System.out.println("111111"+ out_time);
                   ps.setString(2, break_time);
                   System.out.println("22222222"+break_time);
                  
                 //  System.out.println("8888888888"+Standerd_cost);
                   ps.setString(3, Status);
                   System.out.println("3333333"+Status);
                   ps.setString(4, emp_id);
                  
                   ps.setString(5, date);
                    System.out.println("55555551"+date);
                   System.out.println("4444444"+emp_id);
                 //  System.out.println("999999999"+Unit_price);
                   
                  status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
}
}
