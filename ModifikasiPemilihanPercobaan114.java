import java.util.Scanner;
public class ModifikasiPemilihanPercobaan114 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        int angka = input28.nextInt();
        String hasil;
        hasil = (angka % 2 == 0) ? "Bilangan genap\n" : "Bilangan ganjil\n";
        System.out.println(hasil);
    }
}