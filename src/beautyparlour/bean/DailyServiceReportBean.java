/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.bean;

/**
 *
 * @author hp
 */
public class DailyServiceReportBean {
     int service_id;
    String service_name;
    int  customers;
    double amount;

    public DailyServiceReportBean(int sale_id, String service_name, int customers, double amount) {
        this.service_id = sale_id;
        this.service_name = service_name;
        this.customers = customers;
        this.amount = amount;
    }

    public int getSale_id() {
        return service_id;
    }

    public void setSale_id(int sale_id) {
        this.service_id = sale_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public int getCustomers() {
        return customers;
    }

    public void setCustomers(int customers) {
        this.customers = customers;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
