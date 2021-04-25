/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Sudip Maiti
 */

public class UPDATE_PRODUCT extends javax.swing.JFrame {
     String time = null;
     String date = null;
     String time2 = null;
     String date2 = null;
     String ph = null;
     String Name = null;
     String Id = null;
     String emll = null;
     String trn_id = null;
     String pro_id = null;
     BigInteger ttttt_Id =null;
     BigInteger pppp_Id =null;
     String PPPP=null;
     String mng_Id = null;
     String emp_id = null;
    
     
    /**
     * Creates new form ADD_NEW_PRODUCT
     */
    public UPDATE_PRODUCT() {
        initComponents();
        mng_name.setEditable(false);
        mng_id.setEditable(false);
        t2.setEditable(false);
        d2.setEditable(false);
        quantity1.setEditable(false);
        upda.setEnabled(false);
         total.setEditable(false);
        id_create();
      //  cal();
        table();
        search();
        date();
        time();
        
        
       
       
    }
    
 void up (String fullname, String mng_Id,String email,String t1,String d1,String p) {
        Name = fullname;
        Id = mng_Id;
        emll = email;
        time = t1;
        date = d1;
        ph= p;
       
        
        mng_name.setText(Name);
        mng_id.setText(Id);
       
       
 }
 
 void date() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
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
 
 
 
 
 
 
 
  void id_create(){
        t_idd.setEditable(false);
        p_id.setEditable(false);
         try{
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from id_store");         
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
             mng_Id=rs.getString("MNG_ID");
         //   System.out.println("MANAGER ID "+mng_Id);
            emp_id=rs.getString("EMP_ID");
         //   System.out.println("EMPLOYEE ID "+emp_id);
            trn_id=rs.getString("TRANSACTION_ID");
          //  System.out.println("Transaction_Id "+trn_id);
            pro_id=rs.getString("PRODUCT_ID");
          //  System.out.println("Product_Id "+pro_id);
            rs.close();
            ps.close();
            }else{
                JOptionPane.showMessageDialog(null, "NOTHING FOUND IN DATABASE!!!!!!");
            }
            con.close();
           }
        catch(Exception e){System.out.println(e);}
       
        
        ttttt_Id = new BigInteger(trn_id);
        BigInteger nxt = new BigInteger("1");
    //    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+ ttttt_Id);
    //    System.out.println("#################"+trn_id);
        ttttt_Id = ttttt_Id.add(nxt);
   //     System.out.println("%%%%%%%%%%%%%%%%%%%%%%"+ttttt_Id);
        t_idd.setText("EMNG_T"+ttttt_Id);
        
        
        
    }
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
                   rs.getString("Product_id"),rs.getString("Product_name"),rs.getString("Vendor_Name"),rs.getString("Description"),rs.getString("Standerd_cost"),rs.getString("Unit_price"),
              rs.getString("Mfg_date"),rs.getString("Exp_date"),rs.getString("Quantity"),rs.getString("Category"),rs.getString("Brand"),rs.getString("Total") };
               model.addRow(o);
               
           }
            }catch(Exception e){
            System.out.println("error"+e);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Product_id = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mng_name = new javax.swing.JTextField();
        mng_id = new javax.swing.JTextField();
        d2 = new javax.swing.JTextField();
        t_idd = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        v_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        s_cost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        unit_pri = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        catagory = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        p_name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        upda = new javax.swing.JButton();
        quantity1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        exp = new com.toedter.calendar.JDateChooser();
        mfg = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE PRODUCT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 60));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 6, 20, 20));

        Product_id.setBackground(new java.awt.Color(255, 255, 255));
        Product_id.setForeground(new java.awt.Color(0, 0, 0));
        Product_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Product_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Product_idKeyReleased(evt);
            }
        });
        jPanel1.add(Product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 13, 169, 25));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Product ID :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, 48));

        Search.setBackground(new java.awt.Color(0, 0, 255));
        Search.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Reset");
        Search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 70, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Transaction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("  Time  :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 50, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Manager ID :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Manager Name :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 18, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Transaction ID :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 41, -1, -1));

        mng_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(mng_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 18, 169, -1));

        mng_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(mng_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 169, -1));

        d2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 18, 140, -1));

        t_idd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t_idd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_iddActionPerformed(evt);
            }
        });
        jPanel3.add(t_idd, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 41, 169, -1));

        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel3.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 140, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("  Date  :");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 18, 50, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 900, 70));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Product ID :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));

        p_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Vendor Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        v_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(v_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 130, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Description :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 30));

        s_cost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s_cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s_costKeyTyped(evt);
            }
        });
        jPanel2.add(s_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 130, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Standerd Cost :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, 30));

        unit_pri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        unit_pri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unit_priKeyTyped(evt);
            }
        });
        jPanel2.add(unit_pri, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 130, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Selling Price :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 80, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Mfg Date :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 60, 30));

        quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityFocusLost(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });
        jPanel2.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 50, 30));

        catagory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(catagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 130, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Category :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Tolal :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 50, 30));

        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 130, 30));

        desc.setBorder(null);
        jScrollPane1.setViewportView(desc);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 130, 30));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Expiry Date :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 70, 30));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Brand :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 50, 30));

        brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 130, 30));

        jSeparator1.setForeground(new java.awt.Color(51, 0, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 258, 900, 10));

        table.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Vendor Name", "Description", "Stander Cost", "Unit Price", "Mfg Date", "Expiry Date", "Quantity", "category", "Brand", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 900, 250));

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Quantity :");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 60, 30));

        p_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(p_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 130, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Product Name :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 30));

        reset.setBackground(new java.awt.Color(204, 204, 0));
        reset.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 120, 40));

        upda.setBackground(new java.awt.Color(206, 0, 255));
        upda.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        upda.setForeground(new java.awt.Color(255, 255, 255));
        upda.setText("Update");
        upda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        upda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updaActionPerformed(evt);
            }
        });
        jPanel2.add(upda, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 120, 40));

        quantity1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantity1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantity1KeyTyped(evt);
            }
        });
        jPanel2.add(quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 50, 30));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("+");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 80, 30, 30));

        exp.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 130, 30));

        mfg.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(mfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(920, 591));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
 
    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        
    DASHBOARD_M dm = new DASHBOARD_M();
    dm.mngname(Name,Id,emll,ph,date,time);
    dm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void t_iddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_iddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_iddActionPerformed

    private void s_costKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_costKeyTyped
        // TODO add your handling code here:
         if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
          s_cost.setEditable(true);
      }else if(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE|| evt.getKeyChar()== '.')
      {
         s_cost.setEditable(true);
      }
      else {
           evt.consume();
          JOptionPane.showMessageDialog(this, "Enter Only Number Value");
          
      }
       
    }//GEN-LAST:event_s_costKeyTyped

   
    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
          quantity.setEditable(true);
      }else if(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
      {
          quantity.setEditable(true);
      }
      else {
          evt.consume();
          JOptionPane.showMessageDialog(this, "Enter Only Number Value");
      }
    }//GEN-LAST:event_quantityKeyTyped

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_SearchMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        res();
        id_create();
         try {
             click();
         } catch (ParseException ex) {
             Logger.getLogger(UPDATE_PRODUCT.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         cal();
        upda.setEnabled(true);
       
      
    }//GEN-LAST:event_tableMouseClicked

    private void updaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaActionPerformed
        // TODO add your handling code here:
        String qqq=quantity.getText();
        if(qqq.equals("")){
            quantity.setText("0");
        }
        String Product_id = p_id.getText();
        String p_nmaee = p_name.getText();
        String V_nmaee = v_name.getText();
        String Desc= desc.getText();
        String Standerd_cost = s_cost.getText();
        String unit_price = unit_pri.getText();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        String mfg_date =  s.format(mfg.getDate());
        String exp_date = s.format(exp.getDate());
        
        int quantit1 = Integer.parseInt(quantity.getText());
        int quantit2 = Integer.parseInt(quantity1.getText());
          
        int quantit3= quantit1+quantit2;
        
        String quantit= Integer.toString(quantit3);
        String quantitye=quantity.getText();
        String catag = catagory.getText();
        String Brand = brand.getText();
        String DDDD = d2.getText();
        String tttt = t2.getText();
        String totall = total.getText();
        
        String mng = mng_name.getText();
        String mng_i= mng_id.getText();
        
        String t_id = t_idd.getText();
        String aa= "Purches";
        
//        double a,b,c ;
//        a=Double.parseDouble(s_cost.getText());
//        b=Double.parseDouble(quantity.getText());
//
//        c=a*b;
        
        //total.setText(""+c);
        if(Product_id.isEmpty() || p_nmaee.isEmpty()){
            JOptionPane.showMessageDialog(this, "Fill up all field first");
        }
        else {
            
//             DefaultTableModel model = (DefaultTableModel)table.getModel();
//              model.addRow(new Object[]{p_id.getText(), p_name.getText(),desc.getText(),s_cost.getText(),unit_pri.getText(),
//                                  mfg.getText(),exp.getText(),quantity.getText(),catagory.getText(),brand.getText(),total.getText()
//              });
        int i = ADD_NEW_PRODUCT_DETAOBJ.Update_product(Desc, Standerd_cost, unit_price, mfg_date, exp_date, quantit, catag, Brand, totall,DDDD,tttt,Product_id);
           ADD_NEW_PRODUCT_DETAOBJ.purchase(V_nmaee, mng,mng_i, DDDD, tttt, t_id, Product_id, p_nmaee,Desc, Standerd_cost, unit_price, mfg_date, exp_date, quantitye, catag, Brand, totall);
                       //    mng,mng_i, dddd, t_id, Product_id, p_nmaee,V_nmaee, Desc, Standerd_cost, unit_price, mfg_date, exp_date, quantit, catag, Brand, totall,timee
         ADD_NEW_PRODUCT_DETAOBJ.s_p(aa, V_nmaee, DDDD, tttt, Product_id, p_nmaee, Standerd_cost, quantit, totall);
                       
                       int j = ID_STORE_FETCH.insert_id(mng_Id, emp_id, ttttt_Id.toString(),pro_id);
        
        if(i>0 || j>0){
            res();
            id_create();
            table();
            
            upda.setEnabled(false);
            
    //    System.out.println("Data inserted");
        JOptionPane.showMessageDialog(this, " Product Update Successfully");
               }
        else{
       // System.out.println("Data NOT inserted");
        JOptionPane.showMessageDialog(this, "Product Can Not Update");
            }
        }
    }//GEN-LAST:event_updaActionPerformed

    public void res(){
        t_idd.setText("");
       
         p_name.setText("");
         v_name.setText("");
         desc.setText("");
         s_cost.setText("");
         unit_pri.setText("");
         mfg.setDate(null);
         exp.setDate(null);
         quantity1.setText("");
         quantity.setText("");
         catagory.setText("");
         brand.setText("");
         total.setText("");
         p_id.setText("");
    }
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        res();
     
        upda.setEnabled(false);
       
        
    
    }//GEN-LAST:event_resetActionPerformed

    private void Product_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Product_idKeyReleased
        // TODO add your handling code here:
        String product_idee = Product_id.getText();
      try {
        
             //Data fetch from database
            String sql = "Select * From add_new_product where Product_id like '%"+product_idee+"%' ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
           // ps.setString(1,product_idee);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
           if(rs.next()){
               do
               {
                   Object o []={
                       rs.getString("Product_id"),rs.getString("Product_name"),rs.getString("Vendor_Name"),rs.getString("Description"),rs.getString("Standerd_cost"),rs.getString("Unit_price"),
                        rs.getString("Mfg_date"),rs.getString("Exp_date"),rs.getString("Quantity"),rs.getString("Category"),rs.getString("Brand"),rs.getString("Total") };
                 //   JOptionPane.showMessageDialog(this, "Product Found");
                    model.addRow(o);
               }while (rs.next());
           }else{
               JOptionPane.showMessageDialog(this, "Product Not Found");
           }
          
            }catch(Exception e){
            System.out.println("error"+e);
        }
    }//GEN-LAST:event_Product_idKeyReleased

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        Product_id.setText("");
        table();
    }//GEN-LAST:event_SearchActionPerformed

    private void unit_priKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unit_priKeyTyped
        // TODO add your handling code here:
         if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
          unit_pri.setEditable(true);
      }else if(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE|| evt.getKeyChar()== '.')
      {
         unit_pri.setEditable(true);
      }
      else {
          evt.consume();
          //  s_cost.setEditable(false);
          JOptionPane.showMessageDialog(this, "Enter Only Number Value");
      }
    }//GEN-LAST:event_unit_priKeyTyped

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void quantity1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantity1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity1KeyTyped

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
        // TODO add your handling code here:
//        if(quantity.getText().equals("")){
//            quantity.setText("0");
//        }
    }//GEN-LAST:event_quantityKeyReleased

    private void quantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusGained
        // TODO add your handling code here:
//        if(quantity.getText().equals("0")){
//           quantity.setText("");
//       }
    }//GEN-LAST:event_quantityFocusGained

    private void quantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusLost
        // TODO add your handling code here:
//        if(quantity.getText().equals("")){
//           quantity.setText("0");
//       }
    }//GEN-LAST:event_quantityFocusLost
    
    public void search(){
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
               String f1=Product_id.getText();
               if (f1.equals("")){
                  table();
               }else {
                  // System.out.println("NONE");
                  
               }  
               
            }
            
        };
        Product_id.getDocument().addDocumentListener(dl);
    }
    
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
               // try{
               String f1=s_cost.getText();
               
               String f3=quantity.getText();
               if (!f1.equals("") && f3.equals("")){
                   double b=Double.parseDouble(s_cost.getText());
                   double  b1=Double.parseDouble(quantity1.getText());
                  
                   if(Double.toString(b1).equals("0")){
//                  
                   double d= b*1;
                   String e=String.valueOf(d);
                   total.setText(e);
                   }else{
                   double  b2=Double.parseDouble(quantity.getText());
                       System.out.println("Hello");
                   double a= b2+b1;
                   double c= b*a;
                   String e=String.valueOf(c);
                   total.setText(e);
                 }
               }else if (f1.equals("") && !f3.equals("")){
                   //double b=Double.parseDouble(a.getText());
                  double  b1=Double.parseDouble(quantity.getText());
                  double  b2=Double.parseDouble(quantity1.getText());
                   
                   if(Double.toString(b2).equals("0")){
                   double c= b1+0;
                   String e=String.valueOf(c);
                   total.setText(e);
                   }else{
                   double c= b2+b1;
                   String e=String.valueOf(c);
                   total.setText(e);
                 }
               }else if (!f1.equals("") && !f3.equals("")){
                   double b=Double.parseDouble(s_cost.getText());
                   double  b2=Double.parseDouble(quantity1.getText());
                   
                   double  b1=Double.parseDouble(quantity.getText());
                  
                   if(Double.toString(b2).equals("0")){
                  
                   double c= b*b1;
                   String e=String.valueOf(c);
                   total.setEditable(false);
                   total.setText(e);
                   } else{
                       double d= b2+b1;
                   double c= b*d;
                   String e=String.valueOf(c);
                  
                   total.setText(e);
                   }
                   
               }else{
                //  System.out.println("NONE");
               }
                   
                   
               
            
 //}catch(Exception e){
          //  System.out.println("sss"+e);
}
         //   }
            
        };
   
        s_cost.getDocument().addDocumentListener(dl);
        quantity.getDocument().addDocumentListener(dl);
       
    }
    public void click() throws ParseException{
     int i = table.getSelectedRow();
     DefaultTableModel model=(DefaultTableModel)table.getModel();
     p_id.setText(model.getValueAt(i,0).toString());
     p_name.setText(model.getValueAt(i,1).toString());
     v_name.setText(model.getValueAt(i,2).toString());
     desc.setText(model.getValueAt(i,3).toString());
     s_cost.setText(model.getValueAt(i,4).toString());
     unit_pri.setText(model.getValueAt(i,5).toString());
     
     Date abcd = new SimpleDateFormat("dd-MM-yyyy").parse(model.getValueAt(i,6).toString());
     mfg.setDate(abcd);
     Date abcc = new SimpleDateFormat("dd-MM-yyyy").parse(model.getValueAt(i,7).toString());
     exp.setDate(abcc);
     quantity1.setText(model.getValueAt(i,8).toString());
     catagory.setText(model.getValueAt(i,9).toString());
     brand.setText(model.getValueAt(i,10).toString());
     total.setText(model.getValueAt(i,11).toString());
    
    }


    /**
     *
     * @param args
     */
    public static void main (String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UPDATE_PRODUCT().setVisible(true);
           
            }
    });
   
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Product_id;
    private javax.swing.JButton Search;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField catagory;
    private javax.swing.JTextField d2;
    private javax.swing.JTextPane desc;
    private com.toedter.calendar.JDateChooser exp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
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
    private com.toedter.calendar.JDateChooser mfg;
    private javax.swing.JTextField mng_id;
    private javax.swing.JTextField mng_name;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField p_name;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField quantity1;
    private javax.swing.JButton reset;
    private javax.swing.JTextField s_cost;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t_idd;
    private javax.swing.JTable table;
    private javax.swing.JTextField total;
    private javax.swing.JTextField unit_pri;
    private javax.swing.JButton upda;
    private javax.swing.JTextField v_name;
    // End of variables declaration//GEN-END:variables

}
