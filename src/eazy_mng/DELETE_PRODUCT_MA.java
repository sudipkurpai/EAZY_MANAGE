/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAGHUNATH DAS
 */
public class DELETE_PRODUCT_MA extends javax.swing.JFrame {
     String time = null;
     String date = null;
     String ph = null;
     String Name = null;
     String Id = null;
     String emll = null;

    /**
     * Creates new form DELETE_PRODUCT_
     */
    public DELETE_PRODUCT_MA() {
        initComponents();
        
        time();
        date();
        table();
        pn.setEditable(false);
        pd.setEditable(false);
        sq.setEditable(false);
        pri.setEditable(false);
        brand.setEditable(false);
        cata.setEditable(false);
        mmmm.setEditable(false);
        mnnn.setEditable(false);
}
     void dp (String fullname, String mng_Id,String email,String t1,String d1,String p) {
        Name = fullname;
        Id = mng_Id;
        emll = email;
        time = t1;
        date = d1;
        ph= p;
       
        
        mnnn.setText(Name);
        mmmm.setText(Id);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reson = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        mmmm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mnnn = new javax.swing.JTextField();
        pd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pro_id = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        t2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        sq = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pri = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cata = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Description", "Stock", "Price", "Brand", "Category", "Reason", "Manager Id", "Manager Name", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1090, 320));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 150, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Manager Name");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 158, -1));

        jScrollPane2.setViewportView(reson);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 860, 80));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Time :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 90, 30));

        mmmm.setBackground(new java.awt.Color(255, 255, 255));
        mmmm.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(mmmm, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 226, 34));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText(" Manager ID");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 140, -1));

        mnnn.setBackground(new java.awt.Color(255, 255, 255));
        mnnn.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(mnnn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 226, 34));

        pd.setBackground(new java.awt.Color(255, 255, 255));
        pd.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 226, 34));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Product Name");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 139, -1));

        pn.setBackground(new java.awt.Color(255, 255, 255));
        pn.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 226, 34));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Product Description");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 190, -1));

        pro_id.setBackground(new java.awt.Color(255, 255, 255));
        pro_id.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        pro_id.setForeground(new java.awt.Color(0, 0, 0));
        pro_id.setText("Enter a Product Id :");
        pro_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pro_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pro_idFocusLost(evt);
            }
        });
        pro_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pro_idKeyReleased(evt);
            }
        });
        jPanel4.add(pro_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 300, 40));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 150, 50));

        t2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 180, 20));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Date :");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 20));

        d2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        d2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 230, 20));

        sq.setBackground(new java.awt.Color(255, 255, 255));
        sq.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(sq, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 226, 34));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Stock Quantity");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 190, -1));

        brand.setBackground(new java.awt.Color(255, 255, 255));
        brand.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 226, 34));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Brand");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 190, -1));

        pri.setBackground(new java.awt.Color(255, 255, 255));
        pri.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(pri, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 226, 34));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Price");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 140, -1));

        cata.setBackground(new java.awt.Color(255, 255, 255));
        cata.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(cata, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 226, 34));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Category ");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 140, -1));

        jButton4.setBackground(new java.awt.Color(255, 51, 102));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 150, 40));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Reason For Delete Product :");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 280, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1090, 350));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Deleted Product Details :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 280, 30));

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DELETE PRODUCT");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 71));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1110, 803));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void date() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd:MM:yyyy");
        d2.setText(s.format(d));
    }
    

    void time() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                t2.setText(s.format(d));
            }
        }
        ).start();
    }
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        DASHBOARD_M dm = new DASHBOARD_M();
        dm.mngname(Name, Id, emll, ph, date, time);
        dm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void pro_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_idKeyReleased
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_pro_idKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          String product = pro_id.getText();
      
      
   
        try {
        
             //Data fetch from database
            String sql = "Select * From add_new_product Where Product_id = ? ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,product);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String pnnn =rs.getString("Product_name");
                String pddd =rs.getString("Description");
                String sqq =rs.getString("Quantity");
                String prii =rs.getString("Standerd_cost");
                String brad =rs.getString("Brand");
                String catt =rs.getString("Category");
               
                pn.setText(pnnn);
           //     pn.setEditable(false);
                pd.setText(pddd);
             //   pd.setEditable(false);
                sq.setText(sqq);
              //  sq.setEditable(false);
                pri.setText(prii);
              //  pri.setEditable(false);
                brand.setText(brad);
               // brand.setEditable(false);
                cata.setText(catt);
               // cata.setEditable(false);
                
             //   mmmm.setEditable(false);
                
              //  mnnn.setEditable(false);
                
                JOptionPane.showMessageDialog(this, "Product Found");
                
               
               
            }else{
                JOptionPane.showMessageDialog(this, "Enter Correct Product Id");
               // System.out.println("Enter Correct Employee Id");
            }
        }catch(Exception e){
            System.out.println("error"+e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void reset(){
                pro_id.setText("Enter a Product Id :");
                pn.setText("");
                pd.setText("");
                sq.setText("");
                pri.setText("");
                brand.setText("");
                cata.setText("");
                reson.setText("");
               }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void table(){
    try {
        
             //Data fetch from database
            String sql = "Select * From delete_product ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
           while (rs.next())
           {
               
               Object o []={
                   rs.getString("Product_id"),rs.getString("Product_name"),rs.getString("Description"),rs.getString("Quantity"),rs.getString("Price"),
              rs.getString("Brand"),rs.getString("Category"),rs.getString("Reason"),rs.getString("Manager_id"),rs.getString("Manager_name"),rs.getString("Date"),rs.getString("Time") };
               model.addRow(o);
           } 
           }catch(Exception e){
            System.out.println("error"+e);
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String pnn=pn.getText();
        String rea=reson.getText();
        if (pnn.equals("")){
            JOptionPane.showMessageDialog(this, "Select A Product To Delete");
        }else if(rea.equals("")){
            JOptionPane.showMessageDialog(this, "Enter a Reason For Delet This Product ");
        }else {
           int Yes = JOptionPane.showConfirmDialog(null, "Are Your Sure Want to Remove This Employee ?");
        if(Yes == 0){
                String idd = pro_id.getText();
                String pdd=pd.getText();
                String pee=sq.getText();
                String prii=pri.getText();
                String brad=brand.getText();
                String cat=cata.getText();
                String midd=mmmm.getText();
                String mname=mnnn.getText();
                String tii=t2.getText();
                String dii=d2.getText();
               
     int i =  DELECT_PRODUCT_DETAOBJECT.delet(idd, pnn, pdd, pee, prii, brad, cat, rea, midd,mname, dii, tii);
     
        try{
                if(i>0){
            String sql="delete from add_new_product where Product_id = ?";
             Connection con=DATABASE_CONNECTION.getConnection();
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,idd);
                    ps.execute();
                    ps.close();
                    con.close();
                    reset();
                    table(); 
                    JOptionPane.showMessageDialog(this, "Delete Product Succesfully");
                  
                }else{
                    JOptionPane.showMessageDialog(this, "Product can't Delete"); 
                }  
        }catch(Exception exe){
                System.out.println("exxxx"+exe);
                
             }
        }else{
                int No = 0;
                if(No==0){
                    
                
            }
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pro_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pro_idFocusGained
        // TODO add your handling code here:
        if(pro_id.getText().equals("Enter a Product Id :"))
        {
            pro_id.setText("");
        }
    }//GEN-LAST:event_pro_idFocusGained

    private void pro_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pro_idFocusLost
        // TODO add your handling code here:
        if(pro_id.getText().equals("")){
           pro_id.setText("Enter a Product Id :"); 
        }
    }//GEN-LAST:event_pro_idFocusLost

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
            java.util.logging.Logger.getLogger(DELETE_PRODUCT_MA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DELETE_PRODUCT_MA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DELETE_PRODUCT_MA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DELETE_PRODUCT_MA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DELETE_PRODUCT_MA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brand;
    private javax.swing.JTextField cata;
    private javax.swing.JLabel d2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mmmm;
    private javax.swing.JTextField mnnn;
    private javax.swing.JTextField pd;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField pri;
    private javax.swing.JTextField pro_id;
    private javax.swing.JTextPane reson;
    private javax.swing.JTextField sq;
    private javax.swing.JLabel t2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
