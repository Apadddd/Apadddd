
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-23
 */
public class Class25Maret {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;
        
        double nilaiC = 18;
        double nilaiD = 11;
        
        boolean isPlus = true;
        
        System.out.println("Nilai A: " + nilaiA);
        System.out.println("Nilai B: " + nilaiB);
        System.out.println("Nilai C: " + nilaiC);
        System.out.println("Nilai D: " + nilaiD);
        System.out.println("is Plus: " + isPlus);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input nilai A: ");
        nilaiA = input.nextInt();
        
        System.out.println("Input nilai B: ");
        nilaiB = input.nextInt();
        
        System.out.println("Input nilai C: ");
        nilaiC = input.nextDouble();
        
        System.out.println("Input nilai D: ");
        nilaiD = input.nextDouble();
        
        System.out.println("Input nilai Boolean: ");
        isPlus = input.nextBoolean();
        
        System.out.println("Nilai A: " + nilaiA);
        System.out.println("Nilai B: " + nilaiB);
        System.out.println("Nilai C: " + nilaiC);
        System.out.println("Nilai D: " + nilaiD);
        System.out.println("is Plus: " + isPlus);
        
        String nama = "";
        System.out.println("Silahkan input nama lengkap: ");
        nama = input.nextLine();
        nama = input.nextLine();
        System.out.println("Nama Lengkap :" + nama);
    }
}
