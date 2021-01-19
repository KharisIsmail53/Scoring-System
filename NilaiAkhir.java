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
public class NilaiAkhir {
    
    private static int absen;
    private static int tugas;
    private static int ulangan;
    private static int projek;
    private static int akhir;
    
    public static void main(String[] args) {
        boolean valid;
        Scanner input = new Scanner(System.in);
        System.out.println("---------Perhitungan Nilai Akhir---------");
        do {            
            System.out.print("Masukkan berapa kali HADIR dalam kegiatan belajar mengajar (0-125): ");
            setAbsen(input.nextInt());
            valid = validAngka(getAbsen(), 125);
        } while (valid == false);
        do{
            System.out.print("Nilai Tugas Anda (0-100): ");
            setTugas(input.nextInt());
            valid = validAngka(getTugas(), 100);
        } while (valid == false);
        do{
            System.out.print("Masukkan Nilai Akhir Ulangan Anda (0-100): ");
            setUlangan(input.nextInt());
            valid = validAngka(getUlangan(), 100);
        } while (valid == false);
        do{
            System.out.print("Masukkan Nilai Projek Anda (0-100): ");
            setProjek(input.nextInt());
            valid = validAngka(getProjek(), 100);
        } while (valid == false);
        System.out.println("Menghitung...");
        
        boolean a = absen();
        setAkhir(hitungAkhir());
        char grade = grade();
        
        if (a==true){
            hitungAkhir();
            System.out.println("Nilai Akhir Anda: " + getAkhir());
            System.out.println("Dengan Grade: " + grade);
        } else {
            System.out.println("Mohon Maaf Anda Tidak Lulus");
            System.out.println("Karena Absensi Hadir Anda <75");
        }
    }
    
    public static int hitungAkhir(){
        int akhir;
        int t = getTugas()/100 * 40;
        int u = getUlangan()/100 * 30;
        int p = getProjek()/100 * 30;
        akhir = t + u + p;
        return akhir;
    }
    
    public static char grade(){
        char grade;
        if(getAkhir() <= 20){
            grade='E';
        } else if(getAkhir() <= 40){
            grade='D';
        } else if(getAkhir() <= 60){
            grade='C';
        } else if(getAkhir() <= 80){
            grade='B';
        } else {
            grade='A';
        }
        return grade;
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

    /**
     * @return the absen
     */
    public static int getAbsen() {
        return absen;
    }

    /**
     * @param aAbsen the absen to set
     */
    public static void setAbsen(int aAbsen) {
        absen = aAbsen;
    }

    /**
     * @return the tugas
     */
    public static int getTugas() {
        return tugas;
    }

    /**
     * @param aTugas the tugas to set
     */
    public static void setTugas(int aTugas) {
        tugas = aTugas;
    }

    /**
     * @return the ulangan
     */
    public static int getUlangan() {
        return ulangan;
    }

    /**
     * @param aUlangan the ulangan to set
     */
    public static void setUlangan(int aUlangan) {
        ulangan = aUlangan;
    }

    /**
     * @return the projek
     */
    public static int getProjek() {
        return projek;
    }

    /**
     * @param aProjek the projek to set
     */
    public static void setProjek(int aProjek) {
        projek = aProjek;
    }

    /**
     * @return the akhir
     */
    public static int getAkhir() {
        return akhir;
    }

    /**
     * @param aAkhir the akhir to set
     */
    public static void setAkhir(int aAkhir) {
        akhir = aAkhir;
    }
}
