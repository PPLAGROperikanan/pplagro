/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.mHome_pengelola;
import models.mInduk;
import models.mLogin;
import models.mSuhu;
import views.Induk;
import views.Login;
import views.Suhu;
import views.home_pengelola;

/**
 *
 * @author ANGGA
 */
public class cHome_pengelola {
    
    private mHome_pengelola theModel;
    private home_pengelola theView;

    public cHome_pengelola(mHome_pengelola theModel, home_pengelola theView) {
        this.theModel = theModel;
        this.theView = theView;
        theView.setVisible(true);
        theView.menuTombol(false);
        this.theView.addIndukanListener(new indukanListener());
        this.theView.addKolamListener(new kolamListener());
        this.theView.addLogoutListener(new logoutListener());
        this.theView.addSuhuListener(new suhuListener());
    }

    private class suhuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Suhu a = new Suhu();
            a.setVisible(true);
            home_pengelola.getInstance().DekstopPane(a);
            
            cSuhu theController = new cSuhu(new mSuhu(), a);
            System.out.println("oke");
        }
    }

    private class logoutListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.dispose();
            Login a = new Login();
            try {
                cLogin theController = new cLogin(new mLogin(), a);
            } catch (SQLException ex) {
                Logger.getLogger(cHome_pengelola.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class kolamListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.menuTombol(true);
        }
    }

    private class indukanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.menuTombol(false);
            Induk induk = new Induk();
            induk.setVisible(true);
            home_pengelola.getInstance().DekstopPane(induk);
            try {
                cInduk theController = new cInduk(new mInduk(),induk);
            } catch (SQLException ex) {
                Logger.getLogger(cHome_pengelola.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
