import java.util.Scanner;

public class pemilihan2_percobaan2_qris {
    public static void main(String[] args) {
        double diskon = 0.10, total_bayar, potongan = 1000.0;
        String member,qris;
        int pilihan_menu, harga;

        Scanner sembilan = new Scanner(System.in);
         System.out.println("-------------------------");
         System.out.println("===== MENU KAFE JTI =====");
         System.out.println("-------------------------");
         System.out.println("1. Ricebowl");
         System.out.println("2. Ice Tea");
         System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
         System.out.println("-------------------------------------");
         System.out.print("Masukan angka dari menu yang dipilih = ");

         pilihan_menu = sembilan.nextInt();
         sembilan.nextLine();
         System.out.print("Apakah Punya Member(y/n) ? = ");
         member = sembilan.nextLine();
         System.out.print("Apakah memakai Qris(y/n) ? = ");
         qris = sembilan.nextLine();
         System.out.println("-------------------------------------");

         if (member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan String
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);


            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling =" + harga);
                
            } else {
                System.out.println("Masukkan Pilihan Menu Yang Benar");
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah            
            }
    
            // Menghitung eksekusi lebih lanjut jika pilihan salah
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            
        } else if (member.equalsIgnoreCase("n")) { // Mengguakan equalsIgnoreCase untuk membandingkan String
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah            

            }
                // Menghitung total bayar
                System.out.println("Total Bayar = " + harga);
                

            }   if (qris.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan String
                potongan = 1000.0;
                System.out.println("Potongan sebesar = Rp 1000");
                if (pilihan_menu == 1) {
                    harga = 14000;
    
    
                } else if (pilihan_menu == 2) {
                    harga = 3000;
         
    
                } else if (pilihan_menu == 3) {
                    harga = 15000;
    
                    
                } else {
                    System.out.println("Masukkan Pilihan Menu Yang Benar");
                    return; //Menghentikan eksekusi lebih lanjut jika pilihan salah            
                }
                
                // Menghitung eksekusi lebih lanjut jika pilihan salah
                total_bayar = harga - (harga * diskon) - potongan;
                System.out.println("Total bayar = " + total_bayar);
                
            } else if (qris.equalsIgnoreCase("n")) { // Mengguakan equalsIgnoreCase untuk membandingkan String
                if (pilihan_menu == 1) {
                    harga = 14000;

                } else if (pilihan_menu == 2) {
                    harga = 3000;
    
                } else if (pilihan_menu == 3) {
                    harga = 15000;
    
                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return; // Menghentikan eksekusi lebih lanjut jika pilihan salah            
    
                }
                    // Menghitung total bayar
                    System.out.println("Total Bayar = " + (harga - potongan));
    
                }else {
                    System.out.println("Member Tidak Valid");
                }
                System.out.println("-------------------------------------");

            
        } 
       
    }
