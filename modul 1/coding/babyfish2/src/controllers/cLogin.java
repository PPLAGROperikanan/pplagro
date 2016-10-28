/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.mHome_pengelola;
import models.mLogin;
import views.Login;
import views.home_pengelola;

/**
 *
 * @author ANGGA
 */
public class cLogin {

    private mLogin theModel;
    private Login theView;

    public cLogin(mLogin theModel, Login theView) {
        this.theModel = theModel;
        this.theView = theView;
        theView.setVisible(true);
        this.theView.addLoginListener(new loginListener());
        this.theView.addExitListener(new exitListener());
    }

    private class exitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class loginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                theModel.Login(theView.getUsername(), theView.getPassword());
                if (theModel.getStatus().equalsIgnoreCase("")) {
                    theView.getConfirm();
                } else {
                    theView.dispose();
                    home_pengelola a = home_pengelola.getInstance();
                    cHome_pengelola theController = new cHome_pengelola(new mHome_pengelola(), a);
                    System.out.println("Berhasil");
                }
            } catch (Exception ee) {
                theView.getConfirm();
            }

        }
    }

}
