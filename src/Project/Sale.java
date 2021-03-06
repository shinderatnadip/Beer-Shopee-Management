/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author Ratnadip
 */
public class Sale extends javax.swing.JFrame {
java.sql.Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
  
    /**
     * Creates new form Sale
     */
    public Sale() {
        initComponents();
                conn = Dbconnect.ConnectDb();
        showDate();
                 Fill_Customer_Number_Combo();
                 Fill_Batchno();
                             Update_Storage();
                             Delete_Empty_Storage_Record();


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
        generatebill = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        billnumber = new javax.swing.JTextField();
        licence = new javax.swing.JComboBox<>();
        batchno = new javax.swing.JComboBox<>();
        barcodeid = new javax.swing.JTextField();
        strength = new javax.swing.JTextField();
        availablequantity = new javax.swing.JTextField();
        salequantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        custname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        expiry = new javax.swing.JTextField();
        size = new javax.swing.JTextField();
        priceperbottle = new javax.swing.JTextField();
        issuedate = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        custsurname = new javax.swing.JTextField();
        totalprice = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        view = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Beer & Wine Shopee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 30, 490, 60);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jLabel2.setText("Sales Entry");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 90, 120, 30);

        generatebill.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        generatebill.setForeground(new java.awt.Color(0, 0, 204));
        generatebill.setText("Click Here To Get Last Bill ");
        generatebill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generatebillMouseClicked(evt);
            }
        });
        getContentPane().add(generatebill);
        generatebill.setBounds(80, 130, 190, 20);

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Customer Licence");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 190, 140, 20);

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Batch No");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 250, 100, 20);

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Barcode Id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 300, 110, 20);

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Strength");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 360, 100, 20);

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Available Quantity");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 490, 150, 20);

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Sale Quantity");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 550, 120, 20);
        getContentPane().add(billnumber);
        billnumber.setBounds(270, 130, 180, 30);

        licence.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                licencePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(licence);
        licence.setBounds(270, 190, 170, 30);

        batchno.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                batchnoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(batchno);
        batchno.setBounds(270, 250, 170, 30);
        getContentPane().add(barcodeid);
        barcodeid.setBounds(270, 300, 180, 30);
        getContentPane().add(strength);
        strength.setBounds(270, 360, 180, 30);
        getContentPane().add(availablequantity);
        availablequantity.setBounds(270, 490, 180, 30);
        getContentPane().add(salequantity);
        salequantity.setBounds(270, 550, 180, 30);

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Customer Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(610, 140, 140, 20);

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Address");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(610, 270, 100, 20);

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Brand Name");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 430, 120, 20);

        jLabel13.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Expiry Date");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(610, 320, 120, 20);

        jLabel14.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Size of Bottle");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(610, 370, 120, 20);

        jLabel15.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Price Per Bottle");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(610, 430, 130, 20);

        jLabel16.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Issue Date");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(610, 490, 110, 20);

        jLabel17.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("Total Price");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(610, 560, 110, 20);
        getContentPane().add(total);
        total.setBounds(810, 550, 180, 30);

        custname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custnameActionPerformed(evt);
            }
        });
        getContentPane().add(custname);
        custname.setBounds(810, 140, 180, 30);
        getContentPane().add(address);
        address.setBounds(810, 260, 180, 30);

        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });
        getContentPane().add(brand);
        brand.setBounds(270, 430, 180, 30);
        getContentPane().add(expiry);
        expiry.setBounds(810, 320, 180, 30);
        getContentPane().add(size);
        size.setBounds(810, 380, 180, 30);
        getContentPane().add(priceperbottle);
        priceperbottle.setBounds(810, 440, 180, 30);
        getContentPane().add(issuedate);
        issuedate.setBounds(810, 490, 180, 30);

        jLabel18.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("Customer Surname");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(610, 210, 130, 20);
        getContentPane().add(custsurname);
        custsurname.setBounds(810, 200, 180, 30);

        totalprice.setBackground(new java.awt.Color(0, 102, 204));
        totalprice.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        totalprice.setText("Total");
        totalprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpriceActionPerformed(evt);
            }
        });
        getContentPane().add(totalprice);
        totalprice.setBounds(160, 630, 120, 29);

        savebtn.setBackground(new java.awt.Color(0, 204, 0));
        savebtn.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        getContentPane().add(savebtn);
        savebtn.setBounds(340, 630, 120, 29);

        view.setBackground(new java.awt.Color(255, 255, 0));
        view.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        view.setText("View Sale");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(510, 630, 120, 29);

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(860, 630, 120, 29);

        refresh.setBackground(new java.awt.Color(0, 204, 102));
        refresh.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh);
        refresh.setBounds(690, 630, 120, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Images/sellbeer.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel3.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandActionPerformed

    private void custnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custnameActionPerformed

    private void licencePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_licencePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
         String tmp = (String) licence.getSelectedItem();
        String sql = "select * from customer where licencenumber=?";
        try {
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = (OracleResultSet) pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("FIRSTNAME");
                custname.setText(add1);
                String add2 = rs.getString("LASTNAME");
                custsurname.setText(add2);
                String add3 = rs.getString("ADDRESS");
                address.setText(add3);
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_licencePopupMenuWillBecomeInvisible

    private void batchnoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_batchnoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp = (String) batchno.getSelectedItem();
        String sql = "select * from STORAGE where BATCHNO =?";
        try {
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = (OracleResultSet) pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("BRANDNAME");
                brand.setText(add1);
                String add2 = rs.getString("BARCODEID");
                barcodeid.setText(add2);
                String add3 = rs.getString("SIZEOFLIQUOR");
                size.setText(add3);
                String add4 = rs.getString("PRICEPERBOTTLE");
                priceperbottle.setText(add4);
                String add5 = rs.getString("TYPE");
                strength.setText(add5);
                String add6 =rs.getString("QUANTITY");
                availablequantity.setText(add6);
                String add7 =rs.getString("EXPIRYDATE");
                expiry.setText(add7);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_batchnoPopupMenuWillBecomeInvisible

    private void totalpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpriceActionPerformed
        // TODO add your handling code here:
        total.setText((Integer.parseInt(priceperbottle.getText())*Integer.parseInt(salequantity.getText()))+" ");
        availablequantity.setText((Integer.parseInt(availablequantity.getText()) - Integer.parseInt(salequantity.getText()))+" ");
            //Update_Storage();
           /* try {
            String sql = "Update STORAGE set BARCODEID=?,BRANDNAME=?,EXPIRYDATE=?,SIZEOFLIQUOR=?,PRICEPERBOTTLE=?,QUANTITY=?,TYPE=? where BATCHNO=?";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, barcodeid.getText());
            pst.setString(2,brand.getText());
           
            pst.setString(3,expiry.getText());
            pst.setString(4,size.getText() );
            pst.setString(5, priceperbottle.getText());
            pst.setString(6,availablequantity.getText());

            pst.setString(7,strength.getText());
             String value=batchno.getSelectedItem().toString();
            pst.setString(8, value);
            rs = (OracleResultSet) pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Storage Record Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                            e.printStackTrace();

        }  */
    }//GEN-LAST:event_totalpriceActionPerformed

    private void generatebillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generatebillMouseClicked
        // TODO add your handling code here:
        try{
            String sql="select count(cashmemo)from sales";
                        pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();
            if(rs.next()){
                String count=rs.getString("count(cashmemo)");
                billnumber.setText(count);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_generatebillMouseClicked

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        ViewSale VS = new ViewSale();
        VS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
            Login login = new Login();
            login.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
             try {
            String sql = "Insert into SALES (LICENCENO,CUSTOMERNAME,CUSTLASTNAME,CASHMEMO,PLACE,BARCODEID,BRANDNAME,BATCHNO,EXPIRYDATE,TYPE,SIZEOFLIQUOR,\n"+ 
                    "ISSUEDATE,PRICEPERBOTTLE,QUANTITY,TOTAL) values (?,?,?,?,?,?,?,?,?,?,?,to_date(?, 'yyyy-mm-dd'),?,?,?)";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            String value=licence.getSelectedItem().toString();
            pst.setString(1, value);
            pst.setString(2, custname.getText());

            pst.setString(3, custsurname.getText());
            pst.setString(4, billnumber.getText());
           
            pst.setString(5, address.getText());
            pst.setString(6, barcodeid.getText());
            pst.setString(7, brand.getText());
            String value1=batchno.getSelectedItem().toString();
            pst.setString(8, value1);
            pst.setString(9, expiry.getText());
            pst.setString(10, strength.getText());
            pst.setString(11, size.getText());
            pst.setString(12, issuedate.getText());
            pst.setString(13, priceperbottle.getText());
            pst.setString(14, salequantity.getText());
            pst.setString(15,total.getText());
            //Update_Storage();

            rs = (OracleResultSet) pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();

        }
              try {
            String sql = "Update STORAGE set BARCODEID=?,BRANDNAME=?,EXPIRYDATE=?,SIZEOFLIQUOR=?,PRICEPERBOTTLE=?,QUANTITY=?,TYPE=? where BATCHNO=?";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, barcodeid.getText());
            pst.setString(2,brand.getText());
           
            pst.setString(3,expiry.getText());
            pst.setString(4,size.getText() );
            pst.setString(5, priceperbottle.getText());
            pst.setString(6,availablequantity.getText());

            pst.setString(7,strength.getText());
             String value=batchno.getSelectedItem().toString();
            pst.setString(8, value);
            rs = (OracleResultSet) pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Storage Record Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                            e.printStackTrace();

        }
        //Update_Storage();
        custname.setText("");
        custsurname.setText("");
        billnumber.setText("");
        address.setText("");
        barcodeid.setText("");
        brand.setText("");
        expiry.setText("");
        strength.setText("");
        size.setText("");
        priceperbottle.setText("");
         availablequantity.setText("");
        total.setText("");
        salequantity.setText("");
    }//GEN-LAST:event_savebtnActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
         //Update_Storage();
          Delete_Empty_Storage_Record();
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField availablequantity;
    private javax.swing.JTextField barcodeid;
    private javax.swing.JComboBox<String> batchno;
    private javax.swing.JTextField billnumber;
    private javax.swing.JTextField brand;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField custname;
    private javax.swing.JTextField custsurname;
    private javax.swing.JTextField expiry;
    private javax.swing.JLabel generatebill;
    private javax.swing.JTextField issuedate;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> licence;
    private javax.swing.JTextField priceperbottle;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField salequantity;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField size;
    private javax.swing.JTextField strength;
    private javax.swing.JTextField total;
    private javax.swing.JButton totalprice;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

 private void showDate() {

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        issuedate.setText(s.format(d));
        
    }   

    private void Fill_Customer_Number_Combo() {
try {
            String sql = "select * from CUSTOMER";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("LICENCENUMBER");
                licence.addItem(name);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }

    private void Fill_Batchno() {
try {
            String sql = "select * from STORAGE";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            rs = (OracleResultSet) pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("BATCHNO");
                batchno.addItem(name);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }

    private void Update_Storage() {
/*try{  
                   String sql1 = "UPDATE STORAGE set QUANTITY=? where BATCHNO ='" + (String)batchno.getSelectedItem()+"'";
           pst = (OraclePreparedStatement) conn.prepareStatement(sql1);
            pst.setString(1,availablequantity.getText());
           // pst.setString(2,batchno.getSelectedItem().toString());
            rs = (OracleResultSet) pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Storage Update");
               }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); 
            e.printStackTrace();
            } */

               
    }

    private void Delete_Empty_Storage_Record() {
 try{  
                   String sql1 = "DELETE FROM STORAGE where QUANTITY=0";
           pst = (OraclePreparedStatement) conn.prepareStatement(sql1);
           rs = (OracleResultSet) pst.executeQuery();
               }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);  
            e.printStackTrace();
        }   
    }


}
