/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alam
 */
public class mInduk {

    private Koneksi kon;
    private String dataInduk[] = new String[5];

    public mInduk() throws SQLException {
        this.kon = new Koneksi("baby","","baby_fish");
//        kon = new Koneksi("root", "", "perikanan");
    }

    public void Tambah(int kolam, String jumlah, String berat) throws SQLException {
        String query = "insert into tb_induk values(NULL," + kolam + ",'" + jumlah + "','" + berat + "',current_date ,'Aktif')";
        System.out.println(query);
        kon.execute(query);
    }

    public DefaultTableModel getTabelModel() throws SQLException {
        String header[] = {"Nomer", "Kolam", "Jumlah Induk", "Berat Rata-rata", "Tanggal Masuk"};
        DefaultTableModel tm = new DefaultTableModel(null, header) {
            @Override
            public boolean isCellEditable(int row, int culomn) {
                return false;
            }
        };
        ResultSet rs = kon.getResult("select i.id_kolam, k.nama_kolam, i.jumlah_induk, i.berat_rata, i.tanggal_induk from tb_induk i join tb_kolam k on(i.id_kolam=k.id_kolam) where i.status_induk = 'Aktif' Order by i.tanggal_induk desc");
        for (int i = tm.getRowCount() - 1; i >= 0; i--) {
            tm.removeRow(i);
        }

        while (rs.next()) {
            String baris[] = new String[5];
            for (int i = 0; i < baris.length; i++) {
                baris[i] = rs.getString(i + 1);
            }
            tm.addRow(baris);
        }
        return tm;
    }

    public DefaultTableModel getTabelModelFilter(String status) throws SQLException {
        String header[] = {"Nomer", "Kolam", "Jumlah Induk", "Berat Rata-rata", "Tanggal Masuk"};
        DefaultTableModel tm = new DefaultTableModel(null, header) {
            @Override
            public boolean isCellEditable(int row, int culomn) {
                return false;
            }
        };

        if (status.equalsIgnoreCase("Semua")) {
            System.out.println(status);
            ResultSet rs = kon.getResult("select i.id_kolam, k.nama_kolam, i.jumlah_induk, i.berat_rata, i.tanggal_induk from tb_induk i join tb_kolam k on(i.id_kolam=k.id_kolam) Order by i.tanggal_induk desc");
            for (int i = tm.getRowCount() - 1; i >= 0; i--) {
                tm.removeRow(i);
            }

            while (rs.next()) {
                String baris[] = new String[5];
                for (int i = 0; i < baris.length; i++) {
                    baris[i] = rs.getString(i + 1);
                }
                tm.addRow(baris);
            }

        } else {
            System.out.println(status);
            ResultSet rs = kon.getResult("select i.id_kolam, k.nama_kolam, i.jumlah_induk, i.berat_rata, i.tanggal_induk from tb_induk i join tb_kolam k on(i.id_kolam=k.id_kolam) where i.status_induk = '"+status+"' Order by i.tanggal_induk desc");
            for (int i = tm.getRowCount() - 1; i >= 0; i--) {
                tm.removeRow(i);
            }

            while (rs.next()) {
                String baris[] = new String[5];
                for (int i = 0; i < baris.length; i++) {
                    baris[i] = rs.getString(i + 1);
                }
                tm.addRow(baris);
            }
        }
        return tm;
    }
    
    public void TidakAktif(String id) throws SQLException {
        String query = "update tb_induk set status_induk = 'Tidak aktif' where id_induk = " + id;
        kon.execute(query);
    }
}
