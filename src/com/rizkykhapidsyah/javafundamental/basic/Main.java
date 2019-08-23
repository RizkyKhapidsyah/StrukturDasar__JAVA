package com.rizkykhapidsyah.javafundamental.basic;

import com.rizkykhapidsyah.javafundamental.basic.kendaraan.Kereta;
import com.rizkykhapidsyah.javafundamental.basic.kendaraan.Mobil;
import com.rizkykhapidsyah.javafundamental.basic.kendaraan.Motor;

/*
    Ketiga package diatas dapat disederhanakan seperti ini:

    import com.rizkykhapidsyah.javafundamental.basic.kendaraan.*;

    Ini disebut juga dengan Wildcard(*). Namun, Penggunaan wildcard (*) kadang tidak disarankan jika class di dalam
    package tersebut terlalu banyak. Sebabnya, ia memperlama waktu untuk pencarian class tersebut. Untuk itu kita
    serahkan ke IntelliJ mengatur import yang optimal. Pilih menu Code | Opt imize Imports. Baris import akan
    kembali ke sebelumnya tanpa menggunakan wildcard (*).
 */

import com.rizkykhapidsyah.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hai.. Apakah Saya Menyukai Anda?");

        //Dari Library: com.rizkykhapidsyah.javafundamental.basic.musik
        Gitar.Bunyi();
        Mobil.JumlahBan();
        Motor.JumlahBan();
        Kereta.JumlahBan();

        //Dari Library: import org.apache.commons.lang3.time.DateUtils;
        Date HariIni = new Date();
        System.out.println("Hari Ini: " + HariIni);
        Date Besok = DateUtils.addDays(HariIni,1);
        System.out.println("Besok Adalah: " + Besok);
    }
}
