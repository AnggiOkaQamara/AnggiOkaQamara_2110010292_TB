package gui;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Mahasiswa;
import mysql.Koneksi;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FormPendaftaran extends javax.swing.JFrame {
    Mahasiswa mahasiswa;
  public ArrayList<Mahasiswa> getMahasiswaList () {
        ArrayList<Mahasiswa> MahasiswaList = new ArrayList<Mahasiswa>();
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.getConnection();

        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * From pendaftaran_mahasiswa";
        String order = " ORDER BY pendaftaran_mahasiswa.nim";
//        if(!keyword.equals(""))
//            query = query+ " WHERE anggota.id = ? OR nama_anggota like ?";

        query = query+order;
        try{
            ps = connection.prepareStatement(query);
//            if(!keyword.equals("")){
//                ps.setString(1,eCari.getText());
//                ps.setString(2, "%"+eCari.getText()+"%");
//            }
            rs = ps.executeQuery();
            while(rs.next()){
               mahasiswa = new Mahasiswa(
                        rs.getString("nim"),
                        rs.getString("nama"),
                        rs.getString("TTL"),
                        rs.getString("fakultas"),
                        rs.getString("jurusan"));
                MahasiswaList.add(mahasiswa);
            }
        } catch(SQLException ex){
            System.err.println("ERROR getMahasiswaList : "+ex);
            System.err.println(ex.getMessage());
        }
        return MahasiswaList;
    }  
  public void selectMahasiswa(){
        ArrayList<Mahasiswa> list;
        list = getMahasiswaList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row =  new Object[5];

        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getNim();
            row[1] = list.get(i).getNama();
            row[2] = list.get(i).getTTL();
            row[3] = list.get(i).getFakultas();
            row[4] = list.get(i).getJurusan();
            model.addRow(row);
        }
    }
  public final void RefreshData(){
        DefaultTableModel  dtmbk = (DefaultTableModel) table1.getModel();
        dtmbk.setRowCount(0);
        selectMahasiswa();
    }

    public final void resetForm(){
        fnama.setText("");
        fnim.setText("");
        ftempat.setText("");
        fakul.setSelectedItem("");
        fjurusan.setText("");
    }



    /**
     * Creates new form FormPendaftaran
     */
    public FormPendaftaran() {
        initComponents();
        setLocationRelativeTo(null);
        RefreshData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fnama = new javax.swing.JTextField();
        fnim = new javax.swing.JTextField();
        ftempat = new javax.swing.JTextField();
        fjurusan = new javax.swing.JTextField();
        fakul = new javax.swing.JComboBox<>();
        Simpan = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APLIKASI PENDAFTARAN MAHASISWA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("TTL");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Fakultas");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Jurusan");

        fakul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fakul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FISIP", "FKIP", "FEKON", "FAPERTA", "FSI", "FATEK", "FKM", "FH", "FTI", "FF" }));
        fakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fakulActionPerformed(evt);
            }
        });

        Simpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        Keluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        Hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "nim", "nama", "TTL", "fakultas", "jurusan"
            }
        ));
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fnama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                .addComponent(fnim, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fjurusan, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ftempat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Simpan)
                                .addGap(18, 18, 18)
                                .addComponent(Hapus)
                                .addGap(18, 18, 18)
                                .addComponent(Keluar))
                            .addComponent(fakul, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fakul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Simpan)
                    .addComponent(Hapus)
                    .addComponent(Keluar))
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        int i = table1.getSelectedRow();
        if(i>=0){
        int pilihan = JOptionPane.showConfirmDialog(
                null,
                "ingin dihapus ?",
                "Konfirmasi hapus",
                JOptionPane.YES_NO_OPTION);
        if(pilihan==0){
                try{
                    TableModel model = table1.getModel();
                    Koneksi koneksi = new Koneksi();
                    Connection con = koneksi.getConnection();
                    String executeQuery = "delete from pendaftaran_mahasiswa where nim=?";
                    PreparedStatement ps = con.prepareStatement(executeQuery);
                    ps.setString(1, model.getValueAt(i, 0).toString());
                    ps.executeUpdate();
                        RefreshData();
                        resetForm();
                }  catch (SQLException ex){
                    System.err.println(ex);
                }
            }
            }else{
                JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus");
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        String tanya = "Apakah anda yakin akan keluar aplikasi?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)
        == JOptionPane.YES_OPTION;
        if(yakin){
            System.exit(0);
        }
    }//GEN-LAST:event_KeluarActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama(fnama.getText());
        mahasiswa.setNim(fnim.getText());
        mahasiswa.setTTL(ftempat.getText());
        mahasiswa.setFakultas(fakul.getSelectedItem().toString());
        mahasiswa.setJurusan(fjurusan.getText());

        if( fnama.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lengkapi data");
        }else{

            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.getConnection();
            PreparedStatement ps;
            try {
                    String qry = "insert into pendaftaran_mahasiswa (nim,nama,TTL,fakultas,jurusan) values (?,?,?,?,?)";

                        ps = con.prepareStatement(qry);
                        ps.setString(1, mahasiswa.getNim());
                        ps.setString(2, mahasiswa.getNama());
                        ps.setString(3, mahasiswa.getTTL());
                        ps.setString(4, mahasiswa.getFakultas());
                        ps.setString(5,mahasiswa.getJurusan());
                        ps.executeUpdate();
                        RefreshData();
                        resetForm();
             }catch(SQLException e){
                System.err.println("error :"+e);
            }
        }

        
    }//GEN-LAST:event_SimpanActionPerformed

    private void fakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fakulActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_fakulActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        RefreshData();
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Simpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> fakul;
    private javax.swing.JTextField fjurusan;
    private javax.swing.JTextField fnama;
    private javax.swing.JTextField fnim;
    private javax.swing.JTextField ftempat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}