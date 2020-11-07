/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.AdrianMaidiyangsa;
import java.util.*;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program kalkulator, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class IF110119029Latihan34Kalkulator {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        Kalkulator calculator = new Kalkulator();
        System.out.println("Aplikasi Kalkulator Bilangan");
        System.out.print("Masukan Angka ke-1 : ");
        calculator.value1 = input.nextDouble();
        System.out.print("Masukan Angka ke-2 : ");
        calculator.value2 = input.nextDouble();
        System.out.println();
        
        System.out.println("Hasil Pertambahan : " + calculator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + calculator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + calculator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + calculator.bagiBilangan());
        System.out.println("Hasil Sisa : " + calculator.sisaBilangan());
    }
    
}
