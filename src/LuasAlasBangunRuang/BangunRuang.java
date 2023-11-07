package LuasAlasBangunRuang;
import java.util.Scanner;
public class BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double vol, phi = 3.14;
        int p, l,t,r;
        System.out.println("Menghitung Bangun Ruang");
        
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Tabung");
        System.out.println("5. Tabung");
        System.out.println("==========================");
        System.out.println("Pilih Bangun Ruang Yang Ingin di Hitung");
        int pilih = input.nextInt();
        System.out.println(" ");
        
        
        switch(pilih) {
            case 1 :
                System.out.println("Hitung Bangun Ruang Kubus:");
                System.out.println("==========================");
                System.out.println("Input sisi kubus");
                r = input.nextInt();
                vol = r*r*r;
                System.out.println("Volume kubus adalah: " + vol);
                break;
            case 2 :
                System.out.println("Hitung Bangun Ruang balok:");
                System.out.println("==========================");
                System.out.println("Input panjang balok");
                p = input.nextInt();
                System.out.println("Input lebar balok");
                l = input.nextInt();
                System.out.println("Input tinggi balok");
                t = input.nextInt();
                vol = p*l*t;
                System.out.println("Volume kubus adalah: " + vol);
                break;
            case 3 :
                System.out.println("Hitung Bangun Ruang tabung:");
                System.out.println("==========================");
                System.out.println("Input Jari-jari tabung");
                r = input.nextInt();
                System.out.println("Input tinggi tabung");
                t = input.nextInt();
                vol = phi*r*r+t;
                System.out.println("Volume kubus adalah: " + vol);
                break;
            case 4 :
                System.out.println("Hitung Bangun Ruang Bola:");
                System.out.println("==========================");
                System.out.println("Input Jari-jari tabung");
                r = input.nextInt();
                System.out.println("Input tinggi tabung");
                t = input.nextInt();
                vol = phi*r*r+t;
                System.out.println("Volume kubus adalah: " + vol);
                break;
            case 5 :
                System.out.println("Hitung Bangun Ruang tabung:");
                System.out.println("==========================");
                System.out.println("Input Jari-jari tabung");
                r = input.nextInt();
                System.out.println("Input tinggi tabung");
                t = input.nextInt();
                vol = phi*r*r+t;
                System.out.println("Volume kubus adalah: " + vol);
                break;
        }
}
    }
