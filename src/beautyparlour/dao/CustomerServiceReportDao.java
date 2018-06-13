/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.dao;

import beautyparlour.bean.CustomerServiceReportBean;
import beautyparlour.bean.DailyServiceReportBean;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public interface CustomerServiceReportDao {
    public ArrayList<CustomerServiceReportBean> getCustomerServiceReport(String date);
}
