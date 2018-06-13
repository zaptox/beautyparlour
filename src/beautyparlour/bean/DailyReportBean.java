/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.bean;

/**
 *
 * @author Dell
 */
public class DailyReportBean {
    int sale_id;
    String customer_name;
    String sale_date;
    double total_bill;

    public DailyReportBean(int sale_id, String customer_name, String sale_date, double total_bill) {
        this.sale_id = sale_id;
        this.customer_name = customer_name;
        this.sale_date = sale_date;
        this.total_bill = total_bill;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    public double getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(double total_bill) {
        this.total_bill = total_bill;
    }
    
    
           
}
