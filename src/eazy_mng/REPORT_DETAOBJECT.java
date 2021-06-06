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
public class REPORT_DETAOBJECT {
    
     public static int reportma (String Emp_name, String Emp_id, 
            String Date,String Time, String Report_type, String In_whose_name, String In_Whose_Id, 
            String Report){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO report_for_manager (Emp_name, Emp_id, Date, Time , Report_type, In_whose_name, In_Whose_Id, Report) VALUES (?,?,?,?,?,?,?,?)");
                   ps.setString(1, Emp_name);  
                   System.out.println("111111111"+Emp_name);
                   ps.setString(2, Emp_id);
                 // System.out.println("22222"+Man_id);
                   ps.setString(3, Date);
                  // System.out.println("333333"+EMAIL);
                   ps.setString(4, Time);
                 //  System.out.println("4444444444"+ Transaction_id);
                   ps.setString(5, Report_type);
                 //  System.out.println("55555551"+Product_id);
                   ps.setString(6, In_whose_name);
                 //  System.out.println("6666666"+ Product_name);
                   ps.setString(7, In_Whose_Id);
                 //  System.out.println("77777777777"+Description);
                   ps.setString(8, Report);
                 //  System.out.println("8888888888"+Standerd_cost);
                  
                   
                  status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
}
    
    
}
