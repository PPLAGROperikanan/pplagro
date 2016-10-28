/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.mSuhu;
import views.Suhu;

/**
 *
 * @author ANGGA
 */
public class cSuhu {
    
    private mSuhu theModel;
    private Suhu theView;

    public cSuhu(mSuhu theModel, Suhu theView) {
        this.theModel = theModel;
        this.theView = theView;
        theView.setVisible(true);
    }
    
    
}
