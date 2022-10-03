
package doctorbooking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amalp
 */
public class server extends javax.swing.JFrame {

    
    public static int doc1=0,doc2=0,doc3=0;
  // public static String dem;
    public server() {

        initComponents();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sevl2 = new javax.swing.JLabel();
        sevl3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sevt1 = new javax.swing.JTextField();
        sevt2 = new javax.swing.JTextField();
        sevt3 = new javax.swing.JTextField();
        sevt4 = new javax.swing.JTextField();
        sevt5 = new javax.swing.JTextField();
        sevt6 = new javax.swing.JTextField();
        sevt7 = new javax.swing.JTextField();
        sevt8 = new javax.swing.JTextField();
        sevt9 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        sevl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        sevl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevl2.setForeground(new java.awt.Color(0, 51, 51));
        sevl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sevl2.setText("Doctor Name");

        sevl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevl3.setForeground(new java.awt.Color(0, 51, 51));
        sevl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sevl3.setText("Speciality");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("No.Patient");

        sevt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sevt1.setFocusable(false);

        sevt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sevt2.setFocusable(false);

        sevt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sevt3.setFocusable(false);
        sevt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevt3ActionPerformed(evt);
            }
        });

        sevt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sevt4.setFocusable(false);

        sevt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sevt5.setFocusable(false);

        sevt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sevt6.setFocusable(false);

        sevt7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sevt7.setFocusable(false);

        sevt8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sevt8.setFocusable(false);

        sevt9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sevt9.setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        sevl1.setBackground(new java.awt.Color(0, 153, 153));
        sevl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sevl1.setForeground(new java.awt.Color(0, 153, 153));
        sevl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sevl1.setText("HSM HOSPITAL");

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 151, 151));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Patient details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(sevl1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevl1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "p_name", "address", "place", "age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jScrollPane4.setViewportView(jScrollPane3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "p_name", "address", "place", "age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane5.setViewportView(jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "p_name", "address", "place", "age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jScrollPane6.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sevt4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sevt1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sevt7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sevl2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sevt5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sevt8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sevl3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sevt6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sevt9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sevt2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(sevt3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(sevl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sevl2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevt1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sevt2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sevt3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(sevt5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sevt4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sevt6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sevt7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sevt8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sevt9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sevt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevt3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_sevt3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
         Class.forName("com.mysql.cj.jdbc.Driver");
        
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment", "root", "root12345");
             System.out.println("connect");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select p_name,address,place,age from patient where d_id=1;");
            while(rs.next())
            {
                String p_name =rs.getString("p_name");
                 String address =rs.getString("address");
                  String place =rs.getString("place");
                   String age =String.valueOf(rs.getString("age"));
                   
                   String tb[] ={p_name,address,place,age};
                   DefaultTableModel tbm=(DefaultTableModel)jTable3.getModel();
                   tbm.addRow(tb);
                
            }
        }
        catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try {
         Class.forName("com.mysql.cj.jdbc.Driver");
        
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment", "root", "root12345");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select p_name,address,place,age from patient where d_id=2;");
            while(rs.next())
            {
                String p_name =rs.getString("p_name");
                 String address =rs.getString("address");
                  String place =rs.getString("place");
                   String age =String.valueOf(rs.getString("age"));
                   
                   String tb[] ={p_name,address,place,age};
                   DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
                   tbm.addRow(tb);
                
            }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try {
         Class.forName("com.mysql.cj.jdbc.Driver");
        
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment", "root", "root12345");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select p_name,address,place,age from patient where d_id=3;");
            while(rs.next())
            {
                String p_name =rs.getString("p_name");
                 String address =rs.getString("address");
                  String place =rs.getString("place");
                   String age =String.valueOf(rs.getString("age"));
                   
                   String tb[] ={p_name,address,place,age};
                   DefaultTableModel tbm=(DefaultTableModel)jTable2.getModel();
                   tbm.addRow(tb);
                
            }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Conn() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment", "root", "root12345");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select d_name,speciality from doctor where doctor_id=11;");
            for (int i = 0; rs.next(); i++) {
                sevt1.setText(rs.getString(1));
                sevt2.setText(rs.getString(2));

            }
            //Statement sa = con.createStatement();
            ResultSet ra = st.executeQuery("select d_name,speciality from doctor where doctor_id=22;");
            for (int i = 0; ra.next(); i++) {
                sevt4.setText(ra.getString(1));
                sevt5.setText(ra.getString(2));

            }
            ResultSet rb = st.executeQuery("select d_name,speciality from doctor where doctor_id=33;");
            for (int i = 0; rb.next(); i++) {
                sevt7.setText(rb.getString(1));
                sevt8.setText(rb.getString(2));

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) throws Exception {

        java.awt.EventQueue.invokeLater(() -> {
            server sr = new server();
            sr.setVisible(true);
            try {
                sr.Conn();
            } catch (Exception ex) {
                Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold
        
        ServerSocket ser = new ServerSocket(9999);
        while( !ser.isClosed())
        {
        Socket s = ser.accept();
        
        System.out.printf("New client connected");
        ServerThread st = new ServerThread(s);
        Thread thread = new Thread(st);
        thread.start();
        }
        
        

        
//        while(true){
//        BufferedReader BR=new BufferedReader(new InputStreamReader(s.getInputStream()));
//        String msg=BR.readLine();
//        System.out.println(msg);
//        switch(msg){
//            case "a":doc1++;
//                  break;
//           case "b":doc2++;
//                  break;
//           case "c":doc3++;
//                  break;
//           default:break;
//        }
//        
//        sevt3.setText(String.valueOf (doc1));
//        sevt6.setText(String.valueOf (doc2));
//        sevt9.setText(String.valueOf (doc3));
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel sevl1;
    private javax.swing.JLabel sevl2;
    private javax.swing.JLabel sevl3;
    private javax.swing.JTextField sevt1;
    private javax.swing.JTextField sevt2;
    public static javax.swing.JTextField sevt3;
    private javax.swing.JTextField sevt4;
    private javax.swing.JTextField sevt5;
    public static javax.swing.JTextField sevt6;
    private javax.swing.JTextField sevt7;
    private javax.swing.JTextField sevt8;
    public static javax.swing.JTextField sevt9;
    // End of variables declaration//GEN-END:variables

}
class ServerThread implements Runnable {

    public static ArrayList<ServerThread> Threads = new ArrayList<>();
    
    private Socket socket;
    public BufferedReader bufferedReader;
    public BufferedWriter bw;
    public ServerThread(Socket socket) {
        try {
            this.socket = socket;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
           //  System.out.println("new client connectesdsdsd");
            Threads.add(this);
            
         
            System.out.println("new client connected");
           
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public void update(String[] msg)
    {
       try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment", "root", "root12345");
            Statement st = con.createStatement();
        System.out.println(msg[1]+msg[2]+msg[3]+msg[4]);
            String sql ="insert into patient values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(4,Integer.parseInt(msg[4]));
            pst.setString(1,msg[1]);
             pst.setString(2,msg[2]);
             
              pst.setString(3,msg[3]);
              int x=0;
               switch(msg[0])
           {
               case "a" :x=1;
               break;
               case "b" :x=2;
               break;
               case "c" :x=3;
               break;
               
           }
        
              pst.setInt(5,x);
           //   String s1;
           //   s1=cl1t1.getText();
              //System.out.println(s1);
            pst.executeUpdate();
       }
       catch(Exception e)
       {
           
       }
       
    }
    @Override
    public void run() {
       // Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment", "root", "root12345");
            Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select d_name,speciality,appoinment_day,available_time from doctor where doctor_id=11 ;");
          String sta=null;
           String str=null;
            String stb=null;
           while(rs.next())
           {
               str= rs.getString(1)+"#"+rs.getString(2)+"#"+rs.getString(3)+"#"+rs.getString(4)+"#";
              //String abc=rs.getString(5)+"#"+rs.getString(6)+"#"+rs.getString(7)+"#"+rs.getString(8)+"#";
             // String ab=rs.getString(9)+"#"+rs.getString(10)+"#"+rs.getString(11)+"#"+rs.getString(12)+"#";
              System.out.println(str);
               //System.out.println(abc);
             //   System.out.println(ab);
                
                
        
           }
           ResultSet as = st.executeQuery("select d_name,speciality,appoinment_day,available_time from doctor where doctor_id=22 ;");
         
          
           while(as.next())
           {
               sta= as.getString(1)+"#"+as.getString(2)+"#"+as.getString(3)+"#"+as.getString(4)+"#";
              //String abc=rs.getString(5)+"#"+rs.getString(6)+"#"+rs.getString(7)+"#"+rs.getString(8)+"#";
             // String ab=rs.getString(9)+"#"+rs.getString(10)+"#"+rs.getString(11)+"#"+rs.getString(12)+"#";
              System.out.println(sta);
               //System.out.println(abc);
             //   System.out.println(ab);
                
                
        }
           ResultSet bs = st.executeQuery("select d_name,speciality,appoinment_day,available_time from doctor where doctor_id=33 ;");
         
          
           while(bs.next())
           {
               stb= bs.getString(1)+"#"+bs.getString(2)+"#"+bs.getString(3)+"#"+bs.getString(4)+"#";
              
                
                
        }
           //System.out.println(stb);
           String ab=str.concat(sta);
           String abc=ab.concat(stb);
           System.out.println(abc);
           bw.write(abc);
                 bw.newLine();
    
                bw.flush();
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
        String [] msg;
        while (socket.isConnected()) {
            try {
                msg = bufferedReader.readLine().split("#");
                
                System.out.println(msg);
        switch(msg[0]){
            case "a":server.doc1++;
                  break;
           case "b":server.doc2++;
                  break;
           case "c":server.doc3++;
                  break;
           default:break;
        }
        update(msg);
                
                    
                
       
        server.sevt3.setText(String.valueOf (server.doc1));
        server.sevt6.setText(String.valueOf (server.doc2));
        server.sevt9.setText(String.valueOf (server.doc3));
        
            } catch (IOException e) {
               
               
            }
        }
    }
}
//    public void db()throws Exception 
//    {
//          BufferedWriter BW =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//    Class.forName("com.mysql.cj.jdbc.Driver");
//        try {
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment", "root", "root123");
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("select d_name,speciality,appoinment_day,available_time from doctor  where doctor_id=11;");
//           // for (int i = 0; rs.next(); i++) {
//           while(rs.next())
//           {
//               String str= rs.getString(1)+"#"+rs.getString(2)+"#"+rs.getString(3)+"#"+rs.getString(4)+"#";
//               // sevt1.setText(rs.getString(1));
//                //sevt2.setText(rs.getString(2));
//                System.out.println(str);
//                BW.write(str);
//                 BW.newLine();
//    
//                BW.flush();
//            }
//}
//          catch (Exception e) {
//            System.out.println(e);
//        }
//}
//}
