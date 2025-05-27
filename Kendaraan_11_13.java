public class Kendaraan_11_13{
    String platNomor;
    String tipe;
    String merk;

    Kendaraan_11_13(String plat, String tipe, String merk){
        platNomor = plat;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilkanInformasi(){
        System.out.println(" | " + platNomor + " | " + tipe + " | " + merk);
    }
}