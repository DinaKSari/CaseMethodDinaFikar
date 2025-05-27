public class TransaksiPengisian_11_13 {
    Kendaraan_11_13 kendaraan;
    BBM_11_13 bbm;
    double liter;
    double totalBayar;
    int size;

    public TransaksiPengisian_11_13(Kendaraan_11_13 kendaraan, double liter, double totalBayar, BBM_11_13 bbm, int max) {
        this.kendaraan = kendaraan;
        this.liter = liter;
        this.totalBayar = totalBayar;
        this.bbm = bbm;
        size = max;
    }

    public void riwayatTransaksi(){
        if(size != 0){
            System.out.println(kendaraan.platNomor + " | " + bbm.namaBBM + " | Rp. " + totalBayar);
        }
    }
}
