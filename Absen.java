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
public class Absen {

    private static int absen;
    
    public static void main(String[] args) {
        boolean valid;
        Scanner input = new Scanner(System.in);
        System.out.println("---------Estimasi Jatah Absen---------");
        do{
            System.out.print("Masukkan berapa kali HADIR dalam kegiatan belajar mengajar (0-125): ");
            setAbsen(input.nextInt());
            valid = validAngka(getAbsen(), 125);
        } while (valid == false);            
        System.out.println("Menghitung...");
        boolean absensi = absen();
        
        if (absensi== true){
            int jatahabsen = hitungAbsen();
            System.out.println("Jatah Absen anda adalah " + jatahabsen +" Pertemuan Lagi");
        } else {
            System.out.println("");
            System.out.println("Mohon Maaf Jatah Absensi Anda Sudah Menembus Nilai Minus");
            System.out.println("Anda Berkemungkinan TIDAK LULUS");
            System.out.println("Silahkan Bicarakan kepada Wali Kelas agar anda bisa LULUS");
        }
    }

    public static int hitungAbsen(){
        int jatah = 125 - getAbsen(); 
        return jatah;
    }
    
    public static boolean absen(){
        boolean a;
        if(getAbsen()>=75){
            a = true;
        } else{
            a = false;
        }
        return a;
    }
    
    public static boolean validAngka(int angka, int max){
        boolean a;
        if(angka <= max){
            a = true;
        } else{
            a = false;
            System.out.println("MAsukan tidak teridentifikasi. Masukkan Ulang");
        }
        return a;
    }

    public static int getAbsen() {
        return absen;
    }

    public static void setAbsen(int aAbsen) {
        absen = aAbsen;
    }
}
