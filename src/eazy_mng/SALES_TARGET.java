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
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author RAGHUNATH DAS
 */
public class SALES_TARGET extends javax.swing.JFrame {
    String ID = null;
    String Name = null;
    String Phone = null;
    String Email = null;
    String date=null;
    String time = null;
    /**
     * Creates new form SALES_TARGET
     */
    public SALES_TARGET() throws ParseException {
        initComponents();
        pn.setEditable(false);
        date();
        time();
        String dd = 31 + "-" + 12 + "-" +0001;
        table();

    Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dd);
     
     d4.setDate(date);
    }
    void Sell_t (String fullname, String mng_Id,String email,String t1,String d1,String p) {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        d2 = new com.toedter.calendar.JDateChooser();
        d0 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        d1 = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        t0 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        d = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        d3 = new com.toedter.calendar.JDateChooser();
        pn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        q = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        d4 = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SALES TARGET");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 360, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        d2.setBackground(new java.awt.Color(255, 255, 255));
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 153)));
        d2.setForeground(new java.awt.Color(0, 0, 0));
        d2.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 240, 40));

        d0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d0.setForeground(new java.awt.Color(0, 0, 153));
        d0.setText("20/04/2021");
        jPanel2.add(d0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 100, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Date :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        d1.setBackground(new java.awt.Color(255, 255, 255));
        d1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 153)));
        d1.setForeground(new java.awt.Color(0, 0, 0));
        d1.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 240, 40));

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Search");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 80, 40));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manager Name", "Manager ID", "Date", "Time", "Product ID", "Product Name", "From Date", "To Date", "Quantity", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 910, 160));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Time : ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 50, 30));

        t0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        t0.setForeground(new java.awt.Color(0, 0, 153));
        t0.setText("10:10:11 am");
        jPanel2.add(t0, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 100, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2), "Set Target", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        d.setBackground(new java.awt.Color(255, 255, 255));
        d.setColumns(20);
        d.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        d.setForeground(new java.awt.Color(0, 0, 204));
        d.setRows(5);
        jScrollPane1.setViewportView(d);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 870, 80));

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 100, 40));

        d3.setBackground(new java.awt.Color(255, 255, 255));
        d3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        d3.setForeground(new java.awt.Color(0, 0, 204));
        d3.setDateFormatString("dd-MM-yyyy");
        jPanel4.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 170, 40));

        pn.setBackground(new java.awt.Color(255, 255, 255));
        pn.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        pn.setForeground(new java.awt.Color(0, 0, 204));
        pn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });
        jPanel4.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 210, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Product Name:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 140, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("To");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 80, 40));

        jButton4.setBackground(new java.awt.Color(0, 0, 204));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Search");
        jButton4.setBorder(null);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 80, 40));

        q.setBackground(new java.awt.Color(255, 255, 255));
        q.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        q.setForeground(new java.awt.Color(0, 0, 204));
        q.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jPanel4.add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, 40));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 204));
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 190, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Product ID :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setText(" Quantity : ");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText(" Description : ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 40));

        d4.setBackground(new java.awt.Color(255, 255, 255));
        d4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        d4.setForeground(new java.awt.Color(0, 0, 204));
        d4.setDateFormatString("dd-MM-yyyy");
        jPanel4.add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 170, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 910, 320));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Reset");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void date() throws ParseException {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        d0.setText(s.format(d));
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(s.format(d));
        d3.setDate(date);
        
    }

    void time() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                t0.setText(s.format(d));
            }
        }
        ).start();

    }
    
    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
          DASHBOARD_M dm = new DASHBOARD_M();
    dm.mngname(Name,ID,Email,Phone,date,time);
    dm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            // TODO add your handling code here:
            id.setText("");
            pn.setText("");
            q.setText("");
            d.setText("");
            date();
            String dd = 31 + "-" + 12 + "-" +0001;
            
            
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dd);
            
            d4.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(SALES_TARGET.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
         String product_idee = id.getText();
    
        try {
        
             //Data fetch from database
            String sql = "Select * from add_new_product Where Product_id = ?";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
             
            ps.setString(1,product_idee);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
              String product_ideoo =rs.getString("Product_name");
              pn.setText(product_ideoo);
               
                rs.close();
                ps.close();
                
                 }else{
                JOptionPane.showMessageDialog(this, "Enter Correct Product Id");
               
            }
        }catch(Exception e){
            System.out.println("error"+e);
        }
        
        
    }//GEN-LAST:event_jButton4MouseClicked
public void table()
{
    try {
        
             //Data fetch from database
            String sql = "Select * From sales_target1 ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
           while (rs.next())
           {
               //(MANAGER_NAME,MANAGER_ID,DATE,TIME,"
                       //    + "PRODUCT_ID,PRODUCT_NAME,FROM_DATE,TO_DATE,QUANTITY,DESCRIPTION)
               
               Object o []={
                   rs.getString("MANAGER_NAME"),rs.getString("MANAGER_ID"),rs.getString("DATE"),rs.getString("TIME"),rs.getString("PRODUCT_ID"),rs.getString("PRODUCT_NAME"),
                   rs.getString("FROM_DATE"),rs.getString("TO_DATE"),rs.getString("QUANTITY"),rs.getString("DESCRIPTION") };
               model.addRow(o);
               
           }
            }catch(Exception e){
            System.out.println("error"+e);
        }
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String p_id = id.getText();
        String proname = pn.getText();
        String quan = q.getText();

        String dec = d.getText();
       
        String dd0=d0.getText();
        String tt0=t0.getText();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String dd =  s.format(d3.getDate());
        String dd1 =  s.format(d4.getDate());
      
        
        if(proname.equals("") ){
            JOptionPane.showMessageDialog(this, "Fill up all field first");
        }else if (quan.equals("")){
            JOptionPane.showMessageDialog(this, "Enter Tatget quantity");
        }else  if(dd1.equals("31-12-0001")){
            JOptionPane.showMessageDialog(this, "Give  Target Date ");
        }   else if(dec.equals("")){
             JOptionPane.showMessageDialog(this, "Give Target Descprition");
        }else{
      
             SELL_TARGET_DATAOBJECT.SELL_T(Name, ID, dd0, tt0, p_id, proname, dd, dd1, quan, dec);
             JOptionPane.showMessageDialog(this, "Sell Target Save");
             try {
            // TODO add your handling code here:
            id.setText("");
            pn.setText("");
            q.setText("");
            d.setText("");
            date();
            String zz = 31 + "-" + 12 + "-" +0001;
            
            
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(zz);
            
            d4.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(SALES_TARGET.class.getName()).log(Level.SEVERE, null, ex);
           
        }
             table();
                   
           // MANAGER_MANE,MANAGER_ID,DATE,TIME, "PRODUCT_ID,PRODUCT_NAME,FROM_DATE,TO_DATE,QUANTITY,DRSCRIPTION"
          
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        d1.setDate(null);
        d2.setDate(null);
        table();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(d1.getDate()==null&& d2.getDate()==null){
           bb2();
            }else{
                
            try {
                bb21();
            } catch (SQLException ex) {
                Logger.getLogger(SALES_TARGET.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
public void bb2(){
         try {
        
             //Data fetch from database
            String sql = "Select * From sales_target1 ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
           while (rs.next())
           {
               
               Object o []={
                  
                     rs.getString("MANAGER_NAME"),rs.getString("MANAGER_ID"),rs.getString("DATE"),rs.getString("TIME"),rs.getString("PRODUCT_ID"),rs.getString("PRODUCT_NAME"),
                   rs.getString("FROM_DATE"),rs.getString("TO_DATE"),rs.getString("QUANTITY"),rs.getString("DESCRIPTION") };
                   model.addRow(o);
             //  table2.setForeground(Color.BLUE);
               JTableHeader tableHeader = table.getTableHeader();
               tableHeader. setBackground(Color.GREEN);
           }
            }catch(Exception e){
            System.out.println("error"+e);
        }
    }
    
    public void bb21() throws SQLException{
        try {
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
             String d5 = s.format(d1.getDate());
         
            String d6 = s.format(d2.getDate());
            
            String sql = "Select * From sales_target1 Where DATE between '"+d5+"' and '"+d6+"' ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
          if (rs.next()){
           do{
               
               Object o []={
                  
                     rs.getString("MANAGER_NAME"),rs.getString("MANAGER_ID"),rs.getString("DATE"),rs.getString("TIME"),rs.getString("PRODUCT_ID"),rs.getString("PRODUCT_NAME"),
                   rs.getString("FROM_DATE"),rs.getString("TO_DATE"),rs.getString("QUANTITY"),rs.getString("DESCRIPTION") };
                   model.addRow(o);
             //  table2.setForeground(Color.BLUE);
               JTableHeader tableHeader = table.getTableHeader();
               tableHeader. setBackground(Color.GREEN);
           }
           while (rs.next());
          }else{
              JOptionPane.showMessageDialog(this, "No Target Founf Between this Date");
          }
            }catch(Exception e){
            System.out.println("error"+e);
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
            java.util.logging.Logger.getLogger(SALES_TARGET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALES_TARGET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALES_TARGET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALES_TARGET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SALES_TARGET().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(SALES_TARGET.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea d;
    private javax.swing.JLabel d0;
    private com.toedter.calendar.JDateChooser d1;
    private com.toedter.calendar.JDateChooser d2;
    private com.toedter.calendar.JDateChooser d3;
    private com.toedter.calendar.JDateChooser d4;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField q;
    private javax.swing.JLabel t0;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
