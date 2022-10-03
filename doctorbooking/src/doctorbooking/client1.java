
package doctorbooking;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author amalp
 */
public class client1 extends javax.swing.JFrame {
    
    /**
     * Creates new form client1
     */
    String d;
    public client1(String d) {
        initComponents();
        
        this.d=d;
//        this.r=r;
//         abc.setText(Integer.toString(r));
//        System.out.println(r);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        c1l2 = new javax.swing.JLabel();
        c1l5 = new javax.swing.JLabel();
        c1l3 = new javax.swing.JLabel();
        c1l4 = new javax.swing.JLabel();
        c1b2 = new javax.swing.JButton();
        c1b1 = new javax.swing.JButton();
        cl1t2 = new javax.swing.JTextField();
        cl1t1 = new javax.swing.JTextField();
        cl1t3 = new javax.swing.JTextField();
        cl1t4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        c1l1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        c1l2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c1l2.setForeground(new java.awt.Color(0, 51, 51));
        c1l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1l2.setText("Patient Name");

        c1l5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c1l5.setForeground(new java.awt.Color(0, 51, 51));
        c1l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1l5.setText("Age");

        c1l3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c1l3.setForeground(new java.awt.Color(0, 51, 51));
        c1l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1l3.setText("Address");

        c1l4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c1l4.setForeground(new java.awt.Color(0, 51, 51));
        c1l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1l4.setText("Place");

        c1b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c1b2.setForeground(new java.awt.Color(0, 51, 51));
        c1b2.setText("Submit");
        c1b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1b2ActionPerformed(evt);
            }
        });

        c1b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c1b1.setForeground(new java.awt.Color(0, 51, 51));
        c1b1.setText("Clear");

        cl1t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cl1t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cl1t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cl1t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cl1t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cl1t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cl1t4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cl1t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        c1l1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c1l1.setForeground(new java.awt.Color(0, 153, 153));
        c1l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1l1.setText("HSM HOSPITAL");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c1l1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(c1l1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c1l3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1l4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1l5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1l2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(c1b1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cl1t3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl1t2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl1t4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1b2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl1t1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1l2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl1t1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1l3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl1t2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1l4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl1t3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1l5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl1t4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1b1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1b2ActionPerformed
        // TODO add your handling code here:
        client.name=cl1t1.getText();
         client.address=cl1t2.getText();
          client.place=cl1t3.getText();
           client.age=cl1t4.getText();
           client.doc=d;
           client.send(d+"#"+cl1t1.getText()+"#"+cl1t2.getText()+"#"+cl1t3.getText()+"#"+cl1t4.getText());
//           switch(d)
//           {
//               case "a" :client.doc=1;
//               break;
//               case "b" :client.doc=2;
//               break;
//               case "c" :client.doc=3;
//               break;
//               
//           }
        
//         try
//        {                                                                                         //database connection
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment","root","root123");
//            String sql ="insert into patient values (?,?,?,?,?)";
//            PreparedStatement pst = con.prepareStatement(sql);
//            pst.setInt(4,Integer.parseInt(cl1t4.getText()));
//            pst.setString(1,cl1t1.getText());
//             pst.setString(2,cl1t2.getText());
//              pst.setString(3,cl1t3.getText());
//              pst.setInt(5,d);
//           //   String s1;
//           //   s1=cl1t1.getText();
//              //System.out.println(s1);
//            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "insertion successful");
//            con.close();
//            dispose();
//        }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
//         
dispose();
    }//GEN-LAST:event_c1b2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
//     public static void main(String[] args) {
//          java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new client1().setVisible(true);
//            }
//        // TODO code application logic here
//    });
//                  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c1b1;
    public static javax.swing.JButton c1b2;
    private javax.swing.JLabel c1l1;
    private javax.swing.JLabel c1l2;
    private javax.swing.JLabel c1l3;
    private javax.swing.JLabel c1l4;
    private javax.swing.JLabel c1l5;
    private javax.swing.JTextField cl1t1;
    private javax.swing.JTextField cl1t2;
    private javax.swing.JTextField cl1t3;
    private javax.swing.JTextField cl1t4;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
