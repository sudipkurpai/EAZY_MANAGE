/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;
import java.awt.Color;
/**
 *
 * @author ganesh pradhan
 */
public final class DASHBOARD extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard1
     */
    public DASHBOARD() {       
        initComponents();
        C_Proudcts.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        C_Proudcts = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        c_pro_detail = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        c_del_pro = new javax.swing.JLabel();
        C_Dashboard = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        sidepanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dash_click = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pro_click = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        order_click = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Statusbar = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        C_Orders = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        C_Members = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        C_Category = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        C_Bill = new javax.swing.JPanel();
        C_Report = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C_Proudcts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        jPanel7.setBackground(new java.awt.Color(85, 65, 118));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        c_pro_detail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        c_pro_detail.setForeground(new java.awt.Color(255, 255, 255));
        c_pro_detail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c_pro_detail.setText("Product Details");
        c_pro_detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_pro_detailMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_pro_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_pro_detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(85, 65, 118));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Product");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(85, 65, 118));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel26.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Product Stock Check");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(85, 65, 118));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel27.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel27.setText("Add New Product");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(85, 65, 118));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c_del_pro.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        c_del_pro.setForeground(new java.awt.Color(255, 255, 255));
        c_del_pro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c_del_pro.setText("Delete Product");
        c_del_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_del_proMouseClicked(evt);
            }
        });
        jPanel4.add(c_del_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        C_Proudcts.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg.add(C_Proudcts, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 230, 250));

        C_Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        C_Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/product (4).png"))); // NOI18N
        C_Dashboard.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 175, 60, 70));

        jTextField7.setBackground(new java.awt.Color(0, 173, 213));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("More info");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        C_Dashboard.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 285, 230, 20));

        jTextField1.setBackground(new java.awt.Color(0, 192, 239));
        jTextField1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField1.setText(" Total Iteam");
        jTextField1.setBorder(null);
        C_Dashboard.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 125, 230, 180));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dashboard-interface.png"))); // NOI18N
        C_Dashboard.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 145, 80, 100));

        jTextField9.setBackground(new java.awt.Color(0, 149, 81));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("More info");
        jTextField9.setBorder(null);
        C_Dashboard.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 285, 230, 20));

        jTextField2.setBackground(new java.awt.Color(0, 166, 90));
        jTextField2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField2.setText(" Category");
        jTextField2.setBorder(null);
        C_Dashboard.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 125, 230, 180));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/office-building.png"))); // NOI18N
        C_Dashboard.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 165, 70, 70));

        jTextField11.setBackground(new java.awt.Color(208, 142, 55));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("More info");
        jTextField11.setBorder(null);
        C_Dashboard.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 285, 230, 20));

        jTextField3.setBackground(new java.awt.Color(232, 158, 61));
        jTextField3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField3.setText(" Company");
        jTextField3.setBorder(null);
        C_Dashboard.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 125, 230, 180));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/box.png"))); // NOI18N
        C_Dashboard.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 415, 60, 80));

        jTextField8.setBackground(new java.awt.Color(0, 173, 213));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("More info");
        jTextField8.setBorder(null);
        C_Dashboard.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 230, 20));

        jTextField4.setBackground(new java.awt.Color(0, 192, 239));
        jTextField4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField4.setText(" Products");
        jTextField4.setBorder(null);
        C_Dashboard.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 230, 180));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/company.png"))); // NOI18N
        C_Dashboard.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 80, 70));

        jTextField10.setBackground(new java.awt.Color(0, 149, 81));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("More info");
        jTextField10.setBorder(null);
        C_Dashboard.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 230, 20));

        jTextField5.setBackground(new java.awt.Color(0, 166, 90));
        jTextField5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField5.setText(" Members");
        jTextField5.setBorder(null);
        C_Dashboard.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 230, 180));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/warehouse.png"))); // NOI18N
        C_Dashboard.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, -1, 70));

        jTextField12.setBackground(new java.awt.Color(208, 142, 55));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("More info");
        jTextField12.setBorder(null);
        C_Dashboard.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 230, 20));

        jTextField6.setBackground(new java.awt.Color(232, 158, 61));
        jTextField6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField6.setText(" Wearhouse");
        jTextField6.setBorder(null);
        C_Dashboard.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 230, 180));

        bg.add(C_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 1090, 690));

        sidepanel.setBackground(new java.awt.Color(54, 33, 89));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(85, 65, 118));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        dash_click.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        dash_click.setForeground(new java.awt.Color(255, 255, 255));
        dash_click.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash_click.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/speedometer (2).png"))); // NOI18N
        dash_click.setText(" Dashboard");
        dash_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_clickMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash_click, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash_click, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 320, 50));

        jPanel5.setBackground(new java.awt.Color(85, 65, 118));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        pro_click.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        pro_click.setForeground(new java.awt.Color(255, 255, 255));
        pro_click.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pro_click.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/box (1).png"))); // NOI18N
        pro_click.setText(" Products  ");
        pro_click.setToolTipText("");
        pro_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pro_clickMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pro_clickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pro_clickMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pro_click, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pro_click, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 320, 50));

        jPanel6.setBackground(new java.awt.Color(85, 65, 118));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        order_click.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        order_click.setForeground(new java.awt.Color(255, 255, 255));
        order_click.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        order_click.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/order.png"))); // NOI18N
        order_click.setText("  Orders  ");
        order_click.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                order_clickMouseDragged(evt);
            }
        });
        order_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_clickMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(order_click, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(order_click, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 320, 50));

        jPanel8.setBackground(new java.awt.Color(85, 65, 118));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/skills.png"))); // NOI18N
        jLabel14.setText("   Members");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 320, 50));

        jPanel9.setBackground(new java.awt.Color(85, 65, 118));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/categories.png"))); // NOI18N
        jLabel16.setText("  Category");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 320, 50));

        jPanel10.setBackground(new java.awt.Color(85, 65, 118));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bill.png"))); // NOI18N
        jLabel18.setText(" Bill            ");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 320, 40));

        jPanel11.setBackground(new java.awt.Color(85, 65, 118));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/settings.png"))); // NOI18N
        jLabel20.setText(" Report      ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 320, 40));

        jPanel12.setBackground(new java.awt.Color(85, 65, 118));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        jLabel22.setText(" Logout       ");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 320, 40));

        jPanel13.setBackground(new java.awt.Color(54, 33, 89));

        jLabel24.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Inventory Management");

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("welcome To");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sidepanel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 70));

        bg.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 317, 749));

        Statusbar.setBackground(new java.awt.Color(255, 255, 255));
        Statusbar.setForeground(new java.awt.Color(51, 51, 255));
        Statusbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 255, 0));
        jLabel28.setText("DATE: 15-01-2021");
        Statusbar.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 220, 30));

        jLabel25.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 255, 0));
        jLabel25.setText("TIME: 11:30 AM");
        Statusbar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 11, 170, 30));

        bg.add(Statusbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 1030, 60));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout C_OrdersLayout = new javax.swing.GroupLayout(C_Orders);
        C_Orders.setLayout(C_OrdersLayout);
        C_OrdersLayout.setHorizontalGroup(
            C_OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        C_OrdersLayout.setVerticalGroup(
            C_OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(C_Orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 1030, 710));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout C_MembersLayout = new javax.swing.GroupLayout(C_Members);
        C_Members.setLayout(C_MembersLayout);
        C_MembersLayout.setHorizontalGroup(
            C_MembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        C_MembersLayout.setVerticalGroup(
            C_MembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bg.add(C_Members, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 1030, 700));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout C_CategoryLayout = new javax.swing.GroupLayout(C_Category);
        C_Category.setLayout(C_CategoryLayout);
        C_CategoryLayout.setHorizontalGroup(
            C_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        C_CategoryLayout.setVerticalGroup(
            C_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(C_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 1030, 690));

        javax.swing.GroupLayout C_BillLayout = new javax.swing.GroupLayout(C_Bill);
        C_Bill.setLayout(C_BillLayout);
        C_BillLayout.setHorizontalGroup(
            C_BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        C_BillLayout.setVerticalGroup(
            C_BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        bg.add(C_Bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 1030, 750));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout C_ReportLayout = new javax.swing.GroupLayout(C_Report);
        C_Report.setLayout(C_ReportLayout);
        C_ReportLayout.setHorizontalGroup(
            C_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C_ReportLayout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        C_ReportLayout.setVerticalGroup(
            C_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        bg.add(C_Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 1030, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1415, 794));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
         //new C_Proudcts().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void pro_clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pro_clickMouseClicked
        // TODO add your handling code here:
        jPanel3.setBackground(Color.decode("#554176"));
        dash_click.setForeground(Color.WHITE);
        jPanel5.setBackground(Color.decode("#1f6f8b"));
        C_Dashboard.setVisible(false);
        C_Proudcts.setVisible(true);
    }//GEN-LAST:event_pro_clickMouseClicked

    private void dash_clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_clickMouseClicked
        // TODO add your handling code here:
        jPanel3.setBackground(Color.decode("#1f6f8b"));
        dash_click.setForeground(Color.WHITE);
        jPanel5.setBackground(Color.decode("#554176"));
        pro_click.setForeground(Color.WHITE);
        C_Dashboard.setVisible(true);
        C_Proudcts.setVisible(false);
    }//GEN-LAST:event_dash_clickMouseClicked

    private void c_pro_detailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_pro_detailMouseClicked
        // TODO add your handling code here:
        jPanel7.setBackground(Color.decode("#1f6f8b"));
        c_pro_detail.setForeground(Color.WHITE);
         jPanel4.setBackground(Color.decode("#554176"));
       c_del_pro.setForeground(Color.WHITE);
         c_pro_detail.setVisible(true);
        c_del_pro.setVisible(false);
    }//GEN-LAST:event_c_pro_detailMouseClicked

    private void c_del_proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_del_proMouseClicked
        // TODO add your handling code here:
         jPanel7.setBackground(Color.decode("#554176"));
        c_pro_detail.setForeground(Color.WHITE);
        jPanel4.setBackground(Color.decode("#1f6f8b"));
        c_del_pro.setForeground(Color.decode("#554176"));
       c_pro_detail.setVisible(false);
       c_del_pro.setVisible(true);
       new DELETE_PRODUCT().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_c_del_proMouseClicked

    private void order_clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_clickMouseClicked
        // TODO add your handling code here:
         jPanel3.setBackground(Color.decode("#554176"));
        dash_click.setForeground(Color.WHITE);
        jPanel5.setBackground(Color.decode("#554176"));
        pro_click.setForeground(Color.WHITE);
       jPanel6.setBackground(Color.decode("#1f6f8b"));
        order_click.setForeground(Color.WHITE);
       C_Dashboard.setVisible(false);
        C_Proudcts.setVisible(false);
        order_click.setVisible(true);
        new MANAGE_ORDER().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_order_clickMouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        new LOGOUT_E().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        new BILL_PRINT().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void order_clickMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_clickMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_order_clickMouseDragged

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        new PRODUCT_DETAILS().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new SEARCH_PRODUCT().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        new PRODUCT_STOCK_CHECK().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        new ADD_NEW_PRODUCT().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void pro_clickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pro_clickMouseEntered
        // TODO add your handling code here:
        /*jPanel3.setBackground(Color.decode("#554176"));
        dash_click.setForeground(Color.WHITE);
        jPanel5.setBackground(Color.decode("#1f6f8b"));
        //C_Dashboard.setVisible(false);*/
        C_Proudcts.setVisible(true);
    }//GEN-LAST:event_pro_clickMouseEntered

    private void pro_clickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pro_clickMouseExited
        // TODO add your handling code here:
        /*jPanel3.setBackground(Color.decode("#554176"));
        dash_click.setForeground(Color.WHITE);        
        jPanel5.setBackground(Color.decode("#1f6f8b"));*/
        //C_Dashboard.setVisible(false);
        C_Proudcts.setVisible(false);
    }//GEN-LAST:event_pro_clickMouseExited

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
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DASHBOARD().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C_Bill;
    private javax.swing.JPanel C_Category;
    private javax.swing.JPanel C_Dashboard;
    private javax.swing.JPanel C_Members;
    private javax.swing.JPanel C_Orders;
    private static javax.swing.JPanel C_Proudcts;
    private javax.swing.JPanel C_Report;
    private javax.swing.JPanel Statusbar;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel c_del_pro;
    private javax.swing.JLabel c_pro_detail;
    private javax.swing.JLabel dash_click;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel order_click;
    private javax.swing.JLabel pro_click;
    private javax.swing.JPanel sidepanel;
    // End of variables declaration//GEN-END:variables
}
