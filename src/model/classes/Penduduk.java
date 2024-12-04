package model.classes;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Penduduk {
    private String nik;
    private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private String jenisKelamin;
    private String golDarah;
    private String alamat;
    private String rtRW;
    private String kelDesa;
    private String kecamatan;
    private String agama;
    private String statusPerkawinan;
    private String pekerjaan;
    private String kewarganegaraan;
    private File foto;
    private File tandaTangan;
    private String berlakuHingga;
    private String kotaPembuatanKTP;
    private String tanggalPembuatanKTP;

    public Penduduk() {
    }

    public Penduduk(String nik, String nama, String tempatLahir, String tanggalLahir, String jenisKelamin,
            String golDarah, String alamat, String rtRW, String kelDesa, String kecamatan, String agama,
            String statusPerkawinan, String pekerjaan, String kewarganegaraan, File foto, File tandaTangan,
            String berlakuHingga, String kotaPembuatanKTP, String tanggalPembuatanKTP) {
        this.nik = nik;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.golDarah = golDarah;
        this.alamat = alamat;
        this.rtRW = rtRW;
        this.kelDesa = kelDesa;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.foto = foto;
        this.tandaTangan = tandaTangan;
        this.berlakuHingga = berlakuHingga;
        this.kotaPembuatanKTP = kotaPembuatanKTP;
        this.tanggalPembuatanKTP = tanggalPembuatanKTP;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getGolDarah() {
        return golDarah;
    }

    public void setGolDarah(String golDarah) {
        this.golDarah = golDarah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRtRW() {
        return rtRW;
    }

    public void setRtRW(String rtRW) {
        this.rtRW = rtRW;
    }

    public String getKelDesa() {
        return kelDesa;
    }

    public void setKelDesa(String kelDesa) {
        this.kelDesa = kelDesa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public File getTandaTangan() {
        return tandaTangan;
    }

    public void setTandaTangan(File tandaTangan) {
        this.tandaTangan = tandaTangan;
    }

    public String getBerlakuHingga() {
        return berlakuHingga;
    }

    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }

    public String getKotaPembuatanKTP() {
        return kotaPembuatanKTP;
    }

    public void setKotaPembuatanKTP(String kotaPembuatanKTP) {
        this.kotaPembuatanKTP = kotaPembuatanKTP;
    }

    public String getTanggalPembuatanKTP() {
        return tanggalPembuatanKTP;
    }

    public void setTanggalPembuatanKTP(String tanggalPembuatanKTP) {
        this.tanggalPembuatanKTP = tanggalPembuatanKTP;
    }

    public static boolean insertData(Penduduk penduduk) {
        String query = "INSERT INTO 'penduduk'('nik', 'nama', 'tempat_lahir', 'tanggal_lahir', 'jenis_kelamin', 'gol_darah', 'alamat', 'rt_rw', 'kel_desa', 'kecamatan', 'agama', 'status_perkawinan', 'pekerjaan', 'kewarganegaraan', 'foto', 'tanda_tangan', 'berlaku_hingga', 'kota_pembuatan_ktp', 'tanggal_pembuatan_ktp')"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = ConnectionManager.getConnection();
                PreparedStatement st = con.prepareStatement(query)) {

            st.setString(1, penduduk.getNik());
            st.setString(2, penduduk.getNama());
            st.setString(3, penduduk.getTempatLahir());
            st.setString(4, penduduk.getTanggalLahir());
            st.setString(5, penduduk.getJenisKelamin());
            st.setString(6, penduduk.getGolDarah());
            st.setString(7, penduduk.getAlamat());
            st.setString(8, penduduk.getRtRW());
            st.setString(9, penduduk.getKelDesa());
            st.setString(10, penduduk.getKecamatan());
            st.setString(11, penduduk.getAgama());
            st.setString(12, penduduk.getStatusPerkawinan());
            st.setString(13, penduduk.getPekerjaan());
            st.setString(14, penduduk.getKewarganegaraan());
            st.setBlob(15, new FileInputStream(penduduk.getFoto())); // Assuming getFoto() returns a File
            st.setBlob(16, new FileInputStream(penduduk.getTandaTangan())); // Assuming getTandaTangan() returns a File
            st.setString(17, penduduk.getBerlakuHingga());
            st.setString(18, penduduk.getKotaPembuatanKTP());
            st.setString(19, penduduk.getTanggalPembuatanKTP());
                    
            int rowsInserted = st.executeUpdate();
            return rowsInserted > 0;

        } catch (Exception ex) {
            System.out.println("Terjadi kesalahan saat Menyimpan Data: " + ex.getMessage());
            return false;
        }
    }

    public static Penduduk getData(String NIK){
        Penduduk dataPenduduk = new Penduduk();
        String query = "SELECT * FROM penduduk where nik = ?";

        try (Connection con = ConnectionManager.getConnection();
                PreparedStatement st = con.prepareStatement(query)) {

            st.setString(1, NIK);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    return dataPenduduk;
                }else{
                    return null;
                }
            }
        }catch (Exception ex) {
            System.out.println("Terjadi kesalahan: " + ex.getMessage());
            return null;
        }
    }
}