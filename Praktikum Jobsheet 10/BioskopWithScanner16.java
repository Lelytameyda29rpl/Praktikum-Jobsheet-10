import java.util.Scanner;
public class BioskopWithScanner16 {

    public static void main(String[] args) {

        Scanner sc16 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama: ");
            nama = sc16.nextLine();
            System.out.print("Masukkan Baris: ");
            baris = sc16.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = sc16.nextInt();
            sc16.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc16.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

    }
    
}
