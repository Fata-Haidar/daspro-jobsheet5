import java.util.Scanner;

/**
 * ModifPemilihanBilangan09
 */
public class ModifPemilihanBilangan09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        
        String result = (angka % 2 == 0) ? "Angka " + angka + " termasuk bilangan genap" : "Angka " + angka + " termasuk bilangan ganjil";
        System.out.println(result);
    }
}