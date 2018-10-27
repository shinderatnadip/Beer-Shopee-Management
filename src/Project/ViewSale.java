/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author Ratnadip
 */
public class ViewSale extends javax.swing.JFrame {
java.sql.Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
  
    /**
     * Creates new form ViewSale
     */
    public ViewSale() {
        initComponents();
                        conn = Dbconnect.ConnectDb();
                         Fill_Customer_Number_Combo();
                      /*   Fill_BrandName();
                         Fill_Size();*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        brand = new javax.swing.JRadioButton();
        size = new javax.swing.JRadioButton();
        customer = new javax.swing.JRadioButton();
        viewall = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        namecombo = new javax.swing.JComboBox<>();
        sizecombo = new javax.swing.JComboBox<>();
        customercombo = new javax.swing.JComboBox<>();
        viewbtn = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        salestable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Beer & Wine Shopee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 30, 470, 50);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("View Sale Information");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 80, 250, 30);

        buttonGroup1.add(brand);
        brand.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        brand.setText("View By Brand Name");
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });
        getContentPane().add(brand);
        brand.setBounds(150, 130, 180, 29);

        buttonGroup1.add(size);
        size.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        size.setText("View By Size");
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });
        getContentPane().add(size);
        size.setBounds(360, 130, 180, 29);

        buttonGroup1.add(customer);
        customer.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        customer.setText("View By Customer");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        getContentPane().add(customer);
        customer.setBounds(570, 130, 180, 29);

        buttonGroup1.add(viewall);
        viewall.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        viewall.setText("View All");
        viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallActionPerformed(evt);
            }
        });
        getContentPane().add(viewall);
        viewall.setBounds(780, 130, 180, 29);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("Select Brand Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 180, 130, 30);

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel4.setText("Select Size");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 180, 130, 30);

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel5.setText("Select Customer Id");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 180, 130, 30);

        namecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kingfisher", "Tuborg", "Heineken", "Knockout", "Carslberg" }));
        namecombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                namecomboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(namecombo);
        namecombo.setBounds(240, 180, 110, 30);

        sizecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "180", "275", "330", "500", "650", "750", "1000", "1500" }));
        sizecombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                sizecomboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(sizecombo);
        sizecombo.setBounds(450, 180, 110, 30);

        customercombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                customercomboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(customercombo);
        customercombo.setBounds(710, 180, 110, 30);

        viewbtn.setBackground(new java.awt.Color(0, 204, 0));
        viewbtn.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        viewbtn.setText("View All");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewbtn);
        viewbtn.setBounds(850, 180, 100, 30);

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(970, 180, 90, 30);

        salestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CUSTOMERNAME", "CUSTOMERNAME", "PLACE", "LICENCENO", "BARCODEID", "BRANDNAME", "BATCHNO", "EXPIRYDATE", "TYPE", "SIZEOFLIQUOR", "ISSUEDATE", "PRICEPERBOTTLE", "QUANTITY", "TOTAL", "CUSTLASTNAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salestable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 330, 1170, 310);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Images/thumb.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel6.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel6.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
      if(evt.getSource()==brand){
            jLabel3.setVisible(true);
             namecombo.setVisible(true);     
            jLabel4.setVisible(false);
            sizecombo.setVisible(false);
            jLabel5.setVisible(false);
            customercombo.setVisible(false);
            viewbtn.setVisible(false);
           
        }
    }//GEN-LAST:event_brandActionPerformed

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
        // TODO add your handling code here:
         if(evt.getSource()==size){
            jLabel3.setVisible(false);
             namecombo.setVisible(false);     
            jLabel4.setVisible(true);
            sizecombo.setVisible(true);
            jLabel5.setVisible(false);
            customercombo.setVisible(false);
            viewbtn.setVisible(false);
           
        }
    }//GEN-LAST:event_sizeActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        // TODO add your handling code here:
         if(evt.getSource()==customer){
            jLabel3.setVisible(false);
             namecombo.setVisible(false);     
            jLabel4.setVisible(false);
            sizecombo.setVisible(false);
            jLabel5.setVisible(true);
            customercombo.setVisible(true);
            viewbtn.setVisible(false);
           
        }
    }//GEN-LAST:event_customerActionPerformed

    private void viewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallActionPerformed
        // TODO add your handling code here:
         if(evt.getSource()==viewall){
            jLabel3.setVisible(false);
             namecombo.setVisible(false);     
            jLabel4.setVisible(false);
            sizecombo.setVisible(false);
            jLabel5.setVisible(false);
            customercombo.setVisible(false);
            viewbtn.setVisible(true);
           
        }
    }//GEN-LAST:event_viewallActionPerformed

    private void namecomboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_namecomboPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try {
            String sql;
            sql = ("select * from sales  where BRANDNAME='" + (String)namecombo.getSelectedItem()+"'");
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();
            salestable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_namecomboPopupMenuWillBecomeInvisible

    private void sizecomboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_sizecomboPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try {
            String sql;
            sql = ("select * from sales  where SIZEOFLIQUOR='" + (String)sizecombo.getSelectedItem()+"'");
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();
            salestable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sizecomboPopupMenuWillBecomeInvisible

    private void customercomboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_customercomboPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
          try {
            String sql;
            sql = ("select * from sales  where LICENCENO='" + (String)customercombo.getSelectedItem()+"'");
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();
            salestable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_customercomboPopupMenuWillBecomeInvisible

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
         try {
            String sql;
            sql = "select * from sales ORDER BY CASHMEMO" ;
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();
            salestable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_viewbtnActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        AdminHome Ah =new AdminHome();
        Ah.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton brand;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JRadioButton customer;
    private javax.swing.JComboBox<String> customercombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> namecombo;
    private javax.swing.JTable salestable;
    private javax.swing.JRadioButton size;
    private javax.swing.JComboBox<String> sizecombo;
    private javax.swing.JRadioButton viewall;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables

    private void Fill_Customer_Number_Combo() {
try {
            String sql = "select * from CUSTOMER";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("LICENCENUMBER");
                customercombo.addItem(name);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }   
    }

  /*  private void Fill_BrandName() {
try {
            String sql = "select * from SALES";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("BRANDNAME");
                namecombo.addItem(name);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }

    private void Fill_Size() {
try {
            String sql = "select * from SALES";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("SIZEOFLIQUOR");
                sizecombo.addItem(name);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }*/
}
