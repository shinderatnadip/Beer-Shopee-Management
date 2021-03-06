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
public class ViewStorage extends javax.swing.JFrame {
java.sql.Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
  
    /**
     * Creates new form ViewStorage
     */
    public ViewStorage() {
        initComponents();
                conn = Dbconnect.ConnectDb();

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
        viewall = new javax.swing.JRadioButton();
        viewbystrength = new javax.swing.JRadioButton();
        Viewbysize = new javax.swing.JRadioButton();
        ViewByBrand = new javax.swing.JRadioButton();
        selectbrand = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        viewAllbtn = new javax.swing.JButton();
        brand = new javax.swing.JComboBox<>();
        size = new javax.swing.JComboBox<>();
        strength = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        storagetbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Beer & Wine Shopee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 30, 480, 60);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jLabel2.setText("View Storage Information");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 80, 239, 30);

        buttonGroup1.add(viewall);
        viewall.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        viewall.setText("View All");
        viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallActionPerformed(evt);
            }
        });
        getContentPane().add(viewall);
        viewall.setBounds(810, 160, 180, 30);

        buttonGroup1.add(viewbystrength);
        viewbystrength.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        viewbystrength.setText("View By Strength");
        viewbystrength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbystrengthActionPerformed(evt);
            }
        });
        getContentPane().add(viewbystrength);
        viewbystrength.setBounds(600, 160, 180, 30);

        buttonGroup1.add(Viewbysize);
        Viewbysize.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        Viewbysize.setText("View By Size");
        Viewbysize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbysizeActionPerformed(evt);
            }
        });
        getContentPane().add(Viewbysize);
        Viewbysize.setBounds(410, 160, 210, 30);

        buttonGroup1.add(ViewByBrand);
        ViewByBrand.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        ViewByBrand.setText("View By Brand Name");
        ViewByBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewByBrandActionPerformed(evt);
            }
        });
        getContentPane().add(ViewByBrand);
        ViewByBrand.setBounds(180, 160, 180, 30);

        selectbrand.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        selectbrand.setText("Select Brand Name");
        getContentPane().add(selectbrand);
        selectbrand.setBounds(140, 220, 140, 20);

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel4.setText("Select Size");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 220, 140, 20);

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel5.setText("Select Strength");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 220, 140, 20);

        viewAllbtn.setBackground(new java.awt.Color(0, 204, 0));
        viewAllbtn.setText("View All");
        viewAllbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewAllbtn);
        viewAllbtn.setBounds(820, 220, 80, 30);

        brand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kingfisher", "Tuborg", "Heineken", "Knockout", "Carslberg" }));
        brand.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                brandPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(brand);
        brand.setBounds(280, 220, 100, 30);

        size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "180", "275", "330", "500", "650", "750", "1000", "1500" }));
        size.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                sizePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(size);
        size.setBounds(480, 220, 80, 30);

        strength.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mild", "Strong" }));
        strength.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                strengthPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(strength);
        strength.setBounds(707, 220, 80, 30);

        storagetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BARCODEID", "BRANDNAME", "BATCHNO", "EXPIRYDATE", "SIZEOFLIQUOR", "PRICEPERBOTTLE", "QUANTITY", "TYPE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(storagetbl);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 360, 810, 260);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        getContentPane().add(jButton1);
        jButton1.setBounds(940, 220, 100, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Images/thumb.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel3.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewByBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewByBrandActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==ViewByBrand){
            selectbrand.setVisible(true);
             brand.setVisible(true);     
            jLabel4.setVisible(false);
            size.setVisible(false);
            jLabel5.setVisible(false);
            strength.setVisible(false);
            viewAllbtn.setVisible(false);
           
        }
        
    }//GEN-LAST:event_ViewByBrandActionPerformed

    private void ViewbysizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbysizeActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Viewbysize){
            selectbrand.setVisible(false);
             brand.setVisible(false);     
            jLabel4.setVisible(true);
            size.setVisible(true);
            jLabel5.setVisible(false);
            strength.setVisible(false);
            viewAllbtn.setVisible(false);
           
        }
    }//GEN-LAST:event_ViewbysizeActionPerformed

    private void viewbystrengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbystrengthActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==viewbystrength){
            selectbrand.setVisible(false);
             brand.setVisible(false);     
            jLabel4.setVisible(false);
            size.setVisible(false);
            jLabel5.setVisible(true);
            strength.setVisible(true);
            viewAllbtn.setVisible(false);
           
        }
    }//GEN-LAST:event_viewbystrengthActionPerformed

    private void viewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==viewall){
            selectbrand.setVisible(false);
             brand.setVisible(false);     
            jLabel4.setVisible(false);
            size.setVisible(false);
            jLabel5.setVisible(false);
            strength.setVisible(false);
            viewAllbtn.setVisible(true);
           
        }
    }//GEN-LAST:event_viewallActionPerformed

    private void brandPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_brandPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
         try {
            String sql;
            sql = ("select * from storage  where BRANDNAME='" + (String)brand.getSelectedItem()+"'");
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();
            storagetbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_brandPopupMenuWillBecomeInvisible

    private void sizePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_sizePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
         try {
            String sql;
            sql = ("select * from storage  where SIZEOFLIQUOR='" + (String)size.getSelectedItem()+"'");
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();
            storagetbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sizePopupMenuWillBecomeInvisible

    private void strengthPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_strengthPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try {
            String sql;
            sql = ("select * from storage  where TYPE='" + (String)strength.getSelectedItem()+"'");
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();
            storagetbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_strengthPopupMenuWillBecomeInvisible

    private void viewAllbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllbtnActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            sql = ("select * from storage");
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();
            storagetbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_viewAllbtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStorage().setVisible(true);
            }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ViewByBrand;
    private javax.swing.JRadioButton Viewbysize;
    private javax.swing.JComboBox<String> brand;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel selectbrand;
    private javax.swing.JComboBox<String> size;
    private javax.swing.JTable storagetbl;
    private javax.swing.JComboBox<String> strength;
    private javax.swing.JButton viewAllbtn;
    private javax.swing.JRadioButton viewall;
    private javax.swing.JRadioButton viewbystrength;
    // End of variables declaration//GEN-END:variables
}
