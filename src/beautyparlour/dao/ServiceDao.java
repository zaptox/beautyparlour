/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.dao;

import beautyparlour.bean.ServiceBeans;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public interface ServiceDao {
      public int addService(ServiceBeans serviceBeans);
    public ArrayList<ServiceBeans> getAllService();
    public int updateService(ServiceBeans serviceBeans);
    public int deleteService(ServiceBeans serviceBeans);
    public ServiceBeans getServiceById(int service_id);
    // public String getCompanyName(int company_id);
}
