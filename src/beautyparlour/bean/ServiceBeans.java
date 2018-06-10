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
public class ServiceBeans {
    private Integer service_id;
    private String service_name;
    private double service_cost;
    private String service_date;
    private int service_status;

    public ServiceBeans(Integer service_id, String service_name, double service_cost, String service_date, int service_status) {
        this.service_id = service_id;
        this.service_name = service_name;
        this.service_cost = service_cost;
        this.service_date = service_date;
        this.service_status = service_status;
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public double getService_cost() {
        return service_cost;
    }

    public void setService_cost(double service_cost) {
        this.service_cost = service_cost;
    }

    public String getService_date() {
        return service_date;
    }

    public void setService_date(String service_date) {
        this.service_date = service_date;
    }

    public int getService_status() {
        return service_status;
    }

    public void setService_status(int service_status) {
        this.service_status = service_status;
    }
    
    
    
    
}
