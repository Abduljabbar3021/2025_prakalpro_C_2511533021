package Tugas2;


		import java.util.Scanner;

		public class HitungUpahMingguan {
		    public static void main(String[] args) {
		        // Deklarasi variabel
		        String namaKaryawan;
		        char golongan;
		        int jamKerja;
		        int upahPerJam = 0;
		        int upahDasar;
		        int totalUpah;
		        int jamLembur = 0;
		        int upahLembur = 0;
		        
		        // Input menggunakan Scanner
		        Scanner input = new Scanner(System.in);
		        
		        System.out.print("Masukkan nama karyawan: ");
		        namaKaryawan = input.nextLine();
		        
		        System.out.print("Masukkan golongan (A/B/C/D): ");
		        golongan = input.next().charAt(0);  // Ambil huruf pertama
		        
		        System.out.print("Masukkan jumlah jam kerja: ");
		        jamKerja = input.nextInt();
		        
		        // Tentukan upah per jam berdasarkan golongan
		        switch (golongan) {
		            case 'A':
		                upahPerJam = 1000;
		                break;
		            case 'B':
		                upahPerJam = 2000;
		                break;
		            case 'C':
		                upahPerJam = 3000;
		                break;
		            case 'D':
		                upahPerJam = 4000;
		                break;
		            default:
		                System.out.println("Golongan tidak valid! Gunakan A, B, C, atau D.");
		                return;  // Keluar jika invalid
		        }
		        
		        // Hitung upah dasar
		        upahDasar = upahPerJam * jamKerja;
		        
		        // Cek lembur
		        if (jamKerja > 60) {
		            jamLembur = jamKerja - 60;
		            upahLembur = jamLembur * 5000;
		            totalUpah = upahDasar + upahLembur;
		        } else {
		            totalUpah = upahDasar;
		        }
		        
		        // Output
		        System.out.println("Nama Karyawan: " + namaKaryawan);
		        System.out.println("Upah Mingguan: Rp " + totalUpah);
		        
		        input.close();
		    }
		


	}


