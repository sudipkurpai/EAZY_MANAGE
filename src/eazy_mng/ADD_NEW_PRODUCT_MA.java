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
import java.time.LocalDate;
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

public class ADD_NEW_PRODUCT_MA extends javax.swing.JFrame {
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
    public ADD_NEW_PRODUCT_MA() throws ParseException {
        initComponents();
       
        mng_name.setEditable(false);
        mng_id.setEditable(false);
        t2.setEditable(false);
        d2.setEditable(false);
      
         new1.setEnabled(false);
        id_create();
        cal();
        table();
        search();
        date();
        time();
        String dd = 31 + "-" + 12 + "-" + 0001;

Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(dd);
exp.setDate(date1);
mfg.setDate(date1);     
       
       
    }
    
 void anp (String fullname, String mng_Id,String email,String t1,String d1,String p) {
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
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
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
        t_idd.setText("EAZY_T"+ttttt_Id);
        
        
        pppp_Id= new BigInteger(pro_id);
        BigInteger aaa = new BigInteger("1");
     //   System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+ pppp_Id);
     //   System.out.println("#################"+pro_id);
        pppp_Id = pppp_Id.add(aaa);
    //    System.out.println("%%%%%%%%%%%%%%%%%%%%%%"+pppp_Id);
        p_id.setText("EAZY_P"+pppp_Id);
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
        mng_id = new javax.swing.JTextField();
        d2 = new javax.swing.JTextField();
        t_idd = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        mng_name = new javax.swing.JTextField();
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
        new1 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        mfg = new com.toedter.calendar.JDateChooser();
        exp = new com.toedter.calendar.JDateChooser();
        reset1 = new javax.swing.JButton();
        catagory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD NEW PRODUCT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 60));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 20, 20));

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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Transaction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText(" Date  :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Manager ID :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Manager Name :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 18, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Transaction ID :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 40, 90, -1));

        mng_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(mng_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 169, -1));

        d2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 170, -1));

        t_idd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t_idd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_iddActionPerformed(evt);
            }
        });
        jPanel3.add(t_idd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 180, -1));

        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 169, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 204));
        jLabel21.setText(" Time  :");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        mng_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mng_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mng_nameActionPerformed(evt);
            }
        });
        jPanel3.add(mng_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 180, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 900, 70));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Product ID :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));

        p_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Vendor Name :");
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
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });
        jPanel2.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 130, 30));

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
        reset.setForeground(new java.awt.Color(204, 0, 102));
        reset.setText("Reset");
        reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 120, 30));

        new1.setBackground(new java.awt.Color(12, 186, 38));
        new1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        new1.setForeground(new java.awt.Color(255, 255, 255));
        new1.setText("New");
        new1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        new1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new1ActionPerformed(evt);
            }
        });
        jPanel2.add(new1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 120, 30));

        save.setBackground(new java.awt.Color(10, 171, 218));
        save.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 120, 30));

        mfg.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(mfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 130, 30));

        exp.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 130, 30));

        reset1.setBackground(new java.awt.Color(153, 0, 255));
        reset1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        reset1.setForeground(new java.awt.Color(255, 255, 255));
        reset1.setText("Update");
        reset1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        jPanel2.add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 120, 30));

        catagory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Appliances", "Arts, Crafts, & Sewing", "Automotive Parts & Accessories", "Baby", "Beauty & Personal Care", "Books", "CDs & Vinyl", "Cell Phones & Accessories", "Clothing, Shoes and Jewelry", "Collectibles & Fine Art", "Computers", "Electronics", "Garden & Outdoor", "Grocery & Gourmet Food", "Handmade", "Health, Household & Baby Care", "Home & Kitchen", "Industrial & Scientific", "Kindle", "Luggage & Travel Gear", "Musical Instruments", "Office Products", "Pet Supplies", "Sports & Outdoors", "Tools & Home Improvement", "Toys & Games", "Video Games" }));
        jPanel2.add(catagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 130, 30));

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

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
         String Product_id = p_id.getText();
        String p_nmaee = p_name.getText();
        String V_nmaee = v_name.getText();
        String Desc= desc.getText();
        String Standerd_cost = s_cost.getText();
        String unit_price = unit_pri.getText();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        String mfg_date =  s.format(mfg.getDate());
       
       
        String exp_date = s.format(exp.getDate());
        
        String quantit = quantity.getText();
        String catag = catagory.getSelectedItem().toString();
        String Brand = brand.getText();
        String mng = mng_name.getText();
        String mng_i= mng_id.getText();
        String dddd = d2.getText();
        String timee = t2.getText();
        String t_id = t_idd.getText();
        String totall = total.getText();
         
         String aa="Purches";
//        double a,b,c ;
//        a=Double.parseDouble(s_cost.getText());
//        b=Double.parseDouble(quantity.getText());
//
//        c=a*b;
        
        //total.setText(""+c);
/*|| !exp_date.equals(s)*/       
       
        
        if(Product_id.isEmpty() || p_nmaee.isEmpty()||V_nmaee.isEmpty()||Standerd_cost.isEmpty() ||unit_price.isEmpty() ||quantit.isEmpty() || Brand.isEmpty()|| catag.isEmpty()){
           JOptionPane.showMessageDialog(this, "Fill up all field first");  
        }else if(catagory.getSelectedItem().equals("-- Select --"))    {
            JOptionPane.showMessageDialog(this, "Select A Catagory"); 
            
        }else if(mfg_date.equals("31-12-0001")||exp_date.equals("31-12-0001")){
            JOptionPane.showMessageDialog(this, "Date Choose From  Calendar ");
        }else

//        if(!mfg.getDate().toString().matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}")||!exp.getDate().toString().matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}"))  {
//         
//
//            System.out.println("mfaa"+mfg_date  + "expp"+exp_date);
//            
//            JOptionPane.showMessageDialog(this, "Date Choose From  Calendar ");
//        }else 
//            
//             DefaultTableModel model = (DefaultTableModel)table.getModel();
//              model.addRow(new Object[]{p_id.getText(), p_name.getText(),desc.getText(),s_cost.getText(),unit_pri.getText(),
//                                  mfg.getText(),exp.getText(),quantity.getText(),catagory.getText(),brand.getText(),total.getText()
//              });
       
        {
            int i = ADD_NEW_PRODUCT_DETAOBJ.add_new_product(mng,mng_i, dddd, t_id, Product_id, p_nmaee,V_nmaee, Desc, Standerd_cost, unit_price, mfg_date, exp_date, quantit, catag, Brand, totall,timee);
         
         
        
        if(i>0){ 
            ID_STORE_FETCH.insert_id(mng_Id, emp_id, ttttt_Id.toString(),pppp_Id.toString());
        
            ADD_NEW_PRODUCT_DETAOBJ.purchase(V_nmaee, mng,mng_i, dddd, timee, t_id, Product_id, p_nmaee,Desc, Standerd_cost, unit_price, mfg_date, exp_date, quantit, catag, Brand, totall);                   
        ADD_NEW_PRODUCT_DETAOBJ.s_p(aa, V_nmaee, dddd, timee, Product_id, p_nmaee, Standerd_cost, quantit, totall);
            table();
           // res();
            save.setEnabled(false);
            new1.setEnabled(true);
      //  System.out.println("Data inserted");
        JOptionPane.showMessageDialog(this, "Add Product Successfully");
               }
        else{
     //   System.out.println("Data NOT inserted");
        JOptionPane.showMessageDialog(this, "Product Can Not Added");
            }}
               
    }//GEN-LAST:event_saveActionPerformed

    public void res() throws ParseException{
        t_idd.setText("");
         p_name.setText("");
         v_name.setText("");
         desc.setText("");
         s_cost.setText("");
         unit_pri.setText("");
         String dd = 31 + "-" + 12 + "-" + 0001;

Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(dd);
exp.setDate(date1);
mfg.setDate(date1);  
         quantity.setText("");
         catagory.setSelectedIndex(0);
         brand.setText("");
         total.setText("");
         p_id.setText("");
    }
    private void new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new1ActionPerformed
//         try {
//             // TODO add your handling code here:
//             res();
//         } catch (ParseException ex) {
//             Logger.getLogger(ADD_NEW_PRODUCT_MA.class.getName()).log(Level.SEVERE, null, ex);
//         }
         id_create();
         save.setEnabled(true);
         
    }//GEN-LAST:event_new1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
         try {
             // TODO add your handling code here:
             res();
             save.setEnabled(false);
             
             new1.setEnabled(true);
         } catch (ParseException ex) {
             Logger.getLogger(ADD_NEW_PRODUCT_MA.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    
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

    private void mng_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mng_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mng_nameActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        // TODO add your handling code here:
         UPDATE_PRODUCT mpm = new  UPDATE_PRODUCT ();
        String name = mng_name.getText();
        String ID = mng_id.getText();
       
        mpm.up(name, ID, emll,time,date,ph);
        mpm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reset1ActionPerformed
    
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
               String f1=s_cost.getText();
               String f2=quantity.getText();
               if (!f1.equals("") && f2.equals("")){
                   double b=Double.parseDouble(s_cost.getText());
                   //double  b1=Double.parseDouble(a1.getText());
                   double c= b;
                   String e=String.valueOf(c);
                   total.setText(e);
               }else if (f1.equals("") && !f2.equals("")){
                   //double b=Double.parseDouble(a.getText());
                   double  b1=Double.parseDouble(quantity.getText());
                   double c= b1;
                   String e=String.valueOf(c);
                   total.setText(e);
               }else if (!f1.equals("") && !f2.equals("")){
                   double b=Double.parseDouble(s_cost.getText());
                   double  b1=Double.parseDouble(quantity.getText());
                   double c= b*b1;
                   String e=String.valueOf(c);
                   total.setEditable(false);
                   total.setText(e);
                   
               }else{
                //   System.out.println("NONE");
               }
                   
                   
               
            }

            
            
        };
        s_cost.getDocument().addDocumentListener(dl);
        quantity.getDocument().addDocumentListener(dl);
    }
    


    /**
     *
     * @param args
     */
    public static void main (String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new ADD_NEW_PRODUCT_MA().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(ADD_NEW_PRODUCT_MA.class.getName()).log(Level.SEVERE, null, ex);
                }
           
            }
    });
   
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Product_id;
    private javax.swing.JButton Search;
    private javax.swing.JTextField brand;
    private javax.swing.JComboBox<String> catagory;
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
    private javax.swing.JButton new1;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField p_name;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JTextField s_cost;
    private javax.swing.JButton save;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t_idd;
    private javax.swing.JTable table;
    private javax.swing.JTextField total;
    private javax.swing.JTextField unit_pri;
    private javax.swing.JTextField v_name;
    // End of variables declaration//GEN-END:variables

}
