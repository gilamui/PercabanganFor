package Perulangan;

import java.util.Scanner;

public class PerulanganFor {
    public static void main(String[] args) {
        int awal, akhir;
        String k;
        Scanner s = new Scanner(System.in);
        System.out.println("");
        k=s.next();
        System.out.println("Masukkan nilai awal: ");
        awal=s.nextInt();
        System.out.println("Masukkan nilai akhir: ");
        akhir=s.nextInt();

        for (int i = akhir; i >= awal; i--) {
            System.out.println(i+"."+k);
        }
    }
}
