/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.dao;

import beautyparlour.bean.DailyReportBean;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public interface ReportDao {
        public ArrayList<DailyReportBean> getDailyReportBean(String date);

}
