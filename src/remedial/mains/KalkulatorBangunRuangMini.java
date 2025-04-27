package remedial.mains;

import remedial.shapes.Kerucut;
import remedial.shapes.Balok;
import java.util.Scanner;

// main class program
public class KalkulatorBangunRuangMini {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // header
        System.out.println("=============================================");
        System.out.println("Kalkulator Bangun Ruang Mini Versi A");
        System.out.println("Angeliani Junitaviana Herman");
        System.out.println("245150700111021");
        System.out.println("=============================================");

        // input untuk kerucut
        System.out.println("Kerucut");
        System.out.println("=============================================");
        System.out.print("Isikan nama     : ");
        String namaKerucut = scan.nextLine();
        System.out.print("Isikan radius   : ");
        double radius = scan.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiKerucut = scan.nextDouble();
        System.out.print("Isikan massa    : ");
        double massaKerucut = scan.nextDouble();
        scan.nextLine(); // konsumsi newline

        Kerucut kerucut = new Kerucut(radius);
        kerucut.setNama(namaKerucut);
        kerucut.setTinggi(tinggiKerucut);
        kerucut.setMassa(massaKerucut);

        System.out.println("=============================================");
        kerucut.printInfo();
        System.out.println("=============================================");

        // input utk balok
        System.out.println("Balok");
        System.out.println("=============================================");
        System.out.print("Isikan nama     : ");
        String namaBalok = scan.nextLine();
        System.out.print("Isikan panjang  : ");
        double panjang = scan.nextDouble();
        System.out.print("Isikan lebar    : ");
        double lebar = scan.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiBalok = scan.nextDouble();
        System.out.print("Isikan massa    : ");
        double massaBalok = scan.nextDouble();

        Balok balok = new Balok(panjang, lebar);
        balok.setNama(namaBalok);
        balok.setTinggi(tinggiBalok);
        balok.setMassa(massaBalok);

        System.out.println("=============================================");
        balok.printInfo();
        System.out.println("=============================================");

        scan.close();
    }
}
