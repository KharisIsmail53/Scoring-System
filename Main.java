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
public class Main {
    
    private static int pilih;
    private static String lagi;

    
    public static void main(String[] args) {
        lagi = null;
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
         //               NilaiAkhir();                        
                        break;
                    case 2:
       //                 jatahAbsen();
                        break;
                    case 3:
     //                   convertGrade();
                        break;                        
                    case 4:                        
                        break;
                    default:
                        System.out.println("Masukkan tidak terdefinisi. Masukkan Ulang");
                }
                if (pilih > 0 && pilih <=3){
                    do{               
                        System.out.println("---------Selesai---------");
                        System.out.println("Apakah anda ingin melakukan operasi lainnya(Y/N)?");
                        lagi = input.next();
                        switch (lagi) {
                            case "Y":
                                lagi = null;
                                break;
                            case "N":
                                lagi = null;
                                pilih = 4;
                                break;
                            default:
                                System.out.println("Masukkan tidak terdefinisi. Masukkan Ulang");
                        }                        
                    } while (lagi != null);
                }                
        } while (pilih != 4);
        System.out.println("Terimakasih telah menggunakan pelayanan kami");
    }    
}
