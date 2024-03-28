import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;
public class methodx {
    public double luas_lingkaran(double diameter) {
        double jari2= diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    public double volume_tabung(double  diameter,double tinggi) {
        double luas = luas_lingkaran(diameter);
        double volume = luas * tinggi;
        return volume;
    }
    public double volume_kerucut(double diameter,double tinggi) {
        double luas = luas_lingkaran(diameter);
        double volume = (luas * tinggi ) / 3.0;
        return volume;
    }
    public double volume_bola(double diameter) {
        double jari2 = diameter / 2.0;
        double volume = (4.0 / 4.0) * Math.PI * Math.pow(jari2, 3);
        return  volume;
    }
    public static void main(String[] args) {
        methodx mt =new methodx();
        String pilihanString = JOptionPane.showInputDialog(null,"pilih bangun ruang:\n1. tabung\n2. kerucut\n3. bola","pilihan", JOptionPane.QUESTION_MESSAGE);
        int pilihan = Integer.parseInt(pilihanString);
        double diameter, tinggi ;
        
        if (pilihan ==1) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "masukkan diameter lingkaran: "));
                    tinggi = Double.parseDouble(JOptionPane.showInputDialog(null,"masukkan tinggi: "));
                    double volume_tabung = mt.volume_tabung(diameter, tinggi);
                    JOptionPane.showInputDialog(null,"volume tabung: " + + volume_tabung);
                    System.out.println("volume tabung: " + volume_tabung);
                    
        }else if (pilihan ==2 ) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "masukkan diameter lingkaran: "));
                    tinggi = Double.parseDouble(JOptionPane.showInputDialog(null,"masukkan tinggi: "));
                    double volume_kerucut = mt.volume_kerucut(diameter, tinggi);
                    JOptionPane.showInputDialog(null,"volume kerucut: " + + volume_kerucut);
                    System.out.println("volume kerucut: " + volume_kerucut);
                    
        }else if(pilihan ==3 ) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "masukkan diameter lingkaran: "));
                    double volume_bola = mt.volume_bola(diameter);
                    JOptionPane.showInputDialog(null,"volume bola: " + + volume_bola);
                    System.out.println("volume bola: " + volume_bola);
        }else {
            JOptionPane.showMessageDialog(null, "pilihan tidak ada");
            }
            System.exit(0);
            
                
    }
        
    
    
    
}
