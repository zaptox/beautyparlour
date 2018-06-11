/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour;

/**
 *
 * @author hp
 */
import beautyparlour.db.DbConnection;
import beautyparlour.frames.HomePage;
import beautyparlour.frames.ServiceForm;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class Beautyparlour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("ok");
        DbConnection.load();
try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
//               UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
//               UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Beautyparlour.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Beautyparlour.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Beautyparlour.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Beautyparlour.class.getName()).log(Level.SEVERE, null, ex);
        }

        new HomePage().setVisible(true);
//       new  ServiceForm().setVisible(true);
        
    }
    
}
