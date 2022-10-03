
package doctorbooking;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author amalp
 */
public class hospital extends javax.swing.JFrame {

    
    public hospital() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adl2 = new javax.swing.JLabel();
        adl3 = new javax.swing.JLabel();
        adl4 = new javax.swing.JLabel();
        adt1 = new javax.swing.JTextField();
        adt2 = new javax.swing.JPasswordField();
        adb1 = new javax.swing.JButton();
        adb2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        adl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adl2.setForeground(new java.awt.Color(102, 0, 0));
        adl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adl2.setText("Admin Log in");
        jPanel1.add(adl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 71, 131, -1));

        adl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adl3.setForeground(new java.awt.Color(0, 51, 51));
        adl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adl3.setText("Username");
        jPanel1.add(adl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 143, 97, 30));

        adl4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adl4.setForeground(new java.awt.Color(0, 51, 51));
        adl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adl4.setText("Password");
        jPanel1.add(adl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 204, 97, 29));

        adt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(adt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 144, 106, 30));

        adt2.setText("jPasswordField1");
        jPanel1.add(adt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 206, 106, 29));

        adb1.setBackground(new java.awt.Color(0, 51, 51));
        adb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adb1.setForeground(new java.awt.Color(255, 255, 255));
        adb1.setText("CLEAR");
        adb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adb1ActionPerformed(evt);
            }
        });
        jPanel1.add(adb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 308, -1, 34));

        adb2.setBackground(new java.awt.Color(0, 51, 51));
        adb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adb2.setForeground(new java.awt.Color(255, 255, 255));
        adb2.setText("Login");
        adb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adb2ActionPerformed(evt);
            }
        });
        jPanel1.add(adb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 308, 79, 34));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        adl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        adl1.setForeground(new java.awt.Color(0, 153, 153));
        adl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adl1.setText("HSM HOSPITAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adl1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 399, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\amalp\\OneDrive\\Desktop\\cn\\project\\e.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adb1ActionPerformed
        // TODO add your handling code here:
        adt1.setText("");
        adt2.setText("");
    }//GEN-LAST:event_adb1ActionPerformed

    private void adb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adb2ActionPerformed
        // TODO add your handling code here:
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment","root","root12345");
               String username=adt1.getText();
               String password=adt2.getText();
                Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("select * from loginadmin where username='"+username+"'and password='"+password+"'");
                 if(rs.next())
                 {
                     dispose();
                     admin1 ad= new admin1();
                     ad.show();
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null, "login failed");
                     adt1.setText("");
                     adt2.setText("");
                 }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_adb2ActionPerformed

   
    public static void main(String args[]) {
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adb1;
    private javax.swing.JButton adb2;
    private javax.swing.JLabel adl1;
    private javax.swing.JLabel adl2;
    private javax.swing.JLabel adl3;
    private javax.swing.JLabel adl4;
    private javax.swing.JTextField adt1;
    private javax.swing.JPasswordField adt2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
