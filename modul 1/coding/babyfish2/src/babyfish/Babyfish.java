/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babyfish;

import controllers.cLogin;
import java.sql.SQLException;
import javax.swing.UnsupportedLookAndFeelException;
import models.mLogin;
import views.Login;

/**
 *
 * @author ANGGA
 */
public class Babyfish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, SQLException {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        
        Login theView = new Login();
        mLogin theModel = new mLogin();
        cLogin theController = new cLogin(theModel, theView);
    }
    
}
