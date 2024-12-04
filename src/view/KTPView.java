package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import model.classes.Penduduk;

public class KTPView extends JFrame{
    JFrame frame;

    public KTPView(Penduduk ktp) {
        viewKTP(ktp);
    }

    private void viewKTP(Penduduk ktp) {
        frame = new JFrame("KTP");
        frame.setLayout(new BorderLayout());
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        final int frameWidth = 800;
        final int frameHeight = 500;

        int frameX = (screenWidth / 2) - (frameWidth / 2);
        int frameY = (screenHeight / 2) - (frameHeight / 2);

        frame.setBounds(frameX, frameY, frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel utama untuk teks dan gambar
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2));

        // Panel kiri untuk teks
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 10));

        // Membuat data KTP dengan StringBuilder
        StringBuilder data = new StringBuilder();
        data.append("<html>");
        data.append("<h2 style='text-align:center;'>PROVINSI JAKARTA</h2>");
        data.append("<h2 style='text-align:center;'>JAKARTA UTARA</h2><br>");
        data.append("<h3>NIK : " + ktp.getNik() + "</h4><br>");
        data.append("Nama : " + ktp.getNama() + "<br>");
        data.append("Tempat/Tgl Lahir : " + ktp.getTempatLahir() + ", " + ktp.getTanggalLahir() + "<br>");
        data.append("Jenis Kelamin : " + ktp.getJenisKelamin() + " &nbsp;&nbsp;&nbsp; Gol. Darah : " + ktp.getGolDarah() + "<br>");
        data.append("Alamat : " + ktp.getAlamat() + "<br>");
        data.append("RT/RW : " + ktp.getRtRW() + "<br>");
        data.append("Kel/Desa : " + ktp.getKelDesa() + "<br>");
        data.append("Kecamatan : " + ktp.getKecamatan() + "<br>");
        data.append("Agama : " + ktp.getAgama() + "<br>");
        data.append("Status Perkawinan : " + ktp.getStatusPerkawinan() + "<br>");
        data.append("Pekerjaan : " + ktp.getPekerjaan() + "<br>");
        data.append("Kewarganegaraan : " + ktp.getKewarganegaraan() + "<br>");
        data.append("Berlaku Hingga : " + ktp.getBerlakuHingga() + "<br>");
        data.append("</html>");

        JLabel textLabel = new JLabel(data.toString());
        textPanel.add(textLabel);

        // Panel kanan untuk gambar
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new BoxLayout(imagePanel, BoxLayout.Y_AXIS));
        imagePanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 20));

        // Foto
        ImageIcon fotoIcon = new ImageIcon(ktp.getFoto().getAbsolutePath());
        Image scaledFoto = fotoIcon.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH);
        JLabel fotoLabel = new JLabel(new ImageIcon(scaledFoto));
        fotoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Tanda tangan
        ImageIcon ttdIcon = new ImageIcon(ktp.getTandaTangan().getAbsolutePath());
        Image scaledTTD = ttdIcon.getImage().getScaledInstance(100, 50, Image.SCALE_SMOOTH);
        JLabel ttdLabel = new JLabel(new ImageIcon(scaledTTD));
        ttdLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel kotaTanggalLabel = new JLabel(
                "<html>" + ktp.getKotaPembuatanKTP() + "<br>" + ktp.getTanggalPembuatanKTP() + "</html>");
        kotaTanggalLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Tambahkan ke panel gambar
        imagePanel.add(fotoLabel);
        imagePanel.add(Box.createVerticalStrut(20));
        imagePanel.add(kotaTanggalLabel);
        imagePanel.add(Box.createVerticalStrut(10));
        imagePanel.add(ttdLabel);

        JButton backButton = new JButton("Back to Main");
        backButton.setBounds(100, 500, 75, 25);
        textPanel.add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                frame.dispose();
            }
        });

        // Tambahkan panel ke main panel
        mainPanel.add(textPanel);
        mainPanel.add(imagePanel);

        // Tambahkan main panel ke frame
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
