/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eazy_mng;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Sudip Maiti
 */
public class Test_Class extends javax.swing.JFrame {

    /**
     * Creates new form Test_Class
     */
    public Test_Class() {
        initComponents();
        cal();
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
        a = new javax.swing.JTextField();
        a1 = new javax.swing.JTextField();
        t = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 0, 0), 2));

        a.setBackground(new java.awt.Color(153, 255, 153));
        a.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        a.setForeground(new java.awt.Color(0, 0, 204));
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });

        a1.setBackground(new java.awt.Color(153, 255, 153));
        a1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        a1.setForeground(new java.awt.Color(0, 0, 204));
        a1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                a1KeyTyped(evt);
            }
        });

        t.setBackground(new java.awt.Color(0, 153, 0));
        t.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        t.setForeground(new java.awt.Color(0, 0, 204));
        t.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t.setText("Total");
        t.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(t)
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addContainerGap(316, Short.MAX_VALUE))
        );

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

        setSize(new java.awt.Dimension(611, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyTyped
        // TODO add your handling code here:
        
      if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
          a.setEditable(true);
      }else if(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE || evt.getKeyChar()== '.')
      {
          a.setEditable(true);
      }
      else {
          a.setEditable(false);
          JOptionPane.showMessageDialog(this, "Enter Only Number Value");
      }
          
    }//GEN-LAST:event_aKeyTyped

    private void a1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a1KeyTyped
        // TODO add your handling code here:
       
      if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
          a1.requestFocusInWindow();
          a1.setEditable(true);
      }else if(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
      {
          a1.requestFocusInWindow();
          a1.setEditable(true);
          
      }
      else {
          a1.setEditable(false);
          JOptionPane.showMessageDialog(this, "Enter Only Number Value");
          a1.requestFocusInWindow();
      }
    }//GEN-LAST:event_a1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         PrinterJob job = PrinterJob.getPrinterJob();
            //job.setJobName("Print Data");
            
            job.setPrintable((Graphics pg, PageFormat pf, int pageNum) -> {
                pf.setOrientation(PageFormat.PORTRAIT);
                if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                
               // g2.scale(.5, .5);
                
                //which panel want to print
                jPanel1.print(g2);
                
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
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
               String f1=a.getText();
               String f2=a1.getText();
               if (!f1.equals("") && f2.equals("")){
                   double b=Double.parseDouble(a.getText());
                   //double  b1=Double.parseDouble(a1.getText());
                   double c= b;
                   String e=String.valueOf(c);
                   t.setText(e);
               }else if (f1.equals("") && !f2.equals("")){
                   //double b=Double.parseDouble(a.getText());
                   double  b1=Double.parseDouble(a1.getText());
                   double c= b1;
                   String e=String.valueOf(c);
                   t.setText(e);
               }else if (!f1.equals("") && !f2.equals("")){
                   double b=Double.parseDouble(a.getText());
                   double  b1=Double.parseDouble(a1.getText());
                   double c= b+b1;
                   String e=String.valueOf(c);
                   t.setText(e);
               }else{
                   System.out.println("NONE");
               }
                   
                   
               
            }
            
        };
        a.getDocument().addDocumentListener(dl);
        a1.getDocument().addDocumentListener(dl);
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
            java.util.logging.Logger.getLogger(Test_Class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test_Class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test_Class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test_Class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test_Class().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField a1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}
