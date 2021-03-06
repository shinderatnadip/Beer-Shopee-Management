/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author Ratnadip
 */
public class WaiterRegistration extends javax.swing.JFrame {
java.sql.Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    /**
     * Creates new form WaiterRegistration
     */
    public WaiterRegistration() {
        initComponents();
                conn = Dbconnect.ConnectDb();
                    showDate();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        waiternumber = new javax.swing.JTextField();
        waitername = new javax.swing.JTextField();
        waitersurname = new javax.swing.JTextField();
        waitermobile = new javax.swing.JTextField();
        waiteraddress = new javax.swing.JTextField();
        waiterdateofjoin = new javax.swing.JTextField();
        waiterpost = new javax.swing.JTextField();
        waitersalary = new javax.swing.JTextField();
        waiterSaveBtn = new javax.swing.JButton();
        AddNewWaiterBtn = new javax.swing.JButton();
        WaiterCancelBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Beer & Wine Shopee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 60, 630, 60);

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Waiter Registration ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(580, 150, 230, 50);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel3.setText("Waiter ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 220, 100, 23);

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel4.setText("First Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 270, 100, 23);

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel5.setText("Last Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(480, 320, 100, 23);

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel6.setText("Mobile Number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 370, 140, 23);

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 420, 80, 23);

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel8.setText("Date of Joining");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(480, 470, 130, 23);

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel9.setText("Post");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 520, 60, 23);

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel10.setText("Salary");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(480, 570, 70, 23);
        getContentPane().add(waiternumber);
        waiternumber.setBounds(660, 220, 160, 30);
        getContentPane().add(waitername);
        waitername.setBounds(660, 270, 160, 30);
        getContentPane().add(waitersurname);
        waitersurname.setBounds(660, 320, 160, 30);
        getContentPane().add(waitermobile);
        waitermobile.setBounds(660, 370, 160, 30);
        getContentPane().add(waiteraddress);
        waiteraddress.setBounds(660, 420, 160, 30);
        getContentPane().add(waiterdateofjoin);
        waiterdateofjoin.setBounds(660, 470, 160, 30);
        getContentPane().add(waiterpost);
        waiterpost.setBounds(660, 520, 160, 30);
        getContentPane().add(waitersalary);
        waitersalary.setBounds(660, 570, 160, 30);

        waiterSaveBtn.setBackground(new java.awt.Color(0, 153, 0));
        waiterSaveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        waiterSaveBtn.setText("Save");
        waiterSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waiterSaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(waiterSaveBtn);
        waiterSaveBtn.setBounds(470, 640, 65, 25);

        AddNewWaiterBtn.setBackground(new java.awt.Color(255, 255, 0));
        AddNewWaiterBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddNewWaiterBtn.setText("Add Another");
        getContentPane().add(AddNewWaiterBtn);
        AddNewWaiterBtn.setBounds(590, 640, 140, 25);

        WaiterCancelBtn.setBackground(new java.awt.Color(255, 0, 0));
        WaiterCancelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WaiterCancelBtn.setText("Cancel");
        WaiterCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaiterCancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(WaiterCancelBtn);
        WaiterCancelBtn.setBounds(780, 640, 77, 25);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Images/purchase.jpg"))); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WaiterCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaiterCancelBtnActionPerformed
        // TODO add your handling code here:
          AdminHome AH = new AdminHome();
            AH.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_WaiterCancelBtnActionPerformed

    private void waiterSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waiterSaveBtnActionPerformed
        // TODO add your handling code here:
        
         try {
            String sql = "Insert into WAITER (ID,FIRSTNAME,LASTNAME,MOBILENO,ADDRESS,DATEOFJOIN,POST,SALARY) values (?,?,?,?,?,to_date(?, 'yyyy-mm-dd'),?,?)";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, waiternumber.getText());

            pst.setString(2, waitername.getText());
            pst.setString(3, waitersurname.getText());

            pst.setString(4, waitermobile.getText());
            pst.setString(5, waiteraddress.getText());
            pst.setString(6, waiterdateofjoin.getText());
            pst.setString(7, waiterpost.getText());
            pst.setString(8, waitersalary.getText());
            rs = (OracleResultSet) pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Saved");
            
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
        }
         waiternumber.setText("");
         waitername.setText("");
         waitersurname.setText("");
         waitermobile.setText("");
         waiteraddress.setText("");
         waiterdateofjoin.setText("");
         waiterpost.setText("");   
         waitersalary .setText("");
    }//GEN-LAST:event_waiterSaveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(WaiterRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WaiterRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WaiterRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WaiterRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaiterRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewWaiterBtn;
    private javax.swing.JButton WaiterCancelBtn;
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
    private javax.swing.JButton waiterSaveBtn;
    private javax.swing.JTextField waiteraddress;
    private javax.swing.JTextField waiterdateofjoin;
    private javax.swing.JTextField waitermobile;
    private javax.swing.JTextField waitername;
    private javax.swing.JTextField waiternumber;
    private javax.swing.JTextField waiterpost;
    private javax.swing.JTextField waitersalary;
    private javax.swing.JTextField waitersurname;
    // End of variables declaration//GEN-END:variables

 private void showDate() {

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        waiterdateofjoin.setText(s.format(d));
       // purchasedate.setText(s.format(d));
    }    


}
