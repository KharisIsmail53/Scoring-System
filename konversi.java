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
public class konversi {
    
    private static int nilai;
    
    public static void main(String[] args) {
        char grade;
        Scanner input = new Scanner(System.in);
        System.out.println("---------Konversi Nilai Angka ke Huruf---------");
        System.out.print("Masukkan Nilai Yang Ingin Dikonversi (0-100): ");
        setNilai(input.nextInt());
        System.out.println("Menghitung...");
        grade = grade();
        System.out.println("Nilai anda adalah " + getNilai());   
        System.out.println("Dengan Grade: " + grade);         
    }
    
    public static char grade(){
        char grade;
        if(getNilai() <= 20){
            grade='E';
        } else if(getNilai() <= 40){
            grade='D';
        } else if(getNilai() <= 60){
            grade='C';
        } else if(getNilai() <= 80){
            grade='B';
        } else {
            grade='A';
        }
        return grade;
    }

    /**
     * @return the nilai
     */
    public static int getNilai() {
        return nilai;
    }

    /**
     * @param aNilai the nilai to set
     */
    public static void setNilai(int aNilai) {
        nilai = aNilai;
    }
}
