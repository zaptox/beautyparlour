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
public class CustomerServiceReportBean {
    
    String customer;
    int services;
    double price;

    public CustomerServiceReportBean(String customer, int services, double price) {
        this.customer = customer;
        this.services = services;
        this.price = price;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getServices() {
        return services;
    }

    public void setServices(int services) {
        this.services = services;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
