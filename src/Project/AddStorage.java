/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author Ratnadip
 */
public class AddStorage extends javax.swing.JFrame {
java.sql.Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
  
    /**
     * Creates new form AddStorage
     */
    public AddStorage() {
        initComponents();
                conn = Dbconnect.ConnectDb();
                Fill_BatchNo();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        barcodeid = new javax.swing.JTextField();
        brandname = new javax.swing.JTextField();
        strength = new javax.swing.JTextField();
        batchnumber = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        expiry = new javax.swing.JTextField();
        size = new javax.swing.JTextField();
        priceperbottle = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        view = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Beer & Wine Shopee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 30, 490, 60);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Storage");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 90, 100, 33);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel3.setText("Batch Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 130, 110, 23);

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel4.setText("Barcode Id");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 210, 110, 23);

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel5.setText("Brand Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 290, 110, 23);

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel6.setText("Strength");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 370, 110, 23);
        getContentPane().add(barcodeid);
        barcodeid.setBounds(270, 210, 150, 30);
        getContentPane().add(brandname);
        brandname.setBounds(270, 290, 150, 30);
        getContentPane().add(strength);
        strength.setBounds(270, 370, 150, 30);

        batchnumber.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                batchnumberPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(batchnumber);
        batchnumber.setBounds(270, 130, 150, 30);

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel7.setText("Expiry Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(560, 140, 110, 23);

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel8.setText("Size Of Bottle");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(560, 220, 110, 23);

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel9.setText("Price Per Bottle");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(560, 300, 130, 23);

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel10.setText("Quantity");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(560, 370, 120, 23);

        expiry.setText("Life Time");
        getContentPane().add(expiry);
        expiry.setBounds(710, 140, 150, 30);
        getContentPane().add(size);
        size.setBounds(710, 220, 150, 30);
        getContentPane().add(priceperbottle);
        priceperbottle.setBounds(710, 300, 150, 30);
        getContentPane().add(quantity);
        quantity.setBounds(710, 370, 150, 30);

        save.setBackground(new java.awt.Color(0, 204, 51));
        save.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(310, 440, 130, 29);

        update.setBackground(new java.awt.Color(0, 102, 255));
        update.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        update.setText("Update Storage");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(470, 440, 131, 29);

        view.setBackground(new java.awt.Color(255, 255, 0));
        view.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        view.setText("View Storage");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(640, 440, 130, 29);

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(810, 440, 130, 29);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Images/thumb.jpg"))); // NOI18N
        jLabel11.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel11.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel11.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, -2, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batchnumberPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_batchnumberPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp = (String) batchnumber.getSelectedItem();
        String sql = "select * from purchase where BATCHNO=?";
        try {
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = (OracleResultSet) pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("NAMEOFBRAND");
                brandname.setText(add1);
                String add2 = rs.getString("STRENGTH");
                strength.setText(add2);
                String add3 = rs.getString("SIZEOFBOTTLE");
                size.setText(add3);
                    String add4 = rs.getString("PERBOTTLEPRICE");
                priceperbottle.setText(add4);
                

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        
    }//GEN-LAST:event_batchnumberPopupMenuWillBecomeInvisible

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
          try {
            String sql = "Insert into STORAGE (BARCODEID,BRANDNAME,BATCHNO,EXPIRYDATE,SIZEOFLIQUOR,PRICEPERBOTTLE,QUANTITY,TYPE) values (?,?,?,?,?,?,?,?)";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, barcodeid.getText());
            pst.setString(2,brandname.getText());
            String value=batchnumber.getSelectedItem().toString();
            pst.setString(3, value);
            pst.setString(4,expiry.getText());
            pst.setString(5,size.getText() );
            pst.setString(6, priceperbottle.getText());
            pst.setString(7,quantity.getText());

            pst.setString(8,strength.getText());
            rs = (OracleResultSet) pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Storage Record Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
        barcodeid.setText("");
        brandname.setText("");
        size.setText("");
        priceperbottle.setText("");
        quantity.setText("");
        strength.setText("");
                                
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        UpdateStorage US = new UpdateStorage();
        US.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        ViewStorage VS = new ViewStorage();
        VS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        AdminHome AH= new AdminHome();
        AH.setVisible(true);
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
            java.util.logging.Logger.getLogger(AddStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStorage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barcodeid;
    private javax.swing.JComboBox<String> batchnumber;
    private javax.swing.JTextField brandname;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField expiry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField priceperbottle;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton save;
    private javax.swing.JTextField size;
    private javax.swing.JTextField strength;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

    private void Fill_BatchNo() {
try {
            String sql = "select * from purchase";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("BATCHNO");
                batchnumber.addItem(name);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }   
    }
}