/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Sudip Maiti
 */
public class LOGIN_EMPLOYEE extends javax.swing.JFrame {
 String date=null;
    String time = null;
    
    /**
     * Creates new form LOGINfROM
     */
    public LOGIN_EMPLOYEE() {
        initComponents();
        open.setVisible(false);
        date();
        time();
        Mpassword.setVisible(false);
        Memail.setVisible(false);
        pass.setEchoChar((char)0);
    }
    void hint (){
        
    }
    void date (){
      java.util.Date d=new java.util.Date ();
      SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
      date=(s.format(d));     
      
  }
  void time(){
     new Timer(0,new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
            java.util.Date d=new java.util.Date ();
            SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss a");
            time=(s.format(d));              
         }
     }).start();
  }

    /**
     * Creates new form MANAGER_LOGIN
     */
   /* public LOGINFROM() {
        initComponents();
    }*/

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
        Mpassword = new javax.swing.JLabel();
        Memail = new javax.swing.JLabel();
        emp = new javax.swing.JTextField();
        open = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        Clear = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Log_in = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(40, 64, 161));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 227, 70), 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mpassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Mpassword.setForeground(new java.awt.Color(128, 128, 128));
        Mpassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Mpassword.setText("Password");
        jPanel2.add(Mpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 330, -1));

        Memail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Memail.setForeground(new java.awt.Color(128, 128, 128));
        Memail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Memail.setText("Employee ID");
        jPanel2.add(Memail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 330, -1));

        emp.setBackground(new java.awt.Color(255, 255, 255));
        emp.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        emp.setForeground(new java.awt.Color(128, 128, 128));
        emp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emp.setText("Employee ID");
        emp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(128, 128, 128)));
        emp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                empFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                empFocusLost(evt);
            }
        });
        jPanel2.add(emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 329, 40));

        open.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visibility (2).png"))); // NOI18N
        open.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(128, 128, 128)));
        open.setPreferredSize(new java.awt.Dimension(24, 33));
        open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                openMousePressed(evt);
            }
        });
        jPanel2.add(open, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 40, 50));

        hide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visibility (1).png"))); // NOI18N
        hide.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(128, 128, 128)));
        hide.setPreferredSize(new java.awt.Dimension(24, 33));
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
        });
        jPanel2.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 40, 50));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pass.setForeground(new java.awt.Color(128, 128, 128));
        pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pass.setText("Password");
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(128, 128, 128)));
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 300, 40));

        jPanel4.setBackground(new java.awt.Color(220, 20, 60));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 63)));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clear.setText("Clear");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 190, 50));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(40, 64, 161));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SIGN IN");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 490, -1));

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 63));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Forgot Password ?");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 160, -1));

        jPanel5.setBackground(new java.awt.Color(40, 64, 161));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));

        Log_in.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Log_in.setForeground(new java.awt.Color(255, 255, 255));
        Log_in.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Log_in.setText("Sign In");
        Log_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Log_inMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Log_inMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Log_inMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Log_in, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Log_in, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 190, 50));

        Close.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 0, 0));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("❌");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 42)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 199, 95));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Eazy Management");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/team.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Welcome, to");

        jLabel14.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Let's Get Started");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1003, 653));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMousePressed
        // TODO add your handling code here:
        hide.setVisible(true);
        open.setVisible(false);
        pass.setEchoChar('*');
    }//GEN-LAST:event_openMousePressed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        // TODO add your handling code here:
        open.setVisible(true);
        hide.setVisible(false);
        pass.setEchoChar((char)0);
    }//GEN-LAST:event_hideMousePressed

    private void Log_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_inMouseClicked
        // TODO add your handling code here:
        String emp_Id = emp.getText();
        String p_pass = pass.getText();
        String name = null;
        String emp_id = null;       
        String eml = null;
        String phone = null;
        
        try {
             //Data fetch from database
            String sql = "Select * from employee_register Where EMP_ID = ?";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,emp_Id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String emi =rs.getString("EMP_ID");
                System.out.println("EMpppppp "+emp);
                String pss =rs.getString("Password");
                System.out.println("PASSSSSSSSSS "+pss);
                String fname =rs.getString("FIRST_NAME");
                System.out.println("FIRST_NAME "+fname);
                String lname =rs.getString("LAST_NAME");
                System.out.println("LAST_NAME "+lname);
                name = fname+" "+lname;
                System.out.println("FULL_NAME "+name);
                emp_id =rs.getString("EMP_ID");
                System.out.println("empoooooooo"+ emp_id);  
                eml =rs.getString("EMAIL");
                System.out.println("EMAILLLLLLLL "+eml);
                phone =rs.getString("MOBILE_NO");
                System.out.println("EMAILLLLLLLL "+phone);
                rs.close();
                ps.close();
            }else{
                System.out.println("Enter Correct User Name");
            }
        }catch(Exception e){
            System.out.println("error"+e);
        }
        try{
            //ganesh
            if(emp_Id.equals("")||p_pass.equals("")){
                JOptionPane.showMessageDialog(this, "Fill up all field first");
            }
            //raghu
            else if(ADD_NEW_EMP_DATAOBEJECT.validate(emp_Id, p_pass)){
                String t = time;
                EMP_SESSION_DATAOBJECT.emp_insert_session(name, emp_id, eml, phone, t,"",date,"");
                emp.setForeground(Color.GREEN);
                pass.setForeground(Color.GREEN); 
                JOptionPane.showMessageDialog(null, "Login Successfully");
                DASHBOARD_FINAL_EMPLOYEE dme = new DASHBOARD_FINAL_EMPLOYEE();
                dme.setVisible(true);
                dme.empname(name,emp_Id,eml,phone,date,t);
                this.dispose();
                
            }
            //sudip
            else{
                emp.setForeground(Color.RED);
                pass.setForeground(Color.RED);
                JOptionPane.showMessageDialog(null,"Enter Correct Details", "Login Error", JOptionPane.ERROR_MESSAGE);
                emp.setText("Employee ID");
                pass.setText("Password");
                pass.setEchoChar((char)0);
                Mpassword.setVisible(false);
                Memail.setVisible(false);
                emp.setForeground(new Color(128,128,128));
                pass.setForeground(new Color(128,128,128));
            }
        }catch (Exception e){
            System.out.println("Exception -"+e);
        }   
     
    }//GEN-LAST:event_Log_inMouseClicked

    private void empFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empFocusGained
        // TODO add your handling code here:
        if(emp.getText().equals("Employee ID")){
            Memail.setVisible(true);
            emp.setText("");
            emp.setForeground(new Color(000,000,000));
        }
    }//GEN-LAST:event_empFocusGained

    private void empFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empFocusLost
        // TODO add your handling code here:
         if(emp.getText().equals("")){
            Memail.setVisible(false);
            emp.setText("Employee ID");
            emp.setForeground(new Color(128,128,128));
        }else{
            emp.setVisible(true);
        }
    }//GEN-LAST:event_empFocusLost

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        // TODO add your handling code here:
         if(pass.getText().equals("Password")){
            Mpassword.setVisible(true);
            pass.setText("");
            pass.setEchoChar('*');
            pass.setForeground(new Color(000,000,000));
        }
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        // TODO add your handling code here:
         if(pass.getText().equals("")){
            Mpassword.setVisible(false);
            pass.setText("Password");
            pass.setEchoChar((char)0);
            pass.setForeground(new Color(128,128,128));
        }else{
            pass.setVisible(true);
        }
    }//GEN-LAST:event_passFocusLost

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
         OPTION op = new OPTION();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        Mpassword.setVisible(false);
        Memail.setVisible(false);
        emp.setText("Employee ID");
        pass.setText("Password");
        pass.setEchoChar((char)0);
        emp.setForeground(new Color(128,128,128));
        pass.setForeground(new Color(128,128,128));
    }//GEN-LAST:event_jPanel4MouseClicked

    private void Log_inMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_inMousePressed
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(0, 136, 136));
    }//GEN-LAST:event_Log_inMousePressed

    private void Log_inMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_inMouseReleased
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_Log_inMouseReleased

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
            java.util.logging.Logger.getLogger(LOGIN_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_EMPLOYEE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clear;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Log_in;
    private javax.swing.JLabel Memail;
    private javax.swing.JLabel Mpassword;
    private javax.swing.JTextField emp;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel open;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
