/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.daoImpl;


import beautyparlour.bean.CustomerServiceReportBean;
import beautyparlour.bean.DailyReportBean;
import beautyparlour.bean.DailyServiceReportBean;
import beautyparlour.dao.CustomerServiceReportDao;
import beautyparlour.dao.ServiceReportDao;
import beautyparlour.db.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class CustomerServiceReportDaoImpl1  implements CustomerServiceReportDao {
      public Connection con = DbConnection.conn;

    @Override
     public ArrayList<CustomerServiceReportBean> getCustomerServiceReport(String date) {
        ArrayList<CustomerServiceReportBean> dailyReportList = new ArrayList<>();
        try {
            String query = "SELECT COUNT(service_id) AS 'services',SUM(price) AS 'price',c.`customer_name`,sd.`sale_date`  \n" +
            "FROM sale_detail sd INNER JOIN customer c ON c.customer_id=sd.`customer_id` \n" +
            "WHERE EXTRACT(MONTH FROM sd.`sale_date`) = EXTRACT(MONTH FROM '"+date+"')\n" +
            "GROUP BY sd.`customer_id`";
            Statement ps = con.createStatement();

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                String customer_name = rs.getString("customer_name");
                int services = rs.getInt("services");
                double  price = rs.getDouble("price");
             
               

               

                dailyReportList.add(new CustomerServiceReportBean(customer_name, services, price));

            }
        } catch (Exception e) {
            System.out.println("Error in getting DailyReport");
            e.printStackTrace();
        }

        return dailyReportList;
    
    }

    
  
    
}
