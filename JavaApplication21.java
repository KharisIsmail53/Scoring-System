 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Rinaldito
 */
public class JavaApplication21 {
    
    private static int pilih;
    private static int absenhadir;
    private static int nilaitugas;
    private static int nilaiulangan;
    private static int nilaiprojek;
    private static int nilaiakhir;
    private static char grade;
    private static int nilaikonv;
    
    
    public static void main(String[] args) throws InterruptedException {
        String lagi = null;
        Scanner input = new Scanner(System.in);
        do {
                System.out.println("Selamat Datang Di Scoring System");
                System.out.println("1. Perhitungan Nilai Akhir");
                System.out.println("2. Estimasi Jatah Absen");
                System.out.println("3. Konversi Nilai Angka ke Huruf");
                System.out.println("4. Keluar");
                System.out.print("Silahkan Pilih Operasi: ");
                pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        NilaiAkhir();                        
                        break;
                    case 2:
                        jatahAbsen();
                        break;
                    case 3:
                        convertGrade();
                        break;                        
                    case 4:                        
                        break;
                    default:
                        System.out.println("Masukkan tidak terdefinisi. Masukkan Ulang");
                }
                if (pilih > 0 && pilih <=3){
                    System.out.println("---------Selesai---------");
                    System.out.println("Apakah anda ingin melakukan operasi lainnya(Y/N)?");
                    lagi = input.next();                
                }
        } while (pilih>4);
        System.out.println("Terimakasih telah menggunakan pelayanan kami");
    }
    
    
    
    public static void NilaiAkhir(){
        Scanner input = new Scanner(System.in);
        System.out.println("---------Perhitungan Nilai Akhir---------");
        System.out.print("Masukkan berapa kali HADIR dalam kegiatan belajar mengajar (0-100): ");
        absenhadir = input.nextInt();
        System.out.print("Nilai Tugas Anda (0-100): ");
        nilaitugas=input.nextInt();
        System.out.print("Masukkan Nilai Akhir Ulangan Anda (0-100): ");
        nilaiulangan = input.nextInt();
        System.out.print("Masukkan Nilai Projek Anda (0-100): ");
        nilaiprojek = input.nextInt();
        System.out.println("Menghitung...");
        
        boolean a = absen(absenhadir);
        
        if (a==true){
            int t = nilaitugas/100 * 40;
            int u = nilaiulangan/100 * 30;
            int p = nilaiprojek/100 * 30;
            
            nilaiakhir = t + u + p;
            System.out.println("Nilai Akhir Anda: " + nilaiakhir);
         
            grade(nilaiakhir);
            
            System.out.println("Dengan Grade: " + grade);
            
         } else {
            System.out.println("Mohon Maaf Anda Tidak Lulus");
            System.out.println("Karena Absensi Hadir Anda <75");
        }
    }
    
    public static void convertGrade(){
        Scanner input = new Scanner(System.in);
        System.out.println("---------Konversi Nilai Angka ke Huruf---------");
        System.out.print("Masukkan Nilai Yang Ingin Dikonversi (0-100): ");
        nilaikonv = input.nextInt();
        System.out.println("Menghitung...");
        grade(nilaikonv);
        System.out.println("Nilai anda adalah " + nilaikonv);   
        System.out.println("Dengan Grade: " + grade);         
    }

    public static void jatahAbsen(){
        Scanner input = new Scanner(System.in);
        System.out.println("---------Estimasi Jatah Absen---------");
        System.out.print("Masukkan berapa kali HADIR dalam kegiatan belajar mengajar (0-100): ");
        absenhadir = input.nextInt();
        System.out.println("Menghitung...");
        boolean absensi = absen(absenhadir);
        
        if (absensi== true){
            int jatahabsen = 100 - absenhadir;
            System.out.println("Jatah Absen anda adalah " + jatahabsen +"Pertemuan Lagi");
        } else {
            System.out.println("Mohon Maaf Jatah Absensi Anda Sudah Menembus Nilai Minus");
            System.out.println("Anda Berkemungkinan TIDAK LULUS");
            System.out.println("Silahkan Bicarakan kepada Wali Kelas agar anda bisa LULUS");
        }
        
    }

    public static boolean absen(int absenhadir){
        boolean a;
        if(absenhadir>=75){
            a = true;
        } else{
            a = false;
        }
        return a;
    }

    
    public static void grade(int nilai){
        if(nilai <= 20){
            grade='E';
        } else if(nilai <= 40){
            grade='D';
        } else if(nilai <= 60){
            grade='C';
        } else if(nilai <= 80){
            grade='B';
        } else {
            grade='A';
        }
    }
}
