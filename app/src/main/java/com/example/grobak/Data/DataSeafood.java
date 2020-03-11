package com.example.grobak.Data;

import com.example.grobak.R;

import java.util.ArrayList;

public class DataSeafood extends BarangSatuan{

    private static String[] nama = {
            "Mujair",
            "Tuna",
            "Bandeng",
            "Tongkol",
            "Ikan Teri",
            "Kakap Merah",
            "Kakap Putih",
            "Udang Jerbung",
            "Udang Pancet (25)",
            "Ubur"
    };

    private static int[] image = {
            R.drawable.mujair,
            R.drawable.tuna,
            R.drawable.bandeng,
            R.drawable.tongkol,
            R.drawable.teri,
            R.drawable.kakap,
            R.drawable.kakapputih,
            R.drawable.jerbung,
            R.drawable.udang_pancet,
            R.drawable.ubur
    };

    private static String[] harga = {
            "Rp. 30.000",
            "Rp. 85.000",
            "Rp. 35.000",
            "Rp. 30.000",
            "Rp. 25.000",
            "Rp. 46.000",
            "Rp. 67.000",
            "Rp. 60.000",
            "Rp. 185.000",
            "Rp. 29.000"

    };

    private static String[] kuantitas = {
            "@1 Kg",
            "@1 Kg",
            "@1 Kg",
            "@1 Kg",
            "@300gr",
            "@1 Kg",
            "@1 Kg",
            "@500gr",
            "@1 Kg",
            "@275gr"
    };


//    public static ArrayList<DataDaging> getDataDaging()
//    {
//        ArrayList<DataDaging>dataDaging = new ArrayList<>();
//        for(int i = 0 ; i < nama.length;i++){
//            BarangSatuan barangSatuan = new DataDaging(); //Keknya ini salah, Klo misal Daging punya propoerti baru mana bisa dimasukin ke BarangSatuan?
//            barangSatuan.setNama(nama[i]); // Tpi klo gk pake BarangSatuan, brarti tiap Fragment nanti harus buat Array baru sesuai dengan Fragment
//            barangSatuan.setHarga(harga[i]); // DAN JUGA DI ADAPTER MINTANYA KAN BARANGSATUAN, GMN TUH KLO MAU BRARTI BIKIN ADPATER BARU TIAP TIAP
//            barangSatuan.setKuantitas(kuantitas[i]);
//            barangSatuan.setImage(image[i]);
//            dataDaging.add(barangSatuan);
//        }
//        return dataDaging;
//    }

    public static ArrayList<BarangSatuan> getDataSeafood() {
        ArrayList<BarangSatuan> dataSeafood = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            BarangSatuan barangSatuan = new DataSeafood(); //Keknya ini salah, Klo misal Daging punya propoerti baru mana bisa dimasukin ke BarangSatuan?
            barangSatuan.setNama(nama[i]); // Tpi klo gk pake BarangSatuan, brarti tiap Fragment nanti harus buat Array baru sesuai dengan Fragment
            barangSatuan.setHarga(harga[i]);
            barangSatuan.setKuantitas(kuantitas[i]);
            barangSatuan.setImage(image[i]);
            dataSeafood.add(barangSatuan);
        }
        return dataSeafood;
    }


}
