/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author RAGHUNATH DAS
 */
public class UPDATE_PROFILE_EMPLOYEE extends javax.swing.JFrame {
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
     * Creates new form MANAGER_UPDATE_PROFILE
     */
    public UPDATE_PROFILE_EMPLOYEE() {
        initComponents();
    }
    void udpe (String fullname, String mng_Id,String email,String t1,String d1,String p) {
       Name = fullname;
        ID = mng_Id;
        Email = email;
        time = t1;
        date = d1;
        Phone= p;
        //first_name.setEditable(false);
       // first_name.setText(Name);
       /* void nupe  (String fname, String lname,String ph,String email,String dob,String gender,String address) {
        First_name = fname;
        Last_name = lname;
        Phone = ph;
        Email = email;
        DOB = dob;
        Gender= gender;
        Address = address;
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ph = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Searchb = new javax.swing.JButton();
        Search1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dobb = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lname.setBackground(new java.awt.Color(255, 255, 255));
        lname.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 99, 450, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Last Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 69, 130, 20));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 369, 920, 100));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("DOB");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 245, -1, -1));

        ph.setBackground(new java.awt.Color(255, 255, 255));
        ph.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ph.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 187, 420, 40));

        fname.setBackground(new java.awt.Color(255, 255, 255));
        fname.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 99, 420, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Email");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 157, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("First Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 69, -1, -1));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 187, 450, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button (13).png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 497, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button (11).png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 497, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Gender");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Phone");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 157, -1, -1));

        gender.setBackground(new java.awt.Color(255, 255, 255));
        gender.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 450, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Home Address");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 333, 170, 30));

        Searchb.setBackground(new java.awt.Color(0, 51, 255));
        Searchb.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Searchb.setForeground(new java.awt.Color(255, 255, 255));
        Searchb.setText("Search");
        Searchb.setBorder(null);
        Searchb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchbMouseClicked(evt);
            }
        });
        Searchb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbActionPerformed(evt);
            }
        });
        jPanel2.add(Searchb, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 125, 45));

        Search1.setBackground(new java.awt.Color(255, 255, 255));
        Search1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Search1.setForeground(new java.awt.Color(0, 204, 0));
        Search1.setText("Enter Employee ID");
        Search1.setBorder(null);
        Search1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Search1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Search1FocusLost(evt);
            }
        });
        jPanel2.add(Search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 470, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/RaghuSearch.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 500, -1));

        dobb.setBackground(new java.awt.Color(255, 255, 255));
        dobb.setForeground(new java.awt.Color(0, 0, 0));
        dobb.setDateFormatString("dd-MM-yyyy");
        dobb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(dobb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 420, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1000, 560));

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setBackground(new java.awt.Color(0, 204, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE PROFILE EMPLOYEE");

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton1)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1000, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
        String dob = s.format(dobb.getDate());
       // System.out.println("dateee"+dob);
        String add = address.getText();
        
        String gen = gender.getSelectedItem().toString();
       // System.out.println("@@@@@@@@@ "+gen);
        String emp_idd=Search1.getText();
      //  System.out.println("empppppp"+emp_idd);
        
        
        int i = UPDATEPROFILE_M_DATAOBJECT.updateprofile_emp(dob, add, gen,emp_idd);
        
            //(FIRST_NAME,LAST_NAME,EMAIL,MOBILE_NO,PASSWORD,CONFIRM_PASSWORD,ADDRESS,GENDER)
           if(i>0){
               // System.out.println("Data inserted");
                JOptionPane.showMessageDialog(this, "Employee Profile Update Sucessfully "); 
                
           }else{
               // System.out.println("Data NOT inserted");
                JOptionPane.showMessageDialog(this, "Employee Profile Not Update Sucessfully"); 
           }
       
    }//GEN-LAST:event_jLabel16MouseClicked

    private void SearchbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchbMouseClicked
      String em_id = Search1.getText();
       try {
        
             //Data fetch from database
            String sql = "Select * From employee_register Where EMP_ID = ?";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,em_id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String emp_id =rs.getString("EMP_ID");
                String f_name =rs.getString("FIRST_NAME");
                // System.out.println("EMpppppp "+f_name);
                String l_name =rs.getString("LAST_NAME");
                // System.out.println("pppnnn "+l_name);
                String Phone =rs.getString("MOBILE_NO");
                 
                String Email =rs.getString("EMAIL");
               // System.out.println("emlllll "+l_name);
                
                String Dob =rs.getString("DOB");
                String gen =rs.getString("GENDER");
                String Address =rs.getString("ADDRESS");
                fname.setText(f_name);
                fname.setEditable(false);
                lname.setText(l_name);
                lname.setEditable(false);
                ph.setText(Phone);
                ph.setEditable(false);
                email.setText(Email);
                email.setEditable(false);
              //  dobb.setText(Dob);
                gender.setSelectedItem(gen);
                address.setText(Address);
                
                
               // JOptionPane.showMessageDialog(this, "Product Found");
                
               
                rs.close();
                ps.close();
            }else{
                JOptionPane.showMessageDialog(this, "Enter Correct Empolyee Id");
               // System.out.println("Enter Correct Employee Id");
            }
        }catch(Exception e){
            System.out.println("error"+e);
        }
        try{
            
            if(UPDATEPROFILE_M_DATAOBJECT.validate(em_id))
            {    

            //System.out.println("EmpppppppppppIDD"+em_id);
                JOptionPane.showMessageDialog(this, "Employee Found in This Id");
           }else 
            JOptionPane.showMessageDialog(this, "Employee ID not found");
             
        }catch (Exception e){
            System.out.println("Exception -"+e);  
    }                                  
    }//GEN-LAST:event_SearchbMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
         DASHBOARD_M dm = new DASHBOARD_M();
       dm.mngname(Name,ID,Email,Phone,date,time);
       dm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        Search1.setText("Enter Employee ID");
                fname.setText("");
                lname.setText("");
                ph.setText("");
                email.setText("");
                gender.setSelectedIndex(1);
                address.setText("");
                 dobb.setDate(null);
       
    }//GEN-LAST:event_jLabel18MouseClicked

    private void Search1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Search1FocusGained
        // TODO add your handling code here:
        if(Search1.getText().equals("Enter Employee ID")){
            
            Search1.setText("");
    }                            
    }//GEN-LAST:event_Search1FocusGained

    private void Search1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Search1FocusLost
        // TODO add your handling code here:
        if(Search1.getText().equals("")){
           
            Search1.setText("Enter Employee ID");
           
        }else{
           Search1.setVisible(true);
        }
    }//GEN-LAST:event_Search1FocusLost

    private void SearchbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UPDATE_PROFILE_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UPDATE_PROFILE_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UPDATE_PROFILE_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UPDATE_PROFILE_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UPDATE_PROFILE_EMPLOYEE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search1;
    private javax.swing.JButton Searchb;
    private javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser dobb;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField ph;
    // End of variables declaration//GEN-END:variables
}
