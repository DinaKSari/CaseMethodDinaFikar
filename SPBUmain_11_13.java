import java.util.Scanner;
public class SPBUmain_11_13 {
    public static void main(String[] args) {
        Scanner sc_11_13 = new Scanner(System.in);
        System.out.println("Masukan max kapasitas antrian di SPBU: ");
        int jum = sc_11_13.nextInt();
        int temp = -1;
        QueueLinkedLists_11_13 antrian = new QueueLinkedLists_11_13(jum);
        TransaksiPengisian_11_13[] transaksi = new TransaksiPengisian_11_13[jum];
        TransaksiPengisian_11_13 input;
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
            pilihan = sc_11_13.nextInt(); sc_11_13.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc_11_13.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc_11_13.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc_11_13.nextLine();
                    Kendaraan_11_13 kendaraan = new Kendaraan_11_13(plat, tipe, merk);
                    antrian.enqueue(kendaraan);
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    System.out.println("Jumlah kendaraan dalam antrian: " + antrian.jumlahAntrian());
                    break;
                case 4:
                    if(antrian.front != null){
                        System.out.println("Petugas melayani " + antrian.front.kendaraan.platNomor);
                        System.out.print("Masukkan jenis BBM: ");
                        String namaBBM = sc_11_13.nextLine();
                        System.out.print("Masukkan Harga Per Liter: ");
                        double hargaPerLiter = sc_11_13.nextDouble();
                        BBM_11_13 BBM = new BBM_11_13(namaBBM, hargaPerLiter);
                        System.out.println("Masukan jumlah liter: ");
                        double liter = sc_11_13.nextDouble();
                        double totalBayar = liter * hargaPerLiter;
                        input = new TransaksiPengisian_11_13(antrian.front.kendaraan, liter, totalBayar, BBM, jum);
                        transaksi[temp + 1] = input;
                        temp++;
                        antrian.dequeue();
                    } else{
                        System.out.println("Antrian masih kosong!");
                    }
                    break;
                case 5:
                    if(temp != -1){
                        System.out.println("-- Riwayat Transaksi --");
                        for (int i = 0; i <= temp; i++) {
                            transaksi[i].riwayatTransaksi();
                        }
                    } else{
                        System.out.println("Riwayat transaksi masih kosong!");
                    }
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
