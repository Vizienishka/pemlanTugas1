public class Mobil {


    // variabel buat nyimopen data mobil
    private String noPlat;  // menyimpan no.plat mobil
    private String warna;  // menyimpan warna mobil
    private String manufaktur;  // menyimpan merk mobil
    private double kecepatan;  // menyimpan kecepatan mobil (m/s)
    private double waktu;  // menyimpan waktu tempuh (s)
    private double jarak;  // menyimpan jarak tempuh (km)

    //MOHAMAMD VIZIE HAFIYYAN KANISHKA__________________
    // NIM : 245150707111049    |  PEMLAN LAB TUGAS 1___________________

    public void setNoPlat(String s) {  // methdo buat mengatur nomor plat mobil
        noPlat = s;  // mengisi nilai variabel noPlat dengan nilai dari parameter s
    }

    public void setWarna(String s) {   // method buat mengatur warna mobil
        warna = s;  //isi nilai variabel warna mkae nilai dari parameter s
    }

    public void setManufaktur(String s) {  // method buat mengatur manufaktur mobil
        manufaktur = s;  // isi nilai variabel warna make nilai dari parameter s
    }

    public void setKecepatan(double kecepatanKmperJam) {  // method buat mengatur kecepatan mobil ( km/h) dan mengubahnya ke m/s
        this.kecepatan = rubahKecepatan(kecepatanKmperJam);  
    }

    public void setWaktu(double waktuJam) {  // method buat mengatur waktu tempuh ( jam) dan mengubahnya ke sekon
        this.waktu = rubahkeDetik(waktuJam);  
    }

    private double rubahkeDetik(double waktuJam) {  // method private buat mengubah waktu dari jam ke sekon
        return waktuJam * 3600;  // 1 jam = 3600 sekon = waktuh 1jam dikali 3600
    }

    private double rubahKecepatan(double kecepatanKmPerJam) {  // method private buat mengubah kecepatan dari km/h ke m/s
        return kecepatanKmPerJam * (1000.0 / 3600.0);  // 1 km/h = 1000 m/ 3600 sekon
    }

    private void hitungJarak() {  // method private buat ngitung jarak yang dapat ditempuh ( km)
        this.jarak = (kecepatan * waktu) / 1000;   // rumus jarak
    }

    // method buat nampilin detail mobil
    public void displayMessage() {
        hitungJarak(); 
        System.out.println("Mobil kamu bermerk : " + manufaktur);  // menampilkan merk dari mobil
        System.out.println("Dengan nomor plat : " + noPlat);  // menampilkan no. plat mobil
        System.out.println("Bergerak dengan kecepatan : " + kecepatan + "m/s");  // menampilkan kecepatan ( m/s )
        System.out.println("Waktu tempuh : " + waktu + " sekon");  // menampilkan waktu tempuh dalam (s)
        System.out.println("Jarak yang dapat ditempuh : " + jarak + " km");  // menampilkan jarak tempuh (km)
        System.out.println("Warna: " + warna);  // menampilkan warna mobil

    }
}