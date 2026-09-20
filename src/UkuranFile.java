import java.util.Scanner;

public class UkuranFile {
    static final double SATU_KB = 1024.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama file     : ");
        String namaFile = input.nextLine();

        System.out.print("Ukuran (byte) : ");
        long ukuranByte = input.nextLong();


        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;


    }
}
