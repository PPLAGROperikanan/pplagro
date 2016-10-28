/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.mInduk;
import views.Induk;

/**
 *
 * @author alam
 */
public class cInduk {
    private mInduk theModel;
    private Induk theView;
    
    public cInduk(mInduk theModel, Induk theView) throws SQLException{
        this.theModel = theModel;
        this.theView = theView;
        theView.setTabelModel(theModel.getTabelModel());
        theView.setVisible(true);
        this.theView.SimpanListener(new SimpanPerformed());
        this.theView.BatalListener(new BatalPerformed());
        this.theView.FilterListener(new filterListener());
        this.theView.TabelListener(new KlikTabelPerformed());
        this.theView.TidakListener(new TidakPerformed());
    }

    private class filterListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                theView.setTabelModel(theModel.getTabelModelFilter(theView.getFilter()));
            } catch (SQLException ex) {
                Logger.getLogger(cInduk.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class SimpanPerformed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (theView.getKolam() == 0 ||theView.getInduk().equalsIgnoreCase("") || theView.getBerat().equalsIgnoreCase("") ) {
                    theView.Message("Pastikan Semua Data Terisi");
                }
                else{
                    theModel.Tambah(theView.getKolam(), theView.getInduk(), theView.getBerat());
                    theView.Message("Data Berhasil Disimpan");
                    theView.setKosong(null, null);
                }
                
                theView.setTabelModel(theModel.getTabelModel());
            } catch (SQLException ex) {
                Logger.getLogger(cInduk.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
    
    private class BatalPerformed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.setKosong(null, null);
        }
        
    }
    
     class KlikTabelPerformed implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
//            try {
//                theModel.GetDataInduk(theView.getIdinduk());
                theView.TidakEnabled(true);
//            } catch (SQLException ex) {
//                Logger.getLogger(cInduk.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
             
        }
        
    }
     
    class TidakPerformed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                theModel.TidakAktif(theView.getIdinduk());
                theView.Message("Data Berhasil Divalidasi");
                theView.setTabelModel(theModel.getTabelModel());
            } catch (SQLException ex) {
                Logger.getLogger(cInduk.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
        
    }
}
