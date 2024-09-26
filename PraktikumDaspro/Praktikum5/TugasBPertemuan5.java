import java.util.Scanner;

public class TugasBPertemuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan usia Anda: ");
            int usia = scanner.nextInt();

            
                if (usia >= 0 && usia <= 12) {
                    System.out.println("Kategori Usia: Anak");
                } else if (usia >= 13 && usia <= 19) {
                    System.out.println("Kategori Usia: Remaja");
                } else if (usia >= 20 && usia <= 64) {
                    System.out.println("Kategori Usia: Dewasa");
                } else {
                    System.out.println("Kategori Usia: Lansia");
                }
            
        } else {
            System.out.println("Inputan tidak valid. Harap masukkan angka positif.");
        }

    }
}
