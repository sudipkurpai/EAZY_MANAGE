/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Sudip Maiti
 */
public class EMP_SESSION_DATAOBJECT {
    public static int emp_insert_session (String EMP_NAME, String EMP_ID, 
            String EMAIL,String PHONE, String LAST_LOGIN_TIME, String LAST_LOGOUT_TIME, String LAST_LOGIN_DATE, 
            String LAST_LOGOUT_DATE){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO emp_session (EMP_NAME, EMP_ID, EMAIL, PHONE, LAST_LOGIN_TIME, LAST_LOGOUT_TIME, LAST_LOGIN_DATE, LAST_LOGOUT_DATE) VALUES (?,?,?,?,?,?,?,?)");
                   ps.setString(1, EMP_NAME);  
                   System.out.println("111111111"+EMP_NAME);
                   ps.setString(2, EMP_ID);
                   System.out.println("22222"+EMP_ID);
                   ps.setString(3, EMAIL);
                   System.out.println("333333"+EMAIL);
                   ps.setString(4, PHONE);
                   System.out.println("4444444444"+ PHONE);
                   ps.setString(5, LAST_LOGIN_TIME);
                   System.out.println("55555551"+LAST_LOGIN_TIME);
                   ps.setString(6, LAST_LOGOUT_TIME);
                   System.out.println("6666666"+ LAST_LOGOUT_TIME);
                   ps.setString(7, LAST_LOGIN_DATE);
                   System.out.println("77777777777"+LAST_LOGIN_DATE);
                   ps.setString(8, LAST_LOGOUT_DATE);
                   System.out.println("8888888888"+LAST_LOGOUT_TIME);
                                      
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

//INSERT INTO `register`(`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `PASSWORD`, `CONFIRM_PASSWORD`, `ADDRESS`, `GENDER`) 
    }
   public static int updateprofile_e ( String logout_time,String Logout_date, String Login_time,String Login_Date){
        int status=0;
         System.out.println("0000000000000000000000");
              try{
                  System.out.println("11111");
                   Connection con=DATABASE_CONNECTION.getConnection(); 
                   PreparedStatement ps=con.prepareStatement("UPDATE emp_session set LAST_LOGOUT_TIME =? ,LAST_LOGOUT_DATE =? where LAST_LOGIN_TIME =? AND LAST_LOGIN_DATE =?");
                   ps.setString(1,logout_time);
                   System.out.println("rrrrrrr"+logout_time);
                   ps.setString(2, Logout_date);
                   System.out.println("ffffff"+Logout_date);
                   ps.setString(3, Login_time);
                   System.out.println("tttttt"+Login_time);
                   ps.setString(4, Login_Date);
                   System.out.println("eeeeeee"+Login_time);                   
                   status=ps.executeUpdate();
                   System.out.println("444444444444444");
                   con.close();
              }catch(SQLException e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

//INSERT INTO `register`(`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `PASSWORD`, `CONFIRM_PASSWORD`, `ADDRESS`, `GENDER`) 
    }
}
