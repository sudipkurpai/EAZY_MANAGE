/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAGHUNATH DAS
 */
public class SEARCH_PRODUCT_M extends javax.swing.JFrame {
     String time = null;
     String date = null;
     
     String ph = null;
     String Name = null;
     String Id = null;
     String emll = null;
     String trn_id = null;
     String Product_id = null;
    
    
    

    /**
     * Creates new form SEARCH_PRODUCT_M
     */
    public SEARCH_PRODUCT_M() {
        initComponents();
    }
    void snp (String fullname, String mng_Id,String email,String t1,String d1,String p) {
        Name = fullname;
        Id = mng_Id;
        emll = email;
        time = t1;
        date = d1;
        ph= p;
        
        
       
    
    //String product_idee = pro1_id.getText();
        //String p_pass = pass.getText();
        
        
        
//        try {
//             //Data fetch from database
//            String sql = "Select * from add_new_product Where Product_id = ?";
//            Connection con=DATABASE_CONNECTION.getConnection();
//            PreparedStatement ps=con.prepareStatement(sql);
//             String product_idee = pro1_id.getText();
//            ps.setString(1,product_idee);
//            ResultSet rs=ps.executeQuery();
//            if(rs.next()){
//                String product_ideoo =rs.getString("Product_id");
//                 System.out.println("EMpppppp "+product_ideoo);
//                String product_nameyy =rs.getString("Product_name");
//                 System.out.println("pppnnn "+product_nameyy);
//                String description =rs.getString("Description");
//                 System.out.println("ddsss "+description);
//                String standerd_cost =rs.getString("Standerd_cost");
//                 System.out.println("ssccc "+standerd_cost);
//                String unitprice =rs.getString("Unit_price");
//                 System.out.println("uuppp "+unitprice);
//                String mfgdate =rs.getString("Mfg_date");
//                 System.out.println("mmmddd "+mfgdate);
//                String expirydate =rs.getString("Exp_date");
//                 System.out.println("eeeddd "+expirydate);
//                String quantity =rs.getString("Quantity");
//                 System.out.println("qqqqnnn "+quantity);
//                String category =rs.getString("Category");
//                 System.out.println("ccccttt "+category);
//                String brand =rs.getString("Brand");
//                System.out.println("bbbrr "+brand);
//                
//               
//                rs.close();
//                ps.close();
//            }else{
//                System.out.println("Enter Correct Product Id");
//            }
//        }catch(Exception e){
//            System.out.println("error"+e);
//        }
//        try{
//            //ganesh
//            if(Product_id.equals("pro1_id")){
//                JOptionPane.showMessageDialog(this, "product found");
//            }
//            //raghu
//            else 
//            JOptionPane.showMessageDialog(this, "product not found");
//            //sudip
//           
//            
//        }catch (Exception e){
//            System.out.println("Exception -"+e);
//        }   
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
        jLabel5 = new javax.swing.JLabel();
        pro1_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying-glass.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        pro1_id.setBackground(new java.awt.Color(255, 255, 255));
        pro1_id.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pro1_id.setBorder(null);
        jPanel1.add(pro1_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 49, 400, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/RaghuSearch.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 65));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button (23).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Description", "Stander Cost", "Unit Price", "Mfg Date", "Expiry Date", "Quantity", "category", "Brand"
            }
        ));
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1160, 780));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("x");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1118, 0, -1, 30));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 930, 140, 40));

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Modify");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 930, 150, 40));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 930, 140, 40));

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
   String product_idee = pro1_id.getText();
    String product_ideoo= null;
        try {
        
             //Data fetch from database
            String sql = "Select * from add_new_product Where Product_id = ?";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
             
            ps.setString(1,product_idee);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                product_ideoo =rs.getString("Product_id");
                 System.out.println("EMpppppp "+product_ideoo);
                String product_nameyy =rs.getString("Product_name");
                 System.out.println("pppnnn "+product_nameyy);
                String description =rs.getString("Description");
                 System.out.println("ddsss "+description);
                String standerd_cost =rs.getString("Standerd_cost");
                 System.out.println("ssccc "+standerd_cost);
                String unitprice =rs.getString("Unit_price");
                 System.out.println("uuppp "+unitprice);
                String mfgdate =rs.getString("Mfg_date");
                 System.out.println("mmmddd "+mfgdate);
                String expirydate =rs.getString("Exp_date");
                 System.out.println("eeeddd "+expirydate);
                String quantity =rs.getString("Quantity");
                 System.out.println("qqqqnnn "+quantity);
                String category =rs.getString("Category");
                 System.out.println("ccccttt "+category);
                String brand =rs.getString("Brand");
                System.out.println("bbbrr "+brand);
               // JOptionPane.showMessageDialog(this, "Product Found");
                
               
                rs.close();
                ps.close();
            }else{
                JOptionPane.showMessageDialog(this, "Enter Correct Product Id");
                System.out.println("Enter Correct Product Id");
            }
        }catch(Exception e){
            System.out.println("error"+e);
        }
        try{
            //ganesh
            if(ADD_NEW_PRODUCT_DETAOBJ.validate(product_idee))
                 

            {System.out.println("ppppppppppiiiiiiiiiii"+product_idee);
                JOptionPane.showMessageDialog(this, "product found");
               // System.out.println("pppppppppp"+pro1_id);
               String table[] =  {Product_id};
              
         // DefaultTableModel model = (DefaultTableModel)table.getModel();
           // model.addRow(table);
              
            
    
            //raghu
            }else 
            JOptionPane.showMessageDialog(this, "product not found");
            //sudip
            
            
        }catch (Exception e){
            System.out.println("Exception -"+e);  
    }//GEN-LAST:event_jLabel2MouseClicked
     
           
      
    
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
            java.util.logging.Logger.getLogger(SEARCH_PRODUCT_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEARCH_PRODUCT_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEARCH_PRODUCT_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEARCH_PRODUCT_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEARCH_PRODUCT_M().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pro1_id;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
