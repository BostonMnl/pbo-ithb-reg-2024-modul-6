package controller;

import javax.swing.JOptionPane;

import model.classes.Penduduk;
import view.MainMenu;
import view.Pencarian;

public class PencarianController {
    public boolean showData(String NIK){
        Penduduk dataPenduduk = Penduduk.getData(NIK);
        if (dataPenduduk == null) {
            JOptionPane.showMessageDialog(null, "Data Tidak ditemukan", "Hasil Pencarian", 1);
            return false;
        }else{
            new Pencarian(dataPenduduk);
        }
        return false;
    }

    public static void deleteData(String NIK){
        if (Penduduk.deleteData(NIK)) {
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Status data", 0);
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus", "Status data", 0);
        }
        new MainMenu();
    }
    public static void updateData(String NIK){
        if (Penduduk.deleteData(NIK)) {
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate", "Status data", 0);
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal DiUpdate", "Status data", 0);
        }
        new MainMenu();
    }
}
