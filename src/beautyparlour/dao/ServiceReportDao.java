/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.dao;

import beautyparlour.bean.DailyServiceReportBean;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public interface ServiceReportDao {
    public ArrayList<DailyServiceReportBean> getDailyReportBean(String date);
}
