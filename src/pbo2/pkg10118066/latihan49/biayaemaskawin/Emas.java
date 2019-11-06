/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan49.biayaemaskawin;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Emas {
    Scanner scanner = new Scanner(System.in);
    private double beratEmas, hargaPerGram;

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }

    public void setHargaPerGram(double hargaPerGram) {
        this.hargaPerGram = hargaPerGram;
    }

    public double getHargaPerGram() {
        return hargaPerGram;
    }
    
    public double hitungTotalBayar(){
        return beratEmas*hargaPerGram;
    }
    
    public void tampilData(){
        System.out.println("=======Program Hitung Biaya Emas Kawin========");
        System.out.println("Harga Emas 1 gram \t\t: Rp. " + getHargaPerGram());
        System.out.println("");
        System.out.print("Berat Emas Yang Akan Dibeli \t: ");
        setBeratEmas(scanner.nextDouble()); 
        System.out.println("");
        System.out.println("Total Biaya Emas \t\t: Rp. " + hitungTotalBayar());
    }
}
