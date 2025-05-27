import java.util.Scanner;

public class SPBUmain_11_13 {
    public static void main(String[] args) {
        Scanner sc_11_13 = new Scanner(System.in);
        SPBUMethod spbu = new SPBUMethod();
        int pilihan;

        do {
            System.out.println("--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = Integer.parseInt(sc_11_13.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc_11_13.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc_11_13.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc_11_13.nextLine();
                    Kendaraan_11_13 kendaraan = new Kendaraan_11_13(plat, tipe, merk);
                    spbu.tambahAntrian(kendaraan);
                    break;
                case 2:
                    spbu.tampilkanAntrian();
                    break;
                case 3:
                    spbu.cekJumlahAntrian();
                    break;
                case 4:
                    spbu.layaniKendaraan(sc_11_13);
                    break;
                case 5:
                    spbu.tampilkanRiwayatTransaksi();
                    break;
                case 0:
                    System.out.println(">> Program Selesai ^-^ . . .");
                    break;
                default:
                    System.out.println(">> Pilihan tidak sesuai !");
            }
        } while (pilihan != 0);
    }
}
