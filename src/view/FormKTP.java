package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import model.classes.Penduduk;

public class FormKTP extends JFrame {
    JFrame frame;
    File photoFile;
    File ttdFile;

    public FormKTP() {
        inputForm();
        // setLocationRelativeTo(null);
        // setSize(500, 700);
    }

    private void inputForm() {
        // setting Frame size and location
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        final int frameWidth = 750;
        final int frameHeight = 650;

        int frameX = (screenWidth / 2) - (frameWidth / 2);
        int frameY = (screenHeight / 2) - (frameHeight / 2);

        frame = new JFrame("KTP INPUT FORM");
        frame.setBounds(frameX, frameY, frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(null);
        inputPanel.setBounds(0, 0, frameWidth, frameHeight);

        JLabel NIK = new JLabel("NIK");
        JTextField NIKField = new JTextField();
        NIK.setBounds(50, 75, 400, 25);
        NIKField.setBounds(150, 75, 400, 25);

        inputPanel.add(NIK);
        inputPanel.add(NIKField);

        JLabel nama = new JLabel("Nama");
        JTextField namaField = new JTextField();
        nama.setBounds(50, 100, 400, 25);
        namaField.setBounds(150, 100, 400, 25);
        inputPanel.add(nama);
        inputPanel.add(namaField);

        JLabel tempatLahir = new JLabel("Tempat Lahir");
        JTextField tempatLahirField = new JTextField();
        tempatLahir.setBounds(50, 125, 100, 25);
        tempatLahirField.setBounds(150, 125, 400, 25);
        inputPanel.add(tempatLahir);
        inputPanel.add(tempatLahirField);

        JLabel tglLahir = new JLabel("Tanggal Lahir");
        tglLahir.setBounds(50, 150, 400, 25);
        inputPanel.add(tglLahir);

        // Date picker untuk tanggal lahir
        JDateChooser tglLahirDatePicker = new JDateChooser();
        tglLahirDatePicker.setBounds(150, 150, 400, 25);
        inputPanel.add(tglLahirDatePicker);

        JLabel jenisKelamin = new JLabel("Jenis Kelamin");
        jenisKelamin.setBounds(50, 175, 400, 25);
        JRadioButton jkPria = new JRadioButton("Pria");
        jkPria.setBounds(150, 175, 50, 25);
        JRadioButton jkWanita = new JRadioButton("Wanita");
        jkWanita.setBounds(200, 175, 75, 25);

        ButtonGroup jkGroup = new ButtonGroup();
        jkGroup.add(jkPria);
        jkGroup.add(jkWanita);

        inputPanel.add(jenisKelamin);
        inputPanel.add(jkPria);
        inputPanel.add(jkWanita);

        JLabel golDarah = new JLabel("Gol Darah");
        golDarah.setBounds(50, 200, 400, 25);
        JRadioButton golA = new JRadioButton("A");
        golA.setBounds(150, 200, 50, 25);
        JRadioButton golB = new JRadioButton("B");
        golB.setBounds(200, 200, 50, 25);
        JRadioButton golO = new JRadioButton("O");
        golO.setBounds(250, 200, 50, 25);
        JRadioButton golAB = new JRadioButton("AB");
        golAB.setBounds(300, 200, 50, 25);

        ButtonGroup golGroup = new ButtonGroup();
        golGroup.add(golA);
        golGroup.add(golB);
        golGroup.add(golO);
        golGroup.add(golB);
        golGroup.add(golAB);

        inputPanel.add(golDarah);
        inputPanel.add(golA);
        inputPanel.add(golB);
        inputPanel.add(golO);
        inputPanel.add(golAB);

        JLabel alamat = new JLabel("Alamat");
        JTextField alamatField = new JTextField();
        alamat.setBounds(50, 225, 400, 25);
        alamatField.setBounds(150, 225, 400, 25);
        inputPanel.add(alamat);
        inputPanel.add(alamatField);

        JLabel rtRW = new JLabel("RT/RW");
        JTextField rtRWField = new JTextField();
        rtRW.setBounds(50, 250, 400, 25);
        rtRWField.setBounds(150, 250, 50, 25);
        inputPanel.add(rtRW);
        inputPanel.add(rtRWField);

        JLabel kelDesa = new JLabel("Kelurahan/Desa");
        JTextField kelDesaField = new JTextField();
        kelDesa.setBounds(50, 275, 400, 25);
        kelDesaField.setBounds(150, 275, 400, 25);
        inputPanel.add(kelDesa);
        inputPanel.add(kelDesaField);

        JLabel kecamatan = new JLabel("Kecamatan");
        JTextField kecamatanField = new JTextField();
        kecamatan.setBounds(50, 300, 400, 25);
        kecamatanField.setBounds(150, 300, 400, 25);
        inputPanel.add(kecamatan);
        inputPanel.add(kecamatanField);

        JLabel agama = new JLabel("Agama");
        agama.setBounds(50, 325, 400, 25);

        JComboBox agamaBox = new JComboBox<>();
        agamaBox.addItem("KRISTEN");
        agamaBox.addItem("KATOLIK");
        agamaBox.addItem("ISLAM");
        agamaBox.addItem("HINDU");
        agamaBox.addItem("BUDDHA");
        agamaBox.setBounds(150, 325, 400, 25);

        inputPanel.add(agama);
        inputPanel.add(agamaBox);

        JLabel statusPerkawinan = new JLabel("Status Perkawinan");
        statusPerkawinan.setBounds(50, 350, 400, 25);

        JComboBox statusPerkawinanBox = new JComboBox<>();
        statusPerkawinanBox.addItem("BELUM_MENIKAH");
        statusPerkawinanBox.addItem("MENIKAH");
        statusPerkawinanBox.addItem("JANDA");
        statusPerkawinanBox.addItem("DUDA");
        statusPerkawinanBox.setBounds(175, 350, 400, 25);

        inputPanel.add(statusPerkawinan);
        inputPanel.add(statusPerkawinanBox);

        JLabel pekerjaan = new JLabel("Pekerjaan");
        pekerjaan.setBounds(50, 375, 400, 25);
        inputPanel.add(pekerjaan);

        JCheckBox karyawanCB = new JCheckBox("Karyawan Swasta");
        karyawanCB.setBounds(175, 375, 130, 25);
        inputPanel.add(karyawanCB);

        JCheckBox pnsCB = new JCheckBox("PNS");
        pnsCB.setBounds(305, 375, 50, 25);
        inputPanel.add(pnsCB);

        JCheckBox wiraswastaCB = new JCheckBox("Wiraswatsa");
        wiraswastaCB.setBounds(355, 375, 100, 25);
        inputPanel.add(wiraswastaCB);

        JCheckBox akademisiCB = new JCheckBox("Akademisi");
        akademisiCB.setBounds(455, 375, 85, 25);
        inputPanel.add(akademisiCB);

        JCheckBox pengangguranCB = new JCheckBox("Pengangguran");
        pengangguranCB.setBounds(550, 375, 150, 25);
        inputPanel.add(pengangguranCB);

        pengangguranCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pengangguranCB.isSelected()) {
                    karyawanCB.setEnabled(false);
                    pnsCB.setEnabled(false);
                    wiraswastaCB.setEnabled(false);
                    akademisiCB.setEnabled(false);

                    karyawanCB.setSelected(false);
                    pnsCB.setSelected(false);
                    wiraswastaCB.setSelected(false);
                    akademisiCB.setSelected(false);

                } else {
                    karyawanCB.setEnabled(true);
                    pnsCB.setEnabled(true);
                    wiraswastaCB.setEnabled(true);
                    akademisiCB.setEnabled(true);
                }
            }
        });

        JLabel kewarganegaraan = new JLabel("Kewarganegaraan");
        kewarganegaraan.setBounds(50, 400, 400, 25);
        inputPanel.add(kewarganegaraan);

        ButtonGroup kewarganegaraanGroup = new ButtonGroup();
        JRadioButton wni = new JRadioButton("WNI");
        wni.setBounds(175, 400, 75, 25);
        JRadioButton wna = new JRadioButton("WNA");
        wna.setBounds(250, 400, 75, 25);

        kewarganegaraanGroup.add(wna);
        kewarganegaraanGroup.add(wni);

        inputPanel.add(wni);
        inputPanel.add(wna);

        JLabel asalNegara = new JLabel("Negara Asal");
        JTextArea asalNegaraField = new JTextArea();
        asalNegara.setBounds(350, 400, 400, 25);
        asalNegaraField.setBounds(425, 400, 400, 25);
        asalNegara.setVisible(false);
        asalNegaraField.setVisible(false);

        wna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                asalNegara.setVisible(true);
                asalNegaraField.setVisible(true);
            }
        });
        wni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                asalNegara.setVisible(false);
                asalNegaraField.setVisible(false);
            }
        });

        inputPanel.add(asalNegara);
        inputPanel.add(asalNegaraField);

        JLabel photo = new JLabel("Foto");
        photo.setBounds(50, 425, 100, 25);
        inputPanel.add(photo);

        JButton photoButton = new JButton("Upload Photo");
        photoButton.setBounds(175, 425, 200, 24);
        inputPanel.add(photoButton);

        photoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    photoFile = fileChooser.getSelectedFile();
                }
            }
        });

        JLabel ttd = new JLabel("TTD");
        ttd.setBounds(50, 450, 100, 25);
        inputPanel.add(ttd);

        JButton ttdButton = new JButton("Upload Photo");
        ttdButton.setBounds(175, 450, 200, 24);
        inputPanel.add(ttdButton);

        ttdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    ttdFile = fileChooser.getSelectedFile();
                }
            }
        });

        JLabel masaBerlaku = new JLabel("Berlaku Hingga");
        JTextField masaBerlakuField = new JTextField();
        masaBerlaku.setBounds(50, 475, 400, 25);
        masaBerlakuField.setBounds(175, 475, 400, 25);
        inputPanel.add(masaBerlaku);
        inputPanel.add(masaBerlakuField);

        JLabel kotaPembuatan = new JLabel("Kota Pembuatan");
        JTextField kotaPembuatanField = new JTextField();
        kotaPembuatan.setBounds(50, 500, 400, 25);
        kotaPembuatanField.setBounds(175, 500, 400, 25);
        inputPanel.add(kotaPembuatan);
        inputPanel.add(kotaPembuatanField);

        JLabel tglPembuatan = new JLabel("Tanggal Pembuatan");
        tglPembuatan.setBounds(50, 525, 400, 25);

        JDateChooser tglPembuatanField = new JDateChooser();
        tglPembuatanField.setBounds(175, 525, 400, 25);

        inputPanel.add(tglPembuatan);
        inputPanel.add(tglPembuatanField);

        JButton submit = new JButton("Submit!");
        submit.setBounds(125, 570, 500, 25);
        inputPanel.add(submit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String namaOutput = namaField.getText();
                // String nikKTP = NIKField.getText();
                // String tempatLahirOutput = tempatLahirField.getText();
                // Date tglLahirOutput = (Date) tglLahirDatePicker.getDate();
                // LocalDate tanggalLahirlocalDate = tglLahirOutput.toInstant()
                // .atZone(ZoneId.systemDefault())
                // .toLocalDate();
                // String tanggalLahirlocalDateFormatted = tanggalLahirlocalDate
                // .format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                // String jenisKelaminOutput;
                // if (jkPria.isSelected()) {
                // jenisKelaminOutput = "Pria";
                // } else {
                // jenisKelaminOutput = "Wanita";
                // }

                // String golDarahOutput = FormControllers.cekGolDarah(golA, golB, golO, golAB);
                // String alamatOutput = alamatField.getText();
                // String rtRWOutput = rtRWField.getText();
                // String kelDesaOutput = kelDesaField.getText();
                // String kecamatanOutput = kecamatanField.getText();

                // String agamaOutput;
                // if (agamaBox.getSelectedItem() != null) {
                // agamaOutput = agamaBox.getSelectedItem().toString();
                // } else {
                // agamaOutput = "";
                // }

                // String statusKawinOutput = (statusPerkawinanBox.getSelectedItem() != null)
                // ? statusPerkawinanBox.getSelectedItem().toString()
                // : "";

                // String pekerjaanOutput = FormControllers.cekPekerjaan(karyawanCB, pnsCB,
                // wiraswastaCB, akademisiCB,
                // pengangguranCB);

                // String kewarganegaraanOutput;
                // if (wna.isSelected()) {
                // String wargaNegaraAsal = asalNegara.getText();
                // kewarganegaraanOutput = "WNA " + wargaNegaraAsal;
                // } else {
                // kewarganegaraanOutput = "WNI";
                // }
                // String berlakuHinggaOutput = masaBerlakuField.getText();

                // String kotaPembuatanOutput = kotaPembuatanField.getText();

                // Date tglPembuatanKTP = tglPembuatanField.getDate();
                // LocalDate tglPembuatanLocalDate = tglPembuatanKTP.toInstant()
                // .atZone(ZoneId.systemDefault())
                // .toLocalDate();
                // String tglPembuatanFormatted =
                // tglPembuatanLocalDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                String namaOutput = "John Doe";
                String nikKTP = "1234567890123456";
                String tempatLahirOutput = "Bandung";
                String tanggalLahirlocalDateFormatted = "01-01-1990";
                String jenisKelaminOutput = "Pria";
                String golDarahOutput = "O";
                String alamatOutput = "Jl. Mawar No. 1";
                String rtRWOutput = "01/02";
                String kelDesaOutput = "Cibadak";
                String kecamatanOutput = "Cimahi Utara";
                String agamaOutput = "ISLAM";
                String statusKawinOutput = "BELUM_MENIKAH";
                String pekerjaanOutput = "Karyawan Swasta";
                String kewarganegaraanOutput = "WNI";
                File photoFile = new File("C:\\Users\\Canon manalu\\Pictures\\1.jpg"); // Replace with an actual dummy file path
                File ttdFile = new File("C:\\Users\\Canon manalu\\Pictures\\2.png"); // Replace with an actual dummy file path
                String berlakuHinggaOutput = "01-01-2030";
                String kotaPembuatanOutput = "Bandung";
                String tglPembuatanFormatted = "01-12-2024";

                if (nikKTP.isEmpty() || namaOutput.isEmpty() || tempatLahirOutput.isEmpty()
                        || tanggalLahirlocalDateFormatted == null ||
                        jenisKelaminOutput.isEmpty() || golDarahOutput.isEmpty() || agamaOutput.isEmpty()
                        || statusKawinOutput.isEmpty() || pekerjaanOutput.isEmpty() ||
                        alamatOutput.isEmpty() || rtRWOutput.isEmpty() || kelDesaOutput.isEmpty()
                        || kecamatanOutput.isEmpty() ||
                        kewarganegaraanOutput.isEmpty() || berlakuHinggaOutput.isEmpty()
                        || kotaPembuatanOutput.isEmpty() ||
                        tglPembuatanFormatted == null || photoFile == null || ttdFile == null) {
                    JOptionPane.showMessageDialog(null, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);

                } else {
                    Penduduk KTP = new Penduduk(
                            nikKTP,
                            namaOutput,
                            tempatLahirOutput,
                            tanggalLahirlocalDateFormatted,
                            jenisKelaminOutput,
                            golDarahOutput,
                            alamatOutput,
                            rtRWOutput,
                            kelDesaOutput,
                            kecamatanOutput,
                            agamaOutput,
                            statusKawinOutput,
                            pekerjaanOutput,
                            kewarganegaraanOutput,
                            photoFile,
                            ttdFile,
                            berlakuHinggaOutput,
                            kotaPembuatanOutput,
                            tglPembuatanFormatted);
                    Penduduk.insertData(KTP);
                    new KTPView(KTP);
                    frame.dispose();
                }
            }
        });
        
        frame.add(inputPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FormKTP();
    }
}
