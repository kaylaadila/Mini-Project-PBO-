import java.util.Scanner;

class Mahasiswa {

    String nama;
    String nim;
    int nilai;

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai: " + nilai);
    }

    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}

public class ProgramMahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mahasiswa[] mhs = new Mahasiswa[3];

        for (int i = 0; i < 3; i++) {

            mhs[i] = new Mahasiswa();

            System.out.println("\nMahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            mhs[i].nama = input.nextLine();

            System.out.print("NIM: ");
            mhs[i].nim = input.nextLine();

            System.out.print("Nilai: ");
            mhs[i].nilai = input.nextInt();
            input.nextLine();
        }

        System.out.println("\n=== DATA MAHASISWA ===");

        for (int i = 0; i < 3; i++) {

            System.out.println("\nMahasiswa ke-" + (i + 1));

            mhs[i].tampilkanData();
            mhs[i].cekKelulusan();
        }

        input.close();
    }
}
