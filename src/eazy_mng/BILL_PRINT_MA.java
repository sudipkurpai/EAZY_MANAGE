/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sudip Maiti
 */
public class BILL_PRINT_MA extends javax.swing.JFrame {
    String itmt = null ;
     String dsct = null ;
     String quant = null ;
     String prit = null ;
     String taxt = null ;
     String total_wgt = null ;
     String total_gt = null ;
     String time = null;
     String date = null;
     String ph = null;
     String Name = null;
     String Id = null;
     String emll = null;
     
     String Ttime=null;
     
    
     String Inv_no="null";
    
    /**
     * Creates new form BILL_PRINT
     */
    public BILL_PRINT_MA() {
        initComponents();
      
     
        all_t.setEditable(false);
        b_date.setEditable(false);
        b_date.setEditable(false);
        c_name.setEditable(false);
        c_eml.setEditable(false);
        c_phone.setEditable(false);
        addr.setEditable(false);
        pin.setEditable(false);
        inv_no.setEditable(false);
        all_t.setEditable(false);
        
         
        // fast();
    }
    void bp (String fullname, String mng_Id,String email,String t1,String d1,String p,String b_inv ) {
        Inv_no=b_inv;
        System.out.println("Invvv"+b_inv);
        inv_no.setText(b_inv);
        Name = fullname;
        Id = mng_Id;
        emll = email;
        time = t1;
        date = d1;
        ph= p;
      
        fast();
    }
   
   
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        print = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        c_eml = new javax.swing.JTextField();
        c_phone = new javax.swing.JTextField();
        c_name = new javax.swing.JTextField();
        b_t = new javax.swing.JTextField();
        addr = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        inv_no = new javax.swing.JTextField();
        b_date = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        all_t = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        bs = new javax.swing.JLabel();
        pss = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Address");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("City");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Country");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Postal Code");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EAZY MANAGEMENT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 33));

        print.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("BILL TO ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 75, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name :-");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Phone :-");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Address:-");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Postal Code :-");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Email :-");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel12.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Invoice No");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Date");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Time");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, -1, -1));

        c_eml.setBackground(new java.awt.Color(255, 255, 255));
        c_eml.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        c_eml.setForeground(new java.awt.Color(0, 0, 204));
        c_eml.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        c_eml.setBorder(null);
        c_eml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_emlActionPerformed(evt);
            }
        });
        jPanel2.add(c_eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 340, 20));

        c_phone.setBackground(new java.awt.Color(255, 255, 255));
        c_phone.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        c_phone.setForeground(new java.awt.Color(0, 0, 204));
        c_phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        c_phone.setBorder(null);
        c_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_phoneActionPerformed(evt);
            }
        });
        jPanel2.add(c_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 270, 30));

        c_name.setBackground(new java.awt.Color(255, 255, 255));
        c_name.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        c_name.setForeground(new java.awt.Color(0, 0, 204));
        c_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        c_name.setBorder(null);
        c_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nameActionPerformed(evt);
            }
        });
        jPanel2.add(c_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 290, 20));

        b_t.setBackground(new java.awt.Color(255, 255, 255));
        b_t.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        b_t.setForeground(new java.awt.Color(0, 0, 204));
        b_t.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        b_t.setBorder(null);
        b_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tActionPerformed(evt);
            }
        });
        jPanel2.add(b_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 110, 20));

        addr.setBackground(new java.awt.Color(255, 255, 255));
        addr.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        addr.setForeground(new java.awt.Color(0, 0, 204));
        addr.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        addr.setBorder(null);
        addr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrActionPerformed(evt);
            }
        });
        jPanel2.add(addr, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 350, 20));

        pin.setBackground(new java.awt.Color(255, 255, 255));
        pin.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        pin.setForeground(new java.awt.Color(0, 0, 204));
        pin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pin.setBorder(null);
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel2.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 170, 30));

        inv_no.setBackground(new java.awt.Color(255, 255, 255));
        inv_no.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        inv_no.setForeground(new java.awt.Color(0, 0, 204));
        inv_no.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        inv_no.setBorder(null);
        inv_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv_noActionPerformed(evt);
            }
        });
        jPanel2.add(inv_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 120, 20));

        b_date.setBackground(new java.awt.Color(255, 255, 255));
        b_date.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        b_date.setForeground(new java.awt.Color(0, 0, 204));
        b_date.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        b_date.setBorder(null);
        b_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dateActionPerformed(evt);
            }
        });
        jPanel2.add(b_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 90, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 204));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 870, 10));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 870, 340));

        all_t.setBackground(new java.awt.Color(255, 255, 255));
        all_t.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        all_t.setForeground(new java.awt.Color(153, 0, 0));
        all_t.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)), "Total", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(all_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 170, 60));

        jButton3.setBackground(new java.awt.Color(51, 153, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("PRINT");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, 110, 40));

        bs.setBackground(new java.awt.Color(255, 255, 255));
        bs.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        bs.setForeground(new java.awt.Color(153, 0, 0));
        bs.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)), "Bill Status", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(bs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 150, 60));

        pss.setBackground(new java.awt.Color(255, 255, 255));
        pss.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        pss.setForeground(new java.awt.Color(153, 0, 0));
        pss.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)), "Payment Status", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(pss, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 150, 60));

        print.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 910, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(910, 710));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void fast (){
         try {
        
             //Data fetch from database
            String sql = "Select * From add_bill where Invoice_id = ?  ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,Inv_no);
          //  ps.setString(2,date);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
           if(rs.next()){
               
               String nnn =rs.getString("C_name");
               String bDD =rs.getString("Date");
               String Btt =rs.getString("Time");
               String CEML =rs.getString("C_email");
               String CPPP =rs.getString("Phone");
               String Addddd =rs.getString("Address");
               String PNNN =rs.getString("Pin");
               String INVb =rs.getString("Invoice_id");
               String Taall =rs.getString("All_total");
               String BIl =rs.getString("Bill_status");
               String Pay =rs.getString("Payment_status");
               
              b_date.setText(bDD);
              b_t.setText(Btt);
              c_name.setText(nnn);
              c_eml.setText(CEML);
              c_phone.setText(CPPP);
              addr.setText(Addddd);
              pin.setText(PNNN);
              inv_no.setText(INVb);
              all_t.setText(Taall);
              bs.setText(BIl);
              pss.setText(Pay);
              String i = rs.getString("Product_name");
         //     System.out.println("!!!!!!!!!!"+ i);
              String actualString = i;
              String REGEX = "#";
              Pattern pattern = Pattern.compile(REGEX);
              String[] array = pattern.split(actualString);
         //     System.out.println("@@@@@@@@@@"+Arrays.toString(array));
              model.addColumn("Items", array);
              
              String d = rs.getString("Description");
           //   System.out.println("!!!!!!!!!!"+ d);
              String actString = d;
              String REGEX1 = "#";
              Pattern pattern1 = Pattern.compile(REGEX1);
              String[] array1 = pattern1.split(actString);
          //    System.out.println("@@@@@@@@@@"+Arrays.toString(array1));
              model.addColumn("Description", array1);
              
               String q = rs.getString("Quantity");
           //   System.out.println("!!!!!!!!!!"+ q);
              String actString1 = q;
              String REGEX2 = "#";
              Pattern pattern2 = Pattern.compile(REGEX2);
              String[] array2 = pattern2.split(actString1);
           //   System.out.println("@@@@@@@@@@"+Arrays.toString(array2));
              model.addColumn("Quantity", array2);
              
               String pi = rs.getString("Price");
          //    System.out.println("!!!!!!!!!!"+ pi);
              String actString3 = pi;
              String REGEX3 = "#";
              Pattern pattern3 = Pattern.compile(REGEX3);
              String[] array3 = pattern3.split(actString3);
           //   System.out.println("@@@@@@@@@@"+Arrays.toString(array3));
              model.addColumn("Price", array3);
              
               String t = rs.getString("Tax");
          //    System.out.println("!!!!!!!!!!"+ t);
              String actString4 = t;
              String REGEX4 = "#";
              Pattern pattern4 = Pattern.compile(REGEX4);
              String[] array4 = pattern4.split(actString4);
           //   System.out.println("@@@@@@@@@@"+Arrays.toString(array4));
              
              model.addColumn("Tax", array4);
              
              String twg = rs.getString("Total_without_gst");
           //   System.out.println("!!!!!!!!!!"+ twg);
              String actString5 = twg;
              String REGEX5 = "#";
              Pattern pattern5 = Pattern.compile(REGEX5);
              String[] array5 = pattern5.split(actString5);
            //  System.out.println("@@@@@@@@@@"+Arrays.toString(array5));
              model.addColumn("Total", array5);
              
              String tg = rs.getString("Total_with_gst");
             
              String actString6 = tg;
              String REGEX6 = "#";
              Pattern pattern6 = Pattern.compile(REGEX6);
              String[] array6 = pattern6.split(actString6);
              //System.out.println("@@@@@@@@@@"+Arrays.toString(array6));
              model.addColumn("Total with GST", array6);
              
                
               // model.addRow(array);
//               do
//               {
//                   Object o []={array1};
//                       //rs.getString("Product_name"),rs.getString("Description"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("Tax"),rs.getString("Total_without_gst"),rs.getString("Total_with_gst")};
//                   // JOptionPane.showMessageDialog(this, "Product Found");
//                   
//                   model.addRow(o);
//               }while (rs.next());
           }else{
                JOptionPane.showMessageDialog(null,"No Bills Available Between This Date", "Something Went Wrong!!", JOptionPane.ERROR_MESSAGE);
           }
          
            }catch(Exception e){
            System.out.println("error"+e);
        
            }
        
    }
    
    private void c_emlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_emlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_emlActionPerformed

    private void c_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_phoneActionPerformed

    private void c_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nameActionPerformed

    private void b_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_tActionPerformed

    private void addrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addrActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void inv_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv_noActionPerformed

    private void b_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_dateActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        DASHBOARD_M dm = new DASHBOARD_M();
        dm.mngname(Name, Id, emll, ph, date, time);
        dm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        PrinterJob job = PrinterJob.getPrinterJob();
       String  caa= c_name.getText();
            job.setJobName(caa+"'s Bill");
            
            job.setPrintable((Graphics pg, PageFormat pf, int pageNum) -> {
                pf.setOrientation(PageFormat.PORTRAIT);
                if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                double theScaleFactor = (567d / 842d);
                 g2.scale(theScaleFactor, theScaleFactor);
                
                //which panel want to print
                print.print(g2);
                
                //after print return state
                return Printable.PAGE_EXISTS;
         });
            //print job complete
            boolean ok = job.printDialog();
            if(ok){
                try{
                //if success then print  
                  job.print();
                }
                //other wise return error
                catch (PrinterException ex){
                    ex.printStackTrace();
                }
            }
    }//GEN-LAST:event_jButton3ActionPerformed

       
             
             
      
      
          
       
   
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BILL_PRINT_MA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addr;
    private javax.swing.JTextField all_t;
    private javax.swing.JTextField b_date;
    private javax.swing.JTextField b_t;
    private javax.swing.JLabel bs;
    private javax.swing.JTextField c_eml;
    private javax.swing.JTextField c_name;
    private javax.swing.JTextField c_phone;
    private javax.swing.JTextField inv_no;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField pin;
    private javax.swing.JPanel print;
    private javax.swing.JLabel pss;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
