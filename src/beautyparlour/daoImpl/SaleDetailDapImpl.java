/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.daoImpl;

import beautyparlour.bean.SaleDetailBeans;
import beautyparlour.dao.SaleDetailsDao;
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
public class SaleDetailDapImpl implements SaleDetailsDao {

//    public Connection con = SqliteDBCon.LoadDb();
         public Connection con = DbConnection.conn;


    @Override
    public int saveSaleDetails(SaleDetailBeans detail) {
        int i = 0;
        String query = "INSERT INTO sale_detail (`sale_id`, `customer_id`, `service_id`, `sale_date`, `price`)"
                + " VALUES (?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, detail.getSale_id());
            ps.setInt(2, detail.getCustomer_id());
            ps.setInt(3, detail.getService_id());
            ps.setString(4, detail.getSale_date());
            ps.setDouble(5, detail.getPrice());
            
            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in saving Sale detail");
            e.printStackTrace();
        }
        return i;
    }

  @Override
    public ArrayList<SaleDetailBeans> getAllSaleDetailbyCustomerId(int customer_id1) {
        ArrayList<SaleDetailBeans> sale_details_list = new ArrayList<>();
        try {
            String query = "SELECT s.`sale_id`,s.`sale_date`,s.`price`,c.`customer_debt` FROM sale_detail s INNER JOIN customer c ON s.`customer_id`=c.`customer_id` WHERE c.`customer_id`= "+customer_id1;
            Statement ps = con.createStatement();

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
             int sale_detail_id = rs.getInt("sale_detail_id");
             int sale_id = rs.getInt("sale_id");
             int customer_id = rs.getInt("customer_id");
             int service_id= rs.getInt("service_id");
             String sale_date = rs.getString("sale_date");
             double price = rs.getDouble("price");
             
                    
             

                sale_details_list.add(new SaleDetailBeans(sale_detail_id, sale_id, customer_id, sale_id, query, sale_id));

            }
        } catch (Exception e) {
            System.out.println("Error in getting  customer Sales Details");
            e.printStackTrace();
        }

        return sale_details_list;
    }

    @Override
    public int modifySaleDetails(SaleDetailBeans details) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
