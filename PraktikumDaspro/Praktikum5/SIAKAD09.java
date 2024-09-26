import java.util.Scanner;  

public class SIAKAD09 { 

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        
        String nama;
        String nim;
        String kelas;
        int absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine(); 

        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();  

        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine(); 

        System.out.print("Masukkan Nomor Absen: ");
        absen = sc.nextInt(); 

     
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();  

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble(); 

        System.out.print("Masukkan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();  

    
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf: A");
            System.out.println("Kualifikasi : Sangat Baik"); 
        } 
        else if (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
            System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf: B+");
            System.out.println("Kualifikasi : Lebih dari Baik"); 
        }
        else if (nilaiAkhir >= 65 && nilaiAkhir <= 73) {
            System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf: B");
            System.out.println("Kualifikasi : Baik"); 
        }
        else if (nilaiAkhir >= 60 && nilaiAkhir <= 65) {
            System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf: C+");
            System.out.println("Kualifikasi : Lebih dari Cukup"); 
        }
        else if (nilaiAkhir >= 50 && nilaiAkhir <= 60) {
            System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf: C");
            System.out.println("Kualifikasi : Cukup"); 
        }else if (nilaiAkhir >= 39 && nilaiAkhir <= 50) {
            System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf: D");
            System.out.println("Kualifikasi : Kurang"); 
        }
        else if (nilaiAkhir <= 39) {
            System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf: E");
            System.out.println("Kualifikasi : Gagal"); 
        }
        else {
            System.out.println("Invalid Number");
        }
    
    
    }
}