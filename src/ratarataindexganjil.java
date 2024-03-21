
import javax.swing.JOptionPane;
public class ratarataindexganjil {
    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        double total = 0;
        int count = 0;
        int sumOddColumn = 0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                total += data[a][b];
                count++;
                if (b % 2 != 0) { 
                    sumOddColumn += data[a][b];
                }
            }
        }
        double average = total / count;
        System.out.println("Nilai rata-rata array: " + average);
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan baris:"));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kolom:"));
        int newValue = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru:"));

        data[baris][kolom] = newValue;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                System.out.print(data[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println("Total kolom ganjil: " + sumOddColumn);
    }
}

}
