/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.daoImpl;

import beautyparlour.bean.SaleBeans;
import beautyparlour.dao.SaleDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import beautyparlour.db.DbConnection;


/**
 *
 * @author Vksoni
 */
public class SaleDaoImpl implements SaleDao {

//    public Connection con = SqliteDBCon.LoadDb();
//    public Connection con = SqliteDBCon.LoadDb();
     public Connection con = DbConnection.conn;

    @Override
    public int saveSale(SaleBeans sale) {
        int i = 0;
        String query = "INSERT INTO sale (`customer_id`, `discount_type`, `discount`, `total_bill`, `paid`, `sale_date`) "
                + "VALUES (?, ?, ?, ?, ?, ?);  ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, sale.getCustomer_id());
            ps.setString(2, sale.getDiscount_type());
            ps.setFloat(3, sale.getDiscount());
            ps.setDouble(4, sale.getTotal_bill());
            ps.setDouble(5, sale.getPaid());
            ps.setString(6, sale.getSale_date());
            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in saving Sale");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public ArrayList<SaleBeans> getAllSales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modifySale(SaleBeans sale) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SaleBeans getSaleById(int sale_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public ArrayList<SaleBeans> getAllSalesByCustomId(int custo_id) {
  ArrayList<SaleBeans> sale_list = new ArrayList<>();
        try {
            String query = "SELECT  sl.sale_id,sl.total_bill, sl.paid, sl.sale_date,c.customer_name FROM customer c,sale sl WHERE  sl.`customer_id`=c.`customer_id` AND sl.`customer_id`="+custo_id;
            Statement ps = con.createStatement();

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int sale_id = rs.getInt("sale_id");
                double total_bill = rs.getDouble("total_bill");
                float paid = rs.getFloat("paid");
                String sale_date = rs.getString("sale_date");
                String customer_name = rs.getString("customer_name");
                
                sale_list.add(new SaleBeans(sale_id, custo_id, 1, "", 0, total_bill, paid, sale_date));
              
                
                


            }
        } catch (Exception e) {
            System.out.println("Error in getting Customer");
            e.printStackTrace();
        }

        return sale_list;
    }

    @Override
    public int getSaleId() {
        int sale_id=-1;
        try {
            String query = "SELECT sale_id FROM sale ORDER BY sale_id DESC LIMIT 1;";
            Statement ps = con.createStatement();

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                sale_id = rs.getInt("sale_id");
               

            }
        } catch (Exception e) {
            System.out.println("Error in getting customer");
            e.printStackTrace();
        }

        return sale_id;
    }

}
