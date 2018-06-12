/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.dao;

import beautyparlour.bean.CustomerBeans;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public interface CustomerDao {
    public int addCustomer(CustomerBeans customerBeans);
    public ArrayList<CustomerBeans> getAllCustomer();
    public int updateCustomer(CustomerBeans customerBeans);
    public int deleteCustomer(CustomerBeans customerBeans);
    public CustomerBeans getCustomerById(int customer_id);
    public Double getCustomerDebtByCustomerId(int cust_id);
    public int modifyCustomerDebt(int cust_id, double updatedDebt);
    // public String getCompanyName(int company_id);
}
