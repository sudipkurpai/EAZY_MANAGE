/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author RAGHUNATH DAS
 */
public class FORGOT_PASSWORD extends javax.swing.JFrame {
     int otp;
     String eml;
     String phonee;
     
    /**
     * Creates new form LOGIN_M
     */
    public FORGOT_PASSWORD() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        mng_id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(154, 211, 188));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/email.png"))); // NOI18N
        jLabel3.setText("Email ID / Phone");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 420, 30));

        mng_id.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jPanel2.add(mng_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 420, 60));

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Verify Code");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 140, 50));

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Send");
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 110, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Enter Your OTP");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 420, 50));

        pass1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 420, 60));

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forgot Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 36), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 472, 496));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close3.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(558, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
       LOGIN_EMPLOYEE dm = new LOGIN_EMPLOYEE();
        dm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
        try{
          
            if (Integer.parseInt(pass1.getText())== otp){
            System.out.println("OTP Validate Successfully");  
            JOptionPane.showMessageDialog(null, "OTP Validate Successfully");
            RESET_PASSWORD FP = new RESET_PASSWORD();
            FP.res(eml, phonee);
            FP.setVisible(true);
            this.dispose();
            }
            else{
            JOptionPane.showMessageDialog(null, "Enter Your OTP", " Error", JOptionPane.ERROR_MESSAGE);   
           }
        }catch (Exception e){
            System.out.println("Exception -"+e);
        }  
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        String p_email = mng_id.getText();
        String phone = mng_id.getText();
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
                phonee =rs.getString("MOBILE_NO");
                System.out.println("EMAILLLLLLLL "+eml);
                System.out.println("phoooooo "+phonee);
                
                rs.close();
                ps.close();
            
            }
        }catch(Exception e){
            System.out.println("error"+e);
        }
        try{
            if(p_email.equals(eml)||phone.equals(phonee) ){
                
                gen_otp();
               
                System.out.println("matched"+eml);    
             JOptionPane.showMessageDialog(null, "OTP Sand");
            /* if(REGISTRATION_DATAOBEJECT.vali(p_email, phone)){
                gen_otp();
                JOptionPane.showMessageDialog(null, "OTP Send");
                
                
             */ 
            } else{
                    
                JOptionPane.showMessageDialog(null,"Enter Correct Email Id/ Phone Number ", "Login Error", JOptionPane.ERROR_MESSAGE);
                
            }}
        catch (Exception e){
            System.out.println("Exceptionsssss -"+e);
        }  
     
    }//GEN-LAST:event_jButton3MouseClicked

    
    public void gen_otp(){
         Random rand = new Random();
        otp = rand.nextInt(10000); // 0 - 9999
        System.out.println("YOUR OTP IS "+otp);
       
          try{
              String mng = mng_id.getText();
              String msc= "YOUR OTP IS "+otp;
            Mail.send(msc,"cc", "Welcome User", msc);
                   

        }catch(Exception e){
            e.printStackTrace();
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mng_id;
    private javax.swing.JPasswordField pass1;
    // End of variables declaration//GEN-END:variables
}
