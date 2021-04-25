package eazy_mng;


import eazy_mng.DATABASE_CONNECTION;
import java.sql.Connection;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudip Maiti
 */
public class COMPLAIN_DATAOBEJECT {
    public static int COMP (String Manager_Name, String Manager_id, String Date, 
            String Time, String Employee_Name,String Employeee_id, String Employee_Phone, String Employee_email,String Complain){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO complain(Manager_Name, Manager_id, Date,Time, Employee_Name, Employeee_id,Employee_Phone,Employee_email,Complain) VALUES (?,?,?,?,?,?,?,?,?) ");
                   ps.setString(1, Manager_Name);
                   ps.setString(2, Manager_id);
                   ps.setString(3, Date);
                   ps.setString(4, Time);
                   ps.setString(5, Employee_Name);
                   ps.setString(6, Employeee_id);
                   ps.setString(7, Employee_Phone);                   
                   ps.setString(8, Employee_email);
                   ps.setString(9, Complain);
                   
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

//INSERT INTO `register`(`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `PASSWORD`, `CONFIRM_PASSWORD`, `ADDRESS`, `GENDER`) 
    }
}
