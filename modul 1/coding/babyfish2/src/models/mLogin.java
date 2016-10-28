/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.SQLException;

/**
 *
 * @author alam
 */
public class mLogin {
    
    public static String status;
    private Koneksi kon;

    public mLogin() throws SQLException {
        kon = new Koneksi("baby","","baby_fish");
//        this.kon = new Koneksi("root","","perikanan");
    }
    
    public String getStatus(){
        return status;
    }
    
    public void Login(String username, String password){
        if (username.equals("pengelola") && password.equals("pengelola")) {
            status = "pengelola";
        } else{
            status ="";
        }
    }
    
    
    
}
