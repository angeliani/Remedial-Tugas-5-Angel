package remedial.shapes;

import remedial.bases.BangunRuang;
import remedial.interfaces.MemilikiVolume;
import remedial.interfaces.MemilikiBerat;
import remedial.interfaces.MemilikiGarisPelukis;

// class Kerucut sebagai turunan dari BangunRuang dan implementasi interface
public class Kerucut extends BangunRuang implements MemilikiVolume, MemilikiBerat, MemilikiGarisPelukis {
    private double radius; // Radius kerucut
    private static final int PI_PEMBILANG = 22; // pembilang pi
    private static final int PI_PENYEBUT = 7;   // penyebut pi

    // constructor Kerucut
    public Kerucut(double radius) {
        this.radius = radius;
    }

    // getter untuk radius
    public double getRadius() {
        return radius;
    }

    // method untuk menghitung volume kerucut
    public double hitungVolume() {
        return (double) PI_PEMBILANG / PI_PENYEBUT * radius * radius * getTinggi() / 3;
    }

    // method untuk menghitung berat kerucut
    public double hitungBerat() {
        return getMassa() * g;
    }

    // method untuk menghitung garis pelukis kerucut
    public double hitungGarisPelukis() {
        return Math.sqrt(radius * radius + getTinggi() * getTinggi());
    }

    // method untuk print semua info kerucut
    public void printInfo() {
        System.out.println("Nama            : " + getNama());
        System.out.println("Radius          : " + radius);
        System.out.println("Tinggi          : " + getTinggi());
        System.out.println("Massa           : " + getMassa());
        System.out.println("Volume          : " + hitungVolume());
        System.out.println("Berat           : " + hitungBerat());
        System.out.println("Garis pelukis   : " + hitungGarisPelukis());
    }
}
