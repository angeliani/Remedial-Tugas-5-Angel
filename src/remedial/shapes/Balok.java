package remedial.shapes;

import remedial.bases.BangunRuang;
import remedial.interfaces.MemilikiVolume;
import remedial.interfaces.MemilikiBerat;

// class Balok sebagai turunan dari BangunRuang dan implementasi interface
public class Balok extends BangunRuang implements MemilikiVolume, MemilikiBerat {
    private double panjang; // panjang balok
    private double lebar;   // lebar balok

    // constructor Balok
    public Balok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter untuk panjang
    public double getPanjang() {
        return panjang;
    }

    // getter untuk lebar
    public double getLebar() {
        return lebar;
    }

    // method untuk menghitung volume balok
    public double hitungVolume() {
        return panjang * lebar * getTinggi();
    }

    // method untuk menghitung berat balok
    public double hitungBerat() {
        return getMassa() * g;
    }

    // method untuk print semua info balok
    public void printInfo() {
        System.out.println("Nama            : " + getNama());
        System.out.println("Panjang         : " + panjang);
        System.out.println("Lebar           : " + lebar);
        System.out.println("Tinggi          : " + getTinggi());
        System.out.println("Massa           : " + getMassa());
        System.out.println("Volume          : " + hitungVolume());
        System.out.println("Berat           : " + hitungBerat());
    }
}
