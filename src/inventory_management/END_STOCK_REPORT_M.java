/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;

/**
 *
 * @author ganesh pradhan
 */
public class END_STOCK_REPORT_M extends javax.swing.JFrame {

    /**
     * Creates new form END_STOCK_REPORT_M
     */
    public END_STOCK_REPORT_M() {
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

        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(69, 83, 106));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("STOCK REPORT");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/previous page  button(1).png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 51)));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 1232, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

        jTextField16.setBackground(new java.awt.Color(255, 255, 255));
        jTextField16.setBorder(null);
        jPanel22.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, 270, 40));

        jLabel50.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 153, 102));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Stock Out");
        jPanel22.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, 270, 30));

        jLabel42.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 153, 153));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 290, 141));

        jTextField15.setBackground(new java.awt.Color(255, 255, 255));
        jTextField15.setBorder(null);
        jPanel22.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 270, 30));

        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("*Current Month");
        jPanel22.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 110, -1));

        jLabel48.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 153, 102));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Stock In");
        jPanel22.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 290, 40));

        jLabel40.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 153, 153));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 290, 141));

        jLabel41.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 153, 102));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Current Stock");
        jPanel22.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 290, 30));

        jTextField13.setBackground(new java.awt.Color(255, 255, 255));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setBorder(null);
        jPanel22.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 250, 60));

        jLabel43.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 153, 153));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 290, 141));

        jTextField14.setBackground(new java.awt.Color(255, 255, 255));
        jTextField14.setBorder(null);
        jPanel22.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 270, 40));

        jLabel47.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 153, 102));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Stock Value");
        jPanel22.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 290, 30));

        jLabel44.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 153, 153));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 290, 141));

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("Product wise Current Stock");
        jPanel22.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, 260, 30));

        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 600, 370));

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("Category Wise Current Stock");
        jPanel22.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 270, 30));

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 600, 370));

        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("*Current Month");
        jPanel22.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 260, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(END_STOCK_REPORT_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(END_STOCK_REPORT_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(END_STOCK_REPORT_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(END_STOCK_REPORT_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new END_STOCK_REPORT_M().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    // End of variables declaration//GEN-END:variables
}
