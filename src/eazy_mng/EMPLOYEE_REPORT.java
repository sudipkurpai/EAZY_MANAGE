/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author RAGHUNATH DAS
 */
public class EMPLOYEE_REPORT extends javax.swing.JFrame {
String time = null;
     String date = null;
     String ph = null;
     String Name = null;
     String Id = null;
     String emll = null;
    /**
     * Creates new form EMPLOYEE_REPORT1
     */
    public EMPLOYEE_REPORT() {
        initComponents();
        cc1();
    }
void err (String fullname, String mng_Id,String email,String t1,String d1,String p) {
        Name = fullname;
        Id = mng_Id;
        emll = email;
        time = t1;
        date = d1;
        ph= p;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        c2 = new com.toedter.calendar.JDateChooser();
        c1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        empi = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        enn = new javax.swing.JTextField();
        rttt = new javax.swing.JTextField();
        wnn = new javax.swing.JTextField();
        eii = new javax.swing.JTextField();
        dii = new javax.swing.JTextField();
        wii = new javax.swing.JTextField();
        tii = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ree = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("OK");
        jButton3.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE REPORT");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 460, 70));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c2.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 190, 40));

        c1.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OK");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 70, 40));

        table3.setBackground(new java.awt.Color(255, 255, 255));
        table3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        table3.setForeground(new java.awt.Color(0, 0, 0));
        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Employee Id", "Date", "Time", "Report Type", "In Whose Name", "In Whose Id", "Report"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1070, 180));

        jButton5.setBackground(new java.awt.Color(204, 0, 51));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Reset");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 90, 40));

        empi.setBackground(new java.awt.Color(255, 255, 255));
        empi.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        empi.setForeground(new java.awt.Color(0, 0, 0));
        empi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        empi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empiKeyReleased(evt);
            }
        });
        jPanel1.add(empi, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 320, 40));

        jButton6.setBackground(new java.awt.Color(204, 0, 51));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Reset");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 90, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2), "All Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enn.setBackground(new java.awt.Color(255, 255, 255));
        enn.setForeground(new java.awt.Color(0, 0, 0));
        enn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jPanel2.add(enn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 40));

        rttt.setBackground(new java.awt.Color(255, 255, 255));
        rttt.setForeground(new java.awt.Color(0, 0, 0));
        rttt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jPanel2.add(rttt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, 40));

        wnn.setBackground(new java.awt.Color(255, 255, 255));
        wnn.setForeground(new java.awt.Color(0, 0, 0));
        wnn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jPanel2.add(wnn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 230, 40));

        eii.setBackground(new java.awt.Color(255, 255, 255));
        eii.setForeground(new java.awt.Color(0, 0, 0));
        eii.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jPanel2.add(eii, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 230, 40));

        dii.setBackground(new java.awt.Color(255, 255, 255));
        dii.setForeground(new java.awt.Color(0, 0, 0));
        dii.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jPanel2.add(dii, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 230, 40));

        wii.setBackground(new java.awt.Color(255, 255, 255));
        wii.setForeground(new java.awt.Color(0, 0, 0));
        wii.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jPanel2.add(wii, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 230, 40));

        tii.setBackground(new java.awt.Color(255, 255, 255));
        tii.setForeground(new java.awt.Color(0, 0, 0));
        tii.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jPanel2.add(tii, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 230, 40));

        jButton4.setBackground(new java.awt.Color(204, 0, 51));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Reset");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 230, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("In Whose Name :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 140, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Time :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 140, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Employee Name :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Report Type :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Report :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("In Whose Id :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 140, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Date :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 140, 30));

        ree.setColumns(20);
        ree.setRows(5);
        ree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jScrollPane2.setViewportView(ree);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 770, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Employee ID :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 140, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 1070, 310));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Employee ID :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1108, 678));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(c1.getDate()!=null&& c2.getDate()==null){
            JOptionPane.showMessageDialog(this, "Insert Both Date First");
        }else 
         if(c1.getDate()== null && c2.getDate()!= null){
            JOptionPane.showMessageDialog(this, "Insert Both Date First");
        }else if(c1.getDate()==null&& c2.getDate()==null){
            cc1();
            }else{
              cc2();  
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        c1.setDate(null);
        c2.setDate(null);
        cc1();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void empiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empiKeyReleased
        // TODO add your handling code here:
        String Search=empi.getText();
        if(c1.getDate()==null&& c2.getDate()==null){
            try {
        
             //Data fetch from database
            String sql = "Select * From report_for_manager Where Emp_id like '%"+Search+"%' ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table3.getModel(); 
           model.setRowCount(0);
           if (rs.next()){
         do  {
               
               Object o []={
                  
                   rs.getString("Emp_name"),rs.getString("Emp_id"),rs.getString("Date"),rs.getString("Time"),rs.getString("Report_type"),
                            rs.getString("In_whose_name"),rs.getString("In_Whose_Id"),rs.getString("Report") };
                   model.addRow(o);
               table3.setForeground(Color.BLUE);
               JTableHeader tableHeader = table3.getTableHeader();
               tableHeader.setBackground(Color.GREEN);
           }while (rs.next());
           }else{
               JOptionPane.showMessageDialog(this, "No Report Found");
           }
            }catch(Exception e){
            System.out.println("error"+e);
        }
            }else{
                try {
                    SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
            String d1 = s.format(c1.getDate());
         
            String d2 = s.format(c2.getDate());
            
            String sql = "Select * From report_for_manager Where Date between '"+d1+"' and '"+d2+"' and Emp_id like '%"+Search+"%' ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table3.getModel(); 
           model.setRowCount(0);
           if (rs.next()){
         do  {
               
               Object o []={
                  
                   rs.getString("Emp_name"),rs.getString("Emp_id"),rs.getString("Date"),rs.getString("Time"),rs.getString("Report_type"),
                            rs.getString("In_whose_name"),rs.getString("In_Whose_Id"),rs.getString("Report") };
                   model.addRow(o);
               table3.setForeground(Color.BLUE);
               JTableHeader tableHeader = table3.getTableHeader();
               tableHeader.setBackground(Color.GREEN);
           }while (rs.next());
           }else{
               JOptionPane.showMessageDialog(this, "No Report Found");
           }
            }catch(Exception e){
            System.out.println("error"+e);
        }
                
            }
        
    }//GEN-LAST:event_empiKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        empi.setText("");
        if(c1.getDate()==null&& c2.getDate()==null){
            cc1();
            }else{
              cc2();  
            }
    }//GEN-LAST:event_jButton5ActionPerformed

   
    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        // TODO add your handling code here:
         int i = table3.getSelectedRow();
     DefaultTableModel model=(DefaultTableModel)table3.getModel();
     enn.setText(model.getValueAt(i,0).toString());
     eii.setText(model.getValueAt(i,1).toString());
     dii.setText(model.getValueAt(i,2).toString());
     tii.setText(model.getValueAt(i,3).toString());
     rttt.setText(model.getValueAt(i,4).toString());
     String yy=(model.getValueAt(i,5).toString());
      if (yy.isEmpty()){
        wnn.setText("-------------");
    }else{
        wnn.setText(yy);
    }
   String xx=(model.getValueAt(i,6).toString());
    if (xx.isEmpty()){
        wii.setText("-------------");
    }else{
        wii.setText(xx);
    }
     ree.setText(model.getValueAt(i,7).toString());
    
    }//GEN-LAST:event_table3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        enn.setText("");
     eii.setText("");
     dii.setText("");
     tii.setText("");
     rttt.setText("");
     wnn.setText("");
     wii.setText("");
     ree.setText("");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        DASHBOARD_M dm = new DASHBOARD_M();
        dm.mngname(Name,Id,emll,ph,date,time);
        dm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked
 public void cc1(){
        
    try {
        
             //Data fetch from database
            String sql = "Select * From report_for_manager ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table3.getModel(); 
           model.setRowCount(0);
           if (rs.next()){
         do  {
               
               Object o []={
                  
                   rs.getString("Emp_name"),rs.getString("Emp_id"),rs.getString("Date"),rs.getString("Time"),rs.getString("Report_type"),
                            rs.getString("In_whose_name"),rs.getString("In_Whose_Id"),rs.getString("Report") };
                   model.addRow(o);
               table3.setForeground(Color.BLUE);
               JTableHeader tableHeader = table3.getTableHeader();
               tableHeader.setBackground(Color.GREEN);
           }while (rs.next());
           }else{
             //  JOptionPane.showMessageDialog(this, "No Report Found");
           }
            }catch(Exception e){
            System.out.println("error"+e);
        }
}
    public void cc2(){
        
    try {
         SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
            String d1 = s.format(c1.getDate());
         
            String d2 = s.format(c2.getDate());
          
            String sql = "Select * From report_for_manager Where Date between '"+d1+"' and '"+d2+"'";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table3.getModel(); 
           model.setRowCount(0);
           if (rs.next()){
         do  {
               
               Object o []={
                  
                   rs.getString("Emp_name"),rs.getString("Emp_id"),rs.getString("Date"),rs.getString("Time"),rs.getString("Report_type"),
                            rs.getString("In_whose_name"),rs.getString("In_Whose_Id"),rs.getString("Report") };
                   model.addRow(o);
               table3.setForeground(Color.BLUE);
               JTableHeader tableHeader = table3.getTableHeader();
               tableHeader.setBackground(Color.GREEN);
           }while (rs.next());
           }else{
               JOptionPane.showMessageDialog(this, "No Report Found");
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
            java.util.logging.Logger.getLogger(EMPLOYEE_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EMPLOYEE_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EMPLOYEE_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EMPLOYEE_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EMPLOYEE_REPORT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser c1;
    private com.toedter.calendar.JDateChooser c2;
    private javax.swing.JTextField dii;
    private javax.swing.JTextField eii;
    private javax.swing.JTextField empi;
    private javax.swing.JTextField enn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea ree;
    private javax.swing.JTextField rttt;
    private javax.swing.JTable table3;
    private javax.swing.JTextField tii;
    private javax.swing.JTextField wii;
    private javax.swing.JTextField wnn;
    // End of variables declaration//GEN-END:variables
}
