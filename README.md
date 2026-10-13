# Mini Project PBO - Program Data Mahasiswa

## Deskripsi
Program Data Mahasiswa merupakan mini project mata kuliah Pemrograman Berorientasi Objek (PBO) yang dibuat menggunakan bahasa pemrograman Java.

Program ini digunakan untuk memasukkan data mahasiswa, menampilkan informasi mahasiswa, dan menentukan status kelulusan berdasarkan nilai yang diperoleh.

## Fitur Program
- Input data mahasiswa.
- Menyimpan nama, NIM, dan nilai mahasiswa.
- Menampilkan data mahasiswa.
- Menentukan status kelulusan berdasarkan nilai.
- Mengelola minimal 3 objek mahasiswa menggunakan perulangan.

## Konsep Java yang Digunakan
- Variable dan Data Type
- Scanner
- If-Else
- Loop
- Class dan Object
- Method

## Contoh Input

```text
Mahasiswa ke-1
Nama: kayla
NIM: 250810701100067
Nilai: 90

Mahasiswa ke-2
Nama: adila
NIM: 250810701100055
Nilai: 50

Mahasiswa ke-3
Nama: farija
NIM: 250810701100065
Nilai: 70
```

## Contoh Output

```text
=== DATA MAHASISWA ===

Mahasiswa ke-1
Nama: kayla
NIM: 250810701100067
Nilai: 90
Lulus

Mahasiswa ke-2
Nama: adila
NIM: 250810701100055
Nilai: 50
Tidak Lulus

Mahasiswa ke-3
Nama: farija
NIM: 250810701100065
Nilai: 70
Lulus
```

## Logika Kelulusan

Program menggunakan percabangan `if-else` untuk menentukan status kelulusan mahasiswa.

- Nilai >= 60: Lulus.
- Nilai < 60: Tidak Lulus.

## Cara Menjalankan Program

1. Pastikan JDK sudah terpasang.
2. Buka terminal pada folder program.
3. Compile program menggunakan perintah:

   `javac ProgramMahasiswa.java`

4. Jalankan program menggunakan perintah:

   `java ProgramMahasiswa`

## Teknologi
- Bahasa Pemrograman: Java
- Java Development Kit (JDK)
