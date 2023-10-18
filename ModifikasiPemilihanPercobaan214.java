import java.util.Scanner;

public class ModifikasiPemilihanPercobaan214 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);

        System.out.println("Nilai uas   : ");
        float uas = input28.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input28.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = input28.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input28.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (total > 80){
        System.out.println("Nilai huruf = A dan Nilai setara = 4");

        } else if (total > 73) {
        System.out.println("Nilai huruf = B+ dan Nilai setara = 3,5");

        } else if (total > 65) {
        System.out.println("Nilai huruf = B dan Nilai setara = 3");
    
        } else if (total > 60) {
        System.out.println("Nilai huruf = C+ dan Nilai setara = 2,5");
        
        } else if (total > 50) {
        System.out.println("Nilai huruf = C dan Nilai setara = 2");

        } else if (total > 39) {
        System.out.println("Nilai huruf = D dan Nilai setara = 1");

        } else {
        System.out.println("Nilai huruf = E dan Nilai setara = 0");
        }
    }

}