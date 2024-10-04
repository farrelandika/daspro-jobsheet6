import java.util.Scanner;

public class Pemilihan2Percobaan3_9 {
    public static void main(String[] args) {
        Scanner sembilan = new Scanner(System.in);
        String kategori;
         int penghasilan, gajiBersih;
        double pajak;

    System.out.print("masukkan kategori : ");
    kategori = sembilan.nextLine();
    System.out.print("Masukkan besarnya penghasilan : ");
    penghasilan = sembilan.nextInt();

    if (kategori.equalsIgnoreCase("pekerja")) {
        if (penghasilan <= 2000000) {
            pajak = 0.1;
            
        } else if (penghasilan <= 3000000) {
            pajak = 0.15;
            
        } else {
            pajak = 0.2;
        }
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.println("Penghasil Bersih : " + gajiBersih);

    } else if (kategori.equalsIgnoreCase("pebisnis")) {
        if (penghasilan <= 2500000) {
            pajak = 0.15;
        } else if (penghasilan <= 3500000) {
            pajak = 0.2;
            
        } else {
            pajak = 0.25;

        }
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.println("Penghasil Bersih :");
        
    } else {
        System.out.println("Masukan kategori salah");
    }

}
}