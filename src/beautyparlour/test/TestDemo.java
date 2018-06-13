/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.test;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import beautyparlour.db.DbConnection;

/**
 *
 * @author hp
 */
public class TestDemo {
    
     private static Connection con = DbConnection.conn;
     
    public int saveCustomer(int num) {
     
        int i = 0;
        String query = "INSERT INTO `services` ( `service_name`, `service_cost`, `service_date`) VALUES ( 'Hair color "+num+"', '100', '2018-06-13');";
        try {
                Statement statement = con.createStatement();
            

            i = statement.executeUpdate(query);

        } catch (Exception e) {

            System.out.println("Error in saving Customer");
            e.printStackTrace();
        }
        return i;
    }
  
    
    public String showMac(){
    	InetAddress ip;
        String macaddress="";
	try {
			
		ip = InetAddress.getLocalHost();
		//System.out.println("Current IP address : " + ip.getHostAddress());
		
		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			
		byte[] mac = network.getHardwareAddress();
			
	
			
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
		}
                 macaddress=sb.toString();
		
			
	} catch (UnknownHostException e) {
		
		e.printStackTrace();
		
	} catch (SocketException e){
			
		e.printStackTrace();
			
	}
        return macaddress;
    }
}
