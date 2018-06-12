/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.frames;

import beautyparlour.bean.SaleBeans;
import beautyparlour.bean.SaleDetailBeans;
import beautyparlour.dao.CustomerDao;
import beautyparlour.dao.SaleDao;
import beautyparlour.dao.SaleDetailsDao;
import beautyparlour.dao.ServiceDao;
import beautyparlour.daoImpl.CustomerDaoImpl;
import beautyparlour.daoImpl.SaleDaoImpl;
import beautyparlour.daoImpl.SaleDetailDapImpl;
import beautyparlour.daoImpl.ServiceDaoImpl;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Vksoni
 */
public class CustomerDetails extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    DefaultTableModel tableModelCustomerSaleDetail;
    DefaultTableModel tableModelCustomerSale;
    public ArrayList<SaleDetailBeans> sale_details_list;
    public ArrayList<SaleBeans> sale_list;

    TableRowSorter<DefaultTableModel> rowSorter = null;
    ArrayList<SaleDetailBeans> sales_detail_list;
    SaleDetailsDao saleDeatail;
    SaleDao sale;
    ServiceDao servicedao;

    CustomerDao customerDao;
   // DebtDetailDao debtDao;
    int cust_id;

    public CustomerDetails() {
        initComponents();
       }
int customer_id;
    public CustomerDetails(int customer_id) {
        
        initComponents();
        this.customer_id=customer_id;
        saleDeatail = new SaleDetailDapImpl();
//        debtDao = new DebtDaoImpl();
        sale = new SaleDaoImpl();
        servicedao = new ServiceDaoImpl();
        tableModelCustomerSaleDetail = (DefaultTableModel) this.jTableCustomerSaleDetail.getModel();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelCustomerSaleDetail);
        this.jTableCustomerSaleDetail.setRowSorter(rowSorter);
        tableModelCustomerSale = (DefaultTableModel) this.jTableCustomerSale.getModel();

        JTableHeader header = this.jTableCustomerSaleDetail.getTableHeader();
       header.setBackground(new Color(102,204,255));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 14));
        JTableHeader header1 = this.jTableCustomerSale.getTableHeader();
         header.setBackground(new Color(102,204,255));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 14));

        customerDao = new CustomerDaoImpl();
        this.jButtonUpdateMoney.setVisible(false);
        this.jButtonUpdate.setVisible(true);
        this.jTextFieldUpdateMoney.setVisible(false);
        this.jSeparatorUpdate.setVisible(false);
        this.jLabelCustomerName.setText(customerDao.getCustomerById(customer_id).getCustomer_name());
    //showInCustomerSalesDetailTable(customer_id,"2018-06-12");
        showInSaleTable(customer_id);
        this.jLabelCustomerDebt.setText(""+ customerDao.getCustomerById(customer_id).getCustomer_dept());
        //showCustomerDebt(customer_id);
        this.jLabelAddMoney.setVisible(false);
        cust_id = customer_id;
        
        
  

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCustomerSaleDetail = new javax.swing.JTable();
        jSeparatorUpdate = new javax.swing.JSeparator();
        jTextFieldSerach = new javax.swing.JTextField();
        jLabelAddMoney = new javax.swing.JLabel();
        jLabelCustomerName = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabelCustomerDebt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonUpdateMoney = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldUpdateMoney = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCustomerSale = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCustomerSaleDetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTableCustomerSaleDetail.setForeground(new java.awt.Color(0, 0, 51));
        jTableCustomerSaleDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sale Id ", "Services", "cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCustomerSaleDetail.setToolTipText("Products");
        jTableCustomerSaleDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCustomerSaleDetail.setGridColor(new java.awt.Color(0, 0, 51));
        jTableCustomerSaleDetail.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTableCustomerSaleDetail.setSelectionForeground(new java.awt.Color(0, 240, 0));
        jTableCustomerSaleDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCustomerSaleDetailMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCustomerSaleDetail);
        if (jTableCustomerSaleDetail.getColumnModel().getColumnCount() > 0) {
            jTableCustomerSaleDetail.getColumnModel().getColumn(0).setMinWidth(50);
            jTableCustomerSaleDetail.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableCustomerSaleDetail.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableCustomerSaleDetail.getColumnModel().getColumn(1).setMinWidth(110);
            jTableCustomerSaleDetail.getColumnModel().getColumn(1).setPreferredWidth(110);
            jTableCustomerSaleDetail.getColumnModel().getColumn(1).setMaxWidth(110);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 330, 470));
        jPanel1.add(jSeparatorUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, -1));

        jTextFieldSerach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSerach.setBorder(null);
        jTextFieldSerach.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldSerach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSerachMouseClicked(evt);
            }
        });
        jTextFieldSerach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSerachActionPerformed(evt);
            }
        });
        jTextFieldSerach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSerachKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerachKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldSerach, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 280, 40));

        jLabelAddMoney.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAddMoney.setText("Add Money:");
        jPanel1.add(jLabelAddMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        jLabelCustomerName.setBackground(new java.awt.Color(102, 204, 255));
        jLabelCustomerName.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabelCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCustomerName.setText("Customer name");
        jLabelCustomerName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 1, true));
        jLabelCustomerName.setOpaque(true);
        jPanel1.add(jLabelCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 460, 50));

        jButtonBack.setBackground(new java.awt.Color(0, 204, 204));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setText("Back");
        jButtonBack.setFocusPainted(false);
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jLabelCustomerDebt.setBackground(new java.awt.Color(102, 204, 255));
        jLabelCustomerDebt.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 36)); // NOI18N
        jLabelCustomerDebt.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCustomerDebt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCustomerDebt.setText("0.0");
        jLabelCustomerDebt.setOpaque(true);
        jPanel1.add(jLabelCustomerDebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Search");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 22, 60, 30));

        jButtonUpdateMoney.setBackground(new java.awt.Color(102, 204, 255));
        jButtonUpdateMoney.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonUpdateMoney.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateMoney.setText("Update Money");
        jButtonUpdateMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateMoneyActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdateMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 230, 30));

        jButtonUpdate.setBackground(new java.awt.Color(102, 204, 255));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 230, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 280, 20));

        jTextFieldUpdateMoney.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldUpdateMoney.setBorder(null);
        jTextFieldUpdateMoney.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldUpdateMoney.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUpdateMoneyMouseClicked(evt);
            }
        });
        jTextFieldUpdateMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUpdateMoneyActionPerformed(evt);
            }
        });
        jTextFieldUpdateMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUpdateMoneyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUpdateMoneyKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldUpdateMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Remaining Money:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, -1));

        jTableCustomerSale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTableCustomerSale.setForeground(new java.awt.Color(0, 0, 51));
        jTableCustomerSale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sale Id ", "Sale Date", "Total Amount", "Paid", "Remaining"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCustomerSale.setToolTipText("Customer Record");
        jTableCustomerSale.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCustomerSale.setGridColor(new java.awt.Color(0, 0, 51));
        jTableCustomerSale.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTableCustomerSale.setSelectionForeground(new java.awt.Color(0, 240, 0));
        jTableCustomerSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCustomerSaleMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableCustomerSaleMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTableCustomerSale);
        if (jTableCustomerSale.getColumnModel().getColumnCount() > 0) {
            jTableCustomerSale.getColumnModel().getColumn(0).setMinWidth(50);
            jTableCustomerSale.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableCustomerSale.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableCustomerSale.getColumnModel().getColumn(1).setMinWidth(110);
            jTableCustomerSale.getColumnModel().getColumn(1).setPreferredWidth(110);
            jTableCustomerSale.getColumnModel().getColumn(1).setMaxWidth(110);
            jTableCustomerSale.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTableCustomerSale.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTableCustomerSale.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 520, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 570));

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Signature Beauty Parlour");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 564, 1150, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableCustomerSaleDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerSaleDetailMouseClicked


    }//GEN-LAST:event_jTableCustomerSaleDetailMouseClicked

    private void jTextFieldSerachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSerachMouseClicked

    }//GEN-LAST:event_jTextFieldSerachMouseClicked

    private void jTextFieldSerachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSerachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSerachActionPerformed

    private void jTextFieldSerachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerachKeyPressed

    }//GEN-LAST:event_jTextFieldSerachKeyPressed

    private void jTextFieldSerachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerachKeyReleased
        // TODO add your handling code here:
        String searchData = this.jTextFieldSerach.getText();
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchData));

    }//GEN-LAST:event_jTextFieldSerachKeyReleased

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new ShowCustomerPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonUpdateMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateMoneyActionPerformed
        // TODO add your handling code here:
        try {
            double debt = Double.parseDouble("" + this.jLabelCustomerDebt.getText());
            double addMoney = Double.parseDouble(this.jTextFieldUpdateMoney.getText());
            double newDebt = debt - addMoney;

            customerDao.modifyCustomerDebt(cust_id, newDebt);
           

            showCustomerDebt(cust_id);
        } catch (Exception e) {
        }
        this.jButtonUpdate.setVisible(true);
        this.jButtonUpdateMoney.setVisible(false);
        this.jTextFieldUpdateMoney.setVisible(false);
        this.jLabelAddMoney.setVisible(false);
        this.jSeparatorUpdate.setVisible(false);
        

    }//GEN-LAST:event_jButtonUpdateMoneyActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:

        this.jButtonUpdate.setVisible(false);
        this.jTextFieldUpdateMoney.setVisible(true);
        this.jLabelAddMoney.setVisible(true);

        this.jSeparatorUpdate.setVisible(true);
        this.jButtonUpdateMoney.setVisible(true);
     

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldUpdateMoneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUpdateMoneyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUpdateMoneyMouseClicked

    private void jTextFieldUpdateMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUpdateMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUpdateMoneyActionPerformed

    private void jTextFieldUpdateMoneyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUpdateMoneyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUpdateMoneyKeyPressed

    private void jTextFieldUpdateMoneyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUpdateMoneyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUpdateMoneyKeyReleased

    private void jTableCustomerSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerSaleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCustomerSaleMouseClicked

    private void jTableCustomerSaleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerSaleMouseReleased
        // TODO add your handling code here:
       String date = sale_list.get( this.jTableCustomerSale.getSelectedRow()).getSale_date();
       int sale_id=sale_list.get( this.jTableCustomerSale.getSelectedRow()).getSale_id();
      //  System.out.println(""+date);
        showInCustomerSalesDetailTable(customer_id,date,sale_id);
        
    }//GEN-LAST:event_jTableCustomerSaleMouseReleased

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
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }

    public void showInCustomerSalesDetailTable(int customer_id,String date,int saleId ) {
        tableModelCustomerSaleDetail.setRowCount(0);
        int counter = 1;
        ServiceDao ser = new ServiceDaoImpl();
        sale_details_list = saleDeatail.getAllSaleDetailbyCustomerId(customer_id,date,saleId);
        for (SaleDetailBeans salesDetails : sale_details_list) {
            Vector V = new Vector();
            V.add(salesDetails.getSale_id());
            V.add(ser.getServiceById(salesDetails.getService_id()).getService_name());
            V.add(salesDetails.getPrice());
            

            tableModelCustomerSaleDetail.addRow(V);
        }
    }


    public void showInSaleTable(int customer_id) {
        tableModelCustomerSale.setRowCount(0);
        sale_list = sale.getAllSalesByCustomId(customer_id);
        for (SaleBeans salesDetails : sale_list) {
            Vector V = new Vector();
            V.add(salesDetails.getSale_id());
            V.add(salesDetails.getSale_date());
            V.add(salesDetails.getTotal_bill());
            V.add(salesDetails.getPaid());
            V.add(salesDetails.getTotal_bill()-salesDetails.getPaid());
           
           

            tableModelCustomerSale.addRow(V);
        }
    }

    public void showCustomerDebt(int customer_id) {
        this.jLabelCustomerDebt.setText("" + customerDao.getCustomerDebtByCustomerId(customer_id));
    }

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonUpdateMoney;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAddMoney;
    private javax.swing.JLabel jLabelCustomerDebt;
    private javax.swing.JLabel jLabelCustomerName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparatorUpdate;
    private javax.swing.JTable jTableCustomerSale;
    private javax.swing.JTable jTableCustomerSaleDetail;
    private javax.swing.JTextField jTextFieldSerach;
    private javax.swing.JTextField jTextFieldUpdateMoney;
    // End of variables declaration//GEN-END:variables
}
