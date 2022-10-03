
package doctorbooking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amalp
 */
public class client extends javax.swing.JFrame {
    
     static String name;
      static String address;
       static String place;
        static String age;
         static String doc;
    private static Socket ss;
   // private BufferedWriter BR;
    private static BufferedWriter BW;
    /**
     * Creates new form client
     */
    public  static void send(String dr)
    {
        
          if(ss.isConnected()){
        try {
           
         BW.write(dr);
         BW.newLine();
          BW.flush();
      
    //   PrintWriter pwrite = new PrintWriter(ostream, true);
      // pwrite.println("booking");
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }}
      
      //  BW.write(name);
    }
    public client(Socket s) throws IOException {
        initComponents();
        this.ss =s;
        this.BW=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
       // this.BR = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ct1 = new javax.swing.JTextField();
        ct2 = new javax.swing.JTextField();
        ct4 = new javax.swing.JTextField();
        ct5 = new javax.swing.JTextField();
        ct3 = new javax.swing.JTextField();
        ct6 = new javax.swing.JTextField();
        cb2 = new javax.swing.JButton();
        cb1 = new javax.swing.JButton();
        cb3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ct7 = new javax.swing.JTextField();
        ct8 = new javax.swing.JTextField();
        ct9 = new javax.swing.JTextField();
        ct10 = new javax.swing.JTextField();
        ct11 = new javax.swing.JTextField();
        ct12 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cl1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ct1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct1.setFocusable(false);
        jPanel1.add(ct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 165, 95, 31));

        ct2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct2.setFocusable(false);
        jPanel1.add(ct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 95, 31));

        ct4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct4.setFocusable(false);
        jPanel1.add(ct4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 95, 31));

        ct5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct5.setFocusable(false);
        jPanel1.add(ct5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 283, 95, 31));

        ct3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct3.setFocusable(false);
        jPanel1.add(ct3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 224, 95, 31));

        ct6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct6.setFocusable(false);
        jPanel1.add(ct6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 95, 31));

        cb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb2.setText("Booking");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        jPanel1.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 31));

        cb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb1.setText("Booking");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel1.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, 31));

        cb3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb3.setText("Booking");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        jPanel1.add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, 31));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 95, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Speciality");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 116, 95, 31));

        ct7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct7.setFocusable(false);
        jPanel1.add(ct7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 95, 31));

        ct8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct8.setFocusable(false);
        jPanel1.add(ct8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 95, 31));

        ct9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct9.setFocusable(false);
        jPanel1.add(ct9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 95, 31));

        ct10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct10.setFocusable(false);
        jPanel1.add(ct10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 95, 31));

        ct11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct11.setFocusable(false);
        jPanel1.add(ct11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 95, 31));

        ct12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ct12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct12.setFocusable(false);
        jPanel1.add(ct12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 95, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Appoinment Day");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Available Time");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, 31));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        cl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cl1.setForeground(new java.awt.Color(0, 153, 153));
        cl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cl1.setText("HSM HOSPITAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cl1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 306, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cl1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\amalp\\OneDrive\\Desktop\\cn\\project\\OIP (1).jpg")); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(350, 220));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 350, 260));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\amalp\\OneDrive\\Desktop\\cn\\project\\OIP (1).jpg")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 340, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, Short.MAX_VALUE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//int r=0;
    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
    
       
     //  r++;
        // TODO add your handling code here:
       // dispose();
     
       client1 cn= new client1("a");
        
        cn.show();
    }//GEN-LAST:event_cb1ActionPerformed
 //int a=0;
    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
       
       // a++;
//         if(ss.isConnected()){
//        try {
//         //  String s1;
//          
//           // s1=demo.getText();
//          //  BR.write(s1);
//         BW.write("b" );
//         BW.newLine();
//          BW.flush();
//      
//    //   PrintWriter pwrite = new PrintWriter(ostream, true);
//      // pwrite.println("booking");
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }}
      
       client1 cn= new client1("b");
        
        cn.show();
    }//GEN-LAST:event_cb2ActionPerformed
 // int b=0;
    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
      
    //    b++;
//         if(ss.isConnected()){
//        try {
//           
//         BW.write("c" );
//         BW.newLine();
//          BW.flush();
//      
//    //   PrintWriter pwrite = new PrintWriter(ostream, true);
//      // pwrite.println("booking");
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }}
//      
       client1 cn= new client1("c");
        
        cn.show();
    }//GEN-LAST:event_cb3ActionPerformed
 public void Conn()throws Exception
    {
       
//        Class.forName("com.mysql.cj.jdbc.Driver");    
//        try {
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment","root","root123") ;
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("select d_name,speciality,appoinment_day,available_time from doctor where doctor_id=11;");
//            for(int i=0;rs.next();i++)
//            {
//                ct1.setText(rs.getString(1));
//                ct2.setText(rs.getString(2));
//                ct7.setText(rs.getString(3));
//              ct8.setText(rs.getString(4));
//             
//            }     
//              //Statement sa = con.createStatement();
//             ResultSet ra = st.executeQuery("select d_name,speciality,appoinment_day,available_time from doctor where doctor_id=22;");
//            for(int i=0;ra.next();i++)
//            {
//                ct3.setText(ra.getString(1));
//                ct4.setText(ra.getString(2));
//               ct10.setText(ra.getString(3));
//                ct9.setText(ra.getString(4));
//            }     
//             ResultSet rb = st.executeQuery("select d_name,speciality,appoinment_day,available_time  from doctor where doctor_id=33;");
//            for(int i=0;rb.next();i++)
//            {
//                ct5.setText(rb.getString(1));
//                ct6.setText(rb.getString(2));
//                 ct12.setText(rb.getString(3));
//                 ct11.setText(rb.getString(4));
//              
//            }     
        
        
//    }
//        catch(SQLException e)
//        {
//            System.out.println(e);
//        }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        
         try {
           Socket  s = new Socket("localhost",9999);
          //BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
       
          
        System.out.printf("client connected");
      //  java.awt.EventQueue.invokeLater(() -> {
               try {
                   client sr =  new client(s);
                   sr.setVisible(true);
                   BufferedReader br  =new BufferedReader(new InputStreamReader(s.getInputStream()));
       StringBuffer sb = new StringBuffer();
String line ;
int i=0;

while ((line = br.readLine()) != null) {
  //System.out.println(line);
   // sb.append(line);
   // str=br.readLine();
String[] split_array = line.split("#");
//if(split_array [0].equals("0"))
//{
//System.out.println(split_array.length);
for (int j=0; j < split_array.length;)
{
   // System.out.println(split_array[j]);
ct1.setText(split_array [j]);
ct2.setText(split_array [j+1]);
ct7.setText(split_array [j+2]);
ct8.setText(split_array [j+3]);
ct3.setText(split_array [j+4]);
ct4.setText(split_array [j+5]);
ct10.setText(split_array [j+6]);
ct9.setText(split_array [j+7]);
ct5.setText(split_array [j+8]);
ct6.setText(split_array [j+9]);
ct12.setText(split_array [j+10]);
ct11.setText(split_array [j+11]);
 
//j++;
}
//}else if(split_array [0].equals("1"))
{
    
}
               }

               } catch (Exception ex) {
                   System.out.println(ex);
               }

        }
       catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cb1;
    private javax.swing.JButton cb2;
    private javax.swing.JButton cb3;
    private javax.swing.JLabel cl1;
    public static javax.swing.JTextField ct1;
    public static javax.swing.JTextField ct10;
    public static javax.swing.JTextField ct11;
    public static javax.swing.JTextField ct12;
    public static javax.swing.JTextField ct2;
    public static javax.swing.JTextField ct3;
    public static javax.swing.JTextField ct4;
    public static javax.swing.JTextField ct5;
    public static javax.swing.JTextField ct6;
    public static javax.swing.JTextField ct7;
    public static javax.swing.JTextField ct8;
    public static javax.swing.JTextField ct9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
