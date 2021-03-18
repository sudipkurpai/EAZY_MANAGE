/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RAGHUNATH DAS
 */
public class UPDATEPROFILE_M_DATAOBJECT {
    
      public static int updateprofile_m ( String DOB, String ADDRESS,String GENDER,String mng_id){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("UPDATE register set DOB =?,ADDRESS =?,GENDER =? where MNG_ID = ?");
                   
                   ps.setString(1, DOB);
                   ps.setString(2, ADDRESS);
                   ps.setString(3, GENDER);
                   
                   ps.setString(4, mng_id);
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

//INSERT INTO `register`(`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `PASSWORD`, `CONFIRM_PASSWORD`, `ADDRESS`, `GENDER`) 
    }
   
    public static int update_password (String Pass,String c_pass,String mng_id){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("UPDATE register set PASSWORD =?,CONFIRM_PASSWORD =? where MNG_ID = ?");
                   
                   
                   ps.setString(1, Pass);
                   ps.setString(2, c_pass);
                   ps.setString(3, mng_id);
                   
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
              

    }
               public static int Reset_password (String Pass,String c_pass,String email){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("UPDATE register set PASSWORD =?,CONFIRM_PASSWORD =? where EMAIL = ?");
                   
                   
                   ps.setString(1, Pass);
                   ps.setString(2, c_pass);
                   ps.setString(3, email);
                  // ps.setString(4, phone);
                   
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
//INSERT INTO `register`(`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `PASSWORD`, `CONFIRM_PASSWORD`, `ADDRESS`, `GENDER`) 
    }
               public static boolean validate (String EMP_ID) throws SQLException
    {
        boolean status =false;
        try{
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from employee_register where EMP_ID = ?");
            ps.setString(1, EMP_ID);
            
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
           }
        catch(Exception e){System.out.println(e);}
        return status;
    }
               
               
               
               
                public static int updateprofile_emp ( String DOB, String ADDRESS,String GENDER,String emp_id){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("UPDATE employee_register set DOB =?,ADDRESS =?,GENDER =? where EMP_ID = ?");
                   
                   ps.setString(1, DOB);
                   ps.setString(2, ADDRESS);
                   ps.setString(3, GENDER);
                   ps.setString(4, emp_id);
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
}
}



