/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import conn.ManagerCustomerLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rimsh
 */
public class SubUsersRecord extends javax.swing.JFrame {

    /**
     * Creates new form SubUsers
     */
    public SubUsersRecord() {
        initComponents();
        Updated_Table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        UserTitle = new javax.swing.JLabel();
        UserRecordTitle = new javax.swing.JLabel();
        UserID = new javax.swing.JLabel();
        UserNAME = new javax.swing.JLabel();
        UserId = new javax.swing.JTextField();
        UserName = new javax.swing.JTextField();
        UserAddBtn = new javax.swing.JButton();
        UserTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        UserLogoutBtn = new javax.swing.JButton();
        UserCATEGORY = new javax.swing.JLabel();
        UserDeleteBtn = new javax.swing.JButton();
        CustomerFrameBtn = new javax.swing.JButton();
        VistorFrmaeBtn = new javax.swing.JButton();
        DistributorFrameBtn = new javax.swing.JButton();
        DoctorFrameBtn = new javax.swing.JButton();
        UserCategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel3.setLayout(null);

        UserTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        UserTitle.setForeground(new java.awt.Color(0, 102, 102));
        UserTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserTitle.setText("Users");
        jPanel3.add(UserTitle);
        UserTitle.setBounds(90, 50, 170, 50);

        UserRecordTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UserRecordTitle.setForeground(new java.awt.Color(0, 102, 102));
        UserRecordTitle.setText("Users record");
        jPanel3.add(UserRecordTitle);
        UserRecordTitle.setBounds(660, 90, 220, 30);

        UserID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserID.setForeground(new java.awt.Color(0, 102, 102));
        UserID.setText("ID");
        jPanel3.add(UserID);
        UserID.setBounds(70, 180, 19, 22);

        UserNAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserNAME.setForeground(new java.awt.Color(0, 102, 102));
        UserNAME.setText("NAME");
        jPanel3.add(UserNAME);
        UserNAME.setBounds(40, 240, 90, 22);
        jPanel3.add(UserId);
        UserId.setBounds(140, 170, 170, 30);
        jPanel3.add(UserName);
        UserName.setBounds(140, 230, 170, 30);

        UserAddBtn.setBackground(new java.awt.Color(0, 102, 102));
        UserAddBtn.setForeground(new java.awt.Color(255, 255, 255));
        UserAddBtn.setText("ADD");
        UserAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserAddBtnActionPerformed(evt);
            }
        });
        jPanel3.add(UserAddBtn);
        UserAddBtn.setBounds(40, 520, 100, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        UserTable.setViewportView(jTable1);

        jPanel3.add(UserTable);
        UserTable.setBounds(490, 160, 550, 400);

        UserLogoutBtn.setBackground(new java.awt.Color(255, 255, 204));
        UserLogoutBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserLogoutBtn.setForeground(new java.awt.Color(0, 102, 102));
        UserLogoutBtn.setText("Logout");
        UserLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLogoutBtnActionPerformed(evt);
            }
        });
        jPanel3.add(UserLogoutBtn);
        UserLogoutBtn.setBounds(1060, 280, 110, 40);

        UserCATEGORY.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserCATEGORY.setForeground(new java.awt.Color(0, 102, 102));
        UserCATEGORY.setText("CATEGORY");
        jPanel3.add(UserCATEGORY);
        UserCATEGORY.setBounds(30, 290, 100, 30);

        UserDeleteBtn.setBackground(new java.awt.Color(0, 102, 102));
        UserDeleteBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UserDeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        UserDeleteBtn.setText("Delete");
        UserDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserDeleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(UserDeleteBtn);
        UserDeleteBtn.setBounds(170, 520, 110, 40);

        CustomerFrameBtn.setText("Customers");
        CustomerFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerFrameBtnActionPerformed(evt);
            }
        });
        jPanel3.add(CustomerFrameBtn);
        CustomerFrameBtn.setBounds(1060, 340, 110, 40);

        VistorFrmaeBtn.setText("Visitors");
        VistorFrmaeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VistorFrmaeBtnActionPerformed(evt);
            }
        });
        jPanel3.add(VistorFrmaeBtn);
        VistorFrmaeBtn.setBounds(1060, 390, 110, 40);

        DistributorFrameBtn.setText("Distributors");
        DistributorFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistributorFrameBtnActionPerformed(evt);
            }
        });
        jPanel3.add(DistributorFrameBtn);
        DistributorFrameBtn.setBounds(1060, 440, 110, 40);

        DoctorFrameBtn.setText("Doctors");
        DoctorFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorFrameBtnActionPerformed(evt);
            }
        });
        jPanel3.add(DoctorFrameBtn);
        DoctorFrameBtn.setBounds(1060, 490, 110, 40);

        UserCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distributor", "Visitor", "Doctor", "Customer" }));
        jPanel3.add(UserCategory);
        UserCategory.setBounds(140, 290, 170, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1366, 768);

        setSize(new java.awt.Dimension(1201, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void connection (Connection connection) throws ClassNotFoundException{
        
       // This function is for creating connection with oracle database
        
        try {
            Class.forName("oracle.jdbc.OracleDriver"); // defining the oracle driver 
             connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rimsha", "rimsha", "rimsha"); // establishing connection with user in orcale database
        } 
        
        catch (SQLException ex) { // throwing exception if thus user is not available
            
            Logger.getLogger(ComplainsRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private void UserAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserAddBtnActionPerformed

        try{
            Connection connection = null;
       connection(connection);
            String sql="insert into USERS"+"(USER_NO,USER_NAME,USER_STATUS)"+"values(?,?,?)";
            PreparedStatement preparedstatement=connection.prepareStatement(sql);
            int a=(int) Integer.parseInt(UserId.getText());

            preparedstatement.setInt(1, a);
            //pst.setString(1, CID2.getText());
            preparedstatement.setString(2, UserName.getText());
            preparedstatement.setString(3, UserCategory.getSelectedItem().toString());
           

            preparedstatement.executeUpdate();
            JOptionPane.showMessageDialog(this,"Successfully Inserted!");
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(this,e.getMessage());
        }

        Updated_Table();

    }//GEN-LAST:event_UserAddBtnActionPerformed

    
    
     public void Updated_Table()
{
    try{
       Connection connection = null;
       connection(connection);
        String sql="Select * from USERS";
        PreparedStatement preparedstatement=null;
        preparedstatement=connection.prepareStatement(sql);
        ResultSet resultset=null;
        resultset=preparedstatement.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(resultset));
       
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(this,e.getMessage());
       
       
       }
}
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void UserLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLogoutBtnActionPerformed

        new ManagerCustomerLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserLogoutBtnActionPerformed

    private void UserDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserDeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserDeleteBtnActionPerformed

    private void DoctorFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorFrameBtnActionPerformed

new DoctorRecord().setVisible(true);
this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorFrameBtnActionPerformed

    private void CustomerFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerFrameBtnActionPerformed

new CustomerRecord().setVisible(true);
this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerFrameBtnActionPerformed

    private void VistorFrmaeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistorFrmaeBtnActionPerformed

new VisitorsRecord().setVisible(true);
this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_VistorFrmaeBtnActionPerformed

    private void DistributorFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistributorFrameBtnActionPerformed

        new DistributorRecord().setVisible(true);
        this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_DistributorFrameBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SubUsersRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubUsersRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubUsersRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubUsersRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubUsersRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerFrameBtn;
    private javax.swing.JButton DistributorFrameBtn;
    private javax.swing.JButton DoctorFrameBtn;
    private javax.swing.JButton UserAddBtn;
    private javax.swing.JLabel UserCATEGORY;
    private javax.swing.JComboBox<String> UserCategory;
    private javax.swing.JButton UserDeleteBtn;
    private javax.swing.JLabel UserID;
    private javax.swing.JTextField UserId;
    private javax.swing.JButton UserLogoutBtn;
    private javax.swing.JLabel UserNAME;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel UserRecordTitle;
    private javax.swing.JScrollPane UserTable;
    private javax.swing.JLabel UserTitle;
    private javax.swing.JButton VistorFrmaeBtn;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
