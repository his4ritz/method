 import javax.swing.JOptionPane;
public class Modul2 {
    public static void main(String[] args) {
        String[] options = {"Persegi Panjang", "Lingkaran", "Segitiga"};
        int choice = JOptionPane.showOptionDialog(null, "Pilih bangun geometri:", "bangun kalkulator",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0: 
                hitungLuasPersegiPanjang();
                break;
            case 1: 
                hitungLuasLingkaran();
                break;
            case 2: 
                hitungLuasSegitiga();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid.");
        }
    }

    
    public static void hitungLuasPersegiPanjang() {
        int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang persegi panjang:"));
        int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar persegi panjang:"));
        double luasPersegiPanjang = panjang * lebar;
        JOptionPane.showMessageDialog(null, "Luas persegi panjang: " + luasPersegiPanjang);
    }

    
    public static void hitungLuasLingkaran() {
        int diameter = Integer.parseInt(JOptionPane.showInputDialog("Masukkan diameter lingkaran:"));
        double jariJari = diameter / 2.0;
        double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
        JOptionPane.showMessageDialog(null, "Luas lingkaran: " + luasLingkaran);
    }

    
    public static void hitungLuasSegitiga() {
        int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan alas segitiga:"));
        int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
        double luasSegitiga = 0.5 * alas * tinggi;
        JOptionPane.showMessageDialog(null, "Luas segitiga: " + luasSegitiga);
    }
}