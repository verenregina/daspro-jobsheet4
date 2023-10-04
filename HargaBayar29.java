import  java.util.Scanner;
public class HargaBayar29 {

    public static void main (String[] args) {
        Scanner input =new Scanner(System.in);
        String merkBuku;
        int harga, jumlah, jumlahHalamanBuku;
        double diskon, total, bayar, jmlDis;

        System.out.println("Masukkan merk buku ");
        merkBuku=input.next();
        System.out.println("Masukkan jumlah halaman buku");
        jumlahHalamanBuku=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan diskon (contoh 0,2 AKA 20%sidu): ");
        diskon=input.nextDouble();


        total=harga*jumlah;
        jmlDis=total*diskon;
        bayar=total*jmlDis;

        System.out.println("Merk buku " +merkBuku);
        System.out.println("Jumlah halaman buku " +jumlahHalamanBuku +"halaman");
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}