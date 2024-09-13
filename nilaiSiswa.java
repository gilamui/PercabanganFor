import java.util.Scanner;

public class nilaiSiswa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan total siswa: ");
        int totalSiswa = s.nextInt();

        int nilai=0;
        int totalNilai = 0;

        for (int i = 1; i <= totalSiswa; i++) {
            System.out.print("Masukkan nilai untuk siswa " +i+ ": ");
            nilai = s.nextInt();
            totalNilai += nilai;
        }

        double ratarata = totalNilai / totalSiswa;

        System.out.println("Rata-rata: " + ratarata);
        s.close();
    }
}
