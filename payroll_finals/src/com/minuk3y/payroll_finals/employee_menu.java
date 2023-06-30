/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.minuk3y.payroll_finals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class employee_menu extends javax.swing.JFrame {
    Connection con;
    PreparedStatement insert;
    String name;
    String department;
    int hr_per_week;
    int rate_per_hr;
    int tax_rate;
    String hrperweek;
    String rateperhr;
    String taxrate;

    /**
     * Creates new form employee_menu
     */
    public employee_menu() {
        try {
                
            Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","");
                insert = con.prepareStatement("select employee_name, department, hr_per_week, rate_per_hr, tax from employees where employee_name=?");
                insert.setString(1, owner_menu.editselectedValue.toString());
                ResultSet rs = insert.executeQuery();
                if(rs.next()){
                    name = rs.getString("employee_name");
                    department = rs.getString("department");
                    hr_per_week = rs.getInt("hr_per_week");
                    hrperweek = Integer.toString(hr_per_week);
                    rate_per_hr = rs.getInt("rate_per_hr");
                    rateperhr = Integer.toString(rate_per_hr);
                    tax_rate = rs.getInt("tax");
                    taxrate = Integer.toString(tax_rate);
                    
                    
                }
               
            } catch (Exception ex) {
                System.out.println(ex);
            }
        initComponents();
        jt_employeename.setText(name);
        jt_department.setText(department); 
        if ("0".equals(rateperhr)){
            jt_rphr.setText("");
        }
        else{
            jt_rphr.setText(rateperhr);
        }
        if ("0".equals(hrperweek)){
            jt_hrpw.setText("");
        }
        else{
            jt_hrpw.setText(hrperweek);
        }
        if ("0".equals(taxrate)){
            jt_tax.setText("");
        }
        else{
            jt_tax.setText(taxrate);
        }
        
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Login_title = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        b_edit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jt_hrpw = new javax.swing.JTextField();
        jt_rphr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jt_department = new javax.swing.JTextField();
        jt_employeename = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jt_tax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Login_title.setFont(new java.awt.Font("A-OTF Shin Go Pro EL", 0, 18)); // NOI18N
        Login_title.setText("Employee Evaluation");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("A-OTF Shin Go Pro R", 0, 12))); // NOI18N

        b_edit.setText("Edit");
        b_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editActionPerformed(evt);
            }
        });

        jLabel1.setText("Employee Name:");

        jLabel2.setText("Hour Per Week: ");

        jLabel3.setText("Rate per Hour:");

        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jt_hrpw.setFont(new java.awt.Font("A-OTF Shin Go Pro EL", 1, 12)); // NOI18N
        jt_hrpw.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jt_hrpw.setToolTipText("");
        jt_hrpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_hrpwActionPerformed(evt);
            }
        });

        jt_rphr.setFont(new java.awt.Font("A-OTF Shin Go Pro EL", 1, 12)); // NOI18N
        jt_rphr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_rphrActionPerformed(evt);
            }
        });

        jLabel5.setText("Department:");

        jt_employeename.setEditable(false);

        jLabel4.setText("Tax Rate:");

        jt_tax.setFont(new java.awt.Font("A-OTF Shin Go Pro EL", 1, 14)); // NOI18N
        jt_tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_taxActionPerformed(evt);
            }
        });

        jLabel6.setText("%");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(b_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_rphr)
                                    .addComponent(jt_hrpw)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jt_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jt_department, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jt_employeename, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_employeename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jt_hrpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jt_rphr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_edit)
                    .addComponent(jButton1))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(Login_title)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Login_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        owner_menu om = new owner_menu();
        om.combobox_update();
        om.setVisible(true);;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editActionPerformed
        name = jt_employeename.getText();
        department = jt_department.getText();
        hrperweek = jt_hrpw.getText();
        rateperhr = jt_rphr.getText();
        taxrate = jt_tax.getText();
        
        int hpw = Integer.parseInt(hrperweek);
        int rpr = Integer.parseInt(rateperhr);
        int taxr = Integer.parseInt(taxrate);
        
        double grosspay = hpw * rpr;
        double tax = taxr * grosspay / 100;
        double totalgrosspay = grosspay - tax;
        
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","");
                insert = con.prepareStatement("update employees set department=?,hr_per_week=?,rate_per_hr=?, tax=?, pay=? where employee_name=?");
                insert.setString(1, department);
                insert.setInt(2, hpw);
                insert.setInt(3, rpr);
                insert.setInt(4, taxr);
                insert.setDouble(5, totalgrosspay); 
                insert.setString(6, name);
                insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Record Updated!");
            setVisible(false);
            owner_menu om = new owner_menu();
            om.combobox_update();
            om.setVisible(true);
                
            
            
            } catch (Exception ex) {
                System.out.println(ex);
            } 
    }//GEN-LAST:event_b_editActionPerformed

    private void jt_rphrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_rphrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_rphrActionPerformed

    private void jt_hrpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_hrpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_hrpwActionPerformed

    private void jt_taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_taxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_taxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login_title;
    private javax.swing.JButton b_edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jt_department;
    private javax.swing.JTextField jt_employeename;
    private javax.swing.JTextField jt_hrpw;
    private javax.swing.JTextField jt_rphr;
    private javax.swing.JTextField jt_tax;
    // End of variables declaration//GEN-END:variables
}