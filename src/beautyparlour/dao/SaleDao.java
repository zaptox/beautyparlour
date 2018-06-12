/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.dao;


import beautyparlour.bean.SaleBeans;
import java.util.ArrayList;


/**
 *
 * @author Vksoni
 */
public interface SaleDao {
     public int saveSale(SaleBeans sale);
    public ArrayList<SaleBeans> getAllSales();
    public int modifySale(SaleBeans sale);
    public SaleBeans getSaleById(int sale_id);
    public int getSaleId();
   
}
