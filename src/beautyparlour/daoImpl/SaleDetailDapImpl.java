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
    public ArrayList<SaleDetailBeans> getAllSaleDetailbyCustomerId(int customer_id1,String date ,int saleid ) {
        ArrayList<SaleDetailBeans> sale_details_list = new ArrayList<>();
        try {
            String query = "SELECT  s.`sale_detail_id`,s.`sale_id`,c.`customer_id`,s.`customer_id`,\n" +
"                 ser.`service_id`,\n" +
"                    s.`price`,s.`sale_date` FROM sale_detail s\n" +
"                    INNER JOIN customer c ON \n" +
"                    s.`customer_id`=c.`customer_id`INNER JOIN \n" +
"                    services ser ON s.`service_id`=ser.`service_id` \n" +
"                    INNER JOIN sale sl ON s.sale_id=sl.`sale_id`\n" +
"                    WHERE s.customer_id='"+customer_id1+"' AND s.`sale_date`='"+date+"' AND s.`sale_id`="+saleid+"  ORDER BY s.sale_detail_id DESC";
            Statement ps = con.createStatement();

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
             int sale_detail_id = rs.getInt("sale_detail_id");
             int sale_id = rs.getInt("sale_id");
             int customer_id = rs.getInt("customer_id");
             int service_id= rs.getInt("service_id");
             String sale_date = rs.getString("sale_date");
             double price = rs.getDouble("price");
           
             
           sale_details_list.add(new SaleDetailBeans(sale_detail_id, sale_id, customer_id, service_id, sale_date, price));

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
