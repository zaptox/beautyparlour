/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.dao;

import beautyparlour.bean.SaleDetailBeans;
import java.util.ArrayList;


/**
 *
 * @author Vksoni
 */
public interface SaleDetailsDao {

    public int saveSaleDetails(SaleDetailBeans detail);

    public ArrayList<SaleDetailBeans> getAllSaleDetailbyCustomerId(int customer_id);

    public int modifySaleDetails(SaleDetailBeans details);


}
