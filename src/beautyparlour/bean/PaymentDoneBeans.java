/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.bean;

import beautyparlour.bean.ServiceBeans;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class PaymentDoneBeans {
private   String  date;
private Float discount;
private String discount_type;
private Double total_price;
private int customer_id;
private ArrayList<ServiceBeans> selected_service_list;
Boolean sale_customer;

    public PaymentDoneBeans(String date, Float discount, String discount_type, Double total_price, int customer_id, ArrayList<ServiceBeans> selected_service_list, Boolean sale_customer) {
        this.date = date;
        this.discount = discount;
        this.discount_type = discount_type;
        this.total_price = total_price;
        this.customer_id = customer_id;
        this.selected_service_list = selected_service_list;
        this.sale_customer = sale_customer;
    }

    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public String getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(String discount_type) {
        this.discount_type = discount_type;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public ArrayList<ServiceBeans> getSelected_service_list() {
        return selected_service_list;
    }

    public void setSelected_service_list(ArrayList<ServiceBeans> selected_service_list) {
        this.selected_service_list = selected_service_list;
    }

    public Boolean getSale_customer() {
        return sale_customer;
    }

    public void setSale_customer(Boolean sale_customer) {
        this.sale_customer = sale_customer;
    }

    

    


}
