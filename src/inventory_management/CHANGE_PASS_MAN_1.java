/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;

import java.awt.Color;

/**
 *
 * @author Sudip Maiti
 */
public class CHANGE_PASS_MAN_1 extends javax.swing.JFrame {

    /**
     * Creates new form CHANGE_PASS_MAN
     */
    public CHANGE_PASS_MAN_1() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        open1 = new javax.swing.JLabel();
        hide1 = new javax.swing.JLabel();
        open2 = new javax.swing.JLabel();
        hide2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Submit");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 160, 40));

        pass.setBackground(new java.awt.Color(204, 255, 204));
        pass.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 204, 102));
        pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pass.setText("Enter New Password");
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 102)));
        pass.setPreferredSize(new java.awt.Dimension(420, 40));
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 350, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHANGE PASSWORD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        pass1.setBackground(new java.awt.Color(204, 255, 204));
        pass1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        pass1.setForeground(new java.awt.Color(0, 204, 102));
        pass1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pass1.setText("Re-Enter New Password");
        pass1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 102)));
        pass1.setPreferredSize(new java.awt.Dimension(420, 40));
        pass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass1FocusLost(evt);
            }
        });
        jPanel1.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 350, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/key_1.png"))); // NOI18N
        jLabel17.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/key_1.png"))); // NOI18N
        jLabel13.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        open1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        open1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visibility (2).png"))); // NOI18N
        open1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 102)));
        open1.setPreferredSize(new java.awt.Dimension(24, 33));
        open1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                open1MousePressed(evt);
            }
        });
        jPanel1.add(open1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 40, 40));

        hide1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visibility (1).png"))); // NOI18N
        hide1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 102)));
        hide1.setPreferredSize(new java.awt.Dimension(24, 33));
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide1MousePressed(evt);
            }
        });
        jPanel1.add(hide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 40, 40));

        open2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        open2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visibility (2).png"))); // NOI18N
        open2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 102)));
        open2.setPreferredSize(new java.awt.Dimension(24, 33));
        open2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                open2MousePressed(evt);
            }
        });
        jPanel1.add(open2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 40, 40));

        hide2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visibility (1).png"))); // NOI18N
        hide2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 102)));
        hide2.setPreferredSize(new java.awt.Dimension(24, 33));
        hide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide2MousePressed(evt);
            }
        });
        jPanel1.add(hide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(570, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        // TODO add your handling code here:
        if(pass.getText().equals("Enter New Password")){
            
            pass.setText("");
            pass.setEchoChar('*');
            pass.setForeground(new Color(0,204,102));
        }
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        // TODO add your handling code here:
        if(pass.getText().equals("")){
           
            pass.setText("Enter New Password");
            pass.setEchoChar((char)0);
            pass.setForeground(new Color(128,128,128));
        }else{
            pass.setVisible(true);
        }
    }//GEN-LAST:event_passFocusLost

    private void pass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass1FocusLost
        // TODO add your handling code here:
        if(pass1.getText().equals("")){
           
            pass1.setText("Re-Enter New Password");
            pass1.setEchoChar((char)0);
            pass1.setForeground(new Color(128,128,128));
        }else{
            pass1.setVisible(true);
        }
    }//GEN-LAST:event_pass1FocusLost

    private void pass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass1FocusGained
        // TODO add your handling code here:
        if(pass1.getText().equals("Re-Enter New Password")){
            
            pass1.setText("");
            pass1.setEchoChar('*');
            pass1.setForeground(new Color(0,204,102));
        }
    }//GEN-LAST:event_pass1FocusGained

    private void open1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_open1MousePressed
        // TODO add your handling code here:
        hide1.setVisible(true);
        open1.setVisible(false);
        pass1.setEchoChar('*');
    }//GEN-LAST:event_open1MousePressed

    private void hide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MousePressed
        // TODO add your handling code here:
        open1.setVisible(true);
        hide1.setVisible(false);
        pass1.setEchoChar((char)0);
    }//GEN-LAST:event_hide1MousePressed

    private void open2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_open2MousePressed
        // TODO add your handling code here:
        hide2.setVisible(true);
        open2.setVisible(false);
        pass.setEchoChar('*');
    }//GEN-LAST:event_open2MousePressed

    private void hide2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide2MousePressed
        // TODO add your handling code here:
        open2.setVisible(true);
        hide2.setVisible(false);
        pass.setEchoChar((char)0);
    }//GEN-LAST:event_hide2MousePressed

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
            java.util.logging.Logger.getLogger(CHANGE_PASS_MAN_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CHANGE_PASS_MAN_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CHANGE_PASS_MAN_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CHANGE_PASS_MAN_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CHANGE_PASS_MAN_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel hide2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel open1;
    private javax.swing.JLabel open2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass1;
    // End of variables declaration//GEN-END:variables
}