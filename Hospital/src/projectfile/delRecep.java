/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Atul Gupta
 */
public class delRecep extends javax.swing.JFrame {

    /**
     * Creates new form delRecep
     */
    public delRecep() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 0, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Delete Receptionist Data");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        jLabel1.setText("Enter Receptionist's u_Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 170, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "u_Name", "Password", "Phn_num", "Age", "Gender", "Email"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 630, 150));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Show Receptionist");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setToolTipText("");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
new Control().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
t1.setText(null); 
DefaultTableModel t=(DefaultTableModel)tbl.getModel();
t.setRowCount(0);


  
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
{ Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","comp");
Statement stmt=con.createStatement();
String select=t1.getText();
String query="delete from receptionist where u_name='"+select+"';";
stmt.executeUpdate(query);
JOptionPane.showMessageDialog(this,"Record Successfully Deleted");
DefaultTableModel t=(DefaultTableModel)tbl.getModel();
t.setRowCount(0);
}
catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage()); 
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
DefaultTableModel m =(DefaultTableModel)tbl.getModel();
try
{ Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","comp");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from receptionist");
while (rs.next())
{
    String nm = rs.getString("name");
    String un =rs.getString(2);
    String pw=rs.getString(3);
    String pn = rs.getString(4);
    String ag=rs.getString(5);
String gn=rs.getString(6);
String em=rs.getString(7);
m.addRow(new Object[] {nm,un,pw,pn,ag,gn,em});
}
rs.close();
stmt.close();
con.close();
}
catch(Exception e)
{JOptionPane.showMessageDialog(this, e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(delRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delRecep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
