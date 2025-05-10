// import class Scanner
import java.util.Scanner;

/*
    Program ini mensimulasikan ATM.
    Pengguna diberikan kesempatan tiga kali untuk memasukkan PIN yang benar.
    (PIN yang benar diasumsikan 1234). Jika setelah tiga kali PIN yang
    dimasukkan masih salah, program menampilkan pesan Kartu ATM terblokir.
*/
public class ATM {
    public static void main(String[] args) {
        // Untuk menyimpan PIN yang dimasukkan pengguna
        String inputPIN;

        // Buat object Scanner
        Scanner scanner = new Scanner(System.in);

        // Konstanta PIN yang benar
        final String PIN_BENAR = "1234";

        // Percobaan Pertama
        System.out.print("Masukkan PIN Anda: ");
        inputPIN = scanner.nextLine();

        if (inputPIN.equals(PIN_BENAR)) {
            System.out.println("PIN yang Anda masukkan benar.");
        } else {
            System.out.println("PIN yang Anda masukkan salah.");
            // Jika salah pada percobaan pertama, lanjut ke percobaan kedua
            System.out.print("Masukkan kembali PIN Anda: ");
            inputPIN = scanner.nextLine();

            if (inputPIN.equals(PIN_BENAR)) {
                System.out.println("PIN yang Anda masukkan benar.");
            } else {
                System.out.println("PIN yang Anda masukkan salah.");
                // Jika salah pada percobaan kedua, lanjut ke percobaan ketiga
                System.out.print("Masukkan kembali PIN Anda: ");
                inputPIN = scanner.nextLine();

                if (inputPIN.equals(PIN_BENAR)) {
                    System.out.println("PIN yang Anda masukkan benar.");
                } else {
                    System.out.println("PIN yang Anda masukkan salah.");
                    // Jika salah pada percobaan ketiga, kartu diblokir
                    System.out.println("Kartu ATM Anda terblokir.");
                }
            }
        }

        // Menutup scanner
        scanner.close();
    }
}
