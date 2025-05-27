public class TransaksiPengisian_11_13 {
    Kendaraan_11_13 kendaraan;
    BBM_11_13 bbm;
    double liter;
    double totalBayar;
    QueueLinkedLists_11_13 max;
    int size;

    public TransaksiPengisian_11_13(Kendaraan_11_13 kendaraan, double liter, double totalBayar) {
        this.kendaraan = kendaraan;
        this.liter = liter;
        this.totalBayar = totalBayar;
        this.size = max.size;
    }

    public void riwayatTransaksi(){
        System.out.println("Daftar Transaksi: ");
        for(int i=0; i< size;i++){
            System.out.println(kendaraan.platNomor + " | Rp. " + totalBayar);
        }
    }
}
