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
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Sudip Maiti
 */
public class PRODUCT_SELL extends javax.swing.JFrame {
     String time = null;
     String date = null;
     String ph = null;
     String Name = null;
     String Id = null;
     String emll = null;
     String ts;
    /**
     * Creates new form PRODUCT_SALE
     */
    public PRODUCT_SELL() {
        initComponents();
        table();
        time();
        date();
        datee();
        cal();
        bill.setEnabled(false);
        total.setEditable(false);
        afs.setEditable(false);
    }
 void pss (String fullname, String emp_Id,String email,String t1,String d1,String p) {
        Name = fullname;
        Id = emp_Id;
        emll = email;
        time = t1;
        date = d1;
        ph= p;
        ename.setText(fullname);
        eid.setText(emp_Id);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ename = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        eid = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pro_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        p_name = new javax.swing.JTextField();
        cs = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pri = new javax.swing.JTextField();
        exp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        qun = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        afs = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        bill1 = new javax.swing.JButton();
        bill = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        select = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        d1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        ssss = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(32, 64, 81));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCT SELL");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 0, 252, 75));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 30, 33));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1176, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("Employee Name: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 81, -1, -1));

        ename.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ename.setForeground(new java.awt.Color(204, 0, 204));
        ename.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 0, 255)));
        jPanel1.add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 82, 251, 18));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("Employee ID: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 100, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 204));
        jLabel6.setText("Time: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 50, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 204));
        jLabel8.setText("Date :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 50, -1));

        eid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eid.setForeground(new java.awt.Color(204, 0, 204));
        eid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 0, 255)));
        jPanel1.add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 190, 18));

        t.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        t.setForeground(new java.awt.Color(204, 0, 204));
        t.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 0, 255)));
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 110, 18));

        d.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d.setForeground(new java.awt.Color(204, 0, 204));
        d.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 0, 255)));
        jPanel1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 110, 18));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1150, 14));

        pro_id.setBackground(new java.awt.Color(204, 255, 204));
        pro_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pro_id.setForeground(new java.awt.Color(0, 0, 255));
        pro_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel1.add(pro_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 240, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 153));
        jLabel5.setText("Product Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 153));
        jLabel7.setText("Product Name: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, -1));

        p_name.setBackground(new java.awt.Color(204, 255, 204));
        p_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        p_name.setForeground(new java.awt.Color(0, 0, 255));
        p_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel1.add(p_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 250, 30));

        cs.setBackground(new java.awt.Color(204, 255, 204));
        cs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cs.setForeground(new java.awt.Color(0, 0, 255));
        cs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel1.add(cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 247, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 153));
        jLabel9.setText("Current Stock :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 153));
        jLabel13.setText("Price :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 40, -1));

        pri.setBackground(new java.awt.Color(204, 255, 204));
        pri.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pri.setForeground(new java.awt.Color(0, 0, 255));
        pri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel1.add(pri, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 253, 30));

        exp.setBackground(new java.awt.Color(204, 255, 204));
        exp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exp.setForeground(new java.awt.Color(0, 0, 255));
        exp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel1.add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 251, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 153));
        jLabel14.setText("Expiry Date :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2), "Selling Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 153));
        jLabel15.setText("Sell Product Quantity");

        qun.setBackground(new java.awt.Color(204, 255, 204));
        qun.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        qun.setForeground(new java.awt.Color(0, 0, 255));
        qun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 153));
        jLabel16.setText("Stock After sell");

        afs.setBackground(new java.awt.Color(204, 255, 204));
        afs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        afs.setForeground(new java.awt.Color(0, 0, 255));
        afs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 153));
        jLabel17.setText("Total");

        total.setBackground(new java.awt.Color(204, 255, 204));
        total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 255));
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        bill1.setBackground(new java.awt.Color(0, 0, 255));
        bill1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bill1.setForeground(new java.awt.Color(255, 255, 255));
        bill1.setText("Checkout");
        bill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill1ActionPerformed(evt);
            }
        });

        bill.setBackground(new java.awt.Color(153, 0, 204));
        bill.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bill.setForeground(new java.awt.Color(255, 255, 255));
        bill.setText("Creat Bill");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qun, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(afs, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bill1)
                        .addGap(18, 18, 18)
                        .addComponent(bill)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bill)
                                .addComponent(bill1))
                            .addComponent(afs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(4, 4, 4)
                            .addComponent(qun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(4, 4, 4)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 740, 110));

        jButton3.setBackground(new java.awt.Color(51, 255, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setAlignmentY(1.0F);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 113, 1152, 14));

        select.setBackground(new java.awt.Color(204, 255, 204));
        select.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        select.setForeground(new java.awt.Color(0, 0, 255));
        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Product", "Minimum Stock", "Out Of Stock", "Expired Products" }));
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 405, 190, 30));

        table.setBackground(new java.awt.Color(204, 255, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Description", "Unit Price", "Mfg Date", "Expiry Date", "Quantity", "category", "Brand"
            }
        ));
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 1140, 210));

        d1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d1.setForeground(new java.awt.Color(204, 0, 204));
        d1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 0, 255)));
        jPanel1.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 90, 18));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 405, -1, 30));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 360, 100));

        ssss.setFont(new java.awt.Font("Dialog", 0, 3)); // NOI18N
        ssss.setText("jLabel3");
        jPanel1.add(ssss, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 130, 120, 10));

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

        setSize(new java.awt.Dimension(1177, 684));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     void date (){
      Date da=new Date ();
      SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
      d.setText(s.format(da));     
     }
      void datee (){
      Date da=new Date ();
      SimpleDateFormat s=new SimpleDateFormat("EEEE");
      d1.setText(s.format(da)); 
  }
  void time(){
     new Timer(0,new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
            Date d=new Date ();
            SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss a");
            t.setText(s.format(d));              
         }
     }).start();
      
  }
    
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        DASHBOARD_FINAL_EMPLOYEE de = new DASHBOARD_FINAL_EMPLOYEE();
        de.empname(Name, Id, emll, ph, date, time);
        de.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        // TODO add your handling code here:
       BILL_EMPLOYEE bp = new  BILL_EMPLOYEE();
      
         bp.bpm(Name, Id, emll,time,date,ph);
        bp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_billActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            qun.setForeground(new Color(0,0,255));
            cs.setForeground(new Color(0,0,255)); 
           String product_idee = pro_id.getText();
      try {
        
             //Data fetch from database
            String sql = "Select * From add_new_product where Product_id=? ";
            String sql2 = "Select * From sell where Product_id=? ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            PreparedStatement ps1=con.prepareStatement(sql2);
            ps.setString(1,product_idee);
            ps1.setString(1,product_idee);
            ResultSet rs=ps.executeQuery();
            ResultSet rs1 =ps1.executeQuery();
           if(rs.next()&& rs1.next()){
               
                   
               String pn= rs.getString("Product_name");
               String css= rs.getString("Quantity");
               String pr= rs.getString("Unit_price");
               String expp= rs.getString("Exp_date");
               String sss= rs.getString("Standerd_cost");
               ts= rs1.getString("Total_sell");
               p_name.setText(pn);
               ssss.setText(sss);
               p_name.setEditable(false);
               cs.setText(css);
               cs.setEditable(false);
               pri.setText(pr);
               pri.setEditable(false);
               exp.setText(expp);
               exp.setEnabled(true);
                            
                //    JOptionPane.showMessageDialog(this, "Product Found");
                   
               
           }else{
               JOptionPane.showMessageDialog(this, "Enter Currect Product Id");
           }
          
            }catch(Exception e){
            System.out.println("error"+e);
        }
    
        
    }//GEN-LAST:event_jButton2ActionPerformed

     public void cal(){
        DocumentListener dl = new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
              update_val();  
                //To change body of generated methods, choose Tools | Templates.
                
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                update_val();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                update_val();
            }
            
            protected void update_val(){
               String f1=pri.getText();
               String f2=qun.getText();
               if (!f1.equals("") && f2.equals("")){
                   double b=Double.parseDouble(pri.getText());
                   //double  b1=Double.parseDouble(a1.getText());
                   double c= b;
                   String e=String.valueOf(c);
                   total.setText(e);
               }else if (f1.equals("") && !f2.equals("")){
                   //double b=Double.parseDouble(a.getText());
                   double  b1=Double.parseDouble(qun.getText());
                   double c= b1;
                   String e=String.valueOf(c);
                   total.setText(e);
               }else if (!f1.equals("") && !f2.equals("")){
                   double b=Double.parseDouble(pri.getText());
                   double  b1=Double.parseDouble(qun.getText());
                   double c= b*b1;
                   String e=String.valueOf(c);
                   total.setEditable(false);
                   total.setText(e);
                   
               }else{
                 //  System.out.println("NONE");
               }
               }
               };
        pri.getDocument().addDocumentListener(dl);
        qun.getDocument().addDocumentListener(dl);
    }
    
    private void bill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill1ActionPerformed
        int curs = Integer.parseInt(cs.getText());
        int qunn=Integer.parseInt(qun.getText());
        String pn= p_name.getText();
        String en=  ename.getText();
        String pp= pri.getText();
        String ei= eid.getText();
        String ti= t.getText();
        String qu= qun.getText();
        String tt=total.getText();
        String dd=d.getText();
        String Product_id=pro_id.getText();
        String ss=ssss.getText();
        int tss=Integer.parseInt(ts)+Integer.parseInt(qu);
        String tts=Integer.toString(tss);
        String aa="Sell";
        String vv=null;
      //  System.out.println("tssss"+tts);
       double abc=Double.parseDouble(ss)*Double.parseDouble(qu);
      double abcd= Double.parseDouble(tt)-abc;
      String aab=Double.toString(abcd);
      
        if(curs>=qunn){
             DefaultTableModel model = (DefaultTableModel)table2.getModel();
              model.addRow(new Object[]{pro_id.getText(), qun.getText()
              });
             SELL_DATAOBJECT.bill(Product_id, qu);
            qun.setForeground(new Color(0,0,255));
            cs.setForeground(new Color(0,0,255)); 
           int coun= curs-qunn;
           String count=Integer.toString(coun);
           afs.setText(count);
           cs.setText(count);
           
          SELL_DATAOBJECT.sells(en, ei, dd, ti, pn, Product_id, qu, pp, tt,aab,tts);
          ADD_NEW_PRODUCT_DETAOBJ.s_p(aa, vv, dd, ti, Product_id, pn, pp, qu, tt);
           SELL_DATAOBJECT.total(Product_id, tts);
           table();
            int status=0;
             try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("Update add_new_product set   Quantity=?  where Product_id =?");
                   ps.setString(1, count);
                   ps.setString(2, Product_id);
                 //  System.out.println("Producttt"+Product_id);
                   status=ps.executeUpdate();
                   con.close();
                   bill.setEnabled(true);
                }catch(Exception e){
                  System.out.println(e);
                }
            //  System.out.println("upddddddddddddddproooooo"+status);
        
            
        } else{
            bill.setEnabled(false);
           JOptionPane.showMessageDialog(this, "Product Has Low Stock Level ");
            afs.setText("");
            qun.setForeground(Color.red);
            cs.setForeground(Color.red);
        }
    }//GEN-LAST:event_bill1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        All Product
//   Minimum Stock
//  Out Of Stock
// Expired Products
        if(select.getSelectedItem().equals("All Product")){
            
            table();
        }else if(select.getSelectedItem().equals("Minimum Stock")){
            
    try {
        
             //Data fetch from database
            String sql = "Select * From add_new_product where Quantity<=10 ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
           while (rs.next())
           {
               
               Object o []={
                  
                   rs.getString("Product_id"),rs.getString("Product_name"),rs.getString("Description"),rs.getString("Unit_price"),
                        rs.getString("Mfg_date"),rs.getString("Exp_date"),rs.getString("Quantity"),rs.getString("Category"),rs.getString("Brand") };
                     model.addRow(o);
                     
                table.setForeground(new Color(123, 17, 58));
           }
            }catch(Exception e){
            System.out.println("error"+e);
        }
        } else if(select.getSelectedItem().equals("Out Of Stock")){
            
    try {
        
             //Data fetch from database
            String sql = "Select * From add_new_product where Quantity = 0 ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
           while (rs.next())
           {
               
               Object o []={
                  
                  rs.getString("Product_id"),rs.getString("Product_name"),rs.getString("Description"),rs.getString("Unit_price"),
                        rs.getString("Mfg_date"),rs.getString("Exp_date"),rs.getString("Quantity"),rs.getString("Category"),rs.getString("Brand") };
                   model.addRow(o);
               table.setForeground(Color.red);
           }
            }catch(Exception e){
            System.out.println("error"+e);
        }
        }  else if(select.getSelectedItem().equals("Expired Products")){
            
    try {
        String dd=d.getText();
             //Data fetch from database
            String sql = "Select * From add_new_product where Exp_date <= '"+dd+"' ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
           while (rs.next())
           {
               
               Object o []={
                  
                   rs.getString("Product_id"),rs.getString("Product_name"),rs.getString("Description"),rs.getString("Unit_price"),
                        rs.getString("Mfg_date"),rs.getString("Exp_date"),rs.getString("Quantity"),rs.getString("Category"),rs.getString("Brand") };
                   model.addRow(o);
               table.setForeground(Color.decode("#d44000"));
           }
            }catch(Exception e){
            System.out.println("error"+e);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        qun.setForeground(new Color(0,0,255));
        cs.setForeground(new Color(0,0,255)); 
        p_name.setText("");
        cs.setText("");
        pri.setText("");
        exp.setText("");
        pro_id.setText("");
        qun.setText("");
        total.setText("");
        afs.setText("");
        bill.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed
public void table()
{
    try {
        
             //Data fetch from database
            String sql = "Select * From add_new_product ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
           while (rs.next())
           {
               
               Object o []={
                  
                   rs.getString("Product_id"),rs.getString("Product_name"),rs.getString("Description"),rs.getString("Unit_price"),
                        rs.getString("Mfg_date"),rs.getString("Exp_date"),rs.getString("Quantity"),rs.getString("Category"),rs.getString("Brand") };
                   model.addRow(o);
               table.setForeground(Color.BLUE);
               JTableHeader tableHeader = table.getTableHeader();
               tableHeader. setBackground(Color.GREEN);
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
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCT_SELL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField afs;
    private javax.swing.JButton bill;
    private javax.swing.JButton bill1;
    private javax.swing.JTextField cs;
    private javax.swing.JLabel d;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel eid;
    private javax.swing.JLabel ename;
    private javax.swing.JTextField exp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField p_name;
    private javax.swing.JTextField pri;
    private javax.swing.JTextField pro_id;
    private javax.swing.JTextField qun;
    private javax.swing.JComboBox<String> select;
    private javax.swing.JLabel ssss;
    private javax.swing.JLabel t;
    private javax.swing.JTable table;
    private javax.swing.JTable table2;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
