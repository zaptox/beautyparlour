/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.daoImpl;

import beautyparlour.bean.ServiceBeans;
import beautyparlour.dao.ServiceDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import beautyparlour.db.DbConnection;

/**
 *
 * @author Dell
 */
public class ServiceDaoImpl implements ServiceDao {

   // public Connection con = SqliteDBCon.LoadDb();
     public Connection con = DbConnection.conn;

    @Override
    public int addService(ServiceBeans s) {
        int i = 0;
        String query = "INSERT INTO services ( `service_name`, `service_cost`, `service_date`) VALUES ( ?, ?, ?); ";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, s.getService_name());
            ps.setDouble(2, s.getService_cost());
            ps.setString(3, s.getService_date());
           

            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in saving Service");
            e.printStackTrace();
        }
        return i;

    }

    @Override
    public ArrayList<ServiceBeans> getAllService() {
          
        ArrayList<ServiceBeans> service_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM services WHERE service_active=1";
            Statement ps = con.createStatement();

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int service_id = rs.getInt("service_id");
                String service_name = rs.getString("service_name");
                double service_cost = rs.getDouble("service_cost");
                int service_active = rs.getInt("service_active");
                String service_date = rs.getString("service_date");

               

                service_list.add(new ServiceBeans(service_id, service_name, service_cost, service_date, service_active));

            }
        } catch (Exception e) {
            System.out.println("Error in getting Service");
            e.printStackTrace();
        }

        return service_list;
    
    }

    @Override
    public int updateService(ServiceBeans serviceBeans) {
     int i = 0;
        String query = "UPDATE services SET `service_name` = ? , `service_cost` = ? ,"
                + " `service_date` = ?  WHERE `service_id` = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, serviceBeans.getService_name());
            ps.setDouble(2, serviceBeans.getService_cost());
            ps.setString(3, serviceBeans.getService_date());
            ps.setInt(4, serviceBeans.getService_id());
          

            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in modification of Service");
            e.printStackTrace();
        }
        return i;

    }

    @Override
    public int deleteService(ServiceBeans serviceBeans) {
           int i = 0;
        String query = "UPDATE services SET `service_active` = '0' WHERE `service_id` = ?  ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, serviceBeans.getService_id());

            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in deletion of Service");
            e.printStackTrace();
        }
        return i;

    }

     @Override
    public ServiceBeans getServiceById(int service_id) {
        ServiceBeans service = null;
        try {
            String query = "SELECT * FROM services WHERE service_active=1 AND service_id= "+service_id;
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int service_id1 = rs.getInt("service_id");
                String service_name = rs.getString("service_name");
                double service_cost= rs.getDouble("service_cost");
                String service_date= rs.getString("service_date");
                int service_status = rs.getInt("service_active");
                service = new ServiceBeans(service_id, service_name, service_cost, service_date, service_status);

            }
        } catch (Exception e) {
            System.out.println("Error in getting service");
            e.printStackTrace();
        }

        return service;

    }
    
    

}
