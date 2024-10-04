import java.util.Scanner;
public class pemilihan2_tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String jenisBuku;
        double harga = 20000, jumlahBuku, diskon = 0, tambahanDiskon = 0;

        System.out.print("masukan jenis buku (kamus, novel, lainnya) : ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukan Jumlah Buku Yang Akan Dibeli : ");
        jumlahBuku = sc.nextDouble();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10.0;
            if (jumlahBuku > 2) {
                tambahanDiskon = 2.0;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 10.0;
            if (jumlahBuku >= 3) {
                tambahanDiskon = 2.0;
            }
        } else if (jenisBuku.equalsIgnoreCase("lainnya")) {
            if (jumlahBuku >= 3) {
                tambahanDiskon = 5.0;
            } else {
                tambahanDiskon = 1.0; 
            }
        } else {
            System.out.println("Jenis buku yang anda masukkan tidak valid");
            return;
        }

            double totalDiskon = diskon + tambahanDiskon;
            double hargaTotal = jumlahBuku * harga;
            double jumlahDiskon = hargaTotal * totalDiskon / 100;
            double totalBayar = hargaTotal - jumlahDiskon;

            System.out.println("Total Diskon Anda Sebesar = " + totalDiskon);
            System.out.println("Jumlah Diskon Anda Sebesar = Rp" + jumlahDiskon);
            System.out.println("Total Pembayaran Sebesar = Rp" + totalBayar);

            
        }


    
}