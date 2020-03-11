package com.example.grobak.Data;

import com.example.grobak.R;

import java.util.ArrayList;

public class DataSayur extends BarangSatuan{

    private static String[] nama = {
            "Brokoli",
            "Tomat",
            "Jamur Kancing",
            "Jamur Kuping",
            "Jamur Enoki",
            "Wortel",
            "Kubis",
            "Kentang",
            "Cabe Merah",
            "Kacang Hijau"
    };

    private static String[] harga = {
            "Rp. 17.000",
            "Rp. 7.500",
            "Rp. 14.000",
            "Rp. 10.000",
            "Rp. 10.000",
            "Rp. 9.000",
            "Rp. 7.000",
            "Rp. 12.000",
            "Rp. 35.000",
            "Rp. 20.000"

    };

    private static String[] kuantitas = {
            "@500gr",
            "@500gr",
            "@500gr",
            "@50gr",
            "@100gr",
            "@500gr",
            "@1 Kg",
            "@1 Kg",
            "@1 Kg",
            "@1 Kg"




    };

    private static int[] image = {
            R.drawable.broccoli,
            R.drawable.tomat,
            R.drawable.jamur_kancing,
            R.drawable.jamur_kuping,
            R.drawable.jamur_enoki,
            R.drawable.wortel,
            R.drawable.kubis,
            R.drawable.kentang,
            R.drawable.cabe_merah,
            R.drawable.kacang_hijau


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

    public static ArrayList<BarangSatuan> getDataSayur()
    {
        ArrayList<BarangSatuan>dataSayur = new ArrayList<>();
        for(int i = 0 ; i < nama.length;i++){
            BarangSatuan barangSatuan = new DataDaging(); //Keknya ini salah, Klo misal Daging punya propoerti baru mana bisa dimasukin ke BarangSatuan?
            barangSatuan.setNama(nama[i]); // Tpi klo gk pake BarangSatuan, brarti tiap Fragment nanti harus buat Array baru sesuai dengan Fragment
            barangSatuan.setHarga(harga[i]);
            barangSatuan.setKuantitas(kuantitas[i]);
            barangSatuan.setImage(image[i]);
            dataSayur.add(barangSatuan);
        }
        return dataSayur;
    }

}
