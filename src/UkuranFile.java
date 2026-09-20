import java.util.Scanner;

public class UkuranFile {
    static final double SATU_KB = 1024.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama file     : ");
        String namaFile = input.nextLine();

        System.out.print("Ukuran (byte) : ");
        long ukuranByte = input.nextLong(); //pake long karena kapasitasnya lebih besar dari int

        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        //perhitungannya harus presisi maka kita buat pake double biar perhitungannya presisi sehingga jika ad desimal maka desimal terbaca
        System.out.println("Ukuran (KB): " + ukuranKB);
        System.out.println("Ukuran (MB): " + ukuranMB);
        System.out.println("Ukuran (GB): " + ukuranGB);
        int ukuranMBDibulatkan = (int) ukuranMB; //pake int karna untuk ngebuang desimal bukan buat buletin angknya
        System.out.println("Dibulatkan ke MB : " + ukuranMBDibulatkan);
        double selisihPembulatan = ukuranMB - ukuranMBDibulatkan;
        System.out.println("Selisih pembulatan: " + selisihPembulatan);




    }
}
