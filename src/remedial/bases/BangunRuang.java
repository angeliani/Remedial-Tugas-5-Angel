package remedial.bases;

// abstract class untuk semua bangun ruang
public abstract class BangunRuang {
    private String nama;  // nama bangun ruang
    private double tinggi; // tinggi bangun ruang
    private double massa;  // massa bangun ruang

    // constructor default
    public BangunRuang() {}

    // setter dan getter untuk nama
    public void setNama(String inputNama) {
        this.nama = inputNama;
    }

    public String getNama() {
        return nama;
    }

    // setter dan getter untuk tinggi
    public void setTinggi(double inputTinggi) {
        this.tinggi = inputTinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    // setter dan getter untuk massa
    public void setMassa(double inputMassa) {
        this.massa = inputMassa;
    }

    public double getMassa() {
        return massa;
    }

    // abstract method untuk print info
    public abstract void printInfo();
}
