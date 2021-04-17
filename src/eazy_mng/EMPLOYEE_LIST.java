/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sudip Maiti
 */
public class EMPLOYEE_LIST extends javax.swing.JFrame {
 String ID = null;
    String Name = null;
    String Phone = null;
    String Email = null;
    String DOB = null;
    String Gender= null;
    String Address =null;
    String date=null;
    String time = null;
    String emp_id;
    
    /**
     * Creates new form EMPLOYEE_LIST
     */
    public EMPLOYEE_LIST() {
        initComponents();
        table();
    }
  void ell (String fullname, String mng_Id,String email,String t1,String d1,String p) {
       Name = fullname;
        ID = mng_Id;
        Email = email;
        time = t1;
        date = d1;
        Phone= p;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLOYEE LIST");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        emp.setBackground(new java.awt.Color(153, 255, 255));
        emp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        emp.setForeground(new java.awt.Color(0, 0, 204));
        emp.setText("Enter Employee ID");
        emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                empFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                empFocusLost(evt);
            }
        });
        jPanel2.add(emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 69, 260, 30));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, 30));

        table1.setBackground(new java.awt.Color(153, 204, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Fast Name", "Last Name", "Phone No.", "Email ID", "Date of Birth", "Gender", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 880, 460));

        jButton3.setBackground(new java.awt.Color(204, 204, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Reset");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(900, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        DASHBOARD_M dm = new DASHBOARD_M();
        dm.mngname(Name,ID,Email,Phone,date,time);
        dm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel8MouseClicked
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String em_id=emp.getText();
       try {
            if(em_id.equals("")||em_id.equals("Enter Employee ID")){
            JOptionPane.showMessageDialog(this, "Insert Employee ID First");
             //Data fetch from database
           }else{
            String sql = "Select * From employee_register Where EMP_ID = ?";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,em_id);
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel)table1.getModel(); 
            model.setRowCount(0);
                while (rs.next())
                {               
                    Object o []={
                        rs.getString("EMP_ID"),rs.getString("FIRST_NAME"),rs.getString("LAST_NAME"),rs.getString("MOBILE_NO"),rs.getString("EMAIL"),
                   rs.getString("DOB"),rs.getString("GENDER"),rs.getString("ADDRESS") };
                    model.addRow(o);

                }
                /*if(rs.next()){
                String emp_id =rs.getString("EMP_ID");
                String f_name =rs.getString("FIRST_NAME");
                 System.out.println("EMpppppp "+f_name);
                String l_name =rs.getString("LAST_NAME");
                 System.out.println("pppnnn "+l_name);
                String Phone =rs.getString("MOBILE_NO");
                 
                String Email =rs.getString("EMAIL");
               // System.out.println("emlllll "+l_name);
                
                String Dob =rs.getString("DOB");
                String gen =rs.getString("GENDER");
                String Address =rs.getString("ADDRESS");
                
            }*/
            }    
            }catch(Exception e){
            System.out.println("error"+e);
            
    }//GEN-LAST:event_jButton1MouseClicked
    }
    private void empFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empFocusGained
        // TODO add your handling code here:
        if(emp.getText().equals("Enter Employee ID")){
            
            emp.setText("");
    }//GEN-LAST:event_empFocusGained
    }
    private void empFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empFocusLost
        // TODO add your handling code here:
         if(emp.getText().equals("")){
           
            emp.setText("Enter Employee ID");
           
        }else{
           emp.setVisible(true);
    }                             
    }//GEN-LAST:event_empFocusLost

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        emp.setText("Enter Employee ID");

        DefaultTableModel tm=(DefaultTableModel) table1.getModel();
        while(tm.getRowCount()>0){
            tm.setRowCount(0);
        }
        table();

    }//GEN-LAST:event_jButton3MouseClicked
  
public void table()
{
    try {
        
             //Data fetch from database
            String sql = "Select * From employee_register ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table1.getModel(); 
           model.setRowCount(0);
           while (rs.next())
           {
               
               Object o []={
                   rs.getString("EMP_ID"),rs.getString("FIRST_NAME"),rs.getString("LAST_NAME"),rs.getString("MOBILE_NO"),rs.getString("EMAIL"),
              rs.getString("GENDER"),rs.getString("ADDRESS") };
               model.addRow(o);
               
           }
           /* if(rs.next()){
                String emp_id =rs.getString("EMP_ID");
                String f_name =rs.getString("FIRST_NAME");
                 System.out.println("EMpppppp "+f_name);
                String l_name =rs.getString("LAST_NAME");
                 System.out.println("pppnnn "+l_name);
                 String name = (f_name+l_name);
                String Phone =rs.getString("MOBILE_NO");
                 String dept=null;
                String Email =rs.getString("EMAIL");
               String Dob =rs.getString("DOB");
                String gen =rs.getString("GENDER");
                String Address =rs.getString("ADDRESS");
                rs.close();
                ps.close();
            
                While ();
                DefaultTableModel model =(DefaultTableModel)table1.getModel();
            //   DefaultTableModel Sudip = (DefaultTableModel)table1.getModel();
              model.addRow(new Object[]{emp_id,name,dept,Phone,Email,Dob,gen,Address});
            else{
                JOptionPane.showMessageDialog(this, "Enter Correct Empolyee Id");
                System.out.println("Enter Correct Employee Id");
            }
           */
        }catch(Exception e){
            System.out.println("error"+e);
        }
}
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EMPLOYEE_LIST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
