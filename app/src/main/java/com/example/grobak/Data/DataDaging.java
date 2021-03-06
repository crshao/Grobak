package com.example.grobak.Data;

import com.example.grobak.R;

import java.util.ArrayList;

public class DataDaging extends BarangSatuan {

    private static String[] nama = {
            "Tenderloin",
            "T-Bone",
            "Kambing",
            "Paha Ayam",
            "Sirloin",
            "Chuck",
            "Iga",
            "Ayam Kampung",
            "Telur Broiler"
    };

    private static int[] image = {
            R.drawable.tenderloin,
            R.drawable.tbone,
            R.drawable.kambing,
            R.drawable.paha_ayam,
            R.drawable.sirloin,
            R.drawable.chuck,
            R.drawable.iga,
            R.drawable.ayam_kampung,
            R.drawable.telur_ayam_broiler
    };

    private static String[] harga = {
            "Rp. 40.000",
            "Rp. 166.000",
            "Rp. 62.500",
            "Rp. 17.000",
            "Rp. 60.000",
            "Rp. 28.000",
            "Rp. 47.000",
            "Rp. 45.000",
            "Rp. 28.000"

    };

    private static String[] kuantitas = {
            "@500gr",
            "@500gr",
            "@500gr",
            "@500gr",
            "@500gr",
            "@200gr",
            "@500gr",
            "1 Kg",
            "1 Kg"
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

    public static ArrayList<BarangSatuan> getDataDaging() {
        ArrayList<BarangSatuan> dataDaging = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            BarangSatuan barangSatuan = new DataDaging(); //Keknya ini salah, Klo misal Daging punya propoerti baru mana bisa dimasukin ke BarangSatuan?
            barangSatuan.setNama(nama[i]); // Tpi klo gk pake BarangSatuan, brarti tiap Fragment nanti harus buat Array baru sesuai dengan Fragment
            barangSatuan.setHarga(harga[i]);
            barangSatuan.setKuantitas(kuantitas[i]);
            barangSatuan.setImage(image[i]);
            dataDaging.add(barangSatuan);
        }
        return dataDaging;
    }
}
