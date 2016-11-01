/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alam
 */
public class Induk extends javax.swing.JInternalFrame {

    /**
     * Creates new form Suhu
     */
    public Induk() {
        initComponents();
          
    }
    
    public int getKolam(){
        return kolam.getSelectedIndex();
    }
    
//    public void getKolam(ActionListener Kolam){
//        kolam.addActionListener(Kolam);
//    }
    
    public String getInduk(){
        return jumlah_induk.getText();
    }
    
    public String getBerat(){
        return berat_rata_rata.getText();
    }
    
    public String getFilter(){
        return filter.getSelectedItem().toString();
    }
    
    public int getSelectedRow() {
        return tabel_induk.getSelectedRow();
    }
    
     public String getIdinduk() {
        return tabel_induk.getValueAt(getSelectedRow(), 0).toString();
    }
    
    public void setKosong(String jumlah, String berat){       
        jumlah_induk.setText(jumlah);
        berat_rata_rata.setText(berat);
    }
    
    public void setTabelModel(DefaultTableModel tm) {
        tabel_induk.setModel(tm);
    }
    
    public void TabelListener(MouseListener klik){
        tabel_induk.addMouseListener(klik);
    }
    
    public void SimpanListener(ActionListener simpan) {
        btn_simpan.addActionListener(simpan);
    }
    
    public void BatalListener(ActionListener batal){
        btn_batal.addActionListener(batal);
    }
    
    public void TidakListener(ActionListener tidak){
        btn_tidak_aktif.addActionListener(tidak);
    }
    
    public void TidakEnabled(boolean tidak){
        btn_tidak_aktif.setEnabled(tidak);
    }
    
    public void FilterListener(ActionListener filtering){
        filter.addActionListener(filtering);
    }
    
    public void Message (String pesan){
        JOptionPane.showMessageDialog(this, pesan);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gambarLogin1 = new codingGambar.gambarLogin();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kolam = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jumlah_induk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        berat_rata_rata = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_induk = new javax.swing.JTable();
        btn_batal = new javax.swing.JButton();
        filter = new javax.swing.JComboBox();
        btn_tidak_aktif = new javax.swing.JButton();

        gambarLogin1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INDUK");
        gambarLogin1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(197, 193, 193));
        jLabel2.setText("Kolam");
        gambarLogin1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 73, -1, -1));

        kolam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kolam", "Kolam 1", "Kolam 2", "Kolam 3", "Kolam 4", "Kolam 5", "Kolam 6" }));
        gambarLogin1.add(kolam, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 73, 192, 28));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(197, 193, 193));
        jLabel3.setText("Jumlah Induk");
        gambarLogin1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 119, -1, 34));
        gambarLogin1.add(jumlah_induk, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 119, 410, 34));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(197, 193, 193));
        jLabel4.setText("Berat Rata-rata");
        gambarLogin1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 33));
        gambarLogin1.add(berat_rata_rata, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 410, 30));

        btn_simpan.setText("Simpan");
        gambarLogin1.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 70, 30));

        tabel_induk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_induk);

        gambarLogin1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 590, 230));

        btn_batal.setText("Batal");
        gambarLogin1.add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 60, 30));

        filter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aktif", "Tidak Aktif", "Semua" }));
        gambarLogin1.add(filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 160, -1));

        btn_tidak_aktif.setText("Tidak Aktif");
        btn_tidak_aktif.setEnabled(false);
        gambarLogin1.add(btn_tidak_aktif, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gambarLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gambarLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField berat_rata_rata;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tidak_aktif;
    private javax.swing.JComboBox filter;
    private codingGambar.gambarLogin gambarLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah_induk;
    private javax.swing.JComboBox kolam;
    private javax.swing.JTable tabel_induk;
    // End of variables declaration//GEN-END:variables
}