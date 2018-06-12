/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.bean;


/**
 *
 * @author Vksoni
 */
public class SaleDetailBeans {

    private int sale_detail_id;
    private int sale_id;
    private int customer_id;
    private int service_id;
    private String sale_date;
    private double price;

    public SaleDetailBeans(int sale_detail_id, int sale_id, int customer_id, int service_id, String sale_date, double price) {
        this.sale_detail_id = sale_detail_id;
        this.sale_id = sale_id;
        this.customer_id = customer_id;
        this.service_id = service_id;
        this.sale_date = sale_date;
        this.price = price;
    }

    public int getSale_detail_id() {
        return sale_detail_id;
    }

    public void setSale_detail_id(int sale_detail_id) {
        this.sale_detail_id = sale_detail_id;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
}
