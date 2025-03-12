import java.util.Scanner;  //import class scanner buat input user

//MOHAMAMD VIZIE HAFIYYAN KANISHKA
// NIM : 245150707111049    |  PEMLAN LAB TUGAS 1


public class MainMobil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  //membuat objek scanner untuk membaca input
        Mobil m1 = new Mobil();  //membuat objek mobil pertama

        //buat input dari pengguna
        System.out.println("Ketik detail buat Mobil:");
        System.out.print("Manufaktur/Merk : ");
        m1.setManufaktur(input.nextLine());  //input merk
       
        System.out.print("Nomor Plat: ");
        m1.setNoPlat(input.nextLine());  //input no. plat
       
        System.out.print("Warna? : ");
        m1.setWarna(input.nextLine());  //input warna
       
        System.out.print("Kecepatan mobil ( km/jam): ");
        m1.setKecepatan(input.nextDouble());  //input kecepatan (dalam km/jam)
      
        System.out.print("Waktu tempuh mobil (dalam jam): ");
        m1.setWaktu(input.nextDouble());  // input waktu (dalam jam)

        //nampilin detail informasi mobil
        System.out.println("\nDetail Mobil:");
        m1.displayMessage();  //nampilin semua detail mobil



    }
}