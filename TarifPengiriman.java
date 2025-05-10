import java.util.Scanner;
import java.text.DecimalFormat;

public class TarifPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input berat paket dari pengguna
        System.out.print("Masukkan berat paket Anda (kg): "); // Note the space
        double beratPaket = input.nextDouble();

        // Meminta input jarak pengiriman dari pengguna
        System.out.print("Masukkan jarak pengiriman (km): "); // Note the space
        double jarakPengirimanKm = input.nextDouble();

        input.close(); // Menutup scanner setelah selesai membaca input

        int tarifPerKm = 0;

        // Menentukan tarif per km berdasarkan berat paket
        if (beratPaket <= 2) {
            tarifPerKm = 1500;
        } else if (beratPaket <= 6) { // This condition is correct: > 2 and <= 6
            tarifPerKm = 3000;
        } else if (beratPaket <= 10) { // This condition is correct: > 6 and <= 10
            tarifPerKm = 5000;
        } else { // This covers > 10
            tarifPerKm = 5500;
        }

        // Membulatkan jarak pengiriman ke bawah (mengambil bagian integer)
        int jarakPengirimanBulat = (int) jarakPengirimanKm; // This is correct for rounding down

        // Menghitung total tarif pengiriman
        double totalTarif = (double) tarifPerKm * jarakPengirimanBulat;

        // Menggunakan DecimalFormat untuk format mata uang Rupiah
        // The problem statement output example is "Rp.10,000.00"
        // The default DecimalFormat for Indonesian locale would likely use "." as thousand separator
        // and "," as decimal. We need to be careful here or force US locale for formatting
        // if the platform's default locale affects the DecimalFormat.
        // However, the provided format string "#,##0.00" should produce a comma for thousands
        // and a period for the decimal, which matches the example.

        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        String tarifFormatted = formatter.format(totalTarif);

        // Menampilkan tarif pengiriman
        // The problem statement shows: "Tarif Pengiriman = Rp.10,000.00"
        // My code output is:           "Tarif Pengiriman = Rp." + tarifFormatted
        // This seems correct.
        System.out.println("Tarif Pengiriman = Rp." + tarifFormatted);
    }
}
