package eazy_mng;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAGHUNATH DAS
 */
public class FORGOT_PASSWORD extends javax.swing.JFrame {
     String otp;
     String eml;
     String phonee;
     String name;
      String mng ;
     String msc;
     String a;
     String b1;
     String c;

    /**
     * Creates new form FORGATE_PASSWORD
     */
    public FORGOT_PASSWORD() {
        initComponents();
       text.setFocusable(false);
       text1.setVisible(false);
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        b = new javax.swing.JButton();
        cl = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(133, 178, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACCOUNT");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 120, 40));

        jLabel1.setBackground(new java.awt.Color(133, 178, 224));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1rrr.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 480, 480));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));

        jLabel3.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("PASSWORD ?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 310, -1));

        jLabel4.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("FORGOT");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 210, -1));

        text1.setBackground(new java.awt.Color(0, 204, 204));
        text1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        text1.setForeground(new java.awt.Color(0, 204, 204));
        text1.setText("Enter E-mail Address/Phone :");
        jPanel2.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 270, 30));

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Enter the Email address / Phone associate");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 380, 30));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("with Your account.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 180, 30));

        text.setBackground(new java.awt.Color(102, 0, 102));
        text.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        text.setForeground(new java.awt.Color(0, 204, 204));
        text.setText("Enter E-mail Address/Phone :");
        text.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFocusLost(evt);
            }
        });
        text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textMouseExited(evt);
            }
        });
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textKeyReleased(evt);
            }
        });
        jPanel2.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 330, 30));

        b.setBackground(new java.awt.Color(0, 204, 204));
        b.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b.setForeground(new java.awt.Color(102, 0, 102));
        b.setText("Submit");
        b.setToolTipText("");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        jPanel2.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 360, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 900, 490));

        cl.setBackground(new java.awt.Color(255, 51, 102));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });

        javax.swing.GroupLayout clLayout = new javax.swing.GroupLayout(cl);
        cl.setLayout(clLayout);
        clLayout.setHorizontalGroup(
            clLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        clLayout.setVerticalGroup(
            clLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(981, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFocusGained
        // TODO add your handling code here:
//       if(text.getText().equals("Enter E-mail Address/Phone :")){
//            text1.setVisible(true);
//            text.setText("");
//            text.setForeground(new Color(000,000,000));
//        }
    }//GEN-LAST:event_textFocusGained

    private void textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFocusLost
        // TODO add your handling code here:
//         if(text.getText().equals("")){
//            text1.setVisible(false);
//            text.setText("Enter E-mail Address/Phone :");
//            text.setForeground(new Color(0,204,204));
//         
//        }else{
//            text.setVisible(true);
//        }
    }//GEN-LAST:event_textFocusLost

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
        
       //  text.setFocusable(true);
         
         
    }//GEN-LAST:event_textActionPerformed

    private void textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMouseClicked
        // TODO add your handling code here:
        text.setFocusable(true);
         if(text.getText().equals("Enter E-mail Address/Phone :")){
            text1.setVisible(true);
            text.setText("");
            text.setForeground(new Color(000,000,000));
            text.setFocusable(true);
        }
    }//GEN-LAST:event_textMouseClicked

    private void textMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMouseEntered
        // TODO add your handling code here:
         if(text.getText().equals("Enter E-mail Address/Phone :")){
            text1.setVisible(true);
            text.setText("");
            text.setForeground(new Color(0,204,204));
            text.setFocusable(true);
        }
    }//GEN-LAST:event_textMouseEntered

    private void textMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMouseExited
        // TODO add your handling code here:
        if(text.getText().equals("")){
            text1.setVisible(false);
            text.setText("Enter E-mail Address/Phone :");
            text.setForeground(new Color(0,204,204));
         
        }else{
            text.setVisible(true);
        }
    }//GEN-LAST:event_textMouseExited

    private void textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textKeyReleased

    private void textKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyPressed
        // TODO add your handling code here:
        if(text.getText().equals("Enter E-mail Address/Phone :")){
            text1.setVisible(true);
            text.setText("");
            text.setForeground(new Color(0,204,204));
        }
    }//GEN-LAST:event_textKeyPressed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
         String p_email = text.getText();
        String phone = text.getText();
        
        try {
            //  Data fetch from database
            String sql = "Select * from register Where EMAIL =? or MOBILE_NO =? ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,p_email);
            ps.setString(2,phone);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                eml =rs.getString("Email");
               // System.out.println("mail"+eml);
                phonee =rs.getString("MOBILE_NO");
              //   System.out.println("phone"+phonee);
              String  fname=rs.getString("FIRST_NAME");
             String   lname=rs.getString("LAST_NAME");
                 name=fname+" "+lname;
             //   System.out.println("EMAILLLLLLLL "+eml);
              //  System.out.println("phoooooo "+phonee);
                
                rs.close();
                ps.close();
            
            }
        }catch(Exception e){
            System.out.println("error"+e);
        }
        try{
            if(p_email.equals(eml)||phone.equals(phonee) ){
              gen_otp();
             //  pass1.setEnabled(true);
               b.setEnabled(false);
              //  b2.setEnabled(false);
               
             //   System.out.println("matched"+eml);    
           //  JOptionPane.showMessageDialog(null, "OTP Sand To"+" "+name);
            /* if(REGISTRATION_DATAOBEJECT.vali(p_email, phone)){
                gen_otp();
                JOptionPane.showMessageDialog(null, "OTP Send");
                
                
             */ 
            } else{
                    
                JOptionPane.showMessageDialog(null,"Enter Correct Email Id/ Phone Number ", "Wrong Input", JOptionPane.ERROR_MESSAGE);
               
                 b.setEnabled(true);
                  
            }}
        catch (Exception e){
            System.out.println("Exceptionsssss -"+e);
        }  
     
   
    }//GEN-LAST:event_bActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:

         new LOGINFROM().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        // TODO add your handling code here:
        cl.setBackground(Color.red);
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        // TODO add your handling code here:
        cl.setBackground( new Color(255,51,102));
                
                
               
        
    }//GEN-LAST:event_jLabel18MouseExited

    
    public void gen_otp(){
        Random rand = new Random();
        otp = String.format("%06d",rand.nextInt(1000000));
        System.out.println("YOUR OTP IS "+otp);
                 
               
               msc= "YOUR OTP IS "+otp;
            MAIL.send(eml,"Welcome"+" "+name, msc);
            JOptionPane.showMessageDialog(null, "OTP Send To "+name+" By Email");
        
        a= JOptionPane.showInputDialog(this,"Enter Your OTP");
                 if (a.equals(otp)){
            
                  //   JOptionPane.showMessageDialog(null, "OTP Match");
                       FORGOT_PASSWORD_1 cpm = new FORGOT_PASSWORD_1();
                       cpm.res(eml, phonee);
                      //  cpm.cpmm(Name, Id, emll, time, date, ph);
                         cpm.setVisible(true);              
                         this.dispose();
                 }else {
                     JOptionPane.showMessageDialog(null, "OTP Not Match. Only 2 try Left!");
                  b1 = JOptionPane.showInputDialog(this,"Enter Your OTP");
                 
                 if(b1.equals(otp)){
                     
                            // JOptionPane.showMessageDialog(null, "OTP Match");
                                FORGOT_PASSWORD_1 cpm = new FORGOT_PASSWORD_1(); 
                               cpm.res(eml, phonee);
                                  cpm.setVisible(true);              
                                 this.dispose();
                  } else {
                     JOptionPane.showMessageDialog(null, "OTP Not Match. Only 1 try Left!");
                     c = JOptionPane.showInputDialog(this,"Enter Your OTP");
                 if(c.equals(otp)){
                        
                           //  JOptionPane.showMessageDialog(null, "OTP Match");
                                FORGOT_PASSWORD_1 cpm = new FORGOT_PASSWORD_1(); 
                                cpm.res(eml, phonee);
                                  cpm.setVisible(true);              
                                 this.dispose();
                                         
                      }else{
                          JOptionPane.showMessageDialog(null, "You estimate 3 attempts on OTP verification! Please, try again after some time.Thank You!");
                      }
                 }
                 }
    }

    
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
            java.util.logging.Logger.getLogger(FORGOT_PASSWORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORGOT_PASSWORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORGOT_PASSWORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORGOT_PASSWORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORGOT_PASSWORD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JPanel cl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField text;
    private javax.swing.JLabel text1;
    // End of variables declaration//GEN-END:variables
}
