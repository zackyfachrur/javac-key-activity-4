import java.util.Scanner;
import java.text.DecimalFormat;

public class TagihanInternet 
{ 
    public static void main(String[] args)
    {
        // Deklarasi konstanta untuk biaya tambahan per jam.
        final double BIAYA_TAMBAHAN_PER_JAM_PAKET_A = 5000.00;
        final double BIAYA_TAMBAHAN_PER_JAM_PAKET_B = 5000.00;
        
        // Deklarasi variabel paket, totalTagihan, dan jam
        String paketInput; 
        double totalTagihan = 0;
        double jam;
        boolean paketValidDanDiproses = false;

        // Membuat objek scanner untuk membaca input keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Meminta input jenis paket dari pengguna
        System.out.print("Masukkan paket [A,B,C]: ");
        paketInput = keyboard.nextLine().toUpperCase();
        
        // Meminta input jam akses dari pengguna
        System.out.print("Masukkan jam pemakaian: ");
        jam = keyboard.nextDouble();
        
        // Statement Switch untuk menghitung tagihan
        switch (paketInput)
        {
            case "A":
                double biayaDasarA = 100000.00;
                int jamTermasukA = 20;         
                
                if (jam <= jamTermasukA) {
                    totalTagihan = biayaDasarA;
                } else {
                    totalTagihan = biayaDasarA + Math.floor(jam - jamTermasukA) * BIAYA_TAMBAHAN_PER_JAM_PAKET_A;
                }
                paketValidDanDiproses = true;
                break;
            case "B":
                double biayaDasarB = 200000.00; 
                int jamTermasukB = 50;         
                
                if (jam <= jamTermasukB) {
                    totalTagihan = biayaDasarB;
                } else {
                    totalTagihan = biayaDasarB + Math.floor(jam - jamTermasukB) * BIAYA_TAMBAHAN_PER_JAM_PAKET_B;
                }
                paketValidDanDiproses = true;
                break;
            case "C":
                double biayaDasarC = 350000.00; 
                totalTagihan = biayaDasarC;
                paketValidDanDiproses = true;
                break;
            default:
                System.out.println("Salah input! Jenis paket hanya A, B, atau C.");
                break;
        }
        
        // Menampilkan total tagihan
        if (paketValidDanDiproses) {
            DecimalFormat formatter = new DecimalFormat("###,###.00"); // Format dengan titik pemisah ribuan
            System.out.println("Total tagihan = Rp." + formatter.format(totalTagihan));
        }
        
        keyboard.close();
    }
}
